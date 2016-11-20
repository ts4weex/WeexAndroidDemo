package demo.android.weex.tomsnail.cn.weexandroiddemo;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/**
 * Created by yangsong on 2016/11/9.
 */

public class WXApplication  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        InitConfig config=new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
