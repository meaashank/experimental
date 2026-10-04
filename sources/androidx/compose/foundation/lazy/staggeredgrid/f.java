package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.AbstractC1739m;
import androidx.compose.runtime.InterfaceC1946s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class f implements AbstractC1739m.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f92102e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ed.l<Integer, Object> f92103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<Integer, Object> f92104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ed.l<Integer, B> f92105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.r<j, Integer, InterfaceC1946s, Integer, L0> f92106d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Nullable ed.l<? super Integer, ? extends Object> lVar, @NotNull ed.l<? super Integer, ? extends Object> lVar2, @Nullable ed.l<? super Integer, B> lVar3, @NotNull ed.r<? super j, ? super Integer, ? super InterfaceC1946s, ? super Integer, L0> rVar) {
        this.f92103a = lVar;
        this.f92104b = lVar2;
        this.f92105c = lVar3;
        this.f92106d = rVar;
    }

    @NotNull
    public final ed.r<j, Integer, InterfaceC1946s, Integer, L0> a() {
        return this.f92106d;
    }

    @Nullable
    public final ed.l<Integer, B> b() {
        return this.f92105c;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @Nullable
    public ed.l<Integer, Object> getKey() {
        return this.f92103a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC1739m.a
    @NotNull
    public ed.l<Integer, Object> getType() {
        return this.f92104b;
    }
}
