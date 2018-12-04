package com.lyf.agoni.library.net.http;

public class HttpConfig {

    public final static String BASE_URL = "https://api.douban.com/";

    public static boolean isDebug = true;
    //网络缓存地址
    public static String URL_CACHE;
    public static String HttpLogTAG = "final_fantasy_http";
    //缓存最大的内存,默认为10M
    public static long MAX_MEMORY_SIZE = 10 * 1024 * 1024;

    //SharePreference的配置文件名
    public static String USER_CONFIG = "final_fantasy_preference";

    //链接超时时间 10s
    public static final int connectTimeout = 300;
    //读取超时时间 10s
    public static final int readTimeout = 300;
    //写超时时间 10s
    public static final int writeTimeout = 300;

}
