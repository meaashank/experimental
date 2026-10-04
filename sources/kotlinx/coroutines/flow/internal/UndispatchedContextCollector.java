package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f220206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f220207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final p<T, kotlin.coroutines.e<? super L0>, Object> f220208c;

    public UndispatchedContextCollector(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull kotlin.coroutines.i iVar) {
        this.f220206a = iVar;
        this.f220207b = ThreadContextKt.b(iVar);
        this.f220208c = new UndispatchedContextCollector$emitRef$1(fVar, null);
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objC = d.c(this.f220206a, t10, this.f220207b, this.f220208c, eVar);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : L0.f217464a;
    }
}
