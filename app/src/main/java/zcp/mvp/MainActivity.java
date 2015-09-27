package zcp.mvp;

import android.view.View;

import zcp.mvp.controllers.MainController;

public class MainActivity extends BaseActivity implements MainController.MainUi {


    private MainController.MainControllerUiCallbacks mUiCallbacks;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void onResume() {
        super.onResume();
        getMainController().attachUi(this);
    }

    @Override
    protected void onPause() {
        getMainController().detachUi(this);
        super.onPause();
    }

    @Override
    public void showLoginPrompt() {

    }

    @Override
    public void setCallbacks(MainController.MainControllerUiCallbacks callbacks) {

    }

    @Override
    public boolean isModal() {
        return false;
    }


    //
    public void onAbout(View view) {
        getMainController().onAboutButtonPressed();
    }
}
