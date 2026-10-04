package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.os.IBinder;
import com.prism.gaia.naked.compat.android.app.ActivityManagerNativeCompat2;
import com.prism.gaia.naked.metadata.android.app.IActivityManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IActivityManagerCompat2 {

    public static class Util {
        public static int getTaskForActivity(IBinder iBinder) {
            return IActivityManagerCAG.f165322G.getTaskForActivity().call(ActivityManagerNativeCompat2.Util.getIActivityManager(), iBinder, Boolean.FALSE).intValue();
        }
    }
}
