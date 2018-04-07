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

public class NeanderthalFragment extends Fragment {

    @BindView(R.id.neanderthal_list)
    ListView listView;

    public NeanderthalFragment() {
    }

    public static NeanderthalFragment newInstance() {
        return new NeanderthalFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_neanderthal, container, false);
        ButterKnife.bind(this, view);
        listView.setAdapter(new LocationInfoAdapter(getContext(), getInfo()));

        return view;
    }

    private ArrayList<LocationInfo> getInfo() {
        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.neanderthal_info1_caption), getString(R.string.neanderthal_info1), R.drawable.river_original));
        list.add(new LocationInfo(getString(R.string.neanderthal_info2_caption), getString(R.string.neanderthal_info2), R.drawable.homo_sapiens));

        return list;
    }
}
