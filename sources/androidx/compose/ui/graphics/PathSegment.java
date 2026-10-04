package androidx.compose.ui.graphics;

import androidx.compose.animation.C1571b;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class PathSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Type f100791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final float[] f100792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100793c;

    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(@NotNull Type type, @NotNull float[] fArr, float f10) {
        this.f100791a = type;
        this.f100792b = fArr;
        this.f100793c = f10;
    }

    @NotNull
    public final float[] a() {
        return this.f100792b;
    }

    @NotNull
    public final Type b() {
        return this.f100791a;
    }

    public final float c() {
        return this.f100793c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.f100791a == pathSegment.f100791a && Arrays.equals(this.f100792b, pathSegment.f100792b) && this.f100793c == pathSegment.f100793c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f100793c) + ((Arrays.hashCode(this.f100792b) + (this.f100791a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PathSegment(type=");
        sb2.append(this.f100791a);
        sb2.append(", points=");
        String string = Arrays.toString(this.f100792b);
        kotlin.jvm.internal.G.o(string, "toString(this)");
        sb2.append(string);
        sb2.append(", weight=");
        return C1571b.a(sb2, this.f100793c, ')');
    }
}
