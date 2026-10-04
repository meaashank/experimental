package androidx.compose.ui.text.input;

import androidx.compose.foundation.text.C1758e;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2342k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f104806f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104807g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104808h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final M f104809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f104810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104813e;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.k$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2342k(AnnotatedString annotatedString, long j10, C4969v c4969v) {
        this(annotatedString, j10);
    }

    public final void a() {
        o(this.f104812d, this.f104813e, "");
        this.f104812d = -1;
        this.f104813e = -1;
    }

    public final void b() {
        this.f104812d = -1;
        this.f104813e = -1;
    }

    public final void c(int i10, int i11) {
        long jB = androidx.compose.ui.text.a0.b(i10, i11);
        this.f104809a.d(i10, i11, "");
        long jA = C2343l.a(androidx.compose.ui.text.a0.b(this.f104810b, this.f104811c), jB);
        t(androidx.compose.ui.text.Z.l(jA));
        s(androidx.compose.ui.text.Z.k(jA));
        if (m()) {
            long jA2 = C2343l.a(androidx.compose.ui.text.a0.b(this.f104812d, this.f104813e), jB);
            if (androidx.compose.ui.text.Z.h(jA2)) {
                b();
            } else {
                this.f104812d = androidx.compose.ui.text.Z.l(jA2);
                this.f104813e = androidx.compose.ui.text.Z.k(jA2);
            }
        }
    }

    public final char d(int i10) {
        return this.f104809a.a(i10);
    }

    @Nullable
    public final androidx.compose.ui.text.Z e() {
        if (m()) {
            return new androidx.compose.ui.text.Z(androidx.compose.ui.text.a0.b(this.f104812d, this.f104813e));
        }
        return null;
    }

    public final int f() {
        return this.f104813e;
    }

    public final int g() {
        return this.f104812d;
    }

    public final int h() {
        int i10 = this.f104810b;
        int i11 = this.f104811c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int i() {
        return this.f104809a.b();
    }

    public final long j() {
        return androidx.compose.ui.text.a0.b(this.f104810b, this.f104811c);
    }

    public final int k() {
        return this.f104811c;
    }

    public final int l() {
        return this.f104810b;
    }

    public final boolean m() {
        return this.f104812d != -1;
    }

    public final void n(int i10, int i11, @NotNull AnnotatedString annotatedString) {
        o(i10, i11, annotatedString.f104196a);
    }

    public final void o(int i10, int i11, @NotNull String str) {
        if (i10 < 0 || i10 > this.f104809a.b()) {
            StringBuilder sbA = android.support.v4.media.a.a("start (", i10, ") offset is outside of text region ");
            sbA.append(this.f104809a.b());
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < 0 || i11 > this.f104809a.b()) {
            StringBuilder sbA2 = android.support.v4.media.a.a("end (", i11, ") offset is outside of text region ");
            sbA2.append(this.f104809a.b());
            throw new IndexOutOfBoundsException(sbA2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("Do not set reversed range: ", i10, " > ", i11));
        }
        this.f104809a.d(i10, i11, str);
        t(str.length() + i10);
        s(str.length() + i10);
        this.f104812d = -1;
        this.f104813e = -1;
    }

    public final void p(int i10, int i11) {
        if (i10 < 0 || i10 > this.f104809a.b()) {
            StringBuilder sbA = android.support.v4.media.a.a("start (", i10, ") offset is outside of text region ");
            sbA.append(this.f104809a.b());
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < 0 || i11 > this.f104809a.b()) {
            StringBuilder sbA2 = android.support.v4.media.a.a("end (", i11, ") offset is outside of text region ");
            sbA2.append(this.f104809a.b());
            throw new IndexOutOfBoundsException(sbA2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(C1758e.a("Do not set reversed or empty range: ", i10, " > ", i11));
        }
        this.f104812d = i10;
        this.f104813e = i11;
    }

    public final void q(int i10) {
        r(i10, i10);
    }

    public final void r(int i10, int i11) {
        if (i10 < 0 || i10 > this.f104809a.b()) {
            StringBuilder sbA = android.support.v4.media.a.a("start (", i10, ") offset is outside of text region ");
            sbA.append(this.f104809a.b());
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < 0 || i11 > this.f104809a.b()) {
            StringBuilder sbA2 = android.support.v4.media.a.a("end (", i11, ") offset is outside of text region ");
            sbA2.append(this.f104809a.b());
            throw new IndexOutOfBoundsException(sbA2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("Do not set reversed range: ", i10, " > ", i11));
        }
        t(i10);
        s(i11);
    }

    public final void s(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot set selectionEnd to a negative value: ", i10).toString());
        }
        this.f104811c = i10;
    }

    public final void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot set selectionStart to a negative value: ", i10).toString());
        }
        this.f104810b = i10;
    }

    @NotNull
    public String toString() {
        return this.f104809a.toString();
    }

    @NotNull
    public final AnnotatedString u() {
        return new AnnotatedString(this.f104809a.toString(), null, null, 6, null);
    }

    public /* synthetic */ C2342k(String str, long j10, C4969v c4969v) {
        this(str, j10);
    }

    public C2342k(AnnotatedString annotatedString, long j10) {
        this.f104809a = new M(annotatedString.f104196a);
        this.f104810b = androidx.compose.ui.text.Z.l(j10);
        this.f104811c = androidx.compose.ui.text.Z.k(j10);
        this.f104812d = -1;
        this.f104813e = -1;
        int iL = androidx.compose.ui.text.Z.l(j10);
        int iK = androidx.compose.ui.text.Z.k(j10);
        if (iL >= 0 && iL <= annotatedString.f104196a.length()) {
            if (iK < 0 || iK > annotatedString.f104196a.length()) {
                StringBuilder sbA = android.support.v4.media.a.a("end (", iK, ") offset is outside of text region ");
                sbA.append(annotatedString.f104196a.length());
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (iL > iK) {
                throw new IllegalArgumentException(C1758e.a("Do not set reversed range: ", iL, " > ", iK));
            }
            return;
        }
        StringBuilder sbA2 = android.support.v4.media.a.a("start (", iL, ") offset is outside of text region ");
        sbA2.append(annotatedString.f104196a.length());
        throw new IndexOutOfBoundsException(sbA2.toString());
    }

    public C2342k(String str, long j10) {
        this(new AnnotatedString(str, null, null, 6, null), j10);
    }
}
