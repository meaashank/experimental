package kotlinx.coroutines.flow;

import androidx.collection.N0;
import kotlin.InterfaceC4849b;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n1#2:139\n105#3:140\n105#3:141\n105#3:142\n105#3:143\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n18#1:140\n29#1:141\n48#1:142\n80#1:143\n*E\n"})
public final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,111:1\n19#2,5:112\n*E\n"})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f219578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f219579b;

        public a(e eVar, int i10) {
            this.f219578a = eVar;
            this.f219579b = i10;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            Object objCollect = this.f219578a.collect(new FlowKt__LimitKt$drop$2$1(new Ref.IntRef(), this.f219579b, fVar), eVar);
            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,111:1\n30#2,10:112\n*E\n"})
    public static final class b<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f219580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.p f219581b;

        public b(e eVar, ed.p pVar) {
            this.f219580a = eVar;
            this.f219581b = pVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            Object objCollect = this.f219580a.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), fVar, this.f219581b), eVar);
            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.e<? extends T> r4, @org.jetbrains.annotations.NotNull ed.p<? super T, ? super kotlin.coroutines.e<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1) r0
            int r1 = r0.f219584c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219584c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f219583b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219584c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f219582a
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.C4885d0.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L4e
        L2b:
            r5 = move-exception
            goto L4a
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C4885d0.n(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.f219582a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L48
            r0.f219584c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L48
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L48
            if (r4 != r1) goto L4e
            return r1
        L48:
            r5 = move-exception
            r4 = r6
        L4a:
            java.lang.Object r6 = r5.f220073a
            if (r6 != r4) goto L51
        L4e:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.b(kotlinx.coroutines.flow.e, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    public static final <T> Object c(e<? extends T> eVar, ed.p<? super T, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.e<? super L0> eVar2) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            eVar.collect(flowKt__LimitKt$collectWhile$collector$1, eVar2);
        } catch (AbortFlowException e10) {
            if (e10.f220073a != flowKt__LimitKt$collectWhile$collector$1) {
                throw e10;
            }
        }
        return L0.f217464a;
    }

    @NotNull
    public static final <T> e<T> d(@NotNull e<? extends T> eVar, int i10) {
        if (i10 >= 0) {
            return new a(eVar, i10);
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("Drop count should be non-negative, but had ", i10).toString());
    }

    @NotNull
    public static final <T> e<T> e(@NotNull e<? extends T> eVar, @NotNull ed.p<? super T, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> pVar) {
        return new b(eVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.f<? super T> r4, T r5, java.lang.Object r6, kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.f219606c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219606c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f219605b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219606c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.f219604a
            kotlin.C4885d0.n(r7)
            goto L3f
        L31:
            kotlin.C4885d0.n(r7)
            r0.f219604a = r6
            r0.f219606c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.f(kotlinx.coroutines.flow.f, java.lang.Object, java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public static final <T> e<T> g(@NotNull e<? extends T> eVar, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(eVar, i10);
        }
        throw new IllegalArgumentException(N0.a("Requested element count ", i10, " should be positive").toString());
    }

    @NotNull
    public static final <T> e<T> h(@NotNull e<? extends T> eVar, @NotNull ed.p<? super T, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(eVar, pVar);
    }

    @NotNull
    public static final <T, R> e<R> i(@NotNull e<? extends T> eVar, @InterfaceC4849b @NotNull ed.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> qVar) {
        return new m(new FlowKt__LimitKt$transformWhile$1(eVar, qVar, null));
    }
}
