package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1595l;
import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.animation.core.K0;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.C4973z;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class UpdatableAnimationState {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f90002g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final float f90003h = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final K0<C1595l> f90005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f90006b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public C1595l f90007c = f90004i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f90008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f90009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f90001f = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final C1595l f90004i = new C1595l(0.0f);

    public static final class a {
        public a() {
        }

        @NotNull
        public final C1595l a() {
            return UpdatableAnimationState.f90004i;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        public a(C4969v c4969v) {
        }
    }

    public UpdatableAnimationState(@NotNull InterfaceC1587h<Float> interfaceC1587h) {
        this.f90005a = interfaceC1587h.a(VectorConvertersKt.i(C4973z.f217984a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.a(r2.getContext()).B1(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x00b4, PHI: r0 r2 r12 r13 r14
      0x0080: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x0079, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:30:0x0079, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r12v7 float) = (r12v4 float), (r12v8 float) binds: [B:30:0x0079, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r13v7 ed.l<? super java.lang.Float, kotlin.L0>) = (r13v4 ed.l<? super java.lang.Float, kotlin.L0>), (r13v8 ed.l<? super java.lang.Float, kotlin.L0>) binds: [B:30:0x0079, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v9 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v18 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:30:0x0079, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b4, blocks: (B:36:0x00a8, B:31:0x0080, B:33:0x008a), top: B:55:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:36:0x00a8, B:31:0x0080, B:33:0x008a), top: B:55:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[PHI: r0 r2 r13 r14
      0x00af: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:32:0x0088, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:32:0x0088, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r13v5 ed.l<? super java.lang.Float, kotlin.L0>) = (r13v7 ed.l<? super java.lang.Float, kotlin.L0>), (r13v8 ed.l<? super java.lang.Float, kotlin.L0>) binds: [B:32:0x0088, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r14v11 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v18 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:32:0x0088, B:38:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ed.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [ed.a] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ed.a<kotlin.L0>] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.compose.foundation.gestures.UpdatableAnimationState] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a5 -> B:55:0x00a8). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull ed.l<? super java.lang.Float, kotlin.L0> r12, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<kotlin.L0> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.h(ed.l, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    public final float i() {
        return this.f90009e;
    }

    public final void j(float f10) {
        this.f90009e = f10;
    }
}
