package androidx.compose.animation.core;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1619x0<T> implements U<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88249d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final T f88252c;

    public C1619x0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C1619x0) {
            C1619x0 c1619x0 = (C1619x0) obj;
            if (c1619x0.f88250a == this.f88250a && c1619x0.f88251b == this.f88251b && kotlin.jvm.internal.G.g(c1619x0.f88252c, this.f88252c)) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f88250a;
    }

    public final float g() {
        return this.f88251b;
    }

    @Nullable
    public final T h() {
        return this.f88252c;
    }

    public int hashCode() {
        T t10 = this.f88252c;
        return Float.floatToIntBits(this.f88251b) + androidx.compose.animation.B.a(this.f88250a, (t10 != null ? t10.hashCode() : 0) * 31, 31);
    }

    @Override // androidx.compose.animation.core.U, androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC1603p> Z0<V> a(@NotNull H0<T, V> h02) {
        return new Z0<>(this.f88250a, this.f88251b, C1589i.b(h02, this.f88252c));
    }

    public C1619x0(float f10, float f11, @Nullable T t10) {
        this.f88250a = f10;
        this.f88251b = f11;
        this.f88252c = t10;
    }

    public /* synthetic */ C1619x0(float f10, float f11, Object obj, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
