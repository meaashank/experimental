package androidx.compose.ui.platform;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.ui.graphics.Q2;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2249i0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f103856z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f103857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f103860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f103861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f103862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f103863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f103864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f103865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f103866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f103867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f103868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f103869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f103870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f103871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f103872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f103873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f103874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f103875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f103876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f103877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f103878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f103879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Q2 f103880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f103881y;

    public /* synthetic */ C2249i0(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, Q2 q22, int i18, C4969v c4969v) {
        this(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, q22, i18);
    }

    public static C2249i0 A(C2249i0 c2249i0, long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, Q2 q22, int i18, int i19, Object obj) {
        long j11 = (i19 & 1) != 0 ? c2249i0.f103857a : j10;
        int i20 = (i19 & 2) != 0 ? c2249i0.f103858b : i10;
        int i21 = (i19 & 4) != 0 ? c2249i0.f103859c : i11;
        int i22 = (i19 & 8) != 0 ? c2249i0.f103860d : i12;
        int i23 = (i19 & 16) != 0 ? c2249i0.f103861e : i13;
        int i24 = (i19 & 32) != 0 ? c2249i0.f103862f : i14;
        int i25 = (i19 & 64) != 0 ? c2249i0.f103863g : i15;
        float f22 = (i19 & 128) != 0 ? c2249i0.f103864h : f10;
        float f23 = (i19 & 256) != 0 ? c2249i0.f103865i : f11;
        float f24 = (i19 & 512) != 0 ? c2249i0.f103866j : f12;
        float f25 = (i19 & 1024) != 0 ? c2249i0.f103867k : f13;
        float f26 = (i19 & 2048) != 0 ? c2249i0.f103868l : f14;
        int i26 = (i19 & 4096) != 0 ? c2249i0.f103869m : i16;
        long j12 = j11;
        int i27 = (i19 & 8192) != 0 ? c2249i0.f103870n : i17;
        float f27 = (i19 & 16384) != 0 ? c2249i0.f103871o : f15;
        float f28 = (i19 & 32768) != 0 ? c2249i0.f103872p : f16;
        float f29 = (i19 & 65536) != 0 ? c2249i0.f103873q : f17;
        float f30 = (i19 & 131072) != 0 ? c2249i0.f103874r : f18;
        float f31 = (i19 & 262144) != 0 ? c2249i0.f103875s : f19;
        float f32 = (i19 & 524288) != 0 ? c2249i0.f103876t : f20;
        boolean z12 = (i19 & 1048576) != 0 ? c2249i0.f103877u : z10;
        boolean z13 = (i19 & 2097152) != 0 ? c2249i0.f103878v : z11;
        float f33 = (i19 & 4194304) != 0 ? c2249i0.f103879w : f21;
        Q2 q23 = (i19 & 8388608) != 0 ? c2249i0.f103880x : q22;
        int i28 = (i19 & 16777216) != 0 ? c2249i0.f103881y : i18;
        c2249i0.getClass();
        return new C2249i0(j12, i20, i21, i22, i23, i24, i25, f22, f23, f24, f25, f26, i26, i27, f27, f28, f29, f30, f31, f32, z12, z13, f33, q23, i28);
    }

    public final float B() {
        return this.f103879w;
    }

    public final int C() {
        return this.f103869m;
    }

    public final int D() {
        return this.f103861e;
    }

    public final float E() {
        return this.f103874r;
    }

    public final boolean F() {
        return this.f103878v;
    }

    public final boolean G() {
        return this.f103877u;
    }

    public final int H() {
        return this.f103881y;
    }

    public final float I() {
        return this.f103868l;
    }

    public final int J() {
        return this.f103863g;
    }

    public final int K() {
        return this.f103858b;
    }

    public final float L() {
        return this.f103875s;
    }

    public final float M() {
        return this.f103876t;
    }

    @Nullable
    public final Q2 N() {
        return this.f103880x;
    }

    public final int O() {
        return this.f103860d;
    }

    public final float P() {
        return this.f103872p;
    }

    public final float Q() {
        return this.f103873q;
    }

    public final float R() {
        return this.f103871o;
    }

    public final float S() {
        return this.f103864h;
    }

    public final float T() {
        return this.f103865i;
    }

    public final int U() {
        return this.f103870n;
    }

    public final int V() {
        return this.f103859c;
    }

    public final float W() {
        return this.f103866j;
    }

    public final float X() {
        return this.f103867k;
    }

    public final long Y() {
        return this.f103857a;
    }

    public final int Z() {
        return this.f103862f;
    }

    public final long a() {
        return this.f103857a;
    }

    public final void a0(float f10) {
        this.f103879w = f10;
    }

    public final float b() {
        return this.f103866j;
    }

    public final void b0(int i10) {
        this.f103869m = i10;
    }

    public final float c() {
        return this.f103867k;
    }

    public final void c0(float f10) {
        this.f103874r = f10;
    }

    public final float d() {
        return this.f103868l;
    }

    public final void d0(boolean z10) {
        this.f103878v = z10;
    }

    public final int e() {
        return this.f103869m;
    }

    public final void e0(boolean z10) {
        this.f103877u = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249i0)) {
            return false;
        }
        C2249i0 c2249i0 = (C2249i0) obj;
        return this.f103857a == c2249i0.f103857a && this.f103858b == c2249i0.f103858b && this.f103859c == c2249i0.f103859c && this.f103860d == c2249i0.f103860d && this.f103861e == c2249i0.f103861e && this.f103862f == c2249i0.f103862f && this.f103863g == c2249i0.f103863g && Float.compare(this.f103864h, c2249i0.f103864h) == 0 && Float.compare(this.f103865i, c2249i0.f103865i) == 0 && Float.compare(this.f103866j, c2249i0.f103866j) == 0 && Float.compare(this.f103867k, c2249i0.f103867k) == 0 && Float.compare(this.f103868l, c2249i0.f103868l) == 0 && this.f103869m == c2249i0.f103869m && this.f103870n == c2249i0.f103870n && Float.compare(this.f103871o, c2249i0.f103871o) == 0 && Float.compare(this.f103872p, c2249i0.f103872p) == 0 && Float.compare(this.f103873q, c2249i0.f103873q) == 0 && Float.compare(this.f103874r, c2249i0.f103874r) == 0 && Float.compare(this.f103875s, c2249i0.f103875s) == 0 && Float.compare(this.f103876t, c2249i0.f103876t) == 0 && this.f103877u == c2249i0.f103877u && this.f103878v == c2249i0.f103878v && Float.compare(this.f103879w, c2249i0.f103879w) == 0 && kotlin.jvm.internal.G.g(this.f103880x, c2249i0.f103880x) && this.f103881y == c2249i0.f103881y;
    }

    public final int f() {
        return this.f103870n;
    }

    public final void f0(int i10) {
        this.f103881y = i10;
    }

    public final float g() {
        return this.f103871o;
    }

    public final void g0(float f10) {
        this.f103868l = f10;
    }

    public final float h() {
        return this.f103872p;
    }

    public final void h0(float f10) {
        this.f103875s = f10;
    }

    public int hashCode() {
        int iA = androidx.compose.animation.B.a(this.f103879w, (C1635o.a(this.f103878v) + ((C1635o.a(this.f103877u) + androidx.compose.animation.B.a(this.f103876t, androidx.compose.animation.B.a(this.f103875s, androidx.compose.animation.B.a(this.f103874r, androidx.compose.animation.B.a(this.f103873q, androidx.compose.animation.B.a(this.f103872p, androidx.compose.animation.B.a(this.f103871o, (((androidx.compose.animation.B.a(this.f103868l, androidx.compose.animation.B.a(this.f103867k, androidx.compose.animation.B.a(this.f103866j, androidx.compose.animation.B.a(this.f103865i, androidx.compose.animation.B.a(this.f103864h, ((((((((((((C1550p.a(this.f103857a) * 31) + this.f103858b) * 31) + this.f103859c) * 31) + this.f103860d) * 31) + this.f103861e) * 31) + this.f103862f) * 31) + this.f103863g) * 31, 31), 31), 31), 31), 31) + this.f103869m) * 31) + this.f103870n) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31);
        Q2 q22 = this.f103880x;
        return ((iA + (q22 == null ? 0 : q22.hashCode())) * 31) + this.f103881y;
    }

    public final float i() {
        return this.f103873q;
    }

    public final void i0(float f10) {
        this.f103876t = f10;
    }

    public final float j() {
        return this.f103874r;
    }

    public final void j0(@Nullable Q2 q22) {
        this.f103880x = q22;
    }

    public final float k() {
        return this.f103875s;
    }

    public final void k0(float f10) {
        this.f103872p = f10;
    }

    public final int l() {
        return this.f103858b;
    }

    public final void l0(float f10) {
        this.f103873q = f10;
    }

    public final float m() {
        return this.f103876t;
    }

    public final void m0(float f10) {
        this.f103871o = f10;
    }

    public final boolean n() {
        return this.f103877u;
    }

    public final void n0(float f10) {
        this.f103864h = f10;
    }

    public final boolean o() {
        return this.f103878v;
    }

    public final void o0(float f10) {
        this.f103865i = f10;
    }

    public final float p() {
        return this.f103879w;
    }

    public final void p0(int i10) {
        this.f103870n = i10;
    }

    @Nullable
    public final Q2 q() {
        return this.f103880x;
    }

    public final void q0(float f10) {
        this.f103866j = f10;
    }

    public final int r() {
        return this.f103881y;
    }

    public final void r0(float f10) {
        this.f103867k = f10;
    }

    public final int s() {
        return this.f103859c;
    }

    public final int t() {
        return this.f103860d;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.f103857a + ", left=" + this.f103858b + ", top=" + this.f103859c + ", right=" + this.f103860d + ", bottom=" + this.f103861e + ", width=" + this.f103862f + ", height=" + this.f103863g + ", scaleX=" + this.f103864h + ", scaleY=" + this.f103865i + ", translationX=" + this.f103866j + ", translationY=" + this.f103867k + ", elevation=" + this.f103868l + ", ambientShadowColor=" + this.f103869m + ", spotShadowColor=" + this.f103870n + ", rotationZ=" + this.f103871o + ", rotationX=" + this.f103872p + ", rotationY=" + this.f103873q + ", cameraDistance=" + this.f103874r + ", pivotX=" + this.f103875s + ", pivotY=" + this.f103876t + ", clipToOutline=" + this.f103877u + ", clipToBounds=" + this.f103878v + ", alpha=" + this.f103879w + ", renderEffect=" + this.f103880x + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.Q1.i(this.f103881y)) + ')';
    }

    public final int u() {
        return this.f103861e;
    }

    public final int v() {
        return this.f103862f;
    }

    public final int w() {
        return this.f103863g;
    }

    public final float x() {
        return this.f103864h;
    }

    public final float y() {
        return this.f103865i;
    }

    @NotNull
    public final C2249i0 z(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, @Nullable Q2 q22, int i18) {
        return new C2249i0(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, q22, i18);
    }

    public C2249i0(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, Q2 q22, int i18) {
        this.f103857a = j10;
        this.f103858b = i10;
        this.f103859c = i11;
        this.f103860d = i12;
        this.f103861e = i13;
        this.f103862f = i14;
        this.f103863g = i15;
        this.f103864h = f10;
        this.f103865i = f11;
        this.f103866j = f12;
        this.f103867k = f13;
        this.f103868l = f14;
        this.f103869m = i16;
        this.f103870n = i17;
        this.f103871o = f15;
        this.f103872p = f16;
        this.f103873q = f17;
        this.f103874r = f18;
        this.f103875s = f19;
        this.f103876t = f20;
        this.f103877u = z10;
        this.f103878v = z11;
        this.f103879w = f21;
        this.f103880x = q22;
        this.f103881y = i18;
    }
}
