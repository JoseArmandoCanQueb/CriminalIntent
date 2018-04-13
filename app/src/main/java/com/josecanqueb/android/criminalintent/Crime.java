package com.josecanqueb.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by JoseArmando on 13/04/2018.
 */

public class Crime {
    public UUID mId;
    public String mTitle;
    public Date mDate;
    public boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public Date getDate() {
        return mDate;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public boolean isSolved() {
        return mSolved;
    }
}
