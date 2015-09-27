package zcp.mvp;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import zcp.mvp.controllers.MainController;

/**
 * 绑定 controller
 * 绑定 display->controller
 * 初始化 controller
 *
 * Created by Zheng on 15/7/14.
 */
public class BaseActivity extends ActionBarActivity
        implements MainController.HostCallbacks {

    private MainController mMainController;
    private Display mDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Request Progress Bar in Action Bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        super.onCreate(savedInstanceState);
        setContentView(getContentViewLayoutId());

        mMainController = App.from(this).getMainController();
        mDisplay = new AndroidDisplay(this);

        handleIntent(getIntent(), getDisplay());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent, getDisplay());
    }

    protected void handleIntent(Intent intent,  Display display) {
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMainController.attachDisplay(mDisplay);
        mMainController.setHostCallbacks(this);
        mMainController.init();
    }

    @Override
    protected void onPause() {
        mMainController.suspend();
        mMainController.setHostCallbacks(null);
        mMainController.detachDisplay(mDisplay);
        super.onPause();
    }

    protected boolean navigateUp() {
        final Intent intent = getParentIntent();
        if (intent != null) {
            NavUtils.navigateUpTo(this, intent);
            return true;
        }
        return false;
    }

    protected Intent getParentIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDisplay = null;
    }

    @Override
    public void setAccountAuthenticatorResult(String username, String authToken, String accountType) {

    }

    public static interface OnActivityInsetsCallback {
        public void onInsetsChanged(Rect insets);
    }


    protected final MainController getMainController() {
        return mMainController;
    }

    protected int getContentViewLayoutId() {
        return R.layout.activity_main;
    }

    public Display getDisplay() {
        return mDisplay;
    }

    @Override
    public final void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar, boolean handleBackground) {
        setSupportActionBar(toolbar);
        getDisplay().setSupportActionBar(toolbar, handleBackground);
    }
}