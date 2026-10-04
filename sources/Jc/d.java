package Jc;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import yc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f58244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f58246c;

    public d(@e T value, long time, @e TimeUnit unit) {
        Objects.requireNonNull(value, "value is null");
        this.f58244a = value;
        this.f58245b = time;
        Objects.requireNonNull(unit, "unit is null");
        this.f58246c = unit;
    }

    public long a() {
        return this.f58245b;
    }

    public long b(@e TimeUnit unit) {
        return unit.convert(this.f58245b, this.f58246c);
    }

    @e
    public TimeUnit c() {
        return this.f58246c;
    }

    @e
    public T d() {
        return this.f58244a;
    }

    public boolean equals(Object other) {
        if (other instanceof d) {
            d dVar = (d) other;
            if (Objects.equals(this.f58244a, dVar.f58244a) && this.f58245b == dVar.f58245b && Objects.equals(this.f58246c, dVar.f58246c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f58244a.hashCode() * 31;
        long j10 = this.f58245b;
        return this.f58246c.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 31)))) * 31);
    }

    public String toString() {
        return "Timed[time=" + this.f58245b + ", unit=" + this.f58246c + ", value=" + this.f58244a + "]";
    }
}
