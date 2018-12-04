package com.lyf.agoni.finalfantasy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lyf.agoni.finalfantasy.bean.BookBean;
import com.lyf.agoni.finalfantasy.bean.WeatherBean;
import com.lyf.agoni.finalfantasy.home.Home;
import com.lyf.agoni.finalfantasy.home.HomeM;
import com.lyf.agoni.finalfantasy.home.HomeP;
import com.lyf.agoni.library.base.BaseActivity;

public class MainActivity extends BaseActivity<HomeM, HomeP> implements Home.HomeV {

    private Button mBtnQuery;
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        mBtnQuery = findViewById(R.id.btn_final);
        mBtnQuery.setOnClickListener(this);
        mTvResult = findViewById(R.id.tv_final);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_final:
//                mPresenter.getBook("三国演义");
                mPresenter.getWeather("上海");
                break;
        }
    }

    @Override
    public void showBook(BookBean bookBean) {

    }

    @Override
    public void showWeather(WeatherBean weatherBean) {
        if (weatherBean != null) {
            mTvResult.setText(weatherBean.ganmao);
        }
    }

    @Override
    public void onNetError(String tag, String errorMsg) {
        dismissLoading();
    }

    @Override
    public void onNetStart(String tag, String startMsg) {
        showLoading();
    }

    @Override
    public void onNetFinish(String tag, String startMsg) {
        dismissLoading();
    }

}
