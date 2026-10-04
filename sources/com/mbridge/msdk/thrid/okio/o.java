package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f159842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f159843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f159844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f159845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f159846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    o f159847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o f159848g;

    public o() {
        this.f159842a = new byte[8192];
        this.f159846e = true;
        this.f159845d = false;
    }

    public final o a(o oVar) {
        oVar.f159848g = this;
        oVar.f159847f = this.f159847f;
        this.f159847f.f159848g = oVar;
        this.f159847f = oVar;
        return oVar;
    }

    @Nullable
    public final o b() {
        o oVar = this.f159847f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f159848g;
        oVar3.f159847f = oVar;
        this.f159847f.f159848g = oVar3;
        this.f159847f = null;
        this.f159848g = null;
        return oVar2;
    }

    public final o c() {
        this.f159845d = true;
        return new o(this.f159842a, this.f159843b, this.f159844c, true, false);
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f159842a = bArr;
        this.f159843b = i10;
        this.f159844c = i11;
        this.f159845d = z10;
        this.f159846e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f159844c - this.f159843b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f159842a, this.f159843b, oVarA.f159842a, 0, i10);
            }
            oVarA.f159844c = oVarA.f159843b + i10;
            this.f159843b += i10;
            this.f159848g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f159848g;
        if (oVar != this) {
            if (oVar.f159846e) {
                int i10 = this.f159844c - this.f159843b;
                if (i10 > (8192 - oVar.f159844c) + (oVar.f159845d ? 0 : oVar.f159843b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f159846e) {
            int i11 = oVar.f159844c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f159845d) {
                    int i13 = oVar.f159843b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f159842a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f159844c -= oVar.f159843b;
                        oVar.f159843b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f159842a, this.f159843b, oVar.f159842a, oVar.f159844c, i10);
            oVar.f159844c += i10;
            this.f159843b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
