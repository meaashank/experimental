package com.prism.commons.utils;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: com.prism.commons.utils.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3848l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162112a = l0.b(C3848l.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3861z<String, Context> f162113b = new C3861z<>(new C3847k());

    public static String b(Context context) {
        return f162113b.a(context);
    }

    public static String c(Context context) {
        try {
            String str = (String) Context.class.getDeclaredMethod("getOpPackageName", null).invoke(context, null);
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("get host pkg null in vault");
        } catch (Throwable th) {
            Log.e(f162112a, "can not get host pkg name;", th);
            throw new IllegalStateException(th);
        }
    }
}
