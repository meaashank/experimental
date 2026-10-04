package Jb;

import androidx.collection.C1545m0;
import androidx.collection.C1550p;
import androidx.compose.foundation.layout.C1713x0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f58210e;

    public h() {
        this(0, 0, 0L, 0L, 0L, 31, null);
    }

    public static h g(h hVar, int i10, int i11, long j10, long j11, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = hVar.f58206a;
        }
        if ((i12 & 2) != 0) {
            i11 = hVar.f58207b;
        }
        if ((i12 & 4) != 0) {
            j10 = hVar.f58208c;
        }
        if ((i12 & 8) != 0) {
            j11 = hVar.f58209d;
        }
        if ((i12 & 16) != 0) {
            j12 = hVar.f58210e;
        }
        long j13 = j12;
        hVar.getClass();
        long j14 = j11;
        long j15 = j10;
        return new h(i10, i11, j15, j14, j13);
    }

    public final int a() {
        return this.f58206a;
    }

    public final int b() {
        return this.f58207b;
    }

    public final long c() {
        return this.f58208c;
    }

    public final long d() {
        return this.f58209d;
    }

    public final long e() {
        return this.f58210e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58206a == hVar.f58206a && this.f58207b == hVar.f58207b && this.f58208c == hVar.f58208c && this.f58209d == hVar.f58209d && this.f58210e == hVar.f58210e;
    }

    @NotNull
    public final h f(int i10, int i11, long j10, long j11, long j12) {
        return new h(i10, i11, j10, j11, j12);
    }

    public final long h() {
        return this.f58210e;
    }

    public int hashCode() {
        return C1550p.a(this.f58210e) + ((C1550p.a(this.f58209d) + ((C1550p.a(this.f58208c) + (((this.f58206a * 31) + this.f58207b) * 31)) * 31)) * 31);
    }

    public final long i() {
        return this.f58209d;
    }

    public final int j() {
        return this.f58206a;
    }

    public final int k() {
        return this.f58207b;
    }

    public final long l() {
        return this.f58208c;
    }

    public final boolean m() {
        return this.f58208c + this.f58210e == this.f58209d;
    }

    public final void n(long j10) {
        this.f58210e = j10;
    }

    @NotNull
    public String toString() {
        int i10 = this.f58206a;
        int i11 = this.f58207b;
        long j10 = this.f58208c;
        long j11 = this.f58209d;
        long j12 = this.f58210e;
        StringBuilder sbA = C1545m0.a("FileSlice(id=", i10, ", position=", i11, ", startBytes=");
        sbA.append(j10);
        C1713x0.a(sbA, ", endBytes=", j11, ", downloaded=");
        return android.support.v4.media.session.f.a(sbA, j12, ")");
    }

    public h(int i10, int i11, long j10, long j11, long j12) {
        this.f58206a = i10;
        this.f58207b = i11;
        this.f58208c = j10;
        this.f58209d = j11;
        this.f58210e = j12;
    }

    public /* synthetic */ h(int i10, int i11, long j10, long j11, long j12, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? 0L : j10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? 0L : j12);
    }
}
