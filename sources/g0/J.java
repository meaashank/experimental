package G0;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.compose.animation.C1571b;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f40043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f40045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f40046d;

    public J(@NonNull PointF pointF, float f10, @NonNull PointF pointF2, float f11) {
        androidx.core.util.t.m(pointF, "start == null");
        this.f40043a = pointF;
        this.f40044b = f10;
        androidx.core.util.t.m(pointF2, "end == null");
        this.f40045c = pointF2;
        this.f40046d = f11;
    }

    @NonNull
    public PointF a() {
        return this.f40045c;
    }

    public float b() {
        return this.f40046d;
    }

    @NonNull
    public PointF c() {
        return this.f40043a;
    }

    public float d() {
        return this.f40044b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return Float.compare(this.f40044b, j10.f40044b) == 0 && Float.compare(this.f40046d, j10.f40046d) == 0 && this.f40043a.equals(j10.f40043a) && this.f40045c.equals(j10.f40045c);
    }

    public int hashCode() {
        int iHashCode = this.f40043a.hashCode() * 31;
        float f10 = this.f40044b;
        int iHashCode2 = (this.f40045c.hashCode() + ((iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31)) * 31;
        float f11 = this.f40046d;
        return iHashCode2 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PathSegment{start=");
        sb2.append(this.f40043a);
        sb2.append(", startFraction=");
        sb2.append(this.f40044b);
        sb2.append(", end=");
        sb2.append(this.f40045c);
        sb2.append(", endFraction=");
        return C1571b.a(sb2, this.f40046d, '}');
    }
}
