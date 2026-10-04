package k0;

import androidx.collection.C1550p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214274b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214275c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f214276d = 4294967296L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f214277e = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214278a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return D.f214277e;
        }

        public final long b() {
            return D.f214276d;
        }

        public final long c() {
            return D.f214275c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ D(long j10) {
        this.f214278a = j10;
    }

    public static final /* synthetic */ D d(long j10) {
        return new D(j10);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof D) && j10 == ((D) obj).f214278a;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return C1550p.a(j10);
    }

    @NotNull
    public static String i(long j10) {
        return g(j10, f214275c) ? "Unspecified" : g(j10, f214276d) ? "Sp" : g(j10, f214277e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f214278a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214278a);
    }

    public final /* synthetic */ long j() {
        return this.f214278a;
    }

    @NotNull
    public String toString() {
        return i(this.f214278a);
    }

    public static long e(long j10) {
        return j10;
    }
}
