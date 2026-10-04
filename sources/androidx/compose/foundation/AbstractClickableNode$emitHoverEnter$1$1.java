package androidx.compose.foundation;

import androidx.compose.foundation.interaction.c;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractClickableNode$emitHoverEnter$1$1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.g f88320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f88321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$emitHoverEnter$1$1(androidx.compose.foundation.interaction.g gVar, c.a aVar, kotlin.coroutines.e<? super AbstractClickableNode$emitHoverEnter$1$1> eVar) {
        super(2, eVar);
        this.f88320b = gVar;
        this.f88321c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new AbstractClickableNode$emitHoverEnter$1$1(this.f88320b, this.f88321c, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f88319a;
        if (i10 == 0) {
            C4885d0.n(obj);
            androidx.compose.foundation.interaction.g gVar = this.f88320b;
            c.a aVar = this.f88321c;
            this.f88319a = 1;
            if (gVar.b(aVar, this) == coroutineSingletons) {
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
    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((AbstractClickableNode$emitHoverEnter$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
