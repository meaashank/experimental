package kotlin.time;

import androidx.collection.C1550p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.NotImplementedError;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlin.time.C5041h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "2.3")
@V({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/InstantKt\n+ 4 Duration.kt\nkotlin/time/Duration\n*L\n1#1,871:1\n1#2:872\n810#3,14:873\n793#3,6:887\n810#3,14:893\n793#3,6:907\n793#3,6:914\n620#4:913\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant\n*L\n150#1:873,14\n153#1:887,6\n161#1:893,14\n164#1:907,6\n188#1:914,6\n184#1:913\n*E\n"})
@O0(markerClass = {n.class})
public final class Instant implements Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218393c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Instant f218394d = new Instant(w.f218446c, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Instant f218395e = new Instant(w.f218447d, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f218396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218397b;

    @V({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n+ 2 Instant.kt\nkotlin/time/InstantKt\n*L\n1#1,871:1\n793#2,6:872\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/Instant$Companion\n*L\n320#1:872,6\n*E\n"})
    public static final class a {
        public a() {
        }

        public static /* synthetic */ Instant d(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j11 = 0;
            }
            return aVar.c(j10, j11);
        }

        @NotNull
        public final Instant a(long j10) {
            long j11 = j10 / 1000;
            if ((j10 ^ 1000) < 0 && j11 * 1000 != j10) {
                j11--;
            }
            long j12 = j10 % 1000;
            return j11 < w.f218446c ? Instant.f218394d : j11 > w.f218447d ? Instant.f218395e : c(j11, (int) ((j12 + (1000 & (((j12 ^ 1000) & ((-j12) | j12)) >> 63))) * ((long) 1000000)));
        }

        @NotNull
        public final Instant b(long j10, int i10) {
            return c(j10, i10);
        }

        @NotNull
        public final Instant c(long j10, long j11) {
            long j12 = j11 / 1000000000;
            if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
                j12--;
            }
            long j13 = j10 + j12;
            if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                if (j10 > 0) {
                    Instant.f218393c.getClass();
                    return Instant.f218395e;
                }
                Instant.f218393c.getClass();
                return Instant.f218394d;
            }
            if (j13 < w.f218446c) {
                return Instant.f218394d;
            }
            if (j13 > w.f218447d) {
                return Instant.f218395e;
            }
            long j14 = j11 % 1000000000;
            return new Instant(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
        }

        @NotNull
        public final Instant e() {
            return c(w.f218445b, 0);
        }

        @NotNull
        public final Instant f() {
            return c(w.f218444a, 999999999);
        }

        @NotNull
        public final Instant g() {
            return Instant.f218395e;
        }

        @NotNull
        public final Instant h() {
            return Instant.f218394d;
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @InterfaceC4852c0(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        @NotNull
        public final Instant i() {
            throw new NotImplementedError(null, 1, null);
        }

        @NotNull
        public final Instant j(@NotNull CharSequence input) {
            kotlin.jvm.internal.G.p(input, "input");
            return w.r(input).toInstant();
        }

        @Nullable
        public final Instant k(@NotNull CharSequence input) {
            kotlin.jvm.internal.G.p(input, "input");
            return w.r(input).a();
        }

        public a(C4969v c4969v) {
        }
    }

    public Instant(long j10, int i10) {
        this.f218396a = j10;
        this.f218397b = i10;
        if (w.f218446c > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return p.a(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f218396a == instant.f218396a && this.f218397b == instant.f218397b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull Instant other) {
        kotlin.jvm.internal.G.p(other, "other");
        int iU = kotlin.jvm.internal.G.u(this.f218396a, other.f218396a);
        return iU != 0 ? iU : kotlin.jvm.internal.G.t(this.f218397b, other.f218397b);
    }

    public int hashCode() {
        return (this.f218397b * 51) + C1550p.a(this.f218396a);
    }

    public final long i() {
        return this.f218396a;
    }

    public final int j() {
        return this.f218397b;
    }

    @NotNull
    public final Instant k(long j10) {
        return m(C5041h.l0(j10));
    }

    public final long l(@NotNull Instant other) {
        kotlin.jvm.internal.G.p(other, "other");
        C5041h.a aVar = C5041h.f218418b;
        return C5041h.W(j.P(this.f218396a - other.f218396a, DurationUnit.SECONDS), j.O(this.f218397b - other.f218397b, DurationUnit.NANOSECONDS));
    }

    @NotNull
    public final Instant m(long j10) {
        long jC = C5041h.C(j10);
        int iG = C5041h.G(j10);
        if (jC == 0 && iG == 0) {
            return this;
        }
        long j11 = this.f218396a;
        long j12 = j11 + jC;
        if ((j11 ^ j12) >= 0 || (jC ^ j11) < 0) {
            return f218393c.c(j12, this.f218397b + iG);
        }
        return C5041h.T(j10) ? f218395e : f218394d;
    }

    public final long n() {
        long j10 = this.f218396a;
        long j11 = 1000;
        if (j10 >= 0) {
            if (j10 != 1) {
                if (j10 != 0) {
                    long j12 = j10 * 1000;
                    if (j12 / 1000 != j10) {
                        return Long.MAX_VALUE;
                    }
                    j11 = j12;
                } else {
                    j11 = 0;
                }
            }
            long j13 = this.f218397b / 1000000;
            long j14 = j11 + j13;
            if ((j11 ^ j14) >= 0 || (j13 ^ j11) < 0) {
                return j14;
            }
            return Long.MAX_VALUE;
        }
        long j15 = j10 + 1;
        if (j15 != 1) {
            if (j15 != 0) {
                long j16 = j15 * 1000;
                if (j16 / 1000 != j15) {
                    return Long.MIN_VALUE;
                }
                j11 = j16;
            } else {
                j11 = 0;
            }
        }
        long j17 = (this.f218397b / 1000000) - 1000;
        long j18 = j11 + j17;
        if ((j11 ^ j18) >= 0 || (j17 ^ j11) < 0) {
            return j18;
        }
        return Long.MIN_VALUE;
    }

    @NotNull
    public String toString() {
        return w.j(this);
    }
}
