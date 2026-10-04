package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public final class S extends P<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Bundle f111270c = new Bundle();

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public Bundle b() {
        return this.f111270c;
    }

    @Override // androidx.core.os.P
    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public int c() {
        return 4;
    }

    @Override // androidx.core.os.P
    public P d() {
        return this;
    }

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public S g() {
        return this;
    }

    @NotNull
    public final S h(@NotNull AbstractC2402a bufferFillPolicy) {
        kotlin.jvm.internal.G.p(bufferFillPolicy, "bufferFillPolicy");
        this.f111270c.putInt(Profiling.f111261f, bufferFillPolicy.f111282a);
        return this;
    }

    @NotNull
    public final S i(int i10) {
        this.f111270c.putInt(Profiling.f111260e, i10);
        return this;
    }

    @NotNull
    public final S j(int i10) {
        this.f111270c.putInt(Profiling.f111256a, i10);
        return this;
    }
}
