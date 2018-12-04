package com.lyf.agoni.library.base;

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
    protected boolean bActive = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        if (mModel == null) mModel = ObjectGetByClassUtils.getClass(this, 0);
        if (mPresenter == null) mPresenter = ObjectGetByClassUtils.getClass(this, 1);
        if (mModel != null && mPresenter != null) {
            mPresenter.setMV(mModel, this);
        }
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClick(View view) {

    }
}
