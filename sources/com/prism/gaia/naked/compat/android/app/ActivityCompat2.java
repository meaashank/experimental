package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.app.Activity;
import android.os.IBinder;
import com.prism.gaia.naked.metadata.android.app.ActivityCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ActivityCompat2 {

    public static class Util {
        public static IBinder getToken(Activity activity) {
            return ActivityCAG.f165269G.mToken().get(activity);
        }
    }
}
