package com.example.computer.butterknifeandfragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class RecyclerViewFragment extends Fragment {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @BindString(R.string.string_one)
    String one;
    @BindString(R.string.string_two)
    String two;
    @BindString(R.string.string_three)
    String three;
    @BindString(R.string.string_four)
    String four;
    @BindString(R.string.string_five)
    String five;
    @BindString(R.string.string_six)
    String six;
    @BindString(R.string.string_seven)
    String seven;
    @BindString(R.string.string_eight)
    String eight;
    @BindString(R.string.string_nine)
    String nine;
    @BindString(R.string.string_ten)
    String ten;
    @BindString(R.string.string_eleven)
    String eleven;
    @BindString(R.string.string_twelve)
    String twelve;
    @BindString(R.string.string_thirteen)
    String thirteen;
    @BindString(R.string.string_fourteen)
    String fourteen;

    @BindDrawable(R.drawable.icons8_calendar)
    Drawable first;
    @BindDrawable(R.drawable.icons8_time)
    Drawable second;
    @BindDrawable(R.drawable.friends_icon_dark)
    Drawable third;
    @BindDrawable(R.drawable.java_icon)
    Drawable fourth;
    @BindDrawable(R.drawable.ic_developer_mode_black_24dp)
    Drawable fifth;
    @BindDrawable(R.drawable.ic_pool_black_24dp)
    Drawable sixth;
    @BindDrawable(R.drawable.ic_warning_black_24dp)
    Drawable seventh;
    @BindDrawable(R.drawable.ic_receipt_black_24dp)
    Drawable eightht;
    @BindDrawable(R.drawable.icons8_calendar)
    Drawable ninth;
    @BindDrawable(R.drawable.ic_developer_board_black_24dp)
    Drawable tenth;
    @BindDrawable(R.drawable.ic_directions_boat_black_24dp)
    Drawable eleventh;
    @BindDrawable(R.drawable.material_design_icon)
    Drawable twelfth;
    @BindDrawable(R.drawable.ic_assignment_ind_black_24dp)
    Drawable thirteenth;
    @BindDrawable(R.drawable.friends_icon)
    Drawable fourteenth;

    private MyAdapter adapter;
    private List<MyData> myDataList;

    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        unbinder = ButterKnife.bind(this, view);

        myDataList = new ArrayList<>();

        String[] descriptions = {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen};
        Drawable[] images = {first, second, third, fourth, fifth, sixth, seventh, eightht, ninth, tenth, eleventh, twelfth, thirteenth, fourteenth};

        for (int x = 0; x <= descriptions.length - 1; x ++) {
            MyData myData = new MyData();
            myData.setDescription(descriptions[x]);
            myData.setImage(images[x]);
            myDataList.add(myData);
        }


        adapter = new MyAdapter(this.getContext(), myDataList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
