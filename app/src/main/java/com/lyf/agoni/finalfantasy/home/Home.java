package com.lyf.agoni.finalfantasy.home;

import com.lyf.agoni.finalfantasy.bean.BookBean;
import com.lyf.agoni.finalfantasy.bean.WeatherBean;
import com.lyf.agoni.library.base.response.BaseResponse;
import com.lyf.agoni.library.mvp.BaseModel;
import com.lyf.agoni.library.mvp.BasePresenter;
import com.lyf.agoni.library.mvp.BaseView;

import java.util.Map;

import io.reactivex.Observable;

public interface Home {

    interface HomeM extends BaseModel {

        Observable<BaseResponse<BookBean>> getBook(Map<String, Object> params);

        Observable<BaseResponse<WeatherBean>> getWeather(String city);

    }

    interface HomeV extends BaseView {

        void showBook(BookBean bookBean);

        void showWeather(WeatherBean weatherBean);

    }

    abstract class HomeP extends BasePresenter<HomeM, HomeV> {

        public abstract void getBook(String name);

        public abstract void getWeather(String city);

    }

}
