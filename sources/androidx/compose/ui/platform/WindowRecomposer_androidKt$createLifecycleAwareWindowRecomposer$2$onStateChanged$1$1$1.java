package androidx.compose.ui.platform;

import kotlin.C4885d0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.u<Float> f103742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2292x0 f103743c;

    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2292x0 f103744a;

        public a(C2292x0 c2292x0) {
            this.f103744a = c2292x0;
        }

        @Nullable
        public final Object a(float f10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
            this.f103744a.d(f10);
            return kotlin.L0.f217464a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.e eVar) {
            return a(((Number) obj).floatValue(), eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(kotlinx.coroutines.flow.u<Float> uVar, C2292x0 c2292x0, kotlin.coroutines.e<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1> eVar) {
        super(2, eVar);
        this.f103742b = uVar;
        this.f103743c = c2292x0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.f103742b, this.f103743c, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f103741a;
        if (i10 == 0) {
            C4885d0.n(obj);
            kotlinx.coroutines.flow.u<Float> uVar = this.f103742b;
            a aVar = new a(this.f103743c);
            this.f103741a = 1;
            if (uVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(l10, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }
}
