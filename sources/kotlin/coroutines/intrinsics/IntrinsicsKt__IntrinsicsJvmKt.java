package kotlin.coroutines.intrinsics;

import Xc.f;
import ed.l;
import ed.p;
import ed.q;
import kotlin.C4885d0;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,270:1\n204#1,4:271\n225#1:275\n204#1,4:276\n225#1:280\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:271,4\n130#1:275\n165#1:276,4\n165#1:280\n*E\n"})
public class IntrinsicsKt__IntrinsicsJvmKt {
    @InterfaceC4887e0(version = "1.3")
    public static final <T> e<L0> a(final e<? super T> eVar, final l<? super e<? super T>, ? extends Object> lVar) {
        final i context = eVar.getContext();
        return context == EmptyCoroutineContext.f217673a ? new RestrictedContinuationImpl(eVar, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f217683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<e<? super T>, Object> f217684b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(eVar);
                this.f217684b = lVar;
                G.n(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 for r2v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public java.lang.Object invokeSuspend(java.lang.Object r3) {
                /*
                    r2 = this;
                    int r0 = r2.f217683a
                    r1 = 1
                    if (r0 == 0) goto L16
                    if (r0 != r1) goto Le
                    r0 = 2
                    r2.f217683a = r0
                    kotlin.C4885d0.n(r3)
                    return r3
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "This coroutine had already completed"
                    r3.<init>(r0)
                    throw r3
                L16:
                    r2.f217683a = r1
                    kotlin.C4885d0.n(r3)
                    ed.l<kotlin.coroutines.e<? super T>, java.lang.Object> r3 = r2.f217684b
                    java.lang.Object r3 = r3.invoke(r2)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        } : new ContinuationImpl(eVar, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f217685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<e<? super T>, Object> f217686b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(eVar, context);
                this.f217686b = lVar;
                G.n(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 for r2v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public java.lang.Object invokeSuspend(java.lang.Object r3) {
                /*
                    r2 = this;
                    int r0 = r2.f217685a
                    r1 = 1
                    if (r0 == 0) goto L16
                    if (r0 != r1) goto Le
                    r0 = 2
                    r2.f217685a = r0
                    kotlin.C4885d0.n(r3)
                    return r3
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "This coroutine had already completed"
                    r3.<init>(r0)
                    throw r3
                L16:
                    r2.f217685a = r1
                    kotlin.C4885d0.n(r3)
                    ed.l<kotlin.coroutines.e<? super T>, java.lang.Object> r3 = r2.f217686b
                    java.lang.Object r3 = r3.invoke(r2)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static <T> e<L0> b(@NotNull final l<? super e<? super T>, ? extends Object> lVar, @NotNull final e<? super T> completion) {
        G.p(lVar, "<this>");
        G.p(completion, "completion");
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(completion);
        }
        final i context = completion.getContext();
        return context == EmptyCoroutineContext.f217673a ? new RestrictedContinuationImpl(completion, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f217687a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f217688b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion);
                this.f217688b = lVar;
                G.n(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f217687a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.f217687a = 2;
                    C4885d0.n(obj);
                    return obj;
                }
                this.f217687a = 1;
                C4885d0.n(obj);
                G.n(this.f217688b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                l lVar2 = this.f217688b;
                Y.q(lVar2, 1);
                return lVar2.invoke(this);
            }
        } : new ContinuationImpl(completion, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f217689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f217690b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion, context);
                this.f217690b = lVar;
                G.n(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f217689a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.f217689a = 2;
                    C4885d0.n(obj);
                    return obj;
                }
                this.f217689a = 1;
                C4885d0.n(obj);
                G.n(this.f217690b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                l lVar2 = this.f217690b;
                Y.q(lVar2, 1);
                return lVar2.invoke(this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static <R, T> e<L0> c(@NotNull final p<? super R, ? super e<? super T>, ? extends Object> pVar, final R r10, @NotNull final e<? super T> completion) {
        G.p(pVar, "<this>");
        G.p(completion, "completion");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r10, completion);
        }
        final i context = completion.getContext();
        return context == EmptyCoroutineContext.f217673a ? new RestrictedContinuationImpl(completion, pVar, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f217691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f217692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f217693c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion);
                this.f217692b = pVar;
                this.f217693c = r10;
                G.n(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f217691a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.f217691a = 2;
                    C4885d0.n(obj);
                    return obj;
                }
                this.f217691a = 1;
                C4885d0.n(obj);
                G.n(this.f217692b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                p pVar2 = this.f217692b;
                Y.q(pVar2, 2);
                return pVar2.invoke(this.f217693c, this);
            }
        } : new ContinuationImpl(completion, context, pVar, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f217694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f217695b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f217696c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion, context);
                this.f217695b = pVar;
                this.f217696c = r10;
                G.n(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                int i10 = this.f217694a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.f217694a = 2;
                    C4885d0.n(obj);
                    return obj;
                }
                this.f217694a = 1;
                C4885d0.n(obj);
                G.n(this.f217695b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                p pVar2 = this.f217695b;
                Y.q(pVar2, 2);
                return pVar2.invoke(this.f217696c, this);
            }
        };
    }

    public static final <T> e<T> d(final e<? super T> eVar) {
        final i context = eVar.getContext();
        return context == EmptyCoroutineContext.f217673a ? new RestrictedContinuationImpl(eVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(eVar);
                G.n(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                C4885d0.n(obj);
                return obj;
            }
        } : new ContinuationImpl(eVar, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(eVar, context);
                G.n(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) throws Throwable {
                C4885d0.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static <T> e<T> e(@NotNull e<? super T> eVar) {
        e<T> eVar2;
        G.p(eVar, "<this>");
        ContinuationImpl continuationImpl = eVar instanceof ContinuationImpl ? (ContinuationImpl) eVar : null;
        return (continuationImpl == null || (eVar2 = (e<T>) continuationImpl.intercepted()) == null) ? eVar : eVar2;
    }

    @InterfaceC4887e0(version = "1.3")
    @f
    public static final <T> Object f(l<? super e<? super T>, ? extends Object> lVar, e<? super T> completion) {
        G.p(lVar, "<this>");
        G.p(completion, "completion");
        if (!(lVar instanceof BaseContinuationImpl)) {
            return i(lVar, completion);
        }
        Y.q(lVar, 1);
        return lVar.invoke(completion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @f
    public static final <R, T> Object g(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r10, e<? super T> completion) {
        G.p(pVar, "<this>");
        G.p(completion, "completion");
        if (!(pVar instanceof BaseContinuationImpl)) {
            return j(pVar, r10, completion);
        }
        Y.q(pVar, 2);
        return pVar.invoke(r10, completion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    public static final <R, P, T> Object h(q<? super R, ? super P, ? super e<? super T>, ? extends Object> qVar, R r10, P p10, e<? super T> completion) {
        G.p(qVar, "<this>");
        G.p(completion, "completion");
        if (!(qVar instanceof BaseContinuationImpl)) {
            return k(qVar, r10, p10, completion);
        }
        Y.q(qVar, 3);
        return qVar.invoke(r10, p10, completion);
    }

    @InterfaceC4850b0
    @Nullable
    public static <T> Object i(@NotNull l<? super e<? super T>, ? extends Object> lVar, @NotNull e<? super T> completion) {
        G.p(lVar, "<this>");
        G.p(completion, "completion");
        e eVarD = d(completion);
        Y.q(lVar, 1);
        return lVar.invoke(eVarD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4850b0
    @Nullable
    public static <R, T> Object j(@NotNull p<? super R, ? super e<? super T>, ? extends Object> pVar, R r10, @NotNull e<? super T> completion) {
        G.p(pVar, "<this>");
        G.p(completion, "completion");
        e eVarD = d(completion);
        Y.q(pVar, 2);
        return pVar.invoke(r10, eVarD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4850b0
    @Nullable
    public static <R, P, T> Object k(@NotNull q<? super R, ? super P, ? super e<? super T>, ? extends Object> qVar, R r10, P p10, @NotNull e<? super T> completion) {
        G.p(qVar, "<this>");
        G.p(completion, "completion");
        e eVarD = d(completion);
        Y.q(qVar, 3);
        return qVar.invoke(r10, p10, eVarD);
    }
}
