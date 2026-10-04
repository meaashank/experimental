package kotlinx.coroutines.flow;

import ed.InterfaceC4376a;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7\n*L\n1#1,328:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combineTransform$7<R> extends SuspendLambda implements ed.p<f<? super R>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e<T>[] f219983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.q<f<? super R>, T[], kotlin.coroutines.e<? super L0>, Object> f219984d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
    @V({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7$1\n*L\n1#1,328:1\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements InterfaceC4376a<T[]> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e<T>[] f219985d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e<T>[] eVarArr) {
            super(0);
            this.f219985d = eVarArr;
        }

        @Nullable
        public final T[] g() {
            int length = this.f219985d.length;
            G.P();
            throw null;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ Object invoke() {
            g();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
    @V({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7$2\n*L\n1#1,328:1\n*E\n"})
    @Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends SuspendLambda implements ed.q<f<? super R>, T[], kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f219986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f219987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f219988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ed.q<f<? super R>, T[], kotlin.coroutines.e<? super L0>, Object> f219989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ed.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, kotlin.coroutines.e<? super AnonymousClass2> eVar) {
            super(3, eVar);
            this.f219989d = qVar;
        }

        @Nullable
        public final Object e(@NotNull f<? super R> fVar, @NotNull T[] tArr, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            G.P();
            throw null;
        }

        @Override // ed.q
        public Object invoke(Object obj, Object obj2, kotlin.coroutines.e<? super L0> eVar) {
            G.P();
            throw null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f219986a;
            if (i10 == 0) {
                C4885d0.n(obj);
                f<? super R> fVar = (f) this.f219987b;
                Object[] objArr = (Object[]) this.f219988c;
                ed.q<f<? super R>, T[], kotlin.coroutines.e<? super L0>, Object> qVar = this.f219989d;
                this.f219987b = null;
                this.f219986a = 1;
                if (qVar.invoke(fVar, objArr, this) == coroutineSingletons) {
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

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object k(@NotNull Object obj) {
            this.f219989d.invoke((f) this.f219987b, (Object[]) this.f219988c, this);
            return L0.f217464a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$7(e<T>[] eVarArr, ed.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, kotlin.coroutines.e<? super FlowKt__ZipKt$combineTransform$7> eVar) {
        super(2, eVar);
        this.f219983c = eVarArr;
        this.f219984d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.f219983c, this.f219984d, eVar);
        flowKt__ZipKt$combineTransform$7.f219982b = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull f<? super R> fVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((FlowKt__ZipKt$combineTransform$7) create(fVar, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f219981a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return L0.f217464a;
        }
        C4885d0.n(obj);
        G.P();
        throw null;
    }

    @Nullable
    public final Object k(@NotNull Object obj) {
        G.P();
        throw null;
    }
}
