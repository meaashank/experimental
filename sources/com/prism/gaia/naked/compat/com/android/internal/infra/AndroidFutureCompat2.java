package com.prism.gaia.naked.compat.com.android.internal.infra;

import com.prism.gaia.naked.metadata.com.android.internal.infra.AndroidFutureCAG;
import e.T;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidFutureCompat2 {

    public static class Util {
        public static Object completedFuture(Object obj) {
            return AndroidFutureCAG.f165984G.completedFuture().call(obj);
        }

        @T(31)
        public static boolean isAndroidFuture(Class<?> cls) {
            Class clsORG_CLASS = AndroidFutureCAG.f165984G.ORG_CLASS();
            return (clsORG_CLASS == null || cls == null || !clsORG_CLASS.isAssignableFrom(cls)) ? false : true;
        }
    }
}
