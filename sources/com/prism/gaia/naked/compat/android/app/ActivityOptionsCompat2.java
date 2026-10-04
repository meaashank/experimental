package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.os.Bundle;
import com.prism.gaia.naked.metadata.android.app.ActivityOptionsCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ActivityOptionsCompat2 {

    public static class Util {
        public static Object getActivityOptions(Bundle bundle) {
            if (bundle != null) {
                return ActivityOptionsCAG.J16.ctor().newInstance(bundle);
            }
            return null;
        }

        public static boolean getLaunchTaskBehind(Object obj) {
            if (ActivityOptionsCAG.f165273C.getLaunchTaskBehind() == null || obj == null) {
                return false;
            }
            return ActivityOptionsCAG.f165273C.getLaunchTaskBehind().call(obj, new Object[0]).booleanValue();
        }

        public static int getLaunchTaskId(Object obj) {
            if (ActivityOptionsCAG.f165273C.getLaunchTaskId() == null || obj == null) {
                return -1;
            }
            return ActivityOptionsCAG.f165273C.getLaunchTaskId().call(obj, new Object[0]).intValue();
        }
    }
}
