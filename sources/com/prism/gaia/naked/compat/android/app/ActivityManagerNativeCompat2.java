package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.app.ActivityManagerNativeCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ActivityManagerNativeCompat2 {

    public static class Util {
        public static IInterface getIActivityManager() {
            return ActivityManagerNativeCAG.f165272G.getDefault().call(new Object[0]);
        }
    }
}
