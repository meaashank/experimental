package kotlinx.coroutines.flow.internal;

import ed.InterfaceC4376a;
import ed.p;
import ed.q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.collections.C4858c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
public final class CombineKt$combineInternal$2 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f220132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f220134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f220135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<T[]> f220136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.e<? super L0>, Object> f220137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.f<R> f220138j;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    @Vc.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f220139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f220140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f220141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f220142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.channels.g<C4858c0<Object>> f220143e;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C08301<T> implements kotlinx.coroutines.flow.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.g<C4858c0<Object>> f220144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f220145b;

            public C08301(kotlinx.coroutines.channels.g<C4858c0<Object>> gVar, int i10) {
                this.f220144a = gVar;
                this.f220145b = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            
                if (kotlinx.coroutines.n1.a(r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.f
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.f220148c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f220148c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f220146a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f220148c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C4885d0.n(r8)
                    goto L54
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    kotlin.C4885d0.n(r8)
                    goto L4b
                L36:
                    kotlin.C4885d0.n(r8)
                    kotlinx.coroutines.channels.g<kotlin.collections.c0<java.lang.Object>> r8 = r6.f220144a
                    kotlin.collections.c0 r2 = new kotlin.collections.c0
                    int r5 = r6.f220145b
                    r2.<init>(r5, r7)
                    r0.f220148c = r4
                    java.lang.Object r7 = r8.I(r2, r0)
                    if (r7 != r1) goto L4b
                    goto L53
                L4b:
                    r0.f220148c = r3
                    java.lang.Object r7 = kotlinx.coroutines.n1.a(r0)
                    if (r7 != r1) goto L54
                L53:
                    return r1
                L54:
                    kotlin.L0 r7 = kotlin.L0.f217464a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C08301.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, int i10, AtomicInteger atomicInteger, kotlinx.coroutines.channels.g<C4858c0<Object>> gVar, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.f220140b = eVarArr;
            this.f220141c = i10;
            this.f220142d = atomicInteger;
            this.f220143e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            return new AnonymousClass1(this.f220140b, this.f220141c, this.f220142d, this.f220143e, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f220139a;
            try {
                if (i10 == 0) {
                    C4885d0.n(obj);
                    kotlinx.coroutines.flow.e[] eVarArr = this.f220140b;
                    int i11 = this.f220141c;
                    kotlinx.coroutines.flow.e eVar = eVarArr[i11];
                    C08301 c08301 = new C08301(this.f220143e, i11);
                    this.f220139a = 1;
                    if (eVar.collect(c08301, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4885d0.n(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    s.a.a(this.f220143e, null, 1, null);
                }
                return L0.f217464a;
            } finally {
                if (this.f220142d.decrementAndGet() == 0) {
                    s.a.a(this.f220143e, null, 1, null);
                }
            }
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass1) create(l10, eVar)).invokeSuspend(L0.f217464a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, InterfaceC4376a<T[]> interfaceC4376a, q<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, kotlinx.coroutines.flow.f<? super R> fVar, kotlin.coroutines.e<? super CombineKt$combineInternal$2> eVar) {
        super(2, eVar);
        this.f220135g = eVarArr;
        this.f220136h = interfaceC4376a;
        this.f220137i = qVar;
        this.f220138j = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f220135g, this.f220136h, this.f220137i, this.f220138j, eVar);
        combineKt$combineInternal$2.f220134f = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (r10.invoke(r11, r9, r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
    
        if (r11.invoke(r12, r10, r21) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (r6 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[LOOP:0: B:28:0x00bd->B:47:?, LOOP_START, PHI: r6 r10
      0x00bd: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00b8, B:47:?] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r10v5 kotlin.collections.c0) = (r10v4 kotlin.collections.c0), (r10v12 kotlin.collections.c0) binds: [B:25:0x00b8, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fe -> B:44:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011e -> B:44:0x0121). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((CombineKt$combineInternal$2) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
