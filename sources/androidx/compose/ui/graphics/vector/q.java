package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.B;
import androidx.compose.foundation.layout.T;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.AbstractC2131z0;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class q extends p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f101734p = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<e> f101736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final AbstractC2131z0 f101738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f101739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final AbstractC2131z0 f101740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f101741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f101742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f101743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f101744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f101745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f101746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f101747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f101748o;

    public /* synthetic */ q(String str, List list, int i10, AbstractC2131z0 abstractC2131z0, float f10, AbstractC2131z0 abstractC2131z02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, C4969v c4969v) {
        this(str, list, i10, abstractC2131z0, f10, abstractC2131z02, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final float A() {
        return this.f101748o;
    }

    public final float B() {
        return this.f101746m;
    }

    @Nullable
    public final AbstractC2131z0 b() {
        return this.f101738e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            return G.g(this.f101735b, qVar.f101735b) && G.g(this.f101738e, qVar.f101738e) && this.f101739f == qVar.f101739f && G.g(this.f101740g, qVar.f101740g) && this.f101741h == qVar.f101741h && this.f101742i == qVar.f101742i && this.f101743j == qVar.f101743j && this.f101744k == qVar.f101744k && this.f101745l == qVar.f101745l && this.f101746m == qVar.f101746m && this.f101747n == qVar.f101747n && this.f101748o == qVar.f101748o && this.f101737d == qVar.f101737d && G.g(this.f101736c, qVar.f101736c);
        }
        return false;
    }

    public final float g() {
        return this.f101739f;
    }

    @NotNull
    public final String h() {
        return this.f101735b;
    }

    public int hashCode() {
        int iA = T.a(this.f101736c, this.f101735b.hashCode() * 31, 31);
        AbstractC2131z0 abstractC2131z0 = this.f101738e;
        int iA2 = B.a(this.f101739f, (iA + (abstractC2131z0 != null ? abstractC2131z0.hashCode() : 0)) * 31, 31);
        AbstractC2131z0 abstractC2131z02 = this.f101740g;
        return B.a(this.f101748o, B.a(this.f101747n, B.a(this.f101746m, B.a(this.f101745l, (((B.a(this.f101742i, B.a(this.f101741h, (iA2 + (abstractC2131z02 != null ? abstractC2131z02.hashCode() : 0)) * 31, 31), 31) + this.f101743j) * 31) + this.f101744k) * 31, 31), 31), 31), 31) + this.f101737d;
    }

    @NotNull
    public final List<e> i() {
        return this.f101736c;
    }

    public final int j() {
        return this.f101737d;
    }

    @Nullable
    public final AbstractC2131z0 o() {
        return this.f101740g;
    }

    public final float q() {
        return this.f101741h;
    }

    public final int t() {
        return this.f101743j;
    }

    public final int v() {
        return this.f101744k;
    }

    public final float w() {
        return this.f101745l;
    }

    public final float x() {
        return this.f101742i;
    }

    public final float z() {
        return this.f101747n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, List<? extends e> list, int i10, AbstractC2131z0 abstractC2131z0, float f10, AbstractC2131z0 abstractC2131z02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f101735b = str;
        this.f101736c = list;
        this.f101737d = i10;
        this.f101738e = abstractC2131z0;
        this.f101739f = f10;
        this.f101740g = abstractC2131z02;
        this.f101741h = f11;
        this.f101742i = f12;
        this.f101743j = i11;
        this.f101744k = i12;
        this.f101745l = f13;
        this.f101746m = f14;
        this.f101747n = f15;
        this.f101748o = f16;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ q(java.lang.String r18, java.util.List r19, int r20, androidx.compose.ui.graphics.AbstractC2131z0 r21, float r22, androidx.compose.ui.graphics.AbstractC2131z0 r23, float r24, float r25, int r26, int r27, float r28, float r29, float r30, float r31, int r32, kotlin.jvm.internal.C4969v r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto La
            java.lang.String r1 = ""
            r3 = r1
            goto Lc
        La:
            r3 = r18
        Lc:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r21
        L15:
            r1 = r0 & 16
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L1d
            r7 = r4
            goto L1f
        L1d:
            r7 = r22
        L1f:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r8 = r2
            goto L27
        L25:
            r8 = r23
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r9 = r4
            goto L2f
        L2d:
            r9 = r24
        L2f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L36
            r10 = r2
            goto L38
        L36:
            r10 = r25
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L42
            int r1 = androidx.compose.ui.graphics.vector.o.d()
            r11 = r1
            goto L44
        L42:
            r11 = r26
        L44:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4e
            int r1 = androidx.compose.ui.graphics.vector.o.e()
            r12 = r1
            goto L50
        L4e:
            r12 = r27
        L50:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L58
            r1 = 1082130432(0x40800000, float:4.0)
            r13 = r1
            goto L5a
        L58:
            r13 = r28
        L5a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L60
            r14 = r2
            goto L62
        L60:
            r14 = r29
        L62:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L68
            r15 = r4
            goto L6a
        L68:
            r15 = r30
        L6a:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L77
            r16 = r2
            r4 = r19
            r5 = r20
            r2 = r17
            goto L7f
        L77:
            r16 = r31
            r2 = r17
            r4 = r19
            r5 = r20
        L7f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.q.<init>(java.lang.String, java.util.List, int, androidx.compose.ui.graphics.z0, float, androidx.compose.ui.graphics.z0, float, float, int, int, float, float, float, float, int, kotlin.jvm.internal.v):void");
    }
}
