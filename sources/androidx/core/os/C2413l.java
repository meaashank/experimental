package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.os.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public final class C2413l extends P<C2413l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Bundle f111299c = new Bundle();

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public Bundle b() {
        return this.f111299c;
    }

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int c() {
        return 2;
    }

    @Override // androidx.core.os.P
    public P d() {
        return this;
    }

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public C2413l g() {
        return this;
    }

    @NotNull
    public final C2413l h(int i10) {
        this.f111299c.putInt(Profiling.f111260e, i10);
        return this;
    }

    @NotNull
    public final C2413l i(int i10) {
        this.f111299c.putInt(Profiling.f111256a, i10);
        return this;
    }

    @NotNull
    public final C2413l j(long j10) {
        this.f111299c.putLong(Profiling.f111257b, j10);
        return this;
    }

    @NotNull
    public final C2413l k(boolean z10) {
        this.f111299c.putBoolean(Profiling.f111258c, z10);
        return this;
    }
}
