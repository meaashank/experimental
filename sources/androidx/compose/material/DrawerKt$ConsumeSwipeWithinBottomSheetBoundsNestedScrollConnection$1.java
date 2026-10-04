package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Orientation f96102a = Orientation.Vertical;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState<?> f96103b;

    public DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState<?> anchoredDraggableState) {
        this.f96103b = anchoredDraggableState;
    }

    @dd.j(name = "offsetToFloat")
    private final float b(long j10) {
        return this.f96102a == Orientation.Horizontal ? P.g.p(j10) : P.g.r(j10);
    }

    private final long c(float f10) {
        Orientation orientation = this.f96102a;
        float f11 = orientation == Orientation.Horizontal ? f10 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f10 = 0.0f;
        }
        return P.h.a(f11, f10);
    }

    @dd.j(name = "velocityToFloat")
    private final float d(long j10) {
        return this.f96102a == Orientation.Horizontal ? k0.E.l(j10) : k0.E.n(j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long H0(long j10, long j11, int i10) {
        androidx.compose.ui.input.nestedscroll.e.f102137b.getClass();
        if (i10 == androidx.compose.ui.input.nestedscroll.e.f102138c) {
            return c(this.f96103b.o(b(j11)));
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    @NotNull
    public final Orientation a() {
        return this.f96102a;
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long j2(long j10, int i10) {
        float fB = b(j10);
        if (fB < 0.0f) {
            androidx.compose.ui.input.nestedscroll.e.f102137b.getClass();
            if (i10 == androidx.compose.ui.input.nestedscroll.e.f102138c) {
                return c(this.f96103b.o(fB));
            }
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.f96111d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96111d = r1
            goto L18
        L13:
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f96109b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f96111d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r6 = r0.f96108a
            kotlin.C4885d0.n(r8)
            goto L65
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.C4885d0.n(r8)
            float r8 = r5.d(r6)
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.f96103b
            float r2 = r2.E()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L5e
            androidx.compose.material.AnchoredDraggableState<?> r4 = r5.f96103b
            androidx.compose.material.J r4 = r4.p()
            float r4 = r4.d()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5e
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.f96103b
            r0.f96108a = r6
            r0.f96111d = r3
            java.lang.Object r8 = r2.K(r8, r0)
            if (r8 != r1) goto L65
            return r1
        L5e:
            k0.E$a r6 = k0.E.f214279b
            r6.getClass()
            long r6 = k0.E.f214280c
        L65:
            k0.E r8 = new k0.E
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.m1(long, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s0(long r3, long r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super k0.E> r7) throws java.lang.Throwable {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.f96107d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f96107d = r4
            goto L18
        L13:
            androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f96105b
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r3.f96107d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f96104a
            kotlin.C4885d0.n(r4)
            goto L45
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            kotlin.C4885d0.n(r4)
            androidx.compose.material.AnchoredDraggableState<?> r4 = r2.f96103b
            float r0 = r2.d(r5)
            r3.f96104a = r5
            r3.f96107d = r1
            java.lang.Object r3 = r4.K(r0, r3)
            if (r3 != r7) goto L45
            return r7
        L45:
            k0.E r3 = new k0.E
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.s0(long, long, kotlin.coroutines.e):java.lang.Object");
    }
}
