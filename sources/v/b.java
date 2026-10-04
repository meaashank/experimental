package V;

import androidx.compose.runtime.internal.r;
import java.util.Arrays;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f74444c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public long[] f74446b = new long[2];

    public final boolean a(long j10) {
        if (d(j10)) {
            return false;
        }
        m(this.f74445a, j10);
        return true;
    }

    public final boolean b(long j10) {
        return a(j10);
    }

    public final void c() {
        this.f74445a = 0;
    }

    public final boolean d(long j10) {
        int i10 = this.f74445a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f74446b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(long j10) {
        return d(j10);
    }

    public final long f(int i10) {
        return this.f74446b[i10];
    }

    public final int g() {
        return this.f74445a - 1;
    }

    public final int h() {
        return this.f74445a;
    }

    public final boolean i() {
        return this.f74445a == 0;
    }

    public final boolean j(long j10) {
        int i10 = this.f74445a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j10 == this.f74446b[i11]) {
                l(i11);
                return true;
            }
        }
        return false;
    }

    public final boolean k(long j10) {
        return j(j10);
    }

    public final boolean l(int i10) {
        int i11 = this.f74445a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f74446b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f74445a--;
        return true;
    }

    public final void m(int i10, long j10) {
        long[] jArr = this.f74446b;
        if (i10 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            G.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f74446b = jArrCopyOf;
        }
        this.f74446b[i10] = j10;
        if (i10 >= this.f74445a) {
            this.f74445a = i10 + 1;
        }
    }

    public final void n(int i10, long j10) {
        m(i10, j10);
    }
}
