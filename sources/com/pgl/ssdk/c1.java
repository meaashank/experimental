package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f161815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f161816b;

    public c1(Context context, d1 d1Var) {
        this.f161815a = d1Var;
        this.f161816b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        String strB = l0.b();
        try {
            bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.f161816b, null);
        } catch (Throwable unused) {
            b1.f161803a = 501;
        }
        if (bArr == null || bArr.length <= 0) {
            b1.f161803a = 501;
            return;
        }
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        new e1(this.f161816b, null).a(1, 2, bArr);
        d1 d1Var = this.f161815a;
        if (d1Var != null) {
            d1Var.a(b1.a());
        }
    }
}
