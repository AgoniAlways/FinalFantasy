package com.lyf.agoni.library.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lyf.agoni.library.mvp.BaseModel;
import com.lyf.agoni.library.mvp.BasePresenter;
import com.lyf.agoni.library.utils.ObjectGetByClassUtils;

public class BaseActivity<T extends BaseModel, E extends BasePresenter> extends AppCompatActivity implements View.OnClickListener {

    public T mModel;
    public E mPresenter;

    private ProgressDialog mProgressBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (mModel == null) mModel = ObjectGetByClassUtils.getClass(this, 0);
        if (mPresenter == null) mPresenter = ObjectGetByClassUtils.getClass(this, 1);
        if (mModel != null && mPresenter != null) {
            mPresenter.setMV(mModel, this);
        }

        mProgressBar = new ProgressDialog(this);
        mProgressBar.setTitle("loading...");
    }

    @Override
    public void onClick(View view) {

    }

    public void dismissLoading() {
        if (mProgressBar != null && mProgressBar.isShowing()) {
            mProgressBar.dismiss();
        }
    }

    public void showLoading() {
        if (mProgressBar != null && !mProgressBar.isShowing()) {
            mProgressBar.show();
        }
    }

}
