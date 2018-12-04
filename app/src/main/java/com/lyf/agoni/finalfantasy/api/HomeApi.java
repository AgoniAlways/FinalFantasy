package com.lyf.agoni.finalfantasy.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import com.lyf.agoni.finalfantasy.bean.BookBean;
import com.lyf.agoni.library.base.response.BaseResponse;

import java.util.Map;

public interface HomeApi {

    @GET("v2/book/search")
    Observable<BaseResponse<BookBean>> getBook(@QueryMap Map<String, Object> params);

    @GET("v2/book/search")
    Observable<BaseResponse<BookBean>> getSearchBooks(@Query("q") String name,
                                       @Query("tag") String tag,
                                       @Query("start") int start,
                                       @Query("count") int count);

}
