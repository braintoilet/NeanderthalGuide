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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wildlife, container, false);
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

        list.add(new LocationInfo("Wildlife Reserve", "Another great place to visit is the wildlife reserve not far from the museum. " +
                "There are many animals including bisons, tarpans and except bullocks.", R.drawable.wildlife));
        list.add(new LocationInfo("Map", "The reserve is very easy to find by foot.", R.drawable.wildlife_map));

        return list;
    }
}
