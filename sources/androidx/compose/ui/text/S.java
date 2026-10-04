package androidx.compose.ui.text;

import androidx.collection.C1550p;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class S {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104307g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Q f104308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MultiParagraph f104309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f104310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f104311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f104312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<P.j> f104313f;

    public /* synthetic */ S(Q q10, MultiParagraph multiParagraph, long j10, C4969v c4969v) {
        this(q10, multiParagraph, j10);
    }

    public static /* synthetic */ S b(S s10, Q q10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q10 = s10.f104308a;
        }
        if ((i10 & 2) != 0) {
            j10 = s10.f104310c;
        }
        return s10.a(q10, j10);
    }

    public static int q(S s10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return s10.f104309b.o(i10, z10);
    }

    @NotNull
    public final Path A(int i10, int i11) {
        return this.f104309b.E(i10, i11);
    }

    @NotNull
    public final List<P.j> B() {
        return this.f104313f;
    }

    public final long C() {
        return this.f104310c;
    }

    public final long D(int i10) {
        return this.f104309b.I(i10);
    }

    public final boolean E(int i10) {
        return this.f104309b.J(i10);
    }

    @NotNull
    public final S a(@NotNull Q q10, long j10) {
        return new S(q10, this.f104309b, j10);
    }

    @NotNull
    public final ResolvedTextDirection c(int i10) {
        return this.f104309b.c(i10);
    }

    @NotNull
    public final P.j d(int i10) {
        return this.f104309b.d(i10);
    }

    @NotNull
    public final P.j e(int i10) {
        return this.f104309b.e(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return kotlin.jvm.internal.G.g(this.f104308a, s10.f104308a) && kotlin.jvm.internal.G.g(this.f104309b, s10.f104309b) && k0.x.h(this.f104310c, s10.f104310c) && this.f104311d == s10.f104311d && this.f104312e == s10.f104312e && kotlin.jvm.internal.G.g(this.f104313f, s10.f104313f);
    }

    public final boolean f() {
        MultiParagraph multiParagraph = this.f104309b;
        return multiParagraph.f104267c || ((float) ((int) (this.f104310c & ZipKt.f225990j))) < multiParagraph.f104269e;
    }

    public final boolean g() {
        return ((float) ((int) (this.f104310c >> 32))) < this.f104309b.f104268d;
    }

    public final float h() {
        return this.f104311d;
    }

    public int hashCode() {
        return this.f104313f.hashCode() + androidx.compose.animation.B.a(this.f104312e, androidx.compose.animation.B.a(this.f104311d, (C1550p.a(this.f104310c) + ((this.f104309b.hashCode() + (this.f104308a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i10, boolean z10) {
        return this.f104309b.i(i10, z10);
    }

    public final float k() {
        return this.f104312e;
    }

    @NotNull
    public final Q l() {
        return this.f104308a;
    }

    public final float m(int i10) {
        return this.f104309b.l(i10);
    }

    public final float n(int i10) {
        return this.f104309b.m(i10);
    }

    public final int o() {
        return this.f104309b.f104270f;
    }

    public final int p(int i10, boolean z10) {
        return this.f104309b.o(i10, z10);
    }

    public final int r(int i10) {
        return this.f104309b.q(i10);
    }

    public final int s(float f10) {
        return this.f104309b.r(f10);
    }

    public final float t(int i10) {
        return this.f104309b.t(i10);
    }

    @NotNull
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f104308a + ", multiParagraph=" + this.f104309b + ", size=" + ((Object) k0.x.p(this.f104310c)) + ", firstBaseline=" + this.f104311d + ", lastBaseline=" + this.f104312e + ", placeholderRects=" + this.f104313f + ')';
    }

    public final float u(int i10) {
        return this.f104309b.u(i10);
    }

    public final int v(int i10) {
        return this.f104309b.v(i10);
    }

    public final float w(int i10) {
        return this.f104309b.w(i10);
    }

    @NotNull
    public final MultiParagraph x() {
        return this.f104309b;
    }

    public final int y(long j10) {
        return this.f104309b.B(j10);
    }

    @NotNull
    public final ResolvedTextDirection z(int i10) {
        return this.f104309b.C(i10);
    }

    public S(Q q10, MultiParagraph multiParagraph, long j10) {
        this.f104308a = q10;
        this.f104309b = multiParagraph;
        this.f104310c = j10;
        this.f104311d = multiParagraph.g();
        this.f104312e = multiParagraph.k();
        this.f104313f = multiParagraph.f104271g;
    }
}
