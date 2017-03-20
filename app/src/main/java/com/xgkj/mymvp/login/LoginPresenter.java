package com.xgkj.mymvp.login;


import com.xgkj.mymvp.mvp.BasePresenterImpl;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class LoginPresenter extends BasePresenterImpl<LoginContract.View> implements LoginContract.Presenter{

    @Override
    public void login(String userName, String password) {
        if (userName.equals("") && password.equals("")){
            mView.loginSuccess(null);
        }else {
            mView.loginFailed("密码和账号不正确！");
        }
    }
}
