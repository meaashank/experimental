package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f159592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f159593b = new int[10];

    public void a() {
        this.f159592a = 0;
        Arrays.fill(this.f159593b, 0);
    }

    public int b() {
        if ((this.f159592a & 2) != 0) {
            return this.f159593b[1];
        }
        return -1;
    }

    public int c(int i10) {
        return (this.f159592a & 32) != 0 ? this.f159593b[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f159592a) != 0;
    }

    public int b(int i10) {
        return (this.f159592a & 16) != 0 ? this.f159593b[4] : i10;
    }

    public int c() {
        if ((this.f159592a & 128) != 0) {
            return this.f159593b[7];
        }
        return 65535;
    }

    public int d() {
        return Integer.bitCount(this.f159592a);
    }

    public m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f159593b;
            if (i10 < iArr.length) {
                this.f159592a = (1 << i10) | this.f159592a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public int a(int i10) {
        return this.f159593b[i10];
    }

    public void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }
}
