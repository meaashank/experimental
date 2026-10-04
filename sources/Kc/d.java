package Kc;

import java.util.concurrent.TimeUnit;
import lc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f58566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f58568c;

    public d(@e T t10, long j10, @e TimeUnit timeUnit) {
        this.f58566a = t10;
        this.f58567b = j10;
        io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
        this.f58568c = timeUnit;
    }

    public long a() {
        return this.f58567b;
    }

    public long b(@e TimeUnit timeUnit) {
        return timeUnit.convert(this.f58567b, this.f58568c);
    }

    @e
    public TimeUnit c() {
        return this.f58568c;
    }

    @e
    public T d() {
        return this.f58566a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (io.reactivex.internal.functions.a.c(this.f58566a, dVar.f58566a) && this.f58567b == dVar.f58567b && io.reactivex.internal.functions.a.c(this.f58568c, dVar.f58568c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f58566a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f58567b;
        return this.f58568c.hashCode() + (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31);
    }

    public String toString() {
        return "Timed[time=" + this.f58567b + ", unit=" + this.f58568c + ", value=" + this.f58566a + "]";
    }
}
