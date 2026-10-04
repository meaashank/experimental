package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.ui.input.pointer.K;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1", f = "TextFieldSelectionManager.kt", i = {}, l = {1012}, m = "invokeSuspend", n = {}, s = {})
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 extends SuspendLambda implements ed.p<K, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f94929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.A f94930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(androidx.compose.foundation.text.A a10, kotlin.coroutines.e<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1> eVar) {
        super(2, eVar);
        this.f94930c = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 textFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(this.f94930c, eVar);
        textFieldSelectionManagerKt$TextFieldSelectionHandle$2$1.f94929b = obj;
        return textFieldSelectionManagerKt$TextFieldSelectionHandle$2$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull K k10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1) create(k10, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f94928a;
        if (i10 == 0) {
            C4885d0.n(obj);
            K k10 = (K) this.f94929b;
            androidx.compose.foundation.text.A a10 = this.f94930c;
            this.f94928a = 1;
            if (LongPressTextDragObserverKt.c(k10, a10, this) == coroutineSingletons) {
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
}
