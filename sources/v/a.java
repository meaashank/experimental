package V;

import androidx.collection.C1550p;
import androidx.compose.animation.C1571b;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f74441c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f74442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f74443b;

    public a(long j10, float f10) {
        this.f74442a = j10;
        this.f74443b = f10;
    }

    public static a d(a aVar, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.f74442a;
        }
        if ((i10 & 2) != 0) {
            f10 = aVar.f74443b;
        }
        aVar.getClass();
        return new a(j10, f10);
    }

    public final long a() {
        return this.f74442a;
    }

    public final float b() {
        return this.f74443b;
    }

    @NotNull
    public final a c(long j10, float f10) {
        return new a(j10, f10);
    }

    public final float e() {
        return this.f74443b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f74442a == aVar.f74442a && Float.compare(this.f74443b, aVar.f74443b) == 0;
    }

    public final long f() {
        return this.f74442a;
    }

    public final void g(float f10) {
        this.f74443b = f10;
    }

    public final void h(long j10) {
        this.f74442a = j10;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f74443b) + (C1550p.a(this.f74442a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f74442a);
        sb2.append(", dataPoint=");
        return C1571b.a(sb2, this.f74443b, ')');
    }
}
