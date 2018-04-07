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

public class DiscoveryFragment extends Fragment {

    @BindView(R.id.discovery_list)
    ListView listView;

    public DiscoveryFragment() {
    }

    public static DiscoveryFragment newInstance() {
        return new DiscoveryFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discovery, container, false);
        ButterKnife.bind(this, view);

        listView.setAdapter(new LocationInfoAdapter(getContext(), getInfo()));

        return view;
    }

    private ArrayList<LocationInfo> getInfo() {
        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.discovery_info1_caption), getString(R.string.discovery_info1), R.drawable.discovery));
        list.add(new LocationInfo(getString(R.string.discovery_info2_caption), getString(R.string.discovery_info2), R.drawable.discovery_map));

        return list;
    }
}
