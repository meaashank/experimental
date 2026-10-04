package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class e1 extends m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Context f161858p;

    public e1(Context context, String str) {
        super(context, str);
        this.f161858p = context;
        this.f161883c = l0.b() + b();
    }

    @Override // com.pgl.ssdk.m0
    public boolean a(int i10, byte[] bArr) {
        Object objA;
        try {
            objA = b1.a(bArr);
        } catch (Throwable unused) {
        }
        if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
            b1.f161803a = 200;
            return true;
        }
        if (objA instanceof String) {
            b1.f161806d = (String) objA;
            b1.f161803a = 200;
            return true;
        }
        return false;
    }

    public String b() {
        return "?os=android&app_id=" + b1.f161805c + "&did=" + com.pgl.ssdk.ces.b.e() + "&app_ver=" + z.g(this.f161858p) + "&platform=android&ver=6.4.0.0.overseas-rc.5&mode=1";
    }
}
