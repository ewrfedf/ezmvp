package zcp.mvp.state;

import com.google.common.base.Preconditions;

import de.greenrobot.event.EventBus;
import zcp.mvp.model.PhilmUserProfile;

/**
 * 业务逻辑 具体实现
 *
 * 为Controller提供访问Model的get、set方法
 *
 * 注册event监听，并处理event回调
 *
 * 实现BeanState接口
 *
 * Created by Zheng on 15/9/25.
 */
public final class ApplicationState implements BaseState,UserState{

    private final EventBus mEventBus;

    public ApplicationState(EventBus eventBus) {
        mEventBus = Preconditions.checkNotNull(eventBus, "eventBus cannot null");
    }

    @Override
    public void registerForEvents(Object receiver) {
        mEventBus.getDefault().register(receiver);
    }

    @Override
    public void unregisterForEvents(Object receiver) {
        mEventBus.getDefault().unregister(receiver);
    }

    ////////////////////////////////
    //
    // UserState
    //
    ////////////////////////////////

    @Override
    public void setUserProfile(PhilmUserProfile profile) {

    }

    @Override
    public void setCurrentAccount(PhilmAccount account) {

    }

    @Override
    public void setUsername(String username) {

    }
}
