package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 2)
public final class Y0<V extends AbstractC1603p> implements O0<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88059b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88060a;

    public Y0() {
        this(0, 1, null);
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
        b(abstractC1603p, abstractC1603p2, abstractC1603p3);
        return abstractC1603p3;
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return v12;
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return j10 < ((long) this.f88060a) * 1000000 ? v10 : v11;
    }

    @Override // androidx.compose.animation.core.O0
    public int f() {
        return this.f88060a;
    }

    @Override // androidx.compose.animation.core.O0
    public int g() {
        return 0;
    }

    public Y0(int i10) {
        this.f88060a = i10;
    }

    public /* synthetic */ Y0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
