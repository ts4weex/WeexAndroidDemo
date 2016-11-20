package demo.android.weex.tomsnail.cn.weexandroiddemo;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXFileUtils;

import java.util.Date;

/**
 * Created by yangsong on 2016/11/9.
 */

public class WXEventModule extends WXModule {

    private static final String WEEX_CATEGORY = "com.taobao.android.intent.category.WEEX";

    @WXModuleAnno(moduleMethod = true,runOnUIThread = true)
    public void openURL(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }

        if (TextUtils.isEmpty(url)) {
            return;
        }
        String scheme = Uri.parse(url).getScheme();
        StringBuilder builder = new StringBuilder();
        if (TextUtils.equals("http",scheme) || TextUtils.equals("https",scheme) || TextUtils.equals("file",scheme)) {
            builder.append(url);
        } else {
            builder.append("http:");
            builder.append(url);
        }

        Uri uri = Uri.parse(builder.toString());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.addCategory(WEEX_CATEGORY);
        mWXSDKInstance.getContext().startActivity(intent);

//        String scheme = Uri.parse(url).getScheme();
//        StringBuilder builder = new StringBuilder();
//        if (TextUtils.equals("http",scheme) || TextUtils.equals("https",scheme) || TextUtils.equals("file",scheme)) {
//            builder.append(url);
//        } else {
//            builder.append("http:");
//            builder.append(url);
//        }

//        Intent intent = new Intent();
//        //设置Intent的class属性，跳转到SecondActivity
//        intent.setClass(MainActivity.context,Main1Activity.class);
//        //为intent添加额外的信息
//        intent.putExtra("url", url);
//        mWXSDKInstance.getContext().startActivity(intent);
//        MainActivity.refresh(("test"+new Date().getTime()),url,MainActivity.context);
    }
}
