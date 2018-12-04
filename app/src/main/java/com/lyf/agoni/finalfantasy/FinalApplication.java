package com.lyf.agoni.finalfantasy;

import android.app.Application;

import com.lyf.agoni.library.utils.Utils;

public class FinalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
    }

}
