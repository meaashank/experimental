package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@e.T(api = 35)
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Bundle f111251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f111252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final CancellationSignal f111253d;

    public O(int i10, @NotNull Bundle params, @Nullable String str, @Nullable CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.G.p(params, "params");
        this.f111250a = i10;
        this.f111251b = params;
        this.f111252c = str;
        this.f111253d = cancellationSignal;
    }

    @Nullable
    public final CancellationSignal a() {
        return this.f111253d;
    }

    @NotNull
    public final Bundle b() {
        return this.f111251b;
    }

    public final int c() {
        return this.f111250a;
    }

    @Nullable
    public final String d() {
        return this.f111252c;
    }
}
