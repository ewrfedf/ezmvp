package zcp.mvp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import zcp.mvp.fragment.AboutFragment;

/**
 *
 * display 对应 activity （由BaseActivity统一创建）
 *
 * 所有的UI 操作都在display中完成 主要包括页面跳转、推拉等UI变化
 *
 * Created by Zheng on 15/7/14.
 */
public class AndroidDisplay implements Display {

    private final ActionBarActivity mActivity;

    private Toolbar mToolbar;

    private boolean mCanChangeToolbarBackground;


    public AndroidDisplay(ActionBarActivity activity) {
        mActivity = activity;
    }


    @Override
    public void startAboutActivity() {
        Intent intent = new Intent(mActivity, AboutActivity.class);
        mActivity.startActivity(intent);
    }

//    @Override
//    public void startAboutFragment() {
//        AboutFragment fragment = new AboutFragment();
//        mActivity.getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_main, fragment)
//                .commit();
//
//    }

    @Override
    public void setSupportActionBar(Object toolbar, boolean handleBackground) {
        mToolbar = (Toolbar) toolbar;
        mCanChangeToolbarBackground = handleBackground;


    }

    @Override
    public void showAboutFragment() {
        AboutFragment fragment = new AboutFragment();
        mActivity.getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_main, fragment)
                .commit();
    }

    private void setToolbarBackground(int color) {
        if (mCanChangeToolbarBackground && mToolbar != null) {
            mToolbar.setBackgroundColor(color);
        }
    }

}
