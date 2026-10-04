package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class T0<V extends AbstractC1603p> implements K0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87894e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final O0<V> f87895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RepeatMode f87896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f87897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f87898d;

    public /* synthetic */ T0(O0 o02, RepeatMode repeatMode, long j10, C4969v c4969v) {
        this(o02, repeatMode, j10);
    }

    private final long i(long j10) {
        long j11 = this.f87898d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f87897c;
        long j14 = j12 / j13;
        if (this.f87896b != RepeatMode.Restart && j14 % ((long) 2) != 0) {
            return ((j14 + 1) * j13) - j12;
        }
        Long.signum(j14);
        return j12 - (j14 * j13);
    }

    private final V j(long j10, V v10, V v11, V v12) {
        long j11 = this.f87898d;
        long j12 = j10 + j11;
        long j13 = this.f87897c;
        return j12 > j13 ? this.f87895a.d(j13 - j11, v10, v12, v11) : v11;
    }

    @Override // androidx.compose.animation.core.K0
    public boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.core.K0
    public long b(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.K0
    public AbstractC1603p c(AbstractC1603p abstractC1603p, AbstractC1603p abstractC1603p2, AbstractC1603p abstractC1603p3) {
        return d(Long.MAX_VALUE, abstractC1603p, abstractC1603p2, abstractC1603p3);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f87895a.d(i(j10), v10, v11, j(j10, v10, v12, v11));
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f87895a.e(i(j10), v10, v11, j(j10, v10, v12, v11));
    }

    public final long h() {
        return this.f87897c;
    }

    public T0(O0<V> o02, RepeatMode repeatMode, long j10) {
        this.f87895a = o02;
        this.f87896b = repeatMode;
        this.f87897c = ((long) (o02.g() + o02.f())) * 1000000;
        this.f87898d = j10 * 1000000;
    }

    public /* synthetic */ T0(O0 o02, RepeatMode repeatMode, long j10, int i10, C4969v c4969v) {
        this(o02, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i10 & 4) != 0 ? A0.d(0, 0, 2, null) : j10);
    }

    public /* synthetic */ T0(O0 o02, RepeatMode repeatMode, int i10, C4969v c4969v) {
        this(o02, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ T0(O0 o02, RepeatMode repeatMode) {
        this(o02, repeatMode, A0.d(0, 0, 2, null));
    }
}
