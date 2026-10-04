package androidx.compose.animation;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class U implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.p<k0.x, k0.x, androidx.compose.animation.core.U<k0.x>> f87536b;

    /* JADX WARN: Multi-variable type inference failed */
    public U(boolean z10, @NotNull ed.p<? super k0.x, ? super k0.x, ? extends androidx.compose.animation.core.U<k0.x>> pVar) {
        this.f87535a = z10;
        this.f87536b = pVar;
    }

    @NotNull
    public final ed.p<k0.x, k0.x, androidx.compose.animation.core.U<k0.x>> a() {
        return this.f87536b;
    }

    @Override // androidx.compose.animation.T
    public boolean d() {
        return this.f87535a;
    }

    @Override // androidx.compose.animation.T
    @NotNull
    public androidx.compose.animation.core.U<k0.x> e(long j10, long j11) {
        return this.f87536b.invoke(new k0.x(j10), new k0.x(j11));
    }

    public /* synthetic */ U(boolean z10, ed.p pVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? true : z10, pVar);
    }
}
