package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2\n*L\n1#1,328:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {234, 234}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combine$5$2<R, T> extends SuspendLambda implements ed.q<f<? super R>, T[], kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<T[], kotlin.coroutines.e<? super R>, Object> f219926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$2(ed.p<? super T[], ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar, kotlin.coroutines.e<? super FlowKt__ZipKt$combine$5$2> eVar) {
        super(3, eVar);
        this.f219926d = pVar;
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
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
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.f219923a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.C4885d0.n(r6)
            goto L45
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.f219924b
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            kotlin.C4885d0.n(r6)
            goto L39
        L20:
            kotlin.C4885d0.n(r6)
            java.lang.Object r6 = r5.f219924b
            r1 = r6
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            java.lang.Object r6 = r5.f219925c
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            ed.p<T[], kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r5.f219926d
            r5.f219924b = r1
            r5.f219923a = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L39
            goto L44
        L39:
            r3 = 0
            r5.f219924b = r3
            r5.f219923a = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        ((f) this.f219924b).emit(this.f219926d.invoke((Object[]) this.f219925c, this), this);
        return L0.f217464a;
    }
}
