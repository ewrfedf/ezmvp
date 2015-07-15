package zcp.mvp;

import android.app.Application;
import android.content.Context;

import zcp.mvp.controller.AboutController;
import zcp.mvp.controller.MainController;

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
        mainController =  MainController.newInstance(AboutController.newInstance());
    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}