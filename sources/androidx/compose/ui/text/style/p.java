package androidx.compose.ui.text.style;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import k0.B;
import k0.C;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105041d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f105044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f105040c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final p f105042e = new p(0, 0, 3, null);

    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final p a() {
            return p.f105042e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ p(long j10, long j11, C4969v c4969v) {
        this(j10, j11);
    }

    public static p c(p pVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pVar.f105043a;
        }
        if ((i10 & 2) != 0) {
            j11 = pVar.f105044b;
        }
        pVar.getClass();
        return new p(j10, j11);
    }

    @NotNull
    public final p b(long j10, long j11) {
        return new p(j10, j11);
    }

    public final long d() {
        return this.f105043a;
    }

    public final long e() {
        return this.f105044b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return B.j(this.f105043a, pVar.f105043a) && B.j(this.f105044b, pVar.f105044b);
    }

    public int hashCode() {
        return C1550p.a(this.f105044b) + (B.o(this.f105043a) * 31);
    }

    @NotNull
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) B.u(this.f105043a)) + ", restLine=" + ((Object) B.u(this.f105044b)) + ')';
    }

    public p(long j10, long j11) {
        this.f105043a = j10;
        this.f105044b = j11;
    }

    public /* synthetic */ p(long j10, long j11, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? C.m(0) : j10, (i10 & 2) != 0 ? C.m(0) : j11);
    }
}
