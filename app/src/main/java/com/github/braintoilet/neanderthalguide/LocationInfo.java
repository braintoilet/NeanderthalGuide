package com.github.braintoilet.neanderthalguide;

import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;

public class LocationInfo {

    @BindView(R.id.list_item_caption)
    private String infoCaption;

    @BindView(R.id.list_item_text)
    private String infoText;

    @BindView(R.id.list_item_image)
    private ImageView infoImage;

    public LocationInfo(String caption, String info) {
        infoCaption = caption;
        infoText = info;
        infoImage = null;
    }

    public LocationInfo(String caption, String info, int ImageID) {
        infoCaption = caption;
        infoText = info;
        infoImage.setVisibility(View.VISIBLE);
        infoImage.setImageResource(ImageID);
    }

    public String getInfoCaption() {
        return infoCaption;
    }

    public String getInfoText() {
        return infoText;
    }


    public ImageView getInfoImage() {
        return infoImage;
    }
}
