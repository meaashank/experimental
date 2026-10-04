package com.mbridge.msdk.dycreator.baseview;

import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b {
    public static void a(String str, int i10, RelativeLayout.LayoutParams layoutParams, int i11) {
        layoutParams.addRule(i11, str.substring(i10).hashCode());
    }
}
