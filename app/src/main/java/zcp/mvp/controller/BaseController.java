package zcp.mvp.controller;

import android.content.Intent;


import zcp.mvp.Display;

/**
 * Created by Zheng on 15/7/14.
 */
public class BaseController {
    private Display mDisplay;
    private boolean mInited;

    public final void init() {
        mInited = true;
        onInited();
    }

    public final void suspend() {
        onSuspended();
        mInited = false;
    }

    public final boolean isInited() {
        return mInited;
    }

    protected void onInited() {}

    protected void onSuspended() {}

    public boolean handleIntent(Intent intent) {
        return false;
    }

    protected void setDisplay(Display display) {
        mDisplay = display;
    }

    protected final Display getDisplay() {
        return mDisplay;
    }

}
