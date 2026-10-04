package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.e;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {
    public c(Handler handler) {
        super(handler, 15000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (e.c().b()) {
            return;
        }
        String strD = e.a().d();
        if (TextUtils.isEmpty(strD) || MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(strD)) {
            a(b());
            com.apm.insight.a.a((Object) "[DeviceIdTask] did is null, continue check.");
        } else {
            e.c().a(strD);
            com.apm.insight.a.a((Object) "[DeviceIdTask] did is ".concat(String.valueOf(strD)));
        }
    }
}
