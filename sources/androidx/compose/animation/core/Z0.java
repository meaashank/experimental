package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Z0<V extends AbstractC1603p> implements Q0<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88064d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0<V> f88067c;

    public Z0(float f10, float f11, @Nullable V v10) {
        this(f10, f11, L0.c(v10, f10, f11));
    }

    @Override // androidx.compose.animation.core.Q0, androidx.compose.animation.core.K0
    public boolean a() {
        this.f88067c.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.K0
    public long b(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f88067c.b(v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f88067c.c(v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f88067c.d(j10, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f88067c.e(j10, v10, v11, v12);
    }

    public final float h() {
        return this.f88065a;
    }

    public final float i() {
        return this.f88066b;
    }

    public Z0(float f10, float f11, r rVar) {
        this.f88065a = f10;
        this.f88066b = f11;
        this.f88067c = new R0<>(rVar);
    }

    public /* synthetic */ Z0(float f10, float f11, AbstractC1603p abstractC1603p, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : abstractC1603p);
    }
}
