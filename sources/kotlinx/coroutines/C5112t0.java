package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5112t0 implements InterfaceC5114u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final K0 f220795a;

    public C5112t0(@NotNull K0 k02) {
        this.f220795a = k02;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    @NotNull
    public K0 getList() {
        return this.f220795a;
    }

    @Override // kotlinx.coroutines.InterfaceC5114u0
    public boolean isActive() {
        return false;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
