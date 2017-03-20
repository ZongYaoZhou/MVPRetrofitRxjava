package com.xgkj.mymvp.mvp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.ParameterizedType;


public abstract class MVPBaseActivity<V extends BaseView,T extends BasePresenterImpl<V>> extends AppCompatActivity implements BaseView{
    public T mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter= getInstance(this,1);
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null)
        mPresenter.detachView();
    }

    @Override
    public Context getContext(){
        return this;
    }

    public  <T> T getInstance(Object o, int i) {
        try {
            return ((Class<T>) ((ParameterizedType) (o.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[i])
                    .newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ProgressDialog mProgressDialog;
    public ProgressDialog showProgressDialog() {
        mProgressDialog = new ProgressDialog(getContext());
        mProgressDialog.setMessage("拼命加载中...");
        mProgressDialog.show();
        return mProgressDialog;
    }
    public ProgressDialog showProgressDialog(CharSequence message) {
        mProgressDialog = new ProgressDialog(getContext());
        mProgressDialog.setMessage(message);
        mProgressDialog.show();
        return mProgressDialog;
    }
    public void dismissProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            // progressDialog.hide();会导致android.view.WindowLeaked
            mProgressDialog.dismiss();
        }
    }
}
