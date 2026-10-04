package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f219809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.p f219810b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2, reason: invalid class name */
    @V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n25#2,2:219\n*E\n"})
    public static final class AnonymousClass2<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f219814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.p f219815b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
        @Vc.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {219, 219}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219816a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219817b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f219819d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f219820e;

            public AnonymousClass1(kotlin.coroutines.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219816a = obj;
                this.f219817b |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(f fVar, ed.p pVar) {
            this.f219814a = fVar;
            this.f219815b = pVar;
        }

        @Nullable
        public final Object a(Object obj, @NotNull kotlin.coroutines.e eVar) {
            new AnonymousClass1(eVar);
            f fVar = this.f219814a;
            if (!((Boolean) this.f219815b.invoke(obj, eVar)).booleanValue()) {
                fVar.emit(obj, eVar);
            }
            return L0.f217464a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        
            if (r7.emit(r2, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f219817b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f219817b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f219816a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f219817b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.C4885d0.n(r8)
                goto L6a
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                java.lang.Object r7 = r0.f219820e
                kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.f) r7
                java.lang.Object r2 = r0.f219819d
                kotlin.C4885d0.n(r8)
                goto L54
            L3c:
                kotlin.C4885d0.n(r8)
                kotlinx.coroutines.flow.f r8 = r6.f219814a
                ed.p r2 = r6.f219815b
                r0.f219819d = r7
                r0.f219820e = r8
                r0.f219817b = r4
                java.lang.Object r2 = r2.invoke(r7, r0)
                if (r2 != r1) goto L50
                goto L69
            L50:
                r5 = r2
                r2 = r7
                r7 = r8
                r8 = r5
            L54:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L6a
                r8 = 0
                r0.f219819d = r8
                r0.f219820e = r8
                r0.f219817b = r3
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L6a
            L69:
                return r1
            L6a:
                kotlin.L0 r7 = kotlin.L0.f217464a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(e eVar, ed.p pVar) {
        this.f219809a = eVar;
        this.f219810b = pVar;
    }

    @Nullable
    public Object c(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219811a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219812b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219811a = obj;
                this.f219812b |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.f219809a.collect(new AnonymousClass2(fVar, this.f219810b), eVar);
        return L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        Object objCollect = this.f219809a.collect(new AnonymousClass2(fVar, this.f219810b), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }
}
