package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C1836u;
import androidx.compose.foundation.text.C1837v;
import androidx.compose.foundation.text.selection.AbstractC1830a;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.S;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.input.L;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n73#1,8:438\n73#1,8:446\n73#1,8:454\n73#1,8:462\n73#1,8:470\n73#1,8:478\n73#1,8:486\n73#1,8:494\n73#1,8:502\n73#1,8:510\n73#1,8:518\n73#1,8:526\n73#1,6:534\n80#1:541\n73#1,8:542\n73#1,8:550\n73#1,8:558\n74#1,7:566\n74#1,7:573\n73#1,8:580\n73#1,8:588\n73#1,8:596\n73#1,8:604\n74#1,7:612\n1#2:540\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:438,8\n95#1:446,8\n99#1:454,8\n107#1:462,8\n118#1:470,8\n134#1:478,8\n158#1:486,8\n163#1:494,8\n168#1:502,8\n172#1:510,8\n176#1:518,8\n184#1:526,8\n194#1:534,6\n194#1:541\n200#1:542,8\n204#1:550,8\n212#1:558,8\n220#1:566,7\n224#1:573,7\n230#1:580,8\n236#1:588,8\n240#1:596,8\n248#1:604,8\n257#1:612,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC1830a<T extends AbstractC1830a<T>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final C0221a f94960h = new C0221a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f94961i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f94962j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnnotatedString f94963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final S f94965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final L f94966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C f94967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f94968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public AnnotatedString f94969g;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.a$a, reason: collision with other inner class name */
    public static final class C0221a {
        public C0221a() {
        }

        public C0221a(C4969v c4969v) {
        }
    }

    public /* synthetic */ AbstractC1830a(AnnotatedString annotatedString, long j10, S s10, L l10, C c10, C4969v c4969v) {
        this(annotatedString, j10, s10, l10, c10);
    }

    public static AbstractC1830a b(AbstractC1830a abstractC1830a, Object obj, boolean z10, ed.l lVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            abstractC1830a.f94967e.f94672a = null;
        }
        if (abstractC1830a.f94969g.f104196a.length() > 0) {
            lVar.invoke(obj);
        }
        G.n(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (AbstractC1830a) obj;
    }

    public static /* synthetic */ int k(AbstractC1830a abstractC1830a, S s10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC1830a.d0();
        }
        return abstractC1830a.j(s10, i10);
    }

    public static /* synthetic */ int n(AbstractC1830a abstractC1830a, S s10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC1830a.e0();
        }
        return abstractC1830a.m(s10, i10);
    }

    public static /* synthetic */ int r(AbstractC1830a abstractC1830a, S s10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC1830a.c0();
        }
        return abstractC1830a.q(s10, i10);
    }

    public static /* synthetic */ int x(AbstractC1830a abstractC1830a, S s10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC1830a.c0();
        }
        return abstractC1830a.w(s10, i10);
    }

    @NotNull
    public final C A() {
        return this.f94967e;
    }

    @NotNull
    public final String B() {
        return this.f94969g.f104196a;
    }

    public final boolean C() {
        S s10 = this.f94965c;
        return (s10 != null ? s10.f104309b.C(c0()) : null) != ResolvedTextDirection.Rtl;
    }

    public final int D(S s10, int i10) {
        int iC0 = c0();
        C c10 = this.f94967e;
        if (c10.f94672a == null) {
            c10.f94672a = Float.valueOf(s10.f104309b.e(iC0).f65511a);
        }
        int iQ = s10.f104309b.q(iC0) + i10;
        if (iQ < 0) {
            return 0;
        }
        MultiParagraph multiParagraph = s10.f104309b;
        if (iQ >= multiParagraph.f104270f) {
            return this.f94969g.f104196a.length();
        }
        float fM = multiParagraph.m(iQ) - 1;
        Float f10 = this.f94967e.f94672a;
        G.m(f10);
        float fFloatValue = f10.floatValue();
        if ((C() && fFloatValue >= s10.f104309b.u(iQ)) || (!C() && fFloatValue <= s10.f104309b.t(iQ))) {
            return s10.f104309b.o(iQ, true);
        }
        return this.f94966d.a(s10.f104309b.B(P.h.a(f10.floatValue(), fM)));
    }

    @NotNull
    public final T E() {
        S s10;
        if (this.f94969g.f104196a.length() > 0 && (s10 = this.f94965c) != null) {
            int iD = D(s10, 1);
            a0(iD, iD);
        }
        return this;
    }

    @NotNull
    public final T F() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (C()) {
                K();
            } else {
                H();
            }
        }
        return this;
    }

    @NotNull
    public final T G() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (C()) {
                M();
            } else {
                J();
            }
        }
        return this;
    }

    public final T H() {
        int iO;
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0 && (iO = o()) != -1) {
            a0(iO, iO);
        }
        return this;
    }

    @NotNull
    public final T I() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            int iA = C1836u.a(this.f94969g.f104196a, Z.k(this.f94968f));
            if (iA == Z.k(this.f94968f) && iA != this.f94969g.f104196a.length()) {
                iA = C1836u.a(this.f94969g.f104196a, iA + 1);
            }
            a0(iA, iA);
        }
        return this;
    }

    public final T J() {
        Integer numP;
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0 && (numP = p()) != null) {
            int iIntValue = numP.intValue();
            a0(iIntValue, iIntValue);
        }
        return this;
    }

    public final T K() {
        int iV;
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0 && (iV = v()) != -1) {
            a0(iV, iV);
        }
        return this;
    }

    @NotNull
    public final T L() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            int iB = C1836u.b(this.f94969g.f104196a, Z.l(this.f94968f));
            if (iB == Z.l(this.f94968f) && iB != 0) {
                iB = C1836u.b(this.f94969g.f104196a, iB - 1);
            }
            a0(iB, iB);
        }
        return this;
    }

    public final T M() {
        Integer numY;
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0 && (numY = y()) != null) {
            int iIntValue = numY.intValue();
            a0(iIntValue, iIntValue);
        }
        return this;
    }

    @NotNull
    public final T N() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (C()) {
                H();
            } else {
                K();
            }
        }
        return this;
    }

    @NotNull
    public final T O() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (C()) {
                J();
            } else {
                M();
            }
        }
        return this;
    }

    @NotNull
    public final T P() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            int length = this.f94969g.f104196a.length();
            a0(length, length);
        }
        return this;
    }

    @NotNull
    public final T Q() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            a0(0, 0);
        }
        return this;
    }

    @NotNull
    public final T R() {
        Integer numI;
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0 && (numI = i()) != null) {
            int iIntValue = numI.intValue();
            a0(iIntValue, iIntValue);
        }
        return this;
    }

    @NotNull
    public final T S() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (C()) {
                U();
            } else {
                R();
            }
        }
        return this;
    }

    @NotNull
    public final T T() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (C()) {
                R();
            } else {
                U();
            }
        }
        return this;
    }

    @NotNull
    public final T U() {
        Integer numL;
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0 && (numL = l()) != null) {
            int iIntValue = numL.intValue();
            a0(iIntValue, iIntValue);
        }
        return this;
    }

    @NotNull
    public final T V() {
        S s10;
        if (this.f94969g.f104196a.length() > 0 && (s10 = this.f94965c) != null) {
            int iD = D(s10, -1);
            a0(iD, iD);
        }
        return this;
    }

    @NotNull
    public final T W() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            a0(0, this.f94969g.f104196a.length());
        }
        return this;
    }

    @NotNull
    public final T X() {
        if (this.f94969g.f104196a.length() > 0) {
            this.f94968f = a0.b(Z.n(this.f94964b), (int) (this.f94968f & ZipKt.f225990j));
        }
        return this;
    }

    public final void Y(@NotNull AnnotatedString annotatedString) {
        this.f94969g = annotatedString;
    }

    public final void Z(int i10) {
        a0(i10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <U> T a(U u10, boolean z10, @NotNull ed.l<? super U, L0> lVar) {
        if (z10) {
            this.f94967e.f94672a = null;
        }
        if (this.f94969g.f104196a.length() > 0) {
            lVar.invoke(u10);
        }
        G.n(u10, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u10;
    }

    public final void a0(int i10, int i11) {
        this.f94968f = a0.b(i10, i11);
    }

    public final void b0(long j10) {
        this.f94968f = j10;
    }

    public final int c(int i10) {
        int length = this.f94969g.f104196a.length() - 1;
        return i10 > length ? length : i10;
    }

    public final int c0() {
        return this.f94966d.b(Z.i(this.f94968f));
    }

    @NotNull
    public final T d(@NotNull ed.l<? super T, L0> lVar) {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (Z.h(this.f94968f)) {
                lVar.invoke(this);
            } else if (C()) {
                int iL = Z.l(this.f94968f);
                a0(iL, iL);
            } else {
                int iK = Z.k(this.f94968f);
                a0(iK, iK);
            }
        }
        return this;
    }

    public final int d0() {
        return this.f94966d.b(Z.k(this.f94968f));
    }

    @NotNull
    public final T e(@NotNull ed.l<? super T, L0> lVar) {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            if (Z.h(this.f94968f)) {
                lVar.invoke(this);
            } else if (C()) {
                int iK = Z.k(this.f94968f);
                a0(iK, iK);
            } else {
                int iL = Z.l(this.f94968f);
                a0(iL, iL);
            }
        }
        return this;
    }

    public final int e0() {
        return this.f94966d.b(Z.l(this.f94968f));
    }

    @NotNull
    public final T f() {
        this.f94967e.f94672a = null;
        if (this.f94969g.f104196a.length() > 0) {
            int i10 = Z.i(this.f94968f);
            a0(i10, i10);
        }
        return this;
    }

    @NotNull
    public final AnnotatedString g() {
        return this.f94969g;
    }

    @Nullable
    public final S h() {
        return this.f94965c;
    }

    @Nullable
    public final Integer i() {
        S s10 = this.f94965c;
        if (s10 != null) {
            return Integer.valueOf(k(this, s10, 0, 1, null));
        }
        return null;
    }

    public final int j(S s10, int i10) {
        return this.f94966d.a(s10.f104309b.o(s10.f104309b.q(i10), true));
    }

    @Nullable
    public final Integer l() {
        S s10 = this.f94965c;
        if (s10 != null) {
            return Integer.valueOf(n(this, s10, 0, 1, null));
        }
        return null;
    }

    public final int m(S s10, int i10) {
        return this.f94966d.a(s10.f104309b.v(s10.f104309b.q(i10)));
    }

    public final int o() {
        return C1837v.a(this.f94969g.f104196a, Z.i(this.f94968f));
    }

    @Nullable
    public final Integer p() {
        S s10 = this.f94965c;
        if (s10 != null) {
            return Integer.valueOf(r(this, s10, 0, 1, null));
        }
        return null;
    }

    public final int q(S s10, int i10) {
        while (i10 < this.f94963a.f104196a.length()) {
            long jI = s10.f104309b.I(c(i10));
            if (Z.i(jI) > i10) {
                return this.f94966d.a((int) (jI & ZipKt.f225990j));
            }
            i10++;
        }
        return this.f94963a.f104196a.length();
    }

    @NotNull
    public final L s() {
        return this.f94966d;
    }

    public final long t() {
        return this.f94964b;
    }

    @NotNull
    public final AnnotatedString u() {
        return this.f94963a;
    }

    public final int v() {
        return C1837v.b(this.f94969g.f104196a, Z.i(this.f94968f));
    }

    public final int w(S s10, int i10) {
        while (i10 > 0) {
            long jI = s10.f104309b.I(c(i10));
            if (Z.n(jI) < i10) {
                return this.f94966d.a((int) (jI >> 32));
            }
            i10--;
        }
        return 0;
    }

    @Nullable
    public final Integer y() {
        S s10 = this.f94965c;
        if (s10 != null) {
            return Integer.valueOf(x(this, s10, 0, 1, null));
        }
        return null;
    }

    public final long z() {
        return this.f94968f;
    }

    public AbstractC1830a(AnnotatedString annotatedString, long j10, S s10, L l10, C c10) {
        this.f94963a = annotatedString;
        this.f94964b = j10;
        this.f94965c = s10;
        this.f94966d = l10;
        this.f94967e = c10;
        this.f94968f = j10;
        this.f94969g = annotatedString;
    }
}
