package com.bluesky.baseframe.base;


import com.bluesky.baseframe.R;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @author BlueSky
 * @date 2020/4/13
 * Description:全局常量
 */
public class AppConstant {
    //sharedpreference常量


    //Bugly app id

    //Bmob app id
    public static final String BMOB_APP_ID = "222d9d20cb02f1ce9278b0e584d887dd";

    //中国天气ID
    public static final String WEATHER_ID="SJPe3PEfvi";
    //和天气密钥
    public static final String HE_WEATHER_ID="56d25837c5b7412fb2b3bd253a577dd5";


    //时间格式
    public static final SimpleDateFormat FORMAT_FULL_DATE = new SimpleDateFormat("yyyy-MM-dd - HH:mm:ss", Locale.getDefault());
    public static final SimpleDateFormat FORMAT_NO_SECS_DATE = new SimpleDateFormat("yyyy-MM-dd - HH:mm", Locale.getDefault());

    public static final SimpleDateFormat FORMAT_ONLY_DATE = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    public static final SimpleDateFormat FORMAT_ONLY_TIME = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    public static final SimpleDateFormat FORMAT_ONLY_TIME_NO_SECS = new SimpleDateFormat("HH:mm", Locale.getDefault());


    public static final App.DialogResource SAVE_DIALOG_RES = new App.DialogResource(R.drawable.ic_save_black_24dp
            , "保存"
            , "您修改了设置,是否保存?"
            , "保存"
            , "取消");

    public static final App.DialogResource DELETE_DIALOG_RES = new App.DialogResource(R.drawable.ic_delete_black_24dp
            , "删除"
            , "确定要删除该项吗?"
            , "删除"
            , "取消");


}
