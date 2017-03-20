package com.xgkj.mymvp.login;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.xgkj.mymvp.R;
import com.xgkj.mymvp.mvp.MVPBaseActivity;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class LoginActivity extends MVPBaseActivity<LoginContract.View, LoginPresenter> implements LoginContract.View {

    static float payMoney=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    @Override
    public void loginSuccess(Object user) {
    }

    @Override
    public void loginFailed(String message) {

    }
}
