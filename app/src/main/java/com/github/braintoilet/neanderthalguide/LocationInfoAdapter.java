package com.github.braintoilet.neanderthalguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LocationInfoAdapter extends ArrayAdapter<LocationInfo> {

    ArrayList<LocationInfo> objectList;

    public LocationInfoAdapter(Context context, ArrayList<LocationInfo> objects) {
        super(context, 0, objects);
        objectList = objects;
    }

    @Override
    public int getCount() {
        return objectList.size();
    }

    @Override
    public LocationInfo getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_list_item, parent, false);
        }

        LocationInfo currentLocationInfo = getItem(position);

        TextView caption = listItemView.findViewById(R.id.list_item_caption);
        caption.setText(currentLocationInfo.getInfoCaption());

        TextView text = listItemView.findViewById(R.id.list_item_text);
        text.setText(currentLocationInfo.getInfoText());

        ImageView imageView = listItemView.findViewById(R.id.list_item_image);

        if (currentLocationInfo.getInfoImage() != null)
            imageView = currentLocationInfo.getInfoImage();


        return listItemView;
    }
}
