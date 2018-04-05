package com.github.braintoilet.neanderthalguide;

import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;

public class LocationInfo {
    private String infoCaption;
    private String infoText;
    private int infoImageID;

    public LocationInfo(String caption, String info) {
        infoCaption = caption;
        infoText = info;
        infoImageID = 0;
    }

    public LocationInfo(String caption, String info, int ImageID) {
        infoCaption = caption;
        infoText = info;
        infoImageID = ImageID;
    }

    public String getInfoCaption() {
        return infoCaption;
    }

    public String getInfoText() {
        return infoText;
    }

    public int getInfoImageID() {
        return infoImageID;
    }
}


