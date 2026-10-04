package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class CancellableFlowImpl<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e<T> f219315a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    @V({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,281:1\n326#2:282\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n270#1:282\n*E\n"})
    public static final class AnonymousClass2<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<T> f219316a;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(f<? super T> fVar) {
            this.f219316a = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) r0
                int r1 = r0.f219319c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f219319c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f219317a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f219319c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.C4885d0.n(r6)
                goto L44
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.C4885d0.n(r6)
                kotlin.coroutines.i r6 = r0.getContext()
                kotlinx.coroutines.JobKt__JobKt.x(r6)
                kotlinx.coroutines.flow.f<T> r6 = r4.f219316a
                r0.f219319c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.L0 r5 = kotlin.L0.f217464a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CancellableFlowImpl.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(@NotNull e<? extends T> eVar) {
        this.f219315a = eVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objCollect = this.f219315a.collect(new AnonymousClass2(fVar), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : L0.f217464a;
    }
}
