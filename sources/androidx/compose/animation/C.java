package androidx.compose.animation;

import androidx.collection.C1550p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87221d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4814e f87223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f87224c;

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f87225d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f87226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f87227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f87228c;

        public a(float f10, float f11, long j10) {
            this.f87226a = f10;
            this.f87227b = f11;
            this.f87228c = j10;
        }

        public static a e(a aVar, float f10, float f11, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f87226a;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f87227b;
            }
            if ((i10 & 4) != 0) {
                j10 = aVar.f87228c;
            }
            aVar.getClass();
            return new a(f10, f11, j10);
        }

        public final float a() {
            return this.f87226a;
        }

        public final float b() {
            return this.f87227b;
        }

        public final long c() {
            return this.f87228c;
        }

        @NotNull
        public final a d(float f10, float f11, long j10) {
            return new a(f10, f11, j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f87226a, aVar.f87226a) == 0 && Float.compare(this.f87227b, aVar.f87227b) == 0 && this.f87228c == aVar.f87228c;
        }

        public final float f() {
            return this.f87227b;
        }

        public final long g() {
            return this.f87228c;
        }

        public final float h() {
            return this.f87226a;
        }

        public int hashCode() {
            return C1550p.a(this.f87228c) + B.a(this.f87227b, Float.floatToIntBits(this.f87226a) * 31, 31);
        }

        public final float i(long j10) {
            long j11 = this.f87228c;
            return Math.signum(this.f87226a) * this.f87227b * C1572c.f87555a.b(j11 > 0 ? j10 / j11 : 1.0f).f87561a;
        }

        public final float j(long j10) {
            long j11 = this.f87228c;
            return (((Math.signum(this.f87226a) * C1572c.f87555a.b(j11 > 0 ? j10 / j11 : 1.0f).f87562b) * this.f87227b) / this.f87228c) * 1000.0f;
        }

        @NotNull
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f87226a + ", distance=" + this.f87227b + ", duration=" + this.f87228c + ')';
        }
    }

    public C(float f10, @NotNull InterfaceC4814e interfaceC4814e) {
        this.f87222a = f10;
        this.f87223b = interfaceC4814e;
        this.f87224c = a(interfaceC4814e);
    }

    public final float a(InterfaceC4814e interfaceC4814e) {
        return D.c(0.84f, interfaceC4814e.a());
    }

    public final float b(float f10) {
        double dF = f(f10);
        double d10 = ((double) D.f87269c) - 1.0d;
        return (float) (Math.exp((((double) D.f87269c) / d10) * dF) * ((double) (this.f87222a * this.f87224c)));
    }

    public final long c(float f10) {
        return (long) (Math.exp(f(f10) / (((double) D.f87269c) - 1.0d)) * 1000.0d);
    }

    @NotNull
    public final a d(float f10) {
        double dF = f(f10);
        double d10 = ((double) D.f87269c) - 1.0d;
        return new a(f10, (float) (Math.exp((((double) D.f87269c) / d10) * dF) * ((double) (this.f87222a * this.f87224c))), (long) (Math.exp(dF / d10) * 1000.0d));
    }

    @NotNull
    public final InterfaceC4814e e() {
        return this.f87223b;
    }

    public final double f(float f10) {
        return C1572c.f87555a.a(f10, this.f87222a * this.f87224c);
    }
}
