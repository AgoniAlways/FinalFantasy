package com.lyf.agoni.finalfantasy.bean;

import java.util.List;

public class WeatherBean {

    /**{
        "code": 200,
            "msg": "成功!",
            "data": {
        "yesterday": {
            "date": "3日星期一",
                    "high": "高温 19℃",
                    "fx": "东北风",
                    "low": "低温 14℃",
                    "fl": "<![CDATA[<3级]]>",
                    "type": "小雨"
        },
        "city": "上海",
                "aqi": "28",
                "forecast": [
        {
            "date": "4日星期二",
                "high": "高温 16℃",
                "fengli": "<![CDATA[4-5级]]>",
                "low": "低温 11℃",
                "fengxiang": "东北风",
                "type": "小雨"
        },
        {
            "date": "5日星期三",
                "high": "高温 13℃",
                "fengli": "<![CDATA[4-5级]]>",
                "low": "低温 11℃",
                "fengxiang": "东北风",
                "type": "多云"
        },
        {
            "date": "6日星期四",
                "high": "高温 12℃",
                "fengli": "<![CDATA[4-5级]]>",
                "low": "低温 8℃",
                "fengxiang": "北风",
                "type": "中雨"
        },
        {
            "date": "7日星期五",
                "high": "高温 9℃",
                "fengli": "<![CDATA[4-5级]]>",
                "low": "低温 4℃",
                "fengxiang": "北风",
                "type": "小雨"
        },
        {
            "date": "8日星期六",
                "high": "高温 7℃",
                "fengli": "<![CDATA[4-5级]]>",
                "low": "低温 5℃",
                "fengxiang": "北风",
                "type": "小雨"
        }
        ],
        "ganmao": "将有一次强降温过程，天气寒冷，且风力较强，极易发生感冒，请特别注意增加衣服保暖防寒。",
                "wendu": "13"
    }
    }
     */

    public Yesterday yesterday;

    public String city;

    public String ganmao;

    public String wendu;

    public List<Forecast> forecast;

    public class Forecast{

        public String date;

        public String high;

        public String fengli;

        public String low;

        public String fengxiang;

        public String type;
    }

    public class Yesterday{

        public String date;

        public String high;

        public String fx;

        public String low;

        public String fl;

        public String type;
    }

}
