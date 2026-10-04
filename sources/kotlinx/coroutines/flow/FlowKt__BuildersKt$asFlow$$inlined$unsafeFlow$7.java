package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n161#2:112\n162#2,2:114\n164#2:117\n13330#3:113\n13331#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n161#1:113\n161#1:116\n*E\n"})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements e<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f219367a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1, reason: invalid class name */
    @V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
    @Vc.d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f219368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f219369b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f219371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f219372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f219373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f219374g;

        public AnonymousClass1(kotlin.coroutines.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f219368a = obj;
            this.f219369b |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.this.collect(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(int[] iArr) {
        this.f219367a = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.f<? super java.lang.Integer> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.AnonymousClass1) r0
            int r1 = r0.f219369b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219369b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f219368a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219369b
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r9 = r0.f219374g
            int r2 = r0.f219373f
            java.lang.Object r4 = r0.f219372e
            int[] r4 = (int[]) r4
            java.lang.Object r5 = r0.f219371d
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.f) r5
            kotlin.C4885d0.n(r10)
            r10 = r5
            goto L62
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.C4885d0.n(r10)
            int[] r10 = r8.f219367a
            int r2 = r10.length
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r4
            r4 = r7
        L48:
            if (r2 >= r9) goto L64
            r5 = r4[r2]
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r0.f219371d = r10
            r0.f219372e = r4
            r0.f219373f = r2
            r0.f219374g = r9
            r0.f219369b = r3
            java.lang.Object r5 = r10.emit(r6, r0)
            if (r5 != r1) goto L62
            return r1
        L62:
            int r2 = r2 + r3
            goto L48
        L64:
            kotlin.L0 r9 = kotlin.L0.f217464a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.e):java.lang.Object");
    }
}
