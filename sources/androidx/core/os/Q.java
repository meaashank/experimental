package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public final class Q extends P<Q> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Bundle f111269c = new Bundle();

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public Bundle b() {
        return this.f111269c;
    }

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int c() {
        return 3;
    }

    @Override // androidx.core.os.P
    public P d() {
        return this;
    }

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public Q g() {
        return this;
    }

    @NotNull
    public final Q h(int i10) {
        this.f111269c.putInt(Profiling.f111260e, i10);
        return this;
    }

    @NotNull
    public final Q i(int i10) {
        this.f111269c.putInt(Profiling.f111256a, i10);
        return this;
    }

    @NotNull
    public final Q j(int i10) {
        this.f111269c.putInt(Profiling.f111259d, i10);
        return this;
    }
}
