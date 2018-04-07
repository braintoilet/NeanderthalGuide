package com.github.braintoilet.neanderthalguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WildlifeFragment extends Fragment {

    @BindView(R.id.wildlife_list)
    ListView listView;

    public WildlifeFragment() {
    }

    public static WildlifeFragment newInstance() {
        return new WildlifeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wildlife, container, false);
        ButterKnife.bind(this, view);
        listView.setAdapter(new LocationInfoAdapter(getContext(), getInfo()));

        return view;
    }

    private ArrayList<LocationInfo> getInfo() {
        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.wildlife_info1_caption), getString(R.string.wildlife_info1), R.drawable.wildlife));
        list.add(new LocationInfo(getString(R.string.wildlife_info2_caption), getString(R.string.wildlife_info2), R.drawable.wildlife_map));

        return list;
    }
}
