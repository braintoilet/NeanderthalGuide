package com.github.braintoilet.neanderthalguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MuseumFragment extends Fragment {

    @BindView(R.id.museum_list)
    ListView listView;

    public MuseumFragment() {
    }

    public static MuseumFragment newInstance() {
        return new MuseumFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museum, container, false);
        ButterKnife.bind(this, view);
        listView.setAdapter(new LocationInfoAdapter(getContext(), getInfo()));

        return view;
    }

    private ArrayList<LocationInfo> getInfo() {
        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.museum_info1_caption), getString(R.string.museum_info1), R.drawable.museum_inside));
        list.add(new LocationInfo(getString(R.string.museum_info2_caption), getString(R.string.museum_info2)));
        list.add(new LocationInfo(getString(R.string.museum_info3_caption), getString(R.string.museum_info3)));
        list.add(new LocationInfo(getString(R.string.museum_info4_caption), getString(R.string.museum_info4), R.drawable.map));

        return list;
    }
}
