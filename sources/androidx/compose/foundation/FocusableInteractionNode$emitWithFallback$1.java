package androidx.compose.foundation;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5058e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
public final class FocusableInteractionNode$emitWithFallback$1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.g f88675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.d f88676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5058e0 f88677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableInteractionNode$emitWithFallback$1(androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.d dVar, InterfaceC5058e0 interfaceC5058e0, kotlin.coroutines.e<? super FocusableInteractionNode$emitWithFallback$1> eVar) {
        super(2, eVar);
        this.f88675b = gVar;
        this.f88676c = dVar;
        this.f88677d = interfaceC5058e0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new FocusableInteractionNode$emitWithFallback$1(this.f88675b, this.f88676c, this.f88677d, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f88674a;
        if (i10 == 0) {
            C4885d0.n(obj);
            androidx.compose.foundation.interaction.g gVar = this.f88675b;
            androidx.compose.foundation.interaction.d dVar = this.f88676c;
            this.f88674a = 1;
            if (gVar.b(dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        InterfaceC5058e0 interfaceC5058e0 = this.f88677d;
        if (interfaceC5058e0 != null) {
            interfaceC5058e0.dispose();
        }
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((FocusableInteractionNode$emitWithFallback$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
