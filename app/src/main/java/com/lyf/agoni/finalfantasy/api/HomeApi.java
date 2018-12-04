package com.lyf.agoni.finalfantasy.api;

import com.lyf.agoni.finalfantasy.bean.BookBean;
import com.lyf.agoni.finalfantasy.bean.WeatherBean;
import com.lyf.agoni.library.base.response.BaseResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface HomeApi {

    @GET("v2/book/search")
    Observable<BaseResponse<BookBean>> getBook(@QueryMap Map<String, Object> params);

    @GET("https://www.apiopen.top/weatherApi?")
    Observable<BaseResponse<WeatherBean>> getWeather(@Query("city") String city);

}
