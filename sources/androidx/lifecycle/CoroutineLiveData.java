package androidx.lifecycle;

import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.X0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineLiveData<T> extends N<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public BlockRunner<T> f113943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public EmittedSource f113944o;

    public /* synthetic */ CoroutineLiveData(kotlin.coroutines.i iVar, long j10, ed.p pVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? EmptyCoroutineContext.f217673a : iVar, (i10 & 2) != 0 ? 5000L : j10, pVar);
    }

    @Override // androidx.lifecycle.N, androidx.lifecycle.K
    public void m() {
        super.m();
        BlockRunner<T> blockRunner = this.f113943n;
        if (blockRunner != null) {
            blockRunner.h();
        }
    }

    @Override // androidx.lifecycle.N, androidx.lifecycle.K
    public void n() {
        super.n();
        BlockRunner<T> blockRunner = this.f113943n;
        if (blockRunner != null) {
            blockRunner.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.f113949d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113949d = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f113947b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f113949d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f113946a
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            kotlin.C4885d0.n(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C4885d0.n(r5)
            androidx.lifecycle.EmittedSource r5 = r4.f113944o
            if (r5 == 0) goto L45
            r0.f113946a = r4
            r0.f113949d = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r5 = 0
            r0.f113944o = r5
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.v(kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(@org.jetbrains.annotations.NotNull androidx.lifecycle.K<T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.InterfaceC5058e0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.f113954e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113954e = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f113952c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f113954e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f113950a
            androidx.lifecycle.CoroutineLiveData r6 = (androidx.lifecycle.CoroutineLiveData) r6
            kotlin.C4885d0.n(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f113951b
            androidx.lifecycle.K r6 = (androidx.lifecycle.K) r6
            java.lang.Object r2 = r0.f113950a
            androidx.lifecycle.CoroutineLiveData r2 = (androidx.lifecycle.CoroutineLiveData) r2
            kotlin.C4885d0.n(r7)
            r7 = r6
            r6 = r2
            goto L56
        L44:
            kotlin.C4885d0.n(r7)
            r0.f113950a = r5
            r0.f113951b = r6
            r0.f113954e = r4
            java.lang.Object r7 = r5.v(r0)
            if (r7 != r1) goto L54
            goto L63
        L54:
            r7 = r6
            r6 = r5
        L56:
            r0.f113950a = r6
            r2 = 0
            r0.f113951b = r2
            r0.f113954e = r3
            java.lang.Object r7 = androidx.lifecycle.CoroutineLiveDataKt.a(r6, r7, r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r6.f113944o = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.w(androidx.lifecycle.K, kotlin.coroutines.e):java.lang.Object");
    }

    public CoroutineLiveData(@NotNull kotlin.coroutines.i context, long j10, @NotNull ed.p<? super M<T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(block, "block");
        this.f113943n = new BlockRunner<>(this, block, j10, kotlinx.coroutines.M.a(C5052b0.e().Z2().plus(context).plus(new X0((A0) context.get(A0.f218690A3)))), new InterfaceC4376a<L0>(this) { // from class: androidx.lifecycle.CoroutineLiveData.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CoroutineLiveData<T> f113945d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f113945d = this;
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f113945d.f113943n = null;
            }
        });
    }
}
