package com.lyf.agoni.finalfantasy.home;

import com.lyf.agoni.finalfantasy.bean.BookBean;
import com.lyf.agoni.library.base.response.BaseResponse;
import com.lyf.agoni.library.net.rx.NetWorkCodeException;
import com.lyf.agoni.library.net.rx.RxObservableListener;

import java.util.HashMap;
import java.util.Map;

public class HomeP extends Home.HomeP {

    @Override
    public void getBook(String name) {

        Map<String, Object> params  = new HashMap<>();
        params.put("q", name);
        params.put("tag", "");
        params.put("start", 0);
        params.put("count", 1);

        getRxManager().getInstance().addObserver(mModel.getBook(params), new RxObservableListener<BaseResponse<BookBean>>(mView) {
            @Override
            public void onNext(BaseResponse<BookBean> result) {
                super.onNext(result);
            }

            @Override
            public void onNetError(NetWorkCodeException.ResponseThrowable e) {
                super.onNetError(e);
            }
        });

    }

    @Override
    public void getSearchBook(String name, String tag, int start, int count) {

        getRxManager().getInstance().addObserver(mModel.getBook(name, tag, start, count), new RxObservableListener<BaseResponse<BookBean>>(mView) {
            @Override
            public void onNext(BaseResponse<BookBean> result) {
                super.onNext(result);
            }

            @Override
            public void onNetError(NetWorkCodeException.ResponseThrowable e) {
                super.onNetError(e);
            }
        });
    }

}
