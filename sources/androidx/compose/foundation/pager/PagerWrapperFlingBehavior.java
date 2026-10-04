package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.C;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PagerWrapperFlingBehavior implements androidx.compose.foundation.gestures.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C f92454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PagerState f92455b;

    public PagerWrapperFlingBehavior(@NotNull C c10, @NotNull PagerState pagerState) {
        this.f92454a = c10;
        this.f92455b = pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.q
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.gestures.w r5, float r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Float> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.f92458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92458c = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f92456a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f92458c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C4885d0.n(r7)
            androidx.compose.foundation.gestures.C r7 = r4.f92454a
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1 r2 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1
            r2.<init>()
            r0.f92458c = r3
            java.lang.Object r7 = r7.b(r5, r6, r2, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.a(androidx.compose.foundation.gestures.w, float, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public final C c() {
        return this.f92454a;
    }

    @NotNull
    public final PagerState d() {
        return this.f92455b;
    }
}
