package com.prism.commons.utils;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.prism.commons.utils.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3839c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f162080b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162079a = l0.b(C3839c.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f162081c = false;

    @SuppressLint({"DiscouragedPrivateApi"})
    public static IBinder a(IBinder iBinder) {
        if (f162080b != null) {
            return b(iBinder);
        }
        if (!f162081c) {
            synchronized (C3839c.class) {
                if (f162080b != null) {
                    return b(iBinder);
                }
                try {
                    Method declaredMethod = Binder.class.getDeclaredMethod("allowBlocking", IBinder.class);
                    f162080b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Throwable th) {
                    I.w(f162079a, "mdAllowBlocking reflection failed: " + th.getMessage(), th);
                    f162080b = null;
                    f162081c = true;
                }
                if (f162080b != null) {
                    return b(iBinder);
                }
            }
        }
        return iBinder;
    }

    public static IBinder b(IBinder iBinder) {
        try {
            return (IBinder) f162080b.invoke(null, iBinder);
        } catch (Throwable th) {
            I.d(f162079a, "mdAllowBlocking invoke failed: " + th.getMessage(), th);
            return null;
        }
    }

    public static boolean c(IInterface iInterface) {
        return iInterface.asBinder().isBinderAlive();
    }
}
