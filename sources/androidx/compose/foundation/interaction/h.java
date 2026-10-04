package androidx.compose.foundation.interaction;

import androidx.compose.runtime.T1;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.i<d> f90153a = o.b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.g
    public boolean a(@NotNull d dVar) {
        return this.f90153a.i(dVar);
    }

    @Override // androidx.compose.foundation.interaction.g
    @Nullable
    public Object b(@NotNull d dVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objEmit = this.f90153a.emit(dVar, eVar);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : L0.f217464a;
    }

    @Override // androidx.compose.foundation.interaction.e
    public kotlinx.coroutines.flow.e c() {
        return this.f90153a;
    }

    @NotNull
    public kotlinx.coroutines.flow.i<d> d() {
        return this.f90153a;
    }
}
