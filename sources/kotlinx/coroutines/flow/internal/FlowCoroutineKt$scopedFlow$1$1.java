package kotlinx.coroutines.flow.internal;

import ed.p;
import ed.q;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<L, kotlinx.coroutines.flow.f<? super R>, kotlin.coroutines.e<? super L0>, Object> f220191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.f<R> f220192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(q<? super L, ? super kotlinx.coroutines.flow.f<? super R>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, kotlinx.coroutines.flow.f<? super R> fVar, kotlin.coroutines.e<? super FlowCoroutineKt$scopedFlow$1$1> eVar) {
        super(2, eVar);
        this.f220191c = qVar;
        this.f220192d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f220191c, this.f220192d, eVar);
        flowCoroutineKt$scopedFlow$1$1.f220190b = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f220189a;
        if (i10 == 0) {
            C4885d0.n(obj);
            L l10 = (L) this.f220190b;
            q<L, kotlinx.coroutines.flow.f<? super R>, kotlin.coroutines.e<? super L0>, Object> qVar = this.f220191c;
            Object obj3 = this.f220192d;
            this.f220189a = 1;
            if (qVar.invoke(l10, obj3, this) == obj2) {
                return obj2;
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
        return ((FlowCoroutineKt$scopedFlow$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
