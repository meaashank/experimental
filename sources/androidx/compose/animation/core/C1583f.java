package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 4)
public final class C1583f<T, V extends AbstractC1603p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88104c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1591j<T, V> f88105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnimationEndReason f88106b;

    public C1583f(@NotNull C1591j<T, V> c1591j, @NotNull AnimationEndReason animationEndReason) {
        this.f88105a = c1591j;
        this.f88106b = animationEndReason;
    }

    @NotNull
    public final AnimationEndReason a() {
        return this.f88106b;
    }

    @NotNull
    public final C1591j<T, V> b() {
        return this.f88105a;
    }

    @NotNull
    public String toString() {
        return "AnimationResult(endReason=" + this.f88106b + ", endState=" + this.f88105a + ')';
    }
}
