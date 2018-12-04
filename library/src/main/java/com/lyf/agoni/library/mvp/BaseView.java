package com.lyf.agoni.library.mvp;

public interface BaseView {
    void onNetError(String tag, String errorMsg);
    void onNetStart(String tag, String startMsg);
    void onNetFinish(String tag, String startMsg);

}
