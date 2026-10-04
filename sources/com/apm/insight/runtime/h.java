package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f137495a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137496b = -1;

    public static com.apm.insight.nativecrash.b a(Context context) {
        return new com.apm.insight.nativecrash.b(context, new ICommonParams() { // from class: com.apm.insight.runtime.h.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    public final boolean b() {
        return this.f137495a != null;
    }

    public final void a(String str) {
        this.f137495a = str;
        q.a().a(str);
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f137495a) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f137495a)) {
            return this.f137495a;
        }
        String strD = com.apm.insight.e.a().d();
        this.f137495a = strD;
        if (!TextUtils.isEmpty(strD) && !MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f137495a)) {
            return this.f137495a;
        }
        String strB = q.a().b();
        this.f137495a = strB;
        return strB;
    }
}
