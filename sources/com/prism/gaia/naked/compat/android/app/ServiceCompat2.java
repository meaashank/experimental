package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.app.Service;
import android.os.IBinder;
import com.prism.gaia.naked.metadata.android.app.ServiceCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ServiceCompat2 {

    public static class Util {
        public static IBinder getToken(Service service) {
            return ServiceCAG.f165383G.mToken().get(service);
        }
    }
}
