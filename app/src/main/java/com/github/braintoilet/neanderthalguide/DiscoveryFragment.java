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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discovery, container, false);
        ButterKnife.bind(this, view);

        listView.setAdapter(new LocationInfoAdapter(getContext(), getInfo()));

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    private ArrayList<LocationInfo> getInfo() {
        ArrayList<LocationInfo> list = new ArrayList<>();

        list.add(new LocationInfo("Discovery Site", "The \"Feldhoffer Grotte\", where the remainings of the Neanderthal were found in 1865, " +
                "got destroyed by quarrying. After new Excavations in 1997 and 2000, the worldfamous place of discovery got rebuilt in a park like fashion.", R.drawable.discovery));
        list.add(new LocationInfo("Map", "The discovery site can easily be found near the museum.", R.drawable.discovery_map));

        return list;
    }
}
