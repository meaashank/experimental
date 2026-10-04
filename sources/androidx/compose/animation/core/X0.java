package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class X0<V extends AbstractC1603p> implements Q0<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88052f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final O0<V> f88054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RepeatMode f88055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88057e;

    public /* synthetic */ X0(int i10, O0 o02, RepeatMode repeatMode, long j10, C4969v c4969v) {
        this(i10, o02, repeatMode, j10);
    }

    @Override // androidx.compose.animation.core.Q0, androidx.compose.animation.core.K0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.K0
    public long b(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (((long) this.f88053a) * this.f88056d) - this.f88057e;
    }

    @Override // androidx.compose.animation.core.K0
    public AbstractC1603p c(AbstractC1603p abstractC1603p, AbstractC1603p abstractC1603p2, AbstractC1603p abstractC1603p3) {
        return d(b(abstractC1603p, abstractC1603p2, abstractC1603p3), abstractC1603p, abstractC1603p2, abstractC1603p3);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f88054b.d(i(j10), v10, v11, j(j10, v10, v12, v11));
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f88054b.e(i(j10), v10, v11, j(j10, v10, v12, v11));
    }

    public final long h() {
        return this.f88056d;
    }

    public final long i(long j10) {
        long j11 = this.f88057e;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long jMin = Math.min(j12 / this.f88056d, ((long) this.f88053a) - 1);
        return (this.f88055c == RepeatMode.Restart || jMin % ((long) 2) == 0) ? j12 - (jMin * this.f88056d) : ((jMin + 1) * this.f88056d) - j12;
    }

    public final V j(long j10, V v10, V v11, V v12) {
        long j11 = this.f88057e;
        long j12 = j10 + j11;
        long j13 = this.f88056d;
        return j12 > j13 ? (V) d(j13 - j11, v10, v11, v12) : v11;
    }

    public X0(int i10, O0<V> o02, RepeatMode repeatMode, long j10) {
        this.f88053a = i10;
        this.f88054b = o02;
        this.f88055c = repeatMode;
        if (i10 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.f88056d = ((long) (o02.g() + o02.f())) * 1000000;
        this.f88057e = j10 * 1000000;
    }

    public /* synthetic */ X0(int i10, O0 o02, RepeatMode repeatMode, long j10, int i11, C4969v c4969v) {
        this(i10, o02, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 8) != 0 ? A0.d(0, 0, 2, null) : j10);
    }

    public /* synthetic */ X0(int i10, O0 o02, RepeatMode repeatMode, int i11, C4969v c4969v) {
        this(i10, o02, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ X0(int i10, O0 o02, RepeatMode repeatMode) {
        this(i10, o02, repeatMode, A0.d(0, 0, 2, null));
    }
}
