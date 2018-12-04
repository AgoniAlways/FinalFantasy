package com.lyf.agoni.finalfantasy.home;

import com.lyf.agoni.finalfantasy.api.HomeApi;
import com.lyf.agoni.finalfantasy.bean.BookBean;
import com.lyf.agoni.library.base.response.BaseResponse;
import com.lyf.agoni.library.net.RetrofitManager;

import java.util.Map;

import io.reactivex.Observable;

public class HomeM implements Home.HomeM {

    @Override
    public Observable<BaseResponse<BookBean>> getBook(Map<String, Object> params) {
        return RetrofitManager.getApiService(HomeApi.class).getBook(params);
    }

    @Override
    public Observable<BaseResponse<BookBean>> getBook(String name, String tag, int start, int count) {
        return RetrofitManager.getApiService(HomeApi.class).getSearchBooks(name, tag, start, count);
    }

}
