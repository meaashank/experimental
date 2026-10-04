package com.prism.gaia.naked.compat.android.os;

import W6.c;
import android.os.IBinder;
import com.prism.gaia.naked.metadata.android.os.ServiceManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ServiceManagerCompat2 {

    public static class Util {
        public static IBinder getService(String str) {
            return ServiceManagerCAG.f165890G.getService().call(str);
        }

        public static void putService(String str, IBinder iBinder) {
            ServiceManagerCAG.f165890G.sCache().get().put(str, iBinder);
        }
    }
}
