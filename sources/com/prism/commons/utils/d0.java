package com.prism.commons.utils;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162084a = l0.b(d0.class.getSimpleName());

    public static void a(Activity activity, boolean z10) {
        if (z10) {
            I.a(f162084a, "clear FLAG_SECURE ");
            activity.getWindow().clearFlags(8192);
        } else {
            I.a(f162084a, "added FLAG_SECURE ");
            activity.getWindow().addFlags(8192);
        }
    }
}
