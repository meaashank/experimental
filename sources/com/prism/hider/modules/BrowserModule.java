package com.prism.hider.modules;

import R9.a;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public class BrowserModule extends DynamicModule {
    public BrowserModule(String str, Drawable drawable, String str2) {
        super(str, drawable, str2);
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        a.a().e(activity);
        Intent intent = new Intent();
        intent.setClassName(activity.getPackageName(), "com.cookiegames.smartcookie.MainActivity");
        activity.startActivity(intent);
    }
}
