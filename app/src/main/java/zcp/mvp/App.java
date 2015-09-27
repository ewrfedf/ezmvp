package zcp.mvp;

import android.app.Application;
import android.content.Context;

import zcp.mvp.controllers.AboutController;
import zcp.mvp.controllers.MainController;

/**
 * Created by Zheng on 15/7/14.
 */
public class App extends Application {


    private MainController mainController;


    public static App from(Context ctx) {
        return (App) ctx.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mainController = new MainController(new AboutController());
    }

    public MainController getMainController() {
        return mainController;
    }


}