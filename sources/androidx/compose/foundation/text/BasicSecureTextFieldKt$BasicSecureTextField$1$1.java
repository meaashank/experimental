package androidx.compose.foundation.text;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$1$1", f = "BasicSecureTextField.kt", i = {}, l = {Opcodes.L2I}, m = "invokeSuspend", n = {}, s = {})
public final class BasicSecureTextFieldKt$BasicSecureTextField$1$1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f92683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$1$1(SecureTextFieldController secureTextFieldController, kotlin.coroutines.e<? super BasicSecureTextFieldKt$BasicSecureTextField$1$1> eVar) {
        super(2, eVar);
        this.f92683b = secureTextFieldController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$1$1(this.f92683b, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f92682a;
        if (i10 == 0) {
            C4885d0.n(obj);
            SecureTextFieldController secureTextFieldController = this.f92683b;
            this.f92682a = 1;
            if (secureTextFieldController.g(this) == coroutineSingletons) {
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
        return ((BasicSecureTextFieldKt$BasicSecureTextField$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
