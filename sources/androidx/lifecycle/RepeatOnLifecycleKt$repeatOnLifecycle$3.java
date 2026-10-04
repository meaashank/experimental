package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.J0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f114071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f114072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> f114073e;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    @kotlin.jvm.internal.V({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    @Vc.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {Opcodes.IF_ACMPNE}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f114074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f114075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f114076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f114077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f114078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f114079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f114080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f114081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f114082i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.L f114083j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super L0>, Object> f114084k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.L l10, ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.f114081h = lifecycle;
            this.f114082i = state;
            this.f114083j = l10;
            this.f114084k = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            return new AnonymousClass1(this.f114081h, this.f114082i, this.f114083j, this.f114084k, eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.A, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
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
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r13.f114080g
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L34
                if (r1 != r3) goto L2c
                java.lang.Object r0 = r13.f114079f
                ed.p r0 = (ed.p) r0
                java.lang.Object r0 = r13.f114078e
                kotlinx.coroutines.L r0 = (kotlinx.coroutines.L) r0
                java.lang.Object r0 = r13.f114077d
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r13.f114076c
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r13.f114075b
                r1 = r0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r0 = r13.f114074a
                r4 = r0
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                kotlin.C4885d0.n(r14)     // Catch: java.lang.Throwable -> L28
                goto L91
            L28:
                r0 = move-exception
                r14 = r0
                goto Lab
            L2c:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L34:
                kotlin.C4885d0.n(r14)
                androidx.lifecycle.Lifecycle r14 = r13.f114081h
                androidx.lifecycle.Lifecycle$State r14 = r14.d()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r14 != r1) goto L44
                kotlin.L0 r14 = kotlin.L0.f217464a
                return r14
            L44:
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r14 = r13.f114082i     // Catch: java.lang.Throwable -> La8
                androidx.lifecycle.Lifecycle r12 = r13.f114081h     // Catch: java.lang.Throwable -> La8
                kotlinx.coroutines.L r7 = r13.f114083j     // Catch: java.lang.Throwable -> La8
                ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super kotlin.L0>, java.lang.Object> r11 = r13.f114084k     // Catch: java.lang.Throwable -> La8
                r13.f114074a = r6     // Catch: java.lang.Throwable -> La8
                r13.f114075b = r1     // Catch: java.lang.Throwable -> La8
                r13.f114076c = r14     // Catch: java.lang.Throwable -> La8
                r13.f114077d = r12     // Catch: java.lang.Throwable -> La8
                r13.f114078e = r7     // Catch: java.lang.Throwable -> La8
                r13.f114079f = r11     // Catch: java.lang.Throwable -> La8
                r13.f114080g = r3     // Catch: java.lang.Throwable -> La8
                kotlinx.coroutines.o r9 = new kotlinx.coroutines.o     // Catch: java.lang.Throwable -> La8
                kotlin.coroutines.e r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r13)     // Catch: java.lang.Throwable -> La8
                r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La8
                r9.n0()     // Catch: java.lang.Throwable -> La8
                androidx.lifecycle.Lifecycle$Event$a r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La8
                androidx.lifecycle.Lifecycle$Event r5 = r4.d(r14)     // Catch: java.lang.Throwable -> La8
                androidx.lifecycle.Lifecycle$Event r8 = r4.a(r14)     // Catch: java.lang.Throwable -> La8
                r14 = 0
                kotlinx.coroutines.sync.a r10 = kotlinx.coroutines.sync.MutexKt.b(r14, r3, r2)     // Catch: java.lang.Throwable -> La8
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r4 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La8
                r4.<init>()     // Catch: java.lang.Throwable -> La8
                r1.f217904a = r4     // Catch: java.lang.Throwable -> La8
                r12.c(r4)     // Catch: java.lang.Throwable -> La8
                java.lang.Object r14 = r9.z()     // Catch: java.lang.Throwable -> La8
                if (r14 != r0) goto L90
                return r0
            L90:
                r4 = r6
            L91:
                T r14 = r4.f217904a
                kotlinx.coroutines.A0 r14 = (kotlinx.coroutines.A0) r14
                if (r14 == 0) goto L9a
                kotlinx.coroutines.A0.a.b(r14, r2, r3, r2)
            L9a:
                T r14 = r1.f217904a
                androidx.lifecycle.y r14 = (androidx.lifecycle.InterfaceC2611y) r14
                if (r14 == 0) goto La5
                androidx.lifecycle.Lifecycle r0 = r13.f114081h
                r0.g(r14)
            La5:
                kotlin.L0 r14 = kotlin.L0.f217464a
                return r14
            La8:
                r0 = move-exception
                r14 = r0
                r4 = r6
            Lab:
                T r0 = r4.f217904a
                kotlinx.coroutines.A0 r0 = (kotlinx.coroutines.A0) r0
                if (r0 == 0) goto Lb4
                kotlinx.coroutines.A0.a.b(r0, r2, r3, r2)
            Lb4:
                T r0 = r1.f217904a
                androidx.lifecycle.y r0 = (androidx.lifecycle.InterfaceC2611y) r0
                if (r0 == 0) goto Lbf
                androidx.lifecycle.Lifecycle r1 = r13.f114081h
                r1.g(r0)
            Lbf:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ed.p
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass1) create(l10, eVar)).invokeSuspend(L0.f217464a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> eVar) {
        super(2, eVar);
        this.f114071c = lifecycle;
        this.f114072d = state;
        this.f114073e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f114071c, this.f114072d, this.f114073e, eVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f114070b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f114069a;
        if (i10 == 0) {
            C4885d0.n(obj);
            kotlinx.coroutines.L l10 = (kotlinx.coroutines.L) this.f114070b;
            J0 j0Z2 = C5052b0.e().Z2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f114071c, this.f114072d, l10, this.f114073e, null);
            this.f114069a = 1;
            if (C5092j.g(j0Z2, anonymousClass1, this) == coroutineSingletons) {
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
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
