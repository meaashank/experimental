package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1<R> implements e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f219826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.p f219827b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2, reason: invalid class name */
    @V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n50#2:219\n*E\n"})
    public static final class AnonymousClass2<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f219831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.p f219832b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
        @Vc.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {219, 219}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219834b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f219836d;

            public AnonymousClass1(kotlin.coroutines.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219833a = obj;
                this.f219834b |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(f fVar, ed.p pVar) {
            this.f219831a = fVar;
            this.f219832b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object a(Object obj, @NotNull kotlin.coroutines.e eVar) {
            new AnonymousClass1(eVar);
            this.f219831a.emit(this.f219832b.invoke(obj, eVar), eVar);
            return L0.f217464a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.f219834b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f219834b = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f219833a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f219834b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                kotlin.C4885d0.n(r8)
                goto L5b
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                java.lang.Object r7 = r0.f219836d
                kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.f) r7
                kotlin.C4885d0.n(r8)
                goto L4f
            L3a:
                kotlin.C4885d0.n(r8)
                kotlinx.coroutines.flow.f r8 = r6.f219831a
                ed.p r2 = r6.f219832b
                r0.f219836d = r8
                r0.f219834b = r4
                java.lang.Object r7 = r2.invoke(r7, r0)
                if (r7 != r1) goto L4c
                goto L5a
            L4c:
                r5 = r8
                r8 = r7
                r7 = r5
            L4f:
                r2 = 0
                r0.f219836d = r2
                r0.f219834b = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L5b
            L5a:
                return r1
            L5b:
                kotlin.L0 r7 = kotlin.L0.f217464a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
        }
    }

    public FlowKt__TransformKt$map$$inlined$unsafeTransform$1(e eVar, ed.p pVar) {
        this.f219826a = eVar;
        this.f219827b = pVar;
    }

    @Nullable
    public Object c(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219829b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219828a = obj;
                this.f219829b |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$map$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.f219826a.collect(new AnonymousClass2(fVar, this.f219827b), eVar);
        return L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        Object objCollect = this.f219826a.collect(new AnonymousClass2(fVar, this.f219827b), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }
}
