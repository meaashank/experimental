package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC1934n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<T, S> f99197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public S f99198b;

    /* JADX WARN: Multi-variable type inference failed */
    public Q(@NotNull ed.l<? super T, ? extends S> lVar) {
        this.f99197a = lVar;
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void b() {
        this.f99198b = this.f99197a.invoke(EffectsKt.f99112a);
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void c() {
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void d() {
        S s10 = this.f99198b;
        if (s10 != null) {
            s10.dispose();
        }
        this.f99198b = null;
    }
}
