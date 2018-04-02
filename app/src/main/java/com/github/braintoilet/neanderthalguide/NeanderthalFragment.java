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
    private OnFragmentInteractionListener mListener;

    @BindView(R.id.neanderthal_list)
    ListView listView;

    public NeanderthalFragment() {
        // Required empty public constructor
    }

    public static NeanderthalFragment newInstance() {
        NeanderthalFragment fragment = new NeanderthalFragment();
        return fragment;
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
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private ArrayList<LocationInfo> getInfo() {
        ArrayList<LocationInfo> list = new ArrayList<>();

        list.add(new LocationInfo("", ""));
        list.add(new LocationInfo("", ""));
        list.add(new LocationInfo("", ""));

        return list;
    }
}
