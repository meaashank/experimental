package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class DistinctFlowImpl<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e<T> f219320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public final ed.l<T, Object> f219321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final ed.p<Object, Object, Boolean> f219322c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DistinctFlowImpl<T> f219323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f219324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f<T> f219325c;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, Ref.ObjectRef<Object> objectRef, f<? super T> fVar) {
            this.f219323a = distinctFlowImpl;
            this.f219324b = objectRef;
            this.f219325c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // kotlinx.coroutines.flow.f
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.f219328c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f219328c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f219326a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f219328c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.C4885d0.n(r7)
                goto L65
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                kotlin.C4885d0.n(r7)
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r7 = r5.f219323a
                ed.l<T, java.lang.Object> r7 = r7.f219321b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f219324b
                T r2 = r2.f217904a
                kotlinx.coroutines.internal.Q r4 = kotlinx.coroutines.flow.internal.l.f220222a
                if (r2 == r4) goto L56
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r4 = r5.f219323a
                ed.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f219322c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L53
                goto L56
            L53:
                kotlin.L0 r6 = kotlin.L0.f217464a
                return r6
            L56:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f219324b
                r2.f217904a = r7
                kotlinx.coroutines.flow.f<T> r7 = r5.f219325c
                r0.f219328c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L65
                return r1
            L65:
                kotlin.L0 r6 = kotlin.L0.f217464a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull e<? extends T> eVar, @NotNull ed.l<? super T, ? extends Object> lVar, @NotNull ed.p<Object, Object, Boolean> pVar) {
        this.f219320a = eVar;
        this.f219321b = lVar;
        this.f219322c = pVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f217904a = (T) kotlinx.coroutines.flow.internal.l.f220222a;
        Object objCollect = this.f219320a.collect(new AnonymousClass2(this, objectRef, fVar), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }
}
