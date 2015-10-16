package zcp.mvp;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import dagger.ObjectGraph;
import zcp.mvp.controllers.MainController;
import zcp.mvp.module.AppModule;
import zcp.mvp.module.lib.ContextProvider;
import zcp.mvp.util.Injector;

/**
 * Created by Zheng on 15/7/14.
 */
public class App extends Application implements Injector {

    private ObjectGraph mObjectGraph;

    @Inject MainController mainController;

    public static App from(Context ctx) {
        return (App) ctx.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();

        mObjectGraph = ObjectGraph.create(
                new ContextProvider(this),
                new AppModule()
//                new ApplicationModule(),
//                new ViewUtilProvider(),
//                new TaskProvider(),
//                new InjectorModule(this),
//                new ReceiverProvider()
        );

        mObjectGraph.inject(this);

    }

    public MainController getMainController() {
        return mainController;
    }

    public ObjectGraph getObjectGraph() {
        return mObjectGraph;
    }


    @Override
    public void inject(Object object) {
        mObjectGraph.inject(object);
    }
}