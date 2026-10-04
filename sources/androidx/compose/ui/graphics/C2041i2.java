package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C2041i2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f101127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final T f101129c;

    public C2041i2(float f10, float f11, @Nullable T t10) {
        this.f101127a = f10;
        this.f101128b = f11;
        this.f101129c = t10;
    }

    public final boolean a(float f10) {
        return f10 <= this.f101128b && this.f101127a <= f10;
    }

    @Nullable
    public final T b() {
        return this.f101129c;
    }

    public final float c() {
        return this.f101128b;
    }

    public final float d() {
        return this.f101127a;
    }

    public final boolean e(float f10, float f11) {
        return this.f101127a <= f11 && this.f101128b >= f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2041i2 c2041i2 = (C2041i2) obj;
            return this.f101127a == c2041i2.f101127a && this.f101128b == c2041i2.f101128b && kotlin.jvm.internal.G.g(this.f101129c, c2041i2.f101129c);
        }
        return false;
    }

    public final boolean f(@NotNull C2041i2<T> c2041i2) {
        return this.f101127a <= c2041i2.f101128b && this.f101128b >= c2041i2.f101127a;
    }

    public int hashCode() {
        int iA = androidx.compose.animation.B.a(this.f101128b, Float.floatToIntBits(this.f101127a) * 31, 31);
        T t10 = this.f101129c;
        return iA + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Interval(start=" + this.f101127a + ", end=" + this.f101128b + ", data=" + this.f101129c + ')';
    }

    public /* synthetic */ C2041i2(float f10, float f11, Object obj, int i10, C4969v c4969v) {
        this(f10, f11, (i10 & 4) != 0 ? null : obj);
    }
}
