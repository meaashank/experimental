package androidx.compose.foundation.text.input;

import androidx.activity.C1477d;
import androidx.collection.C1545m0;
import androidx.compose.foundation.L;
import androidx.compose.foundation.text.C1758e;
import androidx.compose.foundation.text.input.internal.C1794m;
import androidx.compose.foundation.text.input.internal.Q0;
import androidx.compose.foundation.text.input.internal.S0;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,552:1\n1#2:553\n509#3,43:554\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n182#1:554,43\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class j implements Appendable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94351f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l f94352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Q0 f94353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final S0 f94354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C1794m f94355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f94356e;

    @L
    public interface a {
        int a();

        long b(int i10);

        long c(int i10);
    }

    public j(@NotNull l lVar, @Nullable C1794m c1794m, @NotNull l lVar2, @Nullable Q0 q02) {
        this.f94352a = lVar2;
        this.f94353b = q02;
        this.f94354c = new S0(lVar);
        this.f94355d = c1794m != null ? new C1794m(c1794m) : null;
        this.f94356e = lVar.f94359b;
    }

    @L
    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void r(j jVar, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        jVar.q(i10, i11, charSequence, i15, i13);
    }

    public static l y(j jVar, long j10, Z z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = jVar.f94356e;
        }
        if ((i10 & 2) != 0) {
            z10 = null;
        }
        return jVar.x(j10, z10);
    }

    @NotNull
    public final CharSequence a() {
        return this.f94354c;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char c10) {
        m(this.f94354c.c(), this.f94354c.c(), 1);
        S0 s02 = this.f94354c;
        S0.e(s02, s02.c(), this.f94354c.c(), String.valueOf(c10), 0, 0, 24, null);
        return this;
    }

    public final char b(int i10) {
        return this.f94354c.b(i10);
    }

    public final void c() {
        d().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1794m d() {
        C1794m c1794m = this.f94355d;
        if (c1794m != null) {
            return c1794m;
        }
        C1794m c1794m2 = new C1794m(null, 1, 0 == true ? 1 : 0);
        this.f94355d = c1794m2;
        return c1794m2;
    }

    @NotNull
    public final a e() {
        return d();
    }

    public final int g() {
        return this.f94354c.c();
    }

    public final long h() {
        return this.f94352a.f94359b;
    }

    @NotNull
    public final CharSequence i() {
        return this.f94352a.f94358a;
    }

    @NotNull
    public final l j() {
        return this.f94352a;
    }

    public final long k() {
        return this.f94356e;
    }

    @dd.j(name = "hasSelection")
    public final boolean l() {
        return !Z.h(this.f94356e);
    }

    public final void m(int i10, int i11, int i12) {
        int i13;
        d().f(i10, i11, i12);
        Q0 q02 = this.f94353b;
        if (q02 != null) {
            q02.e(i10, i11, i12);
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iL = Z.l(this.f94356e);
        int iK = Z.k(this.f94356e);
        if (iK < iMin) {
            return;
        }
        if (iL <= iMin && iMax <= iK) {
            i13 = i12 - (iMax - iMin);
            if (iL == iK) {
            }
            iMin = iK + i13;
            this.f94356e = a0.b(iL, iMin);
        }
        if (iL > iMin && iK < iMax) {
            iMin += i12;
            iL = iMin;
        } else if (iL >= iMax) {
            i13 = i12 - (iMax - iMin);
        } else if (iMin < iL) {
            iL = iMin + i12;
            iMin = (i12 - (iMax - iMin)) + iK;
        }
        this.f94356e = a0.b(iL, iMin);
        iL += i13;
        iMin = iK + i13;
        this.f94356e = a0.b(iL, iMin);
    }

    public final void n(int i10) {
        s(i10, false, true);
        int i11 = i10 + 1;
        int iC = this.f94354c.c();
        if (i11 > iC) {
            i11 = iC;
        }
        this.f94356e = a0.b(i11, i11);
    }

    public final void o(int i10) {
        s(i10, true, false);
        this.f94356e = a0.b(i10, i10);
    }

    public final void p(int i10, int i11, @NotNull CharSequence charSequence) {
        q(i10, i11, charSequence, 0, charSequence.length());
    }

    public final void q(int i10, int i11, @NotNull CharSequence charSequence, int i12, int i13) {
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("Expected start=", i10, " <= end=", i11).toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(C1758e.a("Expected textStart=", i12, " <= textEnd=", i13).toString());
        }
        m(i10, i11, i13 - i12);
        this.f94354c.d(i10, i11, charSequence, i12, i13);
    }

    public final void s(int i10, boolean z10, boolean z11) {
        int i11 = z10 ? 0 : -1;
        int iC = z11 ? this.f94354c.c() : this.f94354c.c() + 1;
        if (i11 > i10 || i10 >= iC) {
            throw new IllegalArgumentException(C1477d.a(C1545m0.a("Expected ", i10, " to be in [", i11, U6.j.f68738d), iC, ')').toString());
        }
    }

    public final void t(long j10) {
        long jB = a0.b(0, this.f94354c.c());
        if (Z.d(jB, j10)) {
            return;
        }
        throw new IllegalArgumentException(("Expected " + ((Object) Z.q(j10)) + " to be in " + ((Object) Z.q(jB))).toString());
    }

    @NotNull
    public String toString() {
        return this.f94354c.toString();
    }

    public final void u() {
        p(0, this.f94354c.c(), this.f94352a.f94358a.toString());
        v(this.f94352a.f94359b);
        c();
    }

    public final void v(long j10) {
        t(j10);
        this.f94356e = j10;
    }

    public final void w(@NotNull CharSequence charSequence) {
        int i10;
        int i11;
        S0 s02 = this.f94354c;
        int length = s02.length();
        int length2 = charSequence.length();
        boolean z10 = false;
        if (s02.length() <= 0 || charSequence.length() <= 0) {
            i10 = 0;
            i11 = 0;
        } else {
            int i12 = 0;
            int i13 = 0;
            boolean z11 = false;
            while (true) {
                if (!z10) {
                    if (s02.charAt(i12) == charSequence.charAt(i13)) {
                        i12++;
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                if (!z11) {
                    if (s02.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z11 = true;
                    }
                }
                if (i12 >= length || i13 >= length2 || (z10 && z11)) {
                    break;
                }
            }
            i10 = i12;
            i11 = i13;
        }
        int i14 = length;
        int i15 = length2;
        if (i10 < i14 || i11 < i15) {
            q(i10, i14, charSequence, i11, i15);
        }
    }

    @NotNull
    public final l x(long j10, @Nullable Z z10) {
        return new l(this.f94354c.toString(), j10, z10, null, 8, null);
    }

    public /* synthetic */ j(l lVar, C1794m c1794m, l lVar2, Q0 q02, int i10, C4969v c4969v) {
        this(lVar, (i10 & 2) != 0 ? null : c1794m, (i10 & 4) != 0 ? lVar : lVar2, (i10 & 8) != 0 ? null : q02);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence) {
        if (charSequence != null) {
            m(this.f94354c.c(), this.f94354c.c(), charSequence.length());
            S0 s02 = this.f94354c;
            S0.e(s02, s02.c(), this.f94354c.c(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence, int i10, int i11) {
        if (charSequence != null) {
            m(this.f94354c.c(), this.f94354c.c(), i11 - i10);
            S0 s02 = this.f94354c;
            S0.e(s02, s02.c(), this.f94354c.c(), charSequence.subSequence(i10, i11), 0, 0, 24, null);
        }
        return this;
    }
}
