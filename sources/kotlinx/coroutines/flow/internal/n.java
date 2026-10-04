package kotlinx.coroutines.flow.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class n<T> implements kotlin.coroutines.e<T>, Vc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<T> f220226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f220227b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull kotlin.coroutines.e<? super T> eVar, @NotNull kotlin.coroutines.i iVar) {
        this.f220226a = eVar;
        this.f220227b = iVar;
    }

    @Override // Vc.c
    @Nullable
    public Vc.c getCallerFrame() {
        kotlin.coroutines.e<T> eVar = this.f220226a;
        if (eVar instanceof Vc.c) {
            return (Vc.c) eVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public kotlin.coroutines.i getContext() {
        return this.f220227b;
    }

    @Override // Vc.c
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@NotNull Object obj) {
        this.f220226a.resumeWith(obj);
    }
}
