package jp.mixi.triaina.webview;

import jp.mixi.triaina.injector.TriainaApplication;

import android.content.Context;

public class InjectorHelper {
    public <T> T inject(Context context, T obj) {
        ((TriainaApplication)context.getApplicationContext()).getInjector(context).injectMembers(obj);
        return obj;
    }
}
