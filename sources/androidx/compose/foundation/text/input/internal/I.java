package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C1758e;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/foundation/text/input/internal/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f93718h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f93719i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f93720j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final S0 f93721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1794m f93722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Pair<androidx.compose.foundation.text.input.q, androidx.compose.ui.text.Z> f93725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f93726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f93727g;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ I(AnnotatedString annotatedString, long j10, C4969v c4969v) {
        this(annotatedString, j10);
    }

    public final void a(int i10, int i11) {
        if (i10 < 0 || i10 > this.f93721a.c()) {
            StringBuilder sbA = android.support.v4.media.a.a("start (", i10, ") offset is outside of text region ");
            sbA.append(this.f93721a.c());
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < 0 || i11 > this.f93721a.c()) {
            StringBuilder sbA2 = android.support.v4.media.a.a("end (", i11, ") offset is outside of text region ");
            sbA2.append(this.f93721a.c());
            throw new IndexOutOfBoundsException(sbA2.toString());
        }
    }

    public final void b() {
        this.f93725e = null;
    }

    public final void c() {
        this.f93726f = -1;
        this.f93727g = -1;
    }

    public final void d(int i10, int i11) {
        a(i10, i11);
        long jB = androidx.compose.ui.text.a0.b(i10, i11);
        this.f93722b.f(i10, i11, 0);
        S0.e(this.f93721a, androidx.compose.ui.text.Z.l(jB), androidx.compose.ui.text.Z.k(jB), "", 0, 0, 24, null);
        long jA = J.a(androidx.compose.ui.text.a0.b(this.f93723c, this.f93724d), jB);
        x((int) (jA >> 32));
        w((int) (jA & ZipKt.f225990j));
        if (p()) {
            long jA2 = J.a(androidx.compose.ui.text.a0.b(this.f93726f, this.f93727g), jB);
            if (androidx.compose.ui.text.Z.h(jA2)) {
                c();
            } else {
                this.f93726f = androidx.compose.ui.text.Z.l(jA2);
                this.f93727g = androidx.compose.ui.text.Z.k(jA2);
            }
        }
        this.f93725e = null;
    }

    public final char e(int i10) {
        return this.f93721a.b(i10);
    }

    @NotNull
    public final C1794m f() {
        return this.f93722b;
    }

    @Nullable
    public final androidx.compose.ui.text.Z g() {
        if (p()) {
            return new androidx.compose.ui.text.Z(androidx.compose.ui.text.a0.b(this.f93726f, this.f93727g));
        }
        return null;
    }

    public final int h() {
        return this.f93727g;
    }

    public final int i() {
        return this.f93726f;
    }

    public final int j() {
        int i10 = this.f93723c;
        int i11 = this.f93724d;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    @Nullable
    public final Pair<androidx.compose.foundation.text.input.q, androidx.compose.ui.text.Z> k() {
        return this.f93725e;
    }

    public final int l() {
        return this.f93721a.c();
    }

    public final long m() {
        return androidx.compose.ui.text.a0.b(this.f93723c, this.f93724d);
    }

    public final int n() {
        return this.f93724d;
    }

    public final int o() {
        return this.f93723c;
    }

    public final boolean p() {
        return this.f93726f != -1;
    }

    public final void q(int i10, int i11, @NotNull CharSequence charSequence) {
        a(i10, i11);
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i12 = 0;
        int i13 = iMin;
        while (i13 < iMax && i12 < charSequence.length() && charSequence.charAt(i12) == this.f93721a.b(i13)) {
            i12++;
            i13++;
        }
        int length = charSequence.length();
        int i14 = iMax;
        while (i14 > iMin && length > i12 && charSequence.charAt(length - 1) == this.f93721a.b(i14 - 1)) {
            length--;
            i14--;
        }
        this.f93722b.f(i13, i14, length - i12);
        S0.e(this.f93721a, iMin, iMax, charSequence, 0, 0, 24, null);
        x(charSequence.length() + iMin);
        w(charSequence.length() + iMin);
        this.f93726f = -1;
        this.f93727g = -1;
        this.f93725e = null;
    }

    public final void r(int i10, int i11) {
        if (i10 < 0 || i10 > this.f93721a.c()) {
            StringBuilder sbA = android.support.v4.media.a.a("start (", i10, ") offset is outside of text region ");
            sbA.append(this.f93721a.c());
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < 0 || i11 > this.f93721a.c()) {
            StringBuilder sbA2 = android.support.v4.media.a.a("end (", i11, ") offset is outside of text region ");
            sbA2.append(this.f93721a.c());
            throw new IndexOutOfBoundsException(sbA2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(C1758e.a("Do not set reversed or empty range: ", i10, " > ", i11));
        }
        this.f93726f = i10;
        this.f93727g = i11;
    }

    public final void s(int i10) {
        v(i10, i10);
    }

    public final void t(@Nullable Pair<androidx.compose.foundation.text.input.q, androidx.compose.ui.text.Z> pair) {
        this.f93725e = pair;
    }

    @NotNull
    public String toString() {
        return this.f93721a.toString();
    }

    public final void u(int i10, int i11, int i12) {
        if (i11 >= i12) {
            throw new IllegalArgumentException(C1758e.a("Do not set reversed or empty range: ", i11, " > ", i12));
        }
        this.f93725e = new Pair<>(new androidx.compose.foundation.text.input.q(i10), new androidx.compose.ui.text.Z(androidx.compose.ui.text.a0.b(md.u.K(i11, 0, this.f93721a.c()), md.u.K(i12, 0, this.f93721a.c()))));
    }

    public final void v(int i10, int i11) {
        int iK = md.u.K(i10, 0, this.f93721a.c());
        int iK2 = md.u.K(i11, 0, this.f93721a.c());
        x(iK);
        w(iK2);
    }

    public final void w(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot set selectionEnd to a negative value: ", i10).toString());
        }
        this.f93724d = i10;
        this.f93725e = null;
    }

    public final void x(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot set selectionStart to a negative value: ", i10).toString());
        }
        this.f93723c = i10;
        this.f93725e = null;
    }

    @NotNull
    public final AnnotatedString y() {
        return new AnnotatedString(this.f93721a.toString(), null, null, 6, null);
    }

    public /* synthetic */ I(String str, long j10, C4969v c4969v) {
        this(str, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I(AnnotatedString annotatedString, long j10) {
        this.f93721a = new S0(annotatedString.f104196a);
        this.f93722b = new C1794m(null, 1, 0 == true ? 1 : 0);
        this.f93723c = androidx.compose.ui.text.Z.n(j10);
        int i10 = (int) (ZipKt.f225990j & j10);
        this.f93724d = i10;
        this.f93726f = -1;
        this.f93727g = -1;
        a((int) (j10 >> 32), i10);
    }

    public I(String str, long j10) {
        this(new AnnotatedString(str, null, null, 6, null), j10);
    }
}
