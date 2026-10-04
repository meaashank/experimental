package androidx.compose.foundation;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class i0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i0 f90120a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90121b = 0;

    @Override // androidx.compose.foundation.k0
    public long a(long j10, int i10, @NotNull ed.l<? super P.g, P.g> lVar) {
        return lVar.invoke(new P.g(j10)).f65507a;
    }

    @Override // androidx.compose.foundation.k0
    public boolean b() {
        return false;
    }

    @Override // androidx.compose.foundation.k0
    @Nullable
    public Object c(long j10, @NotNull ed.p<? super k0.E, ? super kotlin.coroutines.e<? super k0.E>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objInvoke = pVar.invoke(new k0.E(j10), eVar);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
    }

    @Override // androidx.compose.foundation.k0
    @NotNull
    public androidx.compose.ui.p d() {
        return androidx.compose.ui.p.f103112M2;
    }
}
