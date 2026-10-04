package com.prism.hider.vault.calculator;

import android.content.Context;
import com.android.launcher3.IconCache;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.HashMap;
import java.util.Map;
import rb.C5548b;

/* JADX INFO: loaded from: classes6.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f168418a;

    public A(Context context) {
        HashMap map = new HashMap();
        this.f168418a = map;
        map.put(IconCache.EMPTY_CLASS_NAME, IconCache.EMPTY_CLASS_NAME);
        for (int i10 = 0; i10 <= 9; i10++) {
            this.f168418a.put(Integer.toString(i10), String.valueOf((char) (i10 + 48)));
        }
        this.f168418a.put(RemoteSettings.FORWARD_SLASH_STRING, context.getString(C5548b.m.f235816N2));
        this.f168418a.put("*", context.getString(C5548b.m.f235824P2));
        this.f168418a.put(com.prism.gaia.download.a.f164606q, context.getString(C5548b.m.f235836S2));
        this.f168418a.put("cos", context.getString(C5548b.m.f235766D0));
        this.f168418a.put(BidResponsed.KEY_LN, context.getString(C5548b.m.f235771E0));
        this.f168418a.put("log", context.getString(C5548b.m.f235776F0));
        this.f168418a.put("sin", context.getString(C5548b.m.f235781G0));
        this.f168418a.put("tan", context.getString(C5548b.m.f235786H0));
        this.f168418a.put(kotlin.time.j.f218437k, context.getString(C5548b.m.f235801K0));
    }

    public String a(String str) {
        for (Map.Entry<String, String> entry : this.f168418a.entrySet()) {
            str = str.replace(entry.getKey(), entry.getValue());
        }
        return str;
    }

    public String b(String str) {
        for (Map.Entry<String, String> entry : this.f168418a.entrySet()) {
            str = str.replace(entry.getValue(), entry.getKey());
        }
        return str;
    }
}
