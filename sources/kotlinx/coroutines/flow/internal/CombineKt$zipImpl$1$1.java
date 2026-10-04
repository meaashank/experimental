package kotlinx.coroutines.flow.internal;

import ed.p;
import ed.q;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.InterfaceC5123z;
import kotlinx.coroutines.L;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f220150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f220151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.e<T2> f220152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.e<T1> f220153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.f<R> f220154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q<T1, T2, kotlin.coroutines.e<? super R>, Object> f220155g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    @Vc.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<L0, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f220157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<T1> f220158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.i f220159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f220160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ReceiveChannel<Object> f220161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.f<R> f220162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q<T1, T2, kotlin.coroutines.e<? super R>, Object> f220163g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5123z f220164h;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.coroutines.i f220165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f220166b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ReceiveChannel<Object> f220167c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.f<R> f220168d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q<T1, T2, kotlin.coroutines.e<? super R>, Object> f220169e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5123z f220170f;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            @V({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n509#2,5:141\n14#3:146\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141,5\n129#1:146\n*E\n"})
            @Vc.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
            public static final class C08311 extends SuspendLambda implements p<L0, kotlin.coroutines.e<? super L0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f220171a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f220172b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ReceiveChannel<Object> f220173c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.f<R> f220174d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ q<T1, T2, kotlin.coroutines.e<? super R>, Object> f220175e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ T1 f220176f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC5123z f220177g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C08311(ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends Object> qVar, T1 t12, InterfaceC5123z interfaceC5123z, kotlin.coroutines.e<? super C08311> eVar) {
                    super(2, eVar);
                    this.f220173c = receiveChannel;
                    this.f220174d = fVar;
                    this.f220175e = qVar;
                    this.f220176f = t12;
                    this.f220177g = interfaceC5123z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
                    return new C08311(this.f220173c, this.f220174d, this.f220175e, this.f220176f, this.f220177g, eVar);
                }

                @Override // ed.p
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull L0 l02, @Nullable kotlin.coroutines.e<? super L0> eVar) {
                    return ((C08311) create(l02, eVar)).invokeSuspend(L0.f217464a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
                
                    if (r1.emit(r9, r8) != r0) goto L30;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.f] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
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
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r8.f220172b
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2c
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1c
                        if (r1 != r3) goto L14
                        kotlin.C4885d0.n(r9)
                        goto L6d
                    L14:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1c:
                        java.lang.Object r1 = r8.f220171a
                        kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                        kotlin.C4885d0.n(r9)
                        goto L62
                    L24:
                        kotlin.C4885d0.n(r9)
                        kotlinx.coroutines.channels.j r9 = (kotlinx.coroutines.channels.j) r9
                        java.lang.Object r9 = r9.f219196a
                        goto L3a
                    L2c:
                        kotlin.C4885d0.n(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.f220173c
                        r8.f220172b = r5
                        java.lang.Object r9 = r9.B(r8)
                        if (r9 != r0) goto L3a
                        goto L6c
                    L3a:
                        kotlinx.coroutines.z r1 = r8.f220177g
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.j.c
                        if (r5 == 0) goto L4c
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.j.f(r9)
                        if (r9 != 0) goto L4b
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L4b:
                        throw r9
                    L4c:
                        kotlinx.coroutines.flow.f<R> r1 = r8.f220174d
                        ed.q<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r5 = r8.f220175e
                        T1 r6 = r8.f220176f
                        kotlinx.coroutines.internal.Q r7 = kotlinx.coroutines.flow.internal.l.f220222a
                        if (r9 != r7) goto L57
                        r9 = r2
                    L57:
                        r8.f220171a = r1
                        r8.f220172b = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L62
                        goto L6c
                    L62:
                        r8.f220171a = r2
                        r8.f220172b = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L6d
                    L6c:
                        return r0
                    L6d:
                        kotlin.L0 r9 = kotlin.L0.f217464a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C08311.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(kotlin.coroutines.i iVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends Object> qVar, InterfaceC5123z interfaceC5123z) {
                this.f220165a = iVar;
                this.f220166b = obj;
                this.f220167c = receiveChannel;
                this.f220168d = fVar;
                this.f220169e = qVar;
                this.f220170f = interfaceC5123z;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.f
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T1 r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r14) throws java.lang.Throwable {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.f220180c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f220180c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f220178a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f220180c
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.C4885d0.n(r14)
                    goto L50
                L27:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L2f:
                    kotlin.C4885d0.n(r14)
                    kotlin.coroutines.i r14 = r12.f220165a
                    kotlin.L0 r2 = kotlin.L0.f217464a
                    java.lang.Object r4 = r12.f220166b
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.f220167c
                    kotlinx.coroutines.flow.f<R> r7 = r12.f220168d
                    ed.q<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r8 = r12.f220169e
                    kotlinx.coroutines.z r10 = r12.f220170f
                    r11 = 0
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    r0.f220180c = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.d.c(r14, r2, r4, r5, r0)
                    if (r13 != r1) goto L50
                    return r1
                L50:
                    kotlin.L0 r13 = kotlin.L0.f217464a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlinx.coroutines.flow.e<? extends T1> eVar, kotlin.coroutines.i iVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends Object> qVar, InterfaceC5123z interfaceC5123z, kotlin.coroutines.e<? super AnonymousClass2> eVar2) {
            super(2, eVar2);
            this.f220158b = eVar;
            this.f220159c = iVar;
            this.f220160d = obj;
            this.f220161e = receiveChannel;
            this.f220162f = fVar;
            this.f220163g = qVar;
            this.f220164h = interfaceC5123z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            return new AnonymousClass2(this.f220158b, this.f220159c, this.f220160d, this.f220161e, this.f220162f, this.f220163g, this.f220164h, eVar);
        }

        @Override // ed.p
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull L0 l02, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass2) create(l02, eVar)).invokeSuspend(L0.f217464a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 for r10v1 'this'  kotlin.coroutines.e
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.f220157a
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.C4885d0.n(r11)
                goto L34
            Ld:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L15:
                kotlin.C4885d0.n(r11)
                kotlinx.coroutines.flow.e<T1> r11 = r10.f220158b
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.i r4 = r10.f220159c
                java.lang.Object r5 = r10.f220160d
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r10.f220161e
                kotlinx.coroutines.flow.f<R> r7 = r10.f220162f
                ed.q<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r8 = r10.f220163g
                kotlinx.coroutines.z r9 = r10.f220164h
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r10.f220157a = r2
                java.lang.Object r11 = r11.collect(r3, r10)
                if (r11 != r0) goto L34
                return r0
            L34:
                kotlin.L0 r11 = kotlin.L0.f217464a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.e<? extends T2> eVar, kotlinx.coroutines.flow.e<? extends T1> eVar2, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends Object> qVar, kotlin.coroutines.e<? super CombineKt$zipImpl$1$1> eVar3) {
        super(2, eVar3);
        this.f220152d = eVar;
        this.f220153e = eVar2;
        this.f220154f = fVar;
        this.f220155g = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.f220152d, this.f220153e, this.f220154f, this.f220155g, eVar);
        combineKt$zipImpl$1$1.f220151c = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x001b, blocks: (B:6:0x0016, B:35:0x00a8, B:40:0x00b0), top: B:45:0x0016 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r26) throws java.lang.Throwable {
        /*
            r25 = this;
            r4 = r25
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r4.f220150b
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L29
            if (r0 != r8) goto L21
            java.lang.Object r0 = r4.f220149a
            r1 = r0
            kotlinx.coroutines.z r1 = (kotlinx.coroutines.InterfaceC5123z) r1
            java.lang.Object r0 = r4.f220151c
            r2 = r0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.C4885d0.n(r26)     // Catch: java.lang.Throwable -> L1b kotlinx.coroutines.flow.internal.AbortFlowException -> L1e
            goto L8e
        L1b:
            r0 = move-exception
            goto Lb1
        L1e:
            r0 = move-exception
            goto La8
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L29:
            kotlin.C4885d0.n(r26)
            java.lang.Object r0 = r4.f220151c
            r10 = r0
            kotlinx.coroutines.L r10 = (kotlinx.coroutines.L) r10
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r13 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.e<T2> r0 = r4.f220152d
            r13.<init>(r0, r9)
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            kotlinx.coroutines.channels.ReceiveChannel r20 = kotlinx.coroutines.channels.ProduceKt.f(r10, r11, r12, r13, r14, r15)
            kotlinx.coroutines.z r1 = kotlinx.coroutines.JobKt__JobKt.c(r9, r8, r9)
            r0 = r20
            kotlinx.coroutines.channels.s r0 = (kotlinx.coroutines.channels.s) r0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r2 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            r2.<init>()
            r0.H(r2)
            kotlin.coroutines.i r18 = r10.m()     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> La3
            java.lang.Object r19 = kotlinx.coroutines.internal.ThreadContextKt.b(r18)     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> La3
            kotlin.coroutines.i r0 = r10.m()     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> La3
            kotlin.coroutines.i r0 = r0.plus(r1)     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> La3
            r23 = r1
            kotlin.L0 r1 = kotlin.L0.f217464a     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r16 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            kotlinx.coroutines.flow.e<T1> r2 = r4.f220153e     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            kotlinx.coroutines.flow.f<R> r3 = r4.f220154f     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            ed.q<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r5 = r4.f220155g     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            r24 = 0
            r17 = r2
            r21 = r3
            r22 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L99 kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            r11 = r20
            r10 = r23
            r4.f220151c = r11     // Catch: java.lang.Throwable -> L92 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            r4.f220149a = r10     // Catch: java.lang.Throwable -> L92 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            r4.f220150b = r8     // Catch: java.lang.Throwable -> L92 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            r2 = 0
            r5 = 4
            r6 = 0
            r3 = r16
            java.lang.Object r0 = kotlinx.coroutines.flow.internal.d.d(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92 kotlinx.coroutines.flow.internal.AbortFlowException -> L95
            if (r0 != r7) goto L8d
            return r7
        L8d:
            r2 = r11
        L8e:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.b(r2, r9, r8, r9)
            goto Lad
        L92:
            r0 = move-exception
        L93:
            r2 = r11
            goto Lb1
        L95:
            r0 = move-exception
        L96:
            r1 = r10
        L97:
            r2 = r11
            goto La8
        L99:
            r0 = move-exception
            r11 = r20
            goto L93
        L9d:
            r0 = move-exception
            r11 = r20
            r10 = r23
            goto L96
        La3:
            r0 = move-exception
            r10 = r1
            r11 = r20
            goto L97
        La8:
            java.lang.Object r3 = r0.f220073a     // Catch: java.lang.Throwable -> L1b
            if (r3 != r1) goto Lb0
            goto L8e
        Lad:
            kotlin.L0 r0 = kotlin.L0.f217464a
            return r0
        Lb0:
            throw r0     // Catch: java.lang.Throwable -> L1b
        Lb1:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.b(r2, r9, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((CombineKt$zipImpl$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
