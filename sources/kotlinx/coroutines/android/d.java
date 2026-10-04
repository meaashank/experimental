package kotlinx.coroutines.android;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.J0;
import kotlinx.coroutines.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends J0 implements U {
    public d() {
    }

    @NotNull
    public InterfaceC5058e0 h1(long j10, @NotNull Runnable runnable, @NotNull i iVar) {
        return U.a.b(this, j10, runnable, iVar);
    }

    @NotNull
    public abstract d k3();

    @Override // kotlinx.coroutines.U
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p2(long j10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return U.a.a(this, j10, eVar);
    }

    public d(C4969v c4969v) {
    }
}
