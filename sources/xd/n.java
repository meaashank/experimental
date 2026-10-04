package xd;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.internal.C5085t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final n f240638c = new n();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        b.f240606i.k3(runnable, m.f240637j, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InterfaceC5120x0
    public void H2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        b.f240606i.k3(runnable, m.f240637j, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InterfaceC5107q0
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        C5085t.a(i10);
        return i10 >= m.f240631d ? this : super.R2(i10);
    }
}
