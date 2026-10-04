package kotlin.coroutines.jvm.internal;

import Vc.c;
import java.io.Serializable;
import kotlin.C4885d0;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@InterfaceC4850b0
public abstract class BaseContinuationImpl implements e<Object>, c, Serializable {

    @Nullable
    private final e<Object> completion;

    public BaseContinuationImpl(@Nullable e<Object> eVar) {
        this.completion = eVar;
    }

    @NotNull
    public e<L0> create(@NotNull e<?> completion) {
        G.p(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Vc.c
    @Nullable
    public c getCallerFrame() {
        e<Object> eVar = this.completion;
        if (eVar instanceof c) {
            return (c) eVar;
        }
        return null;
    }

    @Nullable
    public final e<Object> getCompletion() {
        return this.completion;
    }

    @Override // Vc.c
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return Vc.e.e(this);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    public void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.e
    public final void resumeWith(@NotNull Object obj) {
        e<Object> eVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) eVar;
            e<Object> eVar2 = baseContinuationImpl.completion;
            G.m(eVar2);
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C4885d0.a(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(eVar2 instanceof BaseContinuationImpl)) {
                eVar2.resumeWith(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public e<L0> create(@Nullable Object obj, @NotNull e<?> completion) {
        G.p(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
