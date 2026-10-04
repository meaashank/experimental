package androidx.graphics.path;

import android.graphics.PointF;
import androidx.compose.animation.C1571b;
import java.util.Arrays;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PathSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Type f113917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PointF[] f113918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f113919c;

    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(@NotNull Type type, @NotNull PointF[] points, float f10) {
        G.p(type, "type");
        G.p(points, "points");
        this.f113917a = type;
        this.f113918b = points;
        this.f113919c = f10;
    }

    @NotNull
    public final PointF[] a() {
        return this.f113918b;
    }

    @NotNull
    public final Type b() {
        return this.f113917a;
    }

    public final float c() {
        return this.f113919c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PathSegment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.f113917a == pathSegment.f113917a && Arrays.equals(this.f113918b, pathSegment.f113918b) && this.f113919c == pathSegment.f113919c;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f113919c) + (((this.f113917a.hashCode() * 31) + Arrays.hashCode(this.f113918b)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PathSegment(type=");
        sb2.append(this.f113917a);
        sb2.append(", points=");
        String string = Arrays.toString(this.f113918b);
        G.o(string, "toString(this)");
        sb2.append(string);
        sb2.append(", weight=");
        return C1571b.a(sb2, this.f113919c, ')');
    }
}
