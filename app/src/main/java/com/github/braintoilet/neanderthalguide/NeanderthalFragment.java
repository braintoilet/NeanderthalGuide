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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_neanderthal, container, false);
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

        list.add(new LocationInfo("Neandertal as Landscape", "The Neandertal was once a very harsh environment to live in," +
                " but today it is a very beautiful landscape with many opportunities for activities like walking and hiking.", R.drawable.river_original));
        list.add(new LocationInfo("The Neanderthal's", "The Neanderthals more rarely known as Neandertals, were archaic humans that became extinct about 40,000 years ago.", R.drawable.homo_sapiens));

        return list;
    }
}
