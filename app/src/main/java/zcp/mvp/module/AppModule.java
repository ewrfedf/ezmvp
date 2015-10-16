package zcp.mvp.module;

import dagger.Module;
import zcp.mvp.App;
import zcp.mvp.module.lib.UtilProvider;

/**
 * Created by Zheng on 15/10/15.
 */
@Module(
        injects = {
                App.class
        },
        includes = UtilProvider.class
)
public class AppModule {

}
