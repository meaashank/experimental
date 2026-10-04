package androidx.compose.animation.core;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1607r0<T> implements U<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88172e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final F<T> f88174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RepeatMode f88175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88176d;

    public /* synthetic */ C1607r0(int i10, F f10, RepeatMode repeatMode, long j10, C4969v c4969v) {
        this(i10, f10, repeatMode, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C1607r0) {
            C1607r0 c1607r0 = (C1607r0) obj;
            if (c1607r0.f88173a == this.f88173a && kotlin.jvm.internal.G.g(c1607r0.f88174b, this.f88174b) && c1607r0.f88175c == this.f88175c && A0.f(c1607r0.f88176d, this.f88176d)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final F<T> f() {
        return this.f88174b;
    }

    public final long g() {
        return this.f88176d;
    }

    public final int h() {
        return this.f88173a;
    }

    public int hashCode() {
        return C1550p.a(this.f88176d) + ((this.f88175c.hashCode() + ((this.f88174b.hashCode() + (this.f88173a * 31)) * 31)) * 31);
    }

    @NotNull
    public final RepeatMode i() {
        return this.f88175c;
    }

    public C1607r0(int i10, F<T> f10, RepeatMode repeatMode, long j10) {
        this.f88173a = i10;
        this.f88174b = f10;
        this.f88175c = repeatMode;
        this.f88176d = j10;
    }

    @Override // androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    public <V extends AbstractC1603p> Q0<V> a(@NotNull H0<T, V> h02) {
        return new X0(this.f88173a, this.f88174b.a((H0) h02), this.f88175c, this.f88176d);
    }

    public /* synthetic */ C1607r0(int i10, F f10, RepeatMode repeatMode, long j10, int i11, C4969v c4969v) {
        this(i10, f10, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 8) != 0 ? A0.d(0, 0, 2, null) : j10);
    }

    public /* synthetic */ C1607r0(int i10, F f10, RepeatMode repeatMode, int i11, C4969v c4969v) {
        this(i10, f10, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ C1607r0(int i10, F f10, RepeatMode repeatMode) {
        this(i10, f10, repeatMode, A0.d(0, 0, 2, null));
    }
}
