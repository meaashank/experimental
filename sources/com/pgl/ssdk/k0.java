package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class k0 extends m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Context f161874p;

    public k0(Context context, String str) {
        super(context, str);
        this.f161874p = context;
        this.f161883c = l0.a() + b();
    }

    @Override // com.pgl.ssdk.m0
    public boolean a(int i10, byte[] bArr) {
        if (i10 == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    if (((Integer) com.pgl.ssdk.ces.a.meta(223, null, bArr)).intValue() == 0) {
                        com.pgl.ssdk.ces.b.f161819c = true;
                    } else {
                        com.pgl.ssdk.ces.b.f161819c = false;
                    }
                }
            } catch (Throwable unused) {
                com.pgl.ssdk.ces.b.f161819c = false;
            }
        }
        return true;
    }

    public String b() {
        StringBuilder sbA = android.support.v4.media.f.a(w.y.a("?os=0&ver=6.4.0.0.overseas-rc.5&mode=1&app_ver=", String.valueOf(z.g(this.f161874p))), "&region=");
        sbA.append(b0.a());
        StringBuilder sbA2 = android.support.v4.media.f.a(sbA.toString(), "&did=");
        sbA2.append(com.pgl.ssdk.ces.b.e());
        StringBuilder sbA3 = android.support.v4.media.f.a(sbA2.toString(), "&aid=");
        sbA3.append(com.pgl.ssdk.ces.b.d());
        return sbA3.toString();
    }
}
