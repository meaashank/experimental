package androidx.compose.foundation.relocation;

import androidx.compose.foundation.L;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@L
@V({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,181:1\n1208#2:182\n1187#2,2:183\n460#3,11:185\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n112#1:182\n112#1:183,2\n115#1:185,11\n*E\n"})
public final class BringIntoViewRequesterImpl implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<g> f92547a = new androidx.compose.runtime.collection.c<>(new g[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:20:0x0061). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(@org.jetbrains.annotations.Nullable P.j r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.f92554g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92554g = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f92552e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f92554g
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.f92551d
            int r2 = r0.f92550c
            java.lang.Object r4 = r0.f92549b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f92548a
            P.j r5 = (P.j) r5
            kotlin.C4885d0.n(r9)
            r9 = r5
            goto L61
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.C4885d0.n(r9)
            androidx.compose.runtime.collection.c<androidx.compose.foundation.relocation.g> r9 = r7.f92547a
            int r2 = r9.f99566c
            if (r2 <= 0) goto L64
            T[] r9 = r9.f99564a
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L4c:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.g r5 = (androidx.compose.foundation.relocation.g) r5
            r0.f92548a = r9
            r0.f92549b = r4
            r0.f92550c = r2
            r0.f92551d = r8
            r0.f92554g = r3
            java.lang.Object r5 = androidx.compose.foundation.relocation.ScrollIntoView__ScrollIntoViewRequesterKt.a(r5, r9, r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            int r8 = r8 + r3
            if (r8 < r2) goto L4c
        L64:
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(P.j, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public final androidx.compose.runtime.collection.c<g> b() {
        return this.f92547a;
    }
}
