package androidx.compose.ui.text;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.a3;
import androidx.compose.ui.text.font.AbstractC2325w;
import h0.C4481i;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class I {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f104238q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.style.m f104239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.font.L f104241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.font.H f104242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.font.I f104243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final AbstractC2325w f104244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f104245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f104246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.style.a f104247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.style.n f104248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final C4481i f104249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f104250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.style.j f104251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final a3 f104252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final E f104253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.graphics.drawscope.k f104254p;

    public /* synthetic */ I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, C4969v c4969v) {
        this(j10, j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, e10, kVar);
    }

    public static /* synthetic */ I F(I i10, I i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = null;
        }
        return i10.E(i11);
    }

    public static I b(I i10, long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i11, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, int i12, Object obj) {
        return i10.a((i12 & 1) != 0 ? i10.f104239a.a() : j10, (i12 & 2) != 0 ? i10.f104240b : j11, (i12 & 4) != 0 ? i10.f104241c : l10, (i12 & 8) != 0 ? i10.f104242d : h10, (i12 & 16) != 0 ? i10.f104243e : i11, (i12 & 32) != 0 ? i10.f104244f : abstractC2325w, (i12 & 64) != 0 ? i10.f104245g : str, (i12 & 128) != 0 ? i10.f104246h : j12, (i12 & 256) != 0 ? i10.f104247i : aVar, (i12 & 512) != 0 ? i10.f104248j : nVar, (i12 & 1024) != 0 ? i10.f104249k : c4481i, (i12 & 2048) != 0 ? i10.f104250l : j13, (i12 & 4096) != 0 ? i10.f104251m : jVar, (i12 & 8192) != 0 ? i10.f104252n : a3Var, (i12 & 16384) != 0 ? i10.f104253o : e10);
    }

    public static I d(I i10, long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i11, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, int i12, Object obj) {
        long jA = (i12 & 1) != 0 ? i10.f104239a.a() : j10;
        return i10.c(jA, (i12 & 2) != 0 ? i10.f104240b : j11, (i12 & 4) != 0 ? i10.f104241c : l10, (i12 & 8) != 0 ? i10.f104242d : h10, (i12 & 16) != 0 ? i10.f104243e : i11, (i12 & 32) != 0 ? i10.f104244f : abstractC2325w, (i12 & 64) != 0 ? i10.f104245g : str, (i12 & 128) != 0 ? i10.f104246h : j12, (i12 & 256) != 0 ? i10.f104247i : aVar, (i12 & 512) != 0 ? i10.f104248j : nVar, (i12 & 1024) != 0 ? i10.f104249k : c4481i, (i12 & 2048) != 0 ? i10.f104250l : j13, (i12 & 4096) != 0 ? i10.f104251m : jVar, (i12 & 8192) != 0 ? i10.f104252n : a3Var, (i12 & 16384) != 0 ? i10.f104253o : e10, (i12 & 32768) != 0 ? i10.f104254p : kVar);
    }

    public static I f(I i10, long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i11, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, int i12, Object obj) {
        return i10.e((i12 & 1) != 0 ? i10.f104239a.a() : j10, (i12 & 2) != 0 ? i10.f104240b : j11, (i12 & 4) != 0 ? i10.f104241c : l10, (i12 & 8) != 0 ? i10.f104242d : h10, (i12 & 16) != 0 ? i10.f104243e : i11, (i12 & 32) != 0 ? i10.f104244f : abstractC2325w, (i12 & 64) != 0 ? i10.f104245g : str, (i12 & 128) != 0 ? i10.f104246h : j12, (i12 & 256) != 0 ? i10.f104247i : aVar, (i12 & 512) != 0 ? i10.f104248j : nVar, (i12 & 1024) != 0 ? i10.f104249k : c4481i, (i12 & 2048) != 0 ? i10.f104250l : j13, (i12 & 4096) != 0 ? i10.f104251m : jVar, (i12 & 8192) != 0 ? i10.f104252n : a3Var);
    }

    public static I h(I i10, AbstractC2131z0 abstractC2131z0, float f10, long j10, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i11, AbstractC2325w abstractC2325w, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j12, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, int i12, Object obj) {
        androidx.compose.ui.graphics.drawscope.k kVar2;
        E e11;
        long j13;
        long j14;
        androidx.compose.ui.text.style.j jVar2;
        androidx.compose.ui.text.font.L l11;
        androidx.compose.ui.text.font.H h11;
        androidx.compose.ui.text.font.I i13;
        AbstractC2325w abstractC2325w2;
        String str2;
        long j15;
        androidx.compose.ui.text.style.a aVar2;
        androidx.compose.ui.text.style.n nVar2;
        C4481i c4481i2;
        a3 a3Var2;
        float f11 = (i12 & 2) != 0 ? i10.f104239a.f() : f10;
        long j16 = (i12 & 4) != 0 ? i10.f104240b : j10;
        androidx.compose.ui.text.font.L l12 = (i12 & 8) != 0 ? i10.f104241c : l10;
        androidx.compose.ui.text.font.H h12 = (i12 & 16) != 0 ? i10.f104242d : h10;
        androidx.compose.ui.text.font.I i14 = (i12 & 32) != 0 ? i10.f104243e : i11;
        AbstractC2325w abstractC2325w3 = (i12 & 64) != 0 ? i10.f104244f : abstractC2325w;
        String str3 = (i12 & 128) != 0 ? i10.f104245g : str;
        long j17 = (i12 & 256) != 0 ? i10.f104246h : j11;
        androidx.compose.ui.text.style.a aVar3 = (i12 & 512) != 0 ? i10.f104247i : aVar;
        androidx.compose.ui.text.style.n nVar3 = (i12 & 1024) != 0 ? i10.f104248j : nVar;
        C4481i c4481i3 = (i12 & 2048) != 0 ? i10.f104249k : c4481i;
        float f12 = f11;
        long j18 = j16;
        long j19 = (i12 & 4096) != 0 ? i10.f104250l : j12;
        androidx.compose.ui.text.style.j jVar3 = (i12 & 8192) != 0 ? i10.f104251m : jVar;
        a3 a3Var3 = (i12 & 16384) != 0 ? i10.f104252n : a3Var;
        E e12 = (i12 & 32768) != 0 ? i10.f104253o : e10;
        if ((i12 & 65536) != 0) {
            e11 = e12;
            kVar2 = i10.f104254p;
            j14 = j19;
            jVar2 = jVar3;
            l11 = l12;
            h11 = h12;
            i13 = i14;
            abstractC2325w2 = abstractC2325w3;
            str2 = str3;
            j15 = j17;
            aVar2 = aVar3;
            nVar2 = nVar3;
            c4481i2 = c4481i3;
            a3Var2 = a3Var3;
            j13 = j18;
        } else {
            kVar2 = kVar;
            e11 = e12;
            j13 = j18;
            j14 = j19;
            jVar2 = jVar3;
            l11 = l12;
            h11 = h12;
            i13 = i14;
            abstractC2325w2 = abstractC2325w3;
            str2 = str3;
            j15 = j17;
            aVar2 = aVar3;
            nVar2 = nVar3;
            c4481i2 = c4481i3;
            a3Var2 = a3Var3;
        }
        return i10.g(abstractC2131z0, f12, j13, l11, h11, i13, abstractC2325w2, str2, j15, aVar2, nVar2, c4481i2, j14, jVar2, a3Var2, e11, kVar2);
    }

    @Nullable
    public final androidx.compose.ui.text.style.n A() {
        return this.f104248j;
    }

    public final boolean B(@NotNull I i10) {
        if (this == i10) {
            return true;
        }
        return k0.B.j(this.f104240b, i10.f104240b) && kotlin.jvm.internal.G.g(this.f104241c, i10.f104241c) && kotlin.jvm.internal.G.g(this.f104242d, i10.f104242d) && kotlin.jvm.internal.G.g(this.f104243e, i10.f104243e) && kotlin.jvm.internal.G.g(this.f104244f, i10.f104244f) && kotlin.jvm.internal.G.g(this.f104245g, i10.f104245g) && k0.B.j(this.f104246h, i10.f104246h) && kotlin.jvm.internal.G.g(this.f104247i, i10.f104247i) && kotlin.jvm.internal.G.g(this.f104248j, i10.f104248j) && kotlin.jvm.internal.G.g(this.f104249k, i10.f104249k) && K0.y(this.f104250l, i10.f104250l) && kotlin.jvm.internal.G.g(this.f104253o, i10.f104253o);
    }

    public final boolean C(@NotNull I i10) {
        return kotlin.jvm.internal.G.g(this.f104239a, i10.f104239a) && kotlin.jvm.internal.G.g(this.f104251m, i10.f104251m) && kotlin.jvm.internal.G.g(this.f104252n, i10.f104252n) && kotlin.jvm.internal.G.g(this.f104254p, i10.f104254p);
    }

    public final int D() {
        int iO = k0.B.o(this.f104240b) * 31;
        androidx.compose.ui.text.font.L l10 = this.f104241c;
        int i10 = (iO + (l10 != null ? l10.f104572a : 0)) * 31;
        androidx.compose.ui.text.font.H h10 = this.f104242d;
        int i11 = (i10 + (h10 != null ? h10.f104530a : 0)) * 31;
        androidx.compose.ui.text.font.I i12 = this.f104243e;
        int i13 = (i11 + (i12 != null ? i12.f104536a : 0)) * 31;
        AbstractC2325w abstractC2325w = this.f104244f;
        int iHashCode = (i13 + (abstractC2325w != null ? abstractC2325w.hashCode() : 0)) * 31;
        String str = this.f104245g;
        int iA = (C1550p.a(this.f104246h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        androidx.compose.ui.text.style.a aVar = this.f104247i;
        int iFloatToIntBits = (iA + (aVar != null ? Float.floatToIntBits(aVar.f104956a) : 0)) * 31;
        androidx.compose.ui.text.style.n nVar = this.f104248j;
        int iHashCode2 = (iFloatToIntBits + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C4481i c4481i = this.f104249k;
        int iK = (K0.K(this.f104250l) + ((iHashCode2 + (c4481i != null ? c4481i.f202385a.hashCode() : 0)) * 31)) * 31;
        E e10 = this.f104253o;
        return iK + (e10 != null ? e10.hashCode() : 0);
    }

    @T1
    @NotNull
    public final I E(@Nullable I i10) {
        return i10 == null ? this : SpanStyleKt.b(this, i10.f104239a.a(), i10.f104239a.d(), i10.f104239a.f(), i10.f104240b, i10.f104241c, i10.f104242d, i10.f104243e, i10.f104244f, i10.f104245g, i10.f104246h, i10.f104247i, i10.f104248j, i10.f104249k, i10.f104250l, i10.f104251m, i10.f104252n, i10.f104253o, i10.f104254p);
    }

    @T1
    @NotNull
    public final I G(@NotNull I i10) {
        return E(i10);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final I a(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10) {
        return new I(K0.y(j10, this.f104239a.a()) ? this.f104239a : androidx.compose.ui.text.style.m.f105031a.b(j10), j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, e10, (androidx.compose.ui.graphics.drawscope.k) null, 32768, (C4969v) null);
    }

    @NotNull
    public final I c(long j10, long j11, @Nullable androidx.compose.ui.text.font.L l10, @Nullable androidx.compose.ui.text.font.H h10, @Nullable androidx.compose.ui.text.font.I i10, @Nullable AbstractC2325w abstractC2325w, @Nullable String str, long j12, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.n nVar, @Nullable C4481i c4481i, long j13, @Nullable androidx.compose.ui.text.style.j jVar, @Nullable a3 a3Var, @Nullable E e10, @Nullable androidx.compose.ui.graphics.drawscope.k kVar) {
        return new I(K0.y(j10, this.f104239a.a()) ? this.f104239a : androidx.compose.ui.text.style.m.f105031a.b(j10), j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, e10, kVar);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final I e(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var) {
        return new I(K0.y(j10, this.f104239a.a()) ? this.f104239a : androidx.compose.ui.text.style.m.f105031a.b(j10), j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, this.f104253o, this.f104254p);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return B(i10) && C(i10);
    }

    @NotNull
    public final I g(@Nullable AbstractC2131z0 abstractC2131z0, float f10, long j10, @Nullable androidx.compose.ui.text.font.L l10, @Nullable androidx.compose.ui.text.font.H h10, @Nullable androidx.compose.ui.text.font.I i10, @Nullable AbstractC2325w abstractC2325w, @Nullable String str, long j11, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.n nVar, @Nullable C4481i c4481i, long j12, @Nullable androidx.compose.ui.text.style.j jVar, @Nullable a3 a3Var, @Nullable E e10, @Nullable androidx.compose.ui.graphics.drawscope.k kVar) {
        return new I(androidx.compose.ui.text.style.m.f105031a.a(abstractC2131z0, f10), j10, l10, h10, i10, abstractC2325w, str, j11, aVar, nVar, c4481i, j12, jVar, a3Var, e10, kVar);
    }

    public int hashCode() {
        int iK = K0.K(this.f104239a.a()) * 31;
        AbstractC2131z0 abstractC2131z0D = this.f104239a.d();
        int iO = (k0.B.o(this.f104240b) + ((Float.floatToIntBits(this.f104239a.f()) + ((iK + (abstractC2131z0D != null ? abstractC2131z0D.hashCode() : 0)) * 31)) * 31)) * 31;
        androidx.compose.ui.text.font.L l10 = this.f104241c;
        int i10 = (iO + (l10 != null ? l10.f104572a : 0)) * 31;
        androidx.compose.ui.text.font.H h10 = this.f104242d;
        int i11 = (i10 + (h10 != null ? h10.f104530a : 0)) * 31;
        androidx.compose.ui.text.font.I i12 = this.f104243e;
        int i13 = (i11 + (i12 != null ? i12.f104536a : 0)) * 31;
        AbstractC2325w abstractC2325w = this.f104244f;
        int iHashCode = (i13 + (abstractC2325w != null ? abstractC2325w.hashCode() : 0)) * 31;
        String str = this.f104245g;
        int iA = (C1550p.a(this.f104246h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        androidx.compose.ui.text.style.a aVar = this.f104247i;
        int iFloatToIntBits = (iA + (aVar != null ? Float.floatToIntBits(aVar.f104956a) : 0)) * 31;
        androidx.compose.ui.text.style.n nVar = this.f104248j;
        int iHashCode2 = (iFloatToIntBits + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C4481i c4481i = this.f104249k;
        int iA2 = androidx.compose.foundation.contextmenu.a.a(this.f104250l, (iHashCode2 + (c4481i != null ? c4481i.f202385a.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.j jVar = this.f104251m;
        int i14 = (iA2 + (jVar != null ? jVar.f105022a : 0)) * 31;
        a3 a3Var = this.f104252n;
        int iHashCode3 = (i14 + (a3Var != null ? a3Var.hashCode() : 0)) * 31;
        E e10 = this.f104253o;
        int iHashCode4 = (iHashCode3 + (e10 != null ? e10.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.drawscope.k kVar = this.f104254p;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final float i() {
        return this.f104239a.f();
    }

    public final long j() {
        return this.f104250l;
    }

    @Nullable
    public final androidx.compose.ui.text.style.a k() {
        return this.f104247i;
    }

    @Nullable
    public final AbstractC2131z0 l() {
        return this.f104239a.d();
    }

    public final long m() {
        return this.f104239a.a();
    }

    @Nullable
    public final androidx.compose.ui.graphics.drawscope.k n() {
        return this.f104254p;
    }

    @Nullable
    public final AbstractC2325w o() {
        return this.f104244f;
    }

    @Nullable
    public final String p() {
        return this.f104245g;
    }

    public final long q() {
        return this.f104240b;
    }

    @Nullable
    public final androidx.compose.ui.text.font.H r() {
        return this.f104242d;
    }

    @Nullable
    public final androidx.compose.ui.text.font.I s() {
        return this.f104243e;
    }

    @Nullable
    public final androidx.compose.ui.text.font.L t() {
        return this.f104241c;
    }

    @NotNull
    public String toString() {
        return "SpanStyle(color=" + ((Object) K0.L(this.f104239a.a())) + ", brush=" + this.f104239a.d() + ", alpha=" + this.f104239a.f() + ", fontSize=" + ((Object) k0.B.u(this.f104240b)) + ", fontWeight=" + this.f104241c + ", fontStyle=" + this.f104242d + ", fontSynthesis=" + this.f104243e + ", fontFamily=" + this.f104244f + ", fontFeatureSettings=" + this.f104245g + ", letterSpacing=" + ((Object) k0.B.u(this.f104246h)) + ", baselineShift=" + this.f104247i + ", textGeometricTransform=" + this.f104248j + ", localeList=" + this.f104249k + ", background=" + ((Object) K0.L(this.f104250l)) + ", textDecoration=" + this.f104251m + ", shadow=" + this.f104252n + ", platformStyle=" + this.f104253o + ", drawStyle=" + this.f104254p + ')';
    }

    public final long u() {
        return this.f104246h;
    }

    @Nullable
    public final C4481i v() {
        return this.f104249k;
    }

    @Nullable
    public final E w() {
        return this.f104253o;
    }

    @Nullable
    public final a3 x() {
        return this.f104252n;
    }

    @Nullable
    public final androidx.compose.ui.text.style.j y() {
        return this.f104251m;
    }

    @NotNull
    public final androidx.compose.ui.text.style.m z() {
        return this.f104239a;
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, C4969v c4969v) {
        this(j10, j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, e10);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, C4969v c4969v) {
        this(j10, j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var);
    }

    public /* synthetic */ I(AbstractC2131z0 abstractC2131z0, float f10, long j10, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j12, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, C4969v c4969v) {
        this(abstractC2131z0, f10, j10, l10, h10, i10, abstractC2325w, str, j11, aVar, nVar, c4481i, j12, jVar, a3Var, e10, kVar);
    }

    public /* synthetic */ I(androidx.compose.ui.text.style.m mVar, long j10, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j12, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, C4969v c4969v) {
        this(mVar, j10, l10, h10, i10, abstractC2325w, str, j11, aVar, nVar, c4481i, j12, jVar, a3Var, e10, kVar);
    }

    public I(androidx.compose.ui.text.style.m mVar, long j10, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j12, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar) {
        this.f104239a = mVar;
        this.f104240b = j10;
        this.f104241c = l10;
        this.f104242d = h10;
        this.f104243e = i10;
        this.f104244f = abstractC2325w;
        this.f104245g = str;
        this.f104246h = j11;
        this.f104247i = aVar;
        this.f104248j = nVar;
        this.f104249k = c4481i;
        this.f104250l = j12;
        this.f104251m = jVar;
        this.f104252n = a3Var;
        this.f104253o = e10;
        this.f104254p = kVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(androidx.compose.ui.text.style.m mVar, long j10, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j12, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, int i11, C4969v c4969v) {
        long j13;
        long j14;
        long j15;
        if ((i11 & 2) != 0) {
            k0.B.f214266b.getClass();
            j13 = k0.B.f214268d;
        } else {
            j13 = j10;
        }
        androidx.compose.ui.text.font.L l11 = (i11 & 4) != 0 ? null : l10;
        androidx.compose.ui.text.font.H h11 = (i11 & 8) != 0 ? null : h10;
        androidx.compose.ui.text.font.I i12 = (i11 & 16) != 0 ? null : i10;
        AbstractC2325w abstractC2325w2 = (i11 & 32) != 0 ? null : abstractC2325w;
        String str2 = (i11 & 64) != 0 ? null : str;
        if ((i11 & 128) != 0) {
            k0.B.f214266b.getClass();
            j14 = k0.B.f214268d;
        } else {
            j14 = j11;
        }
        androidx.compose.ui.text.style.a aVar2 = (i11 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.n nVar2 = (i11 & 512) != 0 ? null : nVar;
        C4481i c4481i2 = (i11 & 1024) != 0 ? null : c4481i;
        if ((i11 & 2048) != 0) {
            K0.f100733b.getClass();
            j15 = K0.f100746o;
        } else {
            j15 = j12;
        }
        this(mVar, j13, l11, h11, i12, abstractC2325w2, str2, j14, aVar2, nVar2, c4481i2, j15, (i11 & 4096) != 0 ? null : jVar, (i11 & 8192) != 0 ? null : a3Var, (i11 & 16384) != 0 ? null : e10, (i11 & 32768) != 0 ? null : kVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, int i11, C4969v c4969v) {
        long j14;
        long j15;
        long j16;
        long j17;
        if ((i11 & 1) != 0) {
            K0.f100733b.getClass();
            j14 = K0.f100746o;
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            k0.B.f214266b.getClass();
            j15 = k0.B.f214268d;
        } else {
            j15 = j11;
        }
        androidx.compose.ui.text.font.L l11 = (i11 & 4) != 0 ? null : l10;
        androidx.compose.ui.text.font.H h11 = (i11 & 8) != 0 ? null : h10;
        androidx.compose.ui.text.font.I i12 = (i11 & 16) != 0 ? null : i10;
        AbstractC2325w abstractC2325w2 = (i11 & 32) != 0 ? null : abstractC2325w;
        String str2 = (i11 & 64) != 0 ? null : str;
        if ((i11 & 128) != 0) {
            k0.B.f214266b.getClass();
            j16 = k0.B.f214268d;
        } else {
            j16 = j12;
        }
        androidx.compose.ui.text.style.a aVar2 = (i11 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.n nVar2 = (i11 & 512) != 0 ? null : nVar;
        C4481i c4481i2 = (i11 & 1024) != 0 ? null : c4481i;
        if ((i11 & 2048) != 0) {
            K0.f100733b.getClass();
            j17 = K0.f100746o;
        } else {
            j17 = j13;
        }
        this(j14, j15, l11, h11, i12, abstractC2325w2, str2, j16, aVar2, nVar2, c4481i2, j17, (i11 & 4096) != 0 ? null : jVar, (i11 & 8192) != 0 ? null : a3Var);
    }

    public I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var) {
        this(androidx.compose.ui.text.style.m.f105031a.b(j10), j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, (E) null, (androidx.compose.ui.graphics.drawscope.k) null, 32768, (C4969v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, int i11, C4969v c4969v) {
        long j14;
        long j15;
        long j16;
        long j17;
        if ((i11 & 1) != 0) {
            K0.f100733b.getClass();
            j14 = K0.f100746o;
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            k0.B.f214266b.getClass();
            j15 = k0.B.f214268d;
        } else {
            j15 = j11;
        }
        androidx.compose.ui.text.font.L l11 = (i11 & 4) != 0 ? null : l10;
        androidx.compose.ui.text.font.H h11 = (i11 & 8) != 0 ? null : h10;
        androidx.compose.ui.text.font.I i12 = (i11 & 16) != 0 ? null : i10;
        AbstractC2325w abstractC2325w2 = (i11 & 32) != 0 ? null : abstractC2325w;
        String str2 = (i11 & 64) != 0 ? null : str;
        if ((i11 & 128) != 0) {
            k0.B.f214266b.getClass();
            j16 = k0.B.f214268d;
        } else {
            j16 = j12;
        }
        androidx.compose.ui.text.style.a aVar2 = (i11 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.n nVar2 = (i11 & 512) != 0 ? null : nVar;
        C4481i c4481i2 = (i11 & 1024) != 0 ? null : c4481i;
        if ((i11 & 2048) != 0) {
            K0.f100733b.getClass();
            j17 = K0.f100746o;
        } else {
            j17 = j13;
        }
        this(j14, j15, l11, h11, i12, abstractC2325w2, str2, j16, aVar2, nVar2, c4481i2, j17, (i11 & 4096) != 0 ? null : jVar, (i11 & 8192) != 0 ? null : a3Var, (i11 & 16384) != 0 ? null : e10);
    }

    public I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10) {
        this(androidx.compose.ui.text.style.m.f105031a.b(j10), j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, e10, (androidx.compose.ui.graphics.drawscope.k) null, 32768, (C4969v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar, int i11, C4969v c4969v) {
        long j14;
        long j15;
        long j16;
        long j17;
        if ((i11 & 1) != 0) {
            K0.f100733b.getClass();
            j14 = K0.f100746o;
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            k0.B.f214266b.getClass();
            j15 = k0.B.f214268d;
        } else {
            j15 = j11;
        }
        androidx.compose.ui.text.font.L l11 = (i11 & 4) != 0 ? null : l10;
        androidx.compose.ui.text.font.H h11 = (i11 & 8) != 0 ? null : h10;
        androidx.compose.ui.text.font.I i12 = (i11 & 16) != 0 ? null : i10;
        AbstractC2325w abstractC2325w2 = (i11 & 32) != 0 ? null : abstractC2325w;
        String str2 = (i11 & 64) != 0 ? null : str;
        if ((i11 & 128) != 0) {
            k0.B.f214266b.getClass();
            j16 = k0.B.f214268d;
        } else {
            j16 = j12;
        }
        androidx.compose.ui.text.style.a aVar2 = (i11 & 256) != 0 ? null : aVar;
        androidx.compose.ui.text.style.n nVar2 = (i11 & 512) != 0 ? null : nVar;
        C4481i c4481i2 = (i11 & 1024) != 0 ? null : c4481i;
        if ((i11 & 2048) != 0) {
            K0.f100733b.getClass();
            j17 = K0.f100746o;
        } else {
            j17 = j13;
        }
        this(j14, j15, l11, h11, i12, abstractC2325w2, str2, j16, aVar2, nVar2, c4481i2, j17, (i11 & 4096) != 0 ? null : jVar, (i11 & 8192) != 0 ? null : a3Var, (i11 & 16384) != 0 ? null : e10, (i11 & 32768) != 0 ? null : kVar);
    }

    public I(long j10, long j11, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j12, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j13, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar) {
        this(androidx.compose.ui.text.style.m.f105031a.b(j10), j11, l10, h10, i10, abstractC2325w, str, j12, aVar, nVar, c4481i, j13, jVar, a3Var, e10, kVar);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public I(androidx.compose.ui.graphics.AbstractC2131z0 r20, float r21, long r22, androidx.compose.ui.text.font.L r24, androidx.compose.ui.text.font.H r25, androidx.compose.ui.text.font.I r26, androidx.compose.ui.text.font.AbstractC2325w r27, java.lang.String r28, long r29, androidx.compose.ui.text.style.a r31, androidx.compose.ui.text.style.n r32, h0.C4481i r33, long r34, androidx.compose.ui.text.style.j r36, androidx.compose.ui.graphics.a3 r37, androidx.compose.ui.text.E r38, androidx.compose.ui.graphics.drawscope.k r39, int r40, kotlin.jvm.internal.C4969v r41) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.I.<init>(androidx.compose.ui.graphics.z0, float, long, androidx.compose.ui.text.font.L, androidx.compose.ui.text.font.H, androidx.compose.ui.text.font.I, androidx.compose.ui.text.font.w, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.n, h0.i, long, androidx.compose.ui.text.style.j, androidx.compose.ui.graphics.a3, androidx.compose.ui.text.E, androidx.compose.ui.graphics.drawscope.k, int, kotlin.jvm.internal.v):void");
    }

    public I(AbstractC2131z0 abstractC2131z0, float f10, long j10, androidx.compose.ui.text.font.L l10, androidx.compose.ui.text.font.H h10, androidx.compose.ui.text.font.I i10, AbstractC2325w abstractC2325w, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.n nVar, C4481i c4481i, long j12, androidx.compose.ui.text.style.j jVar, a3 a3Var, E e10, androidx.compose.ui.graphics.drawscope.k kVar) {
        this(androidx.compose.ui.text.style.m.f105031a.a(abstractC2131z0, f10), j10, l10, h10, i10, abstractC2325w, str, j11, aVar, nVar, c4481i, j12, jVar, a3Var, e10, kVar);
    }
}
