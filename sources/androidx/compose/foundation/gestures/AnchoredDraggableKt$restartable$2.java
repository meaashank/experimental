package androidx.compose.foundation.gestures;

import androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt;
import ed.InterfaceC4376a;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.flow.AbstractFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1114}, m = "invokeSuspend", n = {}, s = {})
public final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<I> f89157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.p<I, kotlin.coroutines.e<? super L0>, Object> f89158d;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<A0> f89159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L f89160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ed.p<I, kotlin.coroutines.e<? super L0>, Object> f89161c;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        @Vc.d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1120}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super L0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f89162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ed.p<I, kotlin.coroutines.e<? super L0>, Object> f89163b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ I f89164c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ L f89165d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ed.p<? super I, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, I i10, L l10, kotlin.coroutines.e<? super AnonymousClass2> eVar) {
                super(2, eVar);
                this.f89163b = pVar;
                this.f89164c = i10;
                this.f89165d = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
                return new AnonymousClass2(this.f89163b, this.f89164c, this.f89165d, eVar);
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
                int i10 = this.f89162a;
                if (i10 == 0) {
                    C4885d0.n(obj);
                    ed.p<I, kotlin.coroutines.e<? super L0>, Object> pVar = this.f89163b;
                    I i11 = this.f89164c;
                    this.f89162a = 1;
                    if (pVar.invoke(i11, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4885d0.n(obj);
                }
                M.d(this.f89165d, new AnchoredDragFinishedSignal());
                return L0.f217464a;
            }

            @Override // ed.p
            @Nullable
            public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
                return ((AnonymousClass2) create(l10, eVar)).invokeSuspend(L0.f217464a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref.ObjectRef<A0> objectRef, L l10, ed.p<? super I, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
            this.f89159a = objectRef;
            this.f89160b = l10;
            this.f89161c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(I r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.f89171f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f89171f = r1
                goto L18
            L13:
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f89169d
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f89171f
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f89168c
                kotlinx.coroutines.A0 r8 = (kotlinx.coroutines.A0) r8
                java.lang.Object r8 = r0.f89167b
                java.lang.Object r0 = r0.f89166a
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                kotlin.C4885d0.n(r9)
                goto L5c
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.C4885d0.n(r9)
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.A0> r9 = r7.f89159a
                T r9 = r9.f217904a
                kotlinx.coroutines.A0 r9 = (kotlinx.coroutines.A0) r9
                if (r9 == 0) goto L5b
                androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                r2.<init>()
                r9.a(r2)
                r0.f89166a = r7
                r0.f89167b = r8
                r0.f89168c = r9
                r0.f89171f = r3
                java.lang.Object r9 = r9.c2(r0)
                if (r9 != r1) goto L5b
                return r1
            L5b:
                r0 = r7
            L5c:
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.A0> r9 = r0.f89159a
                kotlinx.coroutines.L r1 = r0.f89160b
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                ed.p<I, kotlin.coroutines.e<? super kotlin.L0>, java.lang.Object> r0 = r0.f89161c
                r2 = 0
                r4.<init>(r0, r8, r1, r2)
                r5 = 1
                r6 = 0
                kotlinx.coroutines.A0 r8 = kotlinx.coroutines.C5092j.f(r1, r2, r3, r4, r5, r6)
                r9.f217904a = r8
                kotlin.L0 r8 = kotlin.L0.f217464a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2(InterfaceC4376a<? extends I> interfaceC4376a, ed.p<? super I, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, kotlin.coroutines.e<? super AnchoredDraggableKt$restartable$2> eVar) {
        super(2, eVar);
        this.f89157c = interfaceC4376a;
        this.f89158d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.f89157c, this.f89158d, eVar);
        anchoredDraggableKt$restartable$2.f89156b = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f89155a;
        if (i10 == 0) {
            C4885d0.n(obj);
            L l10 = (L) this.f89156b;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            kotlinx.coroutines.flow.e eVarE = SnapshotStateKt__SnapshotFlowKt.e(this.f89157c);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, l10, this.f89158d);
            this.f89155a = 1;
            if (((AbstractFlow) eVarE).collect(anonymousClass1, this) == coroutineSingletons) {
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
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((AnchoredDraggableKt$restartable$2) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
