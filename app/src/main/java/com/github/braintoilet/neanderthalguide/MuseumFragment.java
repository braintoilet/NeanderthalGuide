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

public class MuseumFragment extends Fragment {

    @BindView(R.id.museum_list)
    ListView listView;

    public MuseumFragment() {
    }

    public static MuseumFragment newInstance() {
        return new MuseumFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museum, container, false);
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

        list.add(new LocationInfo("Traces of humanity",
                "The exhibition shows the traces of humanity, from their long way from the savannas, " +
                        "to the capital cities of the present. The main emphasis lies on the neanderthals.", R.drawable.museum_inside));
        list.add(new LocationInfo("Opening Hours", "Tuesday till Sunday\nfrom 10.00AM to 18.00PM"));
        list.add(new LocationInfo("Contact", "Tel: 0049 2104 97970\n" +
                "Fax: 0049 2104 979796"));
        list.add(new LocationInfo("Adress", "Neanderthal Museum\n" +
                "Talstr. 300\n" +
                "40822 Mettmann", R.drawable.map));
        return list;
    }
}
