package zcp.mvp;

import android.content.Intent;

public class AccountActivity extends BaseActivity {


    @Override
    protected void handleIntent(Intent intent, Display display) {
        if (display.hasMainFragment()) {

        }
    }

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_account;
    }
}
