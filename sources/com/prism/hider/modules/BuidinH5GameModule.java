package com.prism.hider.modules;

import R9.a;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.prism.hider.ui.GameActivity;

/* JADX INFO: loaded from: classes6.dex */
public class BuidinH5GameModule extends DynamicModule {
    public BuidinH5GameModule(String str, Drawable drawable, String str2) {
        super(str, drawable, str2);
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        a.a().m(activity, getName());
        Intent intent = new Intent(activity, (Class<?>) GameActivity.class);
        intent.putExtra(GameActivity.f167957i, getUrl());
        activity.startActivity(intent);
    }
}
