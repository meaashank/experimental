package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.os.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public final class C2414m extends P<C2414m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Bundle f111300c = new Bundle();

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public Bundle b() {
        return this.f111300c;
    }

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int c() {
        return 1;
    }

    @Override // androidx.core.os.P
    public P d() {
        return this;
    }

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public C2414m g() {
        return this;
    }

    @NotNull
    public final C2414m h(int i10) {
        this.f111300c.putInt(Profiling.f111260e, i10);
        return this;
    }
}
