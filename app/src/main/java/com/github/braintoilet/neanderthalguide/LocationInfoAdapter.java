package com.github.braintoilet.neanderthalguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocationInfoAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    ArrayList<LocationInfo> mLocationInfoList;

    public LocationInfoAdapter(Context context, ArrayList<LocationInfo> list) {
        this.inflater = LayoutInflater.from(context);
        mLocationInfoList = list;
    }

    @Override
    public int getCount() {
        return mLocationInfoList.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return mLocationInfoList.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return mLocationInfoList.indexOf(mLocationInfoList.get(position));
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.fragment_list_item, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        LocationInfo listItem = (LocationInfo) getItem(position);

        holder.caption.setText(listItem.getInfoCaption());
        holder.text.setText(listItem.getInfoText());

        if (listItem.getInfoImageID() != 0) {
            holder.image.setImageResource(listItem.getInfoImageID());
            holder.image.setVisibility(View.VISIBLE);
        }

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.list_item_caption)
        TextView caption;
        @BindView(R.id.list_item_text)
        TextView text;
        @BindView(R.id.list_item_image)
        ImageView image;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
