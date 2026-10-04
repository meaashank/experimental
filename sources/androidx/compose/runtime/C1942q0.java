package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1942q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecomposeScopeImpl f99960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f99962c;

    public C1942q0(@NotNull RecomposeScopeImpl recomposeScopeImpl, int i10, @Nullable Object obj) {
        this.f99960a = recomposeScopeImpl;
        this.f99961b = i10;
        this.f99962c = obj;
    }

    @Nullable
    public final Object a() {
        return this.f99962c;
    }

    public final int b() {
        return this.f99961b;
    }

    @NotNull
    public final RecomposeScopeImpl c() {
        return this.f99960a;
    }

    public final boolean d() {
        return this.f99960a.x(this.f99962c);
    }

    public final void e(@Nullable Object obj) {
        this.f99962c = obj;
    }
}
