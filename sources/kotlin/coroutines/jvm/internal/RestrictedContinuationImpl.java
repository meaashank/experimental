package kotlin.coroutines.jvm.internal;

import kotlin.InterfaceC4887e0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(@Nullable e<Object> eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != EmptyCoroutineContext.f217673a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public i getContext() {
        return EmptyCoroutineContext.f217673a;
    }
}
