package com.example.zachs.skimate;

import java.util.UUID;

/**
 * Created by zachs on 3/21/2018.
 */

public class CommunityForm {

    private UUID mId;
    private String mTitle;

    public CommunityForm() {
        // generate unigue identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
