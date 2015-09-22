package zcp.mvp.controllers;


import zcp.mvp.Display;

/**
 * Created by Zheng on 15/7/14.
 */
public class MainController extends BaseUiController<MainController.MainControllerUi,
        MainController.MainControllerUiCallbacks> {

    private static AboutController mAboutController;
    private HostCallbacks mHostCallbacks;

    private MainController mMainController;


    public MainController(AboutController aboutController) {
        mAboutController = aboutController;
    }

    @Override
    protected MainControllerUiCallbacks createUiCallbacks(MainControllerUi ui) {
        return new MainControllerUiCallbacks() {
            @Override
            public void onAbout() {
                Display display = getDisplay();
                if (display != null) {
                    display.startAboutActivity();
                }
            }
        };
    }

    public interface MainControllerUi extends BaseUiController.Ui<MainControllerUiCallbacks> {
    }

    public interface MainUi extends MainControllerUi {


        void showLoginPrompt();

    }

    public interface MainControllerUiCallbacks {

        void onAbout();
    }


    public interface HostCallbacks {
        void finish();

        void setAccountAuthenticatorResult(String username, String authToken, String accountType);
    }


    public void attachDisplay(Display display) {
        setDisplay(display);
    }

    public void detachDisplay(Display display) {
        setDisplay(null);
    }

    @Override
    protected void setDisplay(Display display) {
        super.setDisplay(display);
        mAboutController.setDisplay(display);
    }

    public void setHostCallbacks(HostCallbacks hostCallbacks) {
        mHostCallbacks = hostCallbacks;
    }


    //业务
    public boolean onAboutButtonPressed() {
        Display display = getDisplay();
        if (display != null) {
            display.startAboutActivity();
        }
        return true;
    }

}
