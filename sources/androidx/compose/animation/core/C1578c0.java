package androidx.compose.animation.core;

import androidx.collection.C1550p;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1578c0<T> implements InterfaceC1587h<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88096d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F<T> f88097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RepeatMode f88098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88099c;

    public /* synthetic */ C1578c0(F f10, RepeatMode repeatMode, long j10, C4969v c4969v) {
        this(f10, repeatMode, j10);
    }

    @Override // androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    public <V extends AbstractC1603p> K0<V> a(@NotNull H0<T, V> h02) {
        return new T0(this.f88097a.a((H0) h02), this.f88098b, this.f88099c);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C1578c0) {
            C1578c0 c1578c0 = (C1578c0) obj;
            if (kotlin.jvm.internal.G.g(c1578c0.f88097a, this.f88097a) && c1578c0.f88098b == this.f88098b && A0.f(c1578c0.f88099c, this.f88099c)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final F<T> f() {
        return this.f88097a;
    }

    public final long g() {
        return this.f88099c;
    }

    @NotNull
    public final RepeatMode h() {
        return this.f88098b;
    }

    public int hashCode() {
        return C1550p.a(this.f88099c) + ((this.f88098b.hashCode() + (this.f88097a.hashCode() * 31)) * 31);
    }

    public C1578c0(F<T> f10, RepeatMode repeatMode, long j10) {
        this.f88097a = f10;
        this.f88098b = repeatMode;
        this.f88099c = j10;
    }

    public /* synthetic */ C1578c0(F f10, RepeatMode repeatMode, long j10, int i10, C4969v c4969v) {
        this(f10, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i10 & 4) != 0 ? A0.d(0, 0, 2, null) : j10);
    }

    public /* synthetic */ C1578c0(F f10, RepeatMode repeatMode, int i10, C4969v c4969v) {
        this(f10, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ C1578c0(F f10, RepeatMode repeatMode) {
        this(f10, repeatMode, A0.d(0, 0, 2, null));
    }
}
