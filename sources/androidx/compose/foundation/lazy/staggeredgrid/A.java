package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.T1;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface A {

    @V({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n149#2:159\n1#3:160\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n87#1:159\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a implements A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f91909b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f91910a;

        public /* synthetic */ a(float f10, C4969v c4969v) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.A
        @NotNull
        public int[] a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11) {
            return e.b(i10, Math.max((i10 + i11) / (interfaceC4814e.I1(this.f91910a) + i11), 1), i11);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && k0.i.l(this.f91910a, ((a) obj).f91910a);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f91910a);
        }

        public a(float f10) {
            this.f91910a = f10;
            if (Float.compare(f10, 0) <= 0) {
                throw new IllegalArgumentException("invalid minSize");
            }
        }
    }

    @V({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b implements A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f91911b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91912a;

        public b(int i10) {
            this.f91912a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("grid with no rows/columns");
            }
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.A
        @NotNull
        public int[] a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11) {
            return e.b(i10, this.f91912a, i11);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && this.f91912a == ((b) obj).f91912a;
        }

        public int hashCode() {
            return -this.f91912a;
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class c implements A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f91913b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f91914a;

        public /* synthetic */ c(float f10, C4969v c4969v) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.A
        @NotNull
        public int[] a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11) {
            int iI1 = interfaceC4814e.I1(this.f91914a);
            int i12 = iI1 + i11;
            int i13 = i11 + i10;
            if (i12 >= i13) {
                return new int[]{i10};
            }
            int i14 = i13 / i12;
            int[] iArr = new int[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                iArr[i15] = iI1;
            }
            return iArr;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && k0.i.l(this.f91914a, ((c) obj).f91914a);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f91914a);
        }

        public c(float f10) {
            this.f91914a = f10;
        }
    }

    @NotNull
    int[] a(@NotNull InterfaceC4814e interfaceC4814e, int i10, int i11);
}
