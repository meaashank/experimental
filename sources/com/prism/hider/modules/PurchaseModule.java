package com.prism.hider.modules;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import ma.C5217g;

/* JADX INFO: loaded from: classes6.dex */
public class PurchaseModule extends DynamicModule {
    public PurchaseModule(String str, Drawable drawable, String str2) {
        super(str, drawable, str2);
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        C5217g.b(activity);
    }
}
