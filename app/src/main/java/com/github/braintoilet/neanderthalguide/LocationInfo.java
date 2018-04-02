package com.github.braintoilet.neanderthalguide;

import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;

public class LocationInfo {
    String infoCaption;
    String infoText;
    ImageView infoImage;

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
