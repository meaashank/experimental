package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class WMI {
    private static volatile om<com.bytedance.sdk.openadsdk.uR.ZRu> NOt = null;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context ZRu = null;
    private static int mZ = -1;

    public static class ZRu {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application ZRu;

        static {
            try {
                Object objNOt = NOt();
                ZRu = (Application) objNOt.getClass().getMethod("getApplication", null).invoke(objNOt, null);
                com.bytedance.sdk.component.utils.lp.ZRu("MyApplication", "application get success");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("MyApplication", "application get failed", th);
            }
        }

        private static Object NOt() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        @Nullable
        public static Application ZRu() {
            return ZRu;
        }
    }

    public static void NOt(Context context) {
        if (ZRu == null) {
            synchronized (WMI.class) {
                try {
                    if (ZRu == null) {
                        if (context != null) {
                            ZRu = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                ZRu = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationZRu = ZRu.ZRu();
                            if (applicationZRu != null) {
                                ZRu = applicationZRu;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.edo.mZ.NOt TFq() {
        return !com.bytedance.sdk.openadsdk.core.settings.lp.ZRu() ? com.bytedance.sdk.openadsdk.edo.mZ.mZ.ZRu() : com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu();
    }

    public static Context ZRu() {
        if (ZRu == null) {
            NOt(null);
        }
        return ZRu;
    }

    public static om<com.bytedance.sdk.openadsdk.uR.ZRu> mZ() {
        if (NOt == null) {
            synchronized (WMI.class) {
                try {
                    if (NOt == null) {
                        NOt = new OCA(ZRu);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.Ht uR() {
        return com.bytedance.sdk.openadsdk.core.settings.yBV.CH();
    }

    public static Context ZRu(Context context) {
        if (context == null) {
            context = ZRu();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int NOt() {
        Context contextZRu;
        if (mZ < 0 && (contextZRu = ZRu()) != null) {
            mZ = ViewConfiguration.get(contextZRu).getScaledTouchSlop();
        }
        return mZ;
    }
}
