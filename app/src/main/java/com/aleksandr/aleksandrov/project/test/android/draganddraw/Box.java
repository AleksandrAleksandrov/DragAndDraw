package com.aleksandr.aleksandrov.project.test.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by aleksandr on 10/29/17.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mCurrent = origin;
        mOrigin = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
