package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class a1<V extends AbstractC1603p> implements O0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88073e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final G f88076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final R0<V> f88077d;

    public a1() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.Q0, androidx.compose.animation.core.K0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.O0, androidx.compose.animation.core.K0
    public /* synthetic */ long b(AbstractC1603p abstractC1603p, AbstractC1603p abstractC1603p2, AbstractC1603p abstractC1603p3) {
        return N0.a(this, abstractC1603p, abstractC1603p2, abstractC1603p3);
    }

    @Override // androidx.compose.animation.core.K0
    public AbstractC1603p c(AbstractC1603p abstractC1603p, AbstractC1603p abstractC1603p2, AbstractC1603p abstractC1603p3) {
        return d(b(abstractC1603p, abstractC1603p2, abstractC1603p3), abstractC1603p, abstractC1603p2, abstractC1603p3);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f88077d.d(j10, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (V) this.f88077d.e(j10, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.O0
    public int f() {
        return this.f88075b;
    }

    @Override // androidx.compose.animation.core.O0
    public int g() {
        return this.f88074a;
    }

    @NotNull
    public final G h() {
        return this.f88076c;
    }

    public a1(int i10, int i11, @NotNull G g10) {
        this.f88074a = i10;
        this.f88075b = i11;
        this.f88076c = g10;
        this.f88077d = new R0<>(new C1576b0(i10, i11, g10));
    }

    public /* synthetic */ a1(int i10, int i11, G g10, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? P.d() : g10);
    }
}
