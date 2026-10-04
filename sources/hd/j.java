package Hd;

import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f50889c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f50890d = 65535;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f50891e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50892f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50893g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50894h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f50895i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f50896j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50897k = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f50899b = new int[10];

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public final void a() {
        this.f50898a = 0;
        C4875q.T1(this.f50899b, 0, 0, 0, 6, null);
    }

    public final int b(int i10) {
        return this.f50899b[i10];
    }

    public final boolean c(boolean z10) {
        return (this.f50898a & 4) != 0 ? this.f50899b[2] == 1 : z10;
    }

    public final int d() {
        if ((this.f50898a & 2) != 0) {
            return this.f50899b[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.f50898a & 128) != 0) {
            return this.f50899b[7];
        }
        return 65535;
    }

    public final int f() {
        if ((this.f50898a & 16) != 0) {
            return this.f50899b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int i10) {
        return (this.f50898a & 32) != 0 ? this.f50899b[5] : i10;
    }

    public final int h(int i10) {
        return (this.f50898a & 64) != 0 ? this.f50899b[6] : i10;
    }

    public final boolean i(int i10) {
        return ((1 << i10) & this.f50898a) != 0;
    }

    public final void j(@NotNull j other) {
        G.p(other, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (other.i(i10)) {
                k(i10, other.f50899b[i10]);
            }
            i10 = i11;
        }
    }

    @NotNull
    public final j k(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f50899b;
            if (i10 < iArr.length) {
                this.f50898a = (1 << i10) | this.f50898a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.f50898a);
    }
}
