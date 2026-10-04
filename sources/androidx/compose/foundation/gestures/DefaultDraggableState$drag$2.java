package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {626}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultDraggableState$drag$2 extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultDraggableState f89309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f89310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<j, kotlin.coroutines.e<? super L0>, Object> f89311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, ed.p<? super j, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super DefaultDraggableState$drag$2> eVar) {
        super(2, eVar);
        this.f89309b = defaultDraggableState;
        this.f89310c = mutatePriority;
        this.f89311d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new DefaultDraggableState$drag$2(this.f89309b, this.f89310c, this.f89311d, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f89308a;
        if (i10 == 0) {
            C4885d0.n(obj);
            DefaultDraggableState defaultDraggableState = this.f89309b;
            MutatorMutex mutatorMutex = defaultDraggableState.f89306c;
            j jVar = defaultDraggableState.f89305b;
            MutatePriority mutatePriority = this.f89310c;
            ed.p<j, kotlin.coroutines.e<? super L0>, Object> pVar = this.f89311d;
            this.f89308a = 1;
            if (mutatorMutex.f(jVar, mutatePriority, pVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((DefaultDraggableState$drag$2) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
