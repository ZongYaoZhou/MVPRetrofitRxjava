package com.xgkj.mymvp.login;


import com.xgkj.mymvp.mvp.BasePresenter;
import com.xgkj.mymvp.mvp.BaseView;


public class LoginContract {
    interface View extends BaseView {
        void loginSuccess(Object user);
        void loginFailed(String message);
    }

    interface  Presenter extends BasePresenter<View> {
        void login(String userName,String password);
    }
}
