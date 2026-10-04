package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.core.os.P;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public abstract class P<T extends P<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f111254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CancellationSignal f111255b;

    @NotNull
    public final O a() {
        return new O(c(), b(), this.f111254a, this.f111255b);
    }

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public abstract Bundle b();

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    public abstract int c();

    @RestrictTo({RestrictTo.Scope.SUBCLASSES})
    @NotNull
    public abstract T d();

    @NotNull
    public final T e(@NotNull CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.G.p(cancellationSignal, "cancellationSignal");
        this.f111255b = cancellationSignal;
        return (T) d();
    }

    @NotNull
    public final T f(@NotNull String tag) {
        kotlin.jvm.internal.G.p(tag, "tag");
        this.f111254a = tag;
        return (T) d();
    }
}
