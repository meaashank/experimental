package com.prism.fusionadsdkbase;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public interface f {
    void gatherConsent(Activity activity, h hVar);

    void init(Context context, String str);

    void requestPermissionIfNecessary(Activity activity);
}
