package com.hide;

import U6.c;
import android.app.Application;
import android.content.Context;
import com.prism.commons.utils.l0;
import com.prism.hider.HiderApplication;

/* JADX INFO: loaded from: classes5.dex */
public class Abi64Helper {
    private static final String TAG = l0.b("Abi64Helper");

    public static void init(Context context) {
        c.m0();
        c.g();
        HiderApplication.c(context);
        HiderApplication.f167747b.a(context);
    }

    public static void onCreate(Application application) {
        HiderApplication.b().i(application);
    }

    public static void setHelperRunning64bit(boolean z10) {
        c.k0(z10);
    }

    public static void setHelperRunningApi(int i10) {
        c.l0(i10);
    }
}
