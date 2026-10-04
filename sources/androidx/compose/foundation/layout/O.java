package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import k0.C4811b;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,197:1\n230#2:198\n230#2:199\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n119#1:198\n173#1:199\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class O {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f90565g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FlowLayoutOverflowState f90567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f90571f;

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f90572e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final androidx.compose.ui.layout.O f90573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final androidx.compose.ui.layout.v0 f90574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f90575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f90576d;

        public /* synthetic */ a(androidx.compose.ui.layout.O o10, androidx.compose.ui.layout.v0 v0Var, long j10, boolean z10, int i10, C4969v c4969v) {
            this(o10, v0Var, j10, (i10 & 8) != 0 ? true : z10);
        }

        @NotNull
        public final androidx.compose.ui.layout.O a() {
            return this.f90573a;
        }

        public final long b() {
            return this.f90575c;
        }

        public final boolean c() {
            return this.f90576d;
        }

        @Nullable
        public final androidx.compose.ui.layout.v0 d() {
            return this.f90574b;
        }

        public final void e(boolean z10) {
            this.f90576d = z10;
        }

        public /* synthetic */ a(androidx.compose.ui.layout.O o10, androidx.compose.ui.layout.v0 v0Var, long j10, boolean z10, C4969v c4969v) {
            this(o10, v0Var, j10, z10);
        }

        public a(androidx.compose.ui.layout.O o10, androidx.compose.ui.layout.v0 v0Var, long j10, boolean z10) {
            this.f90573a = o10;
            this.f90574b = v0Var;
            this.f90575c = j10;
            this.f90576d = z10;
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f90577c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f90578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90579b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z10 = false;
            this(z10, z10, 3, null);
        }

        public final boolean a() {
            return this.f90579b;
        }

        public final boolean b() {
            return this.f90578a;
        }

        public b(boolean z10, boolean z11) {
            this.f90578a = z10;
            this.f90579b = z11;
        }

        public /* synthetic */ b(boolean z10, boolean z11, int i10, C4969v c4969v) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
        }
    }

    public /* synthetic */ O(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13, C4969v c4969v) {
        this(i10, flowLayoutOverflowState, j10, i11, i12, i13);
    }

    @Nullable
    public final a a(@NotNull b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a aVarJ;
        if (!bVar.f90579b || (aVarJ = this.f90567b.j(z10, i10, i11)) == null) {
            return null;
        }
        aVarJ.f90576d = i10 >= 0 && (i13 == 0 || (i12 - ((int) (aVarJ.f90575c >> 32)) >= 0 && i13 < this.f90566a));
        return aVarJ;
    }

    @NotNull
    public final b b(boolean z10, int i10, long j10, @Nullable androidx.collection.H h10, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = i12 + i13;
        if (h10 == null) {
            return new b(true, true);
        }
        if (this.f90567b.f90431a != FlowLayoutOverflow.OverflowType.Visible && (i11 >= this.f90569d || ((int) (j10 & ZipKt.f225990j)) - ((int) (h10.f86706a & ZipKt.f225990j)) < 0)) {
            return new b(true, true);
        }
        if (i10 != 0 && (i10 >= this.f90566a || ((int) (j10 >> 32)) - ((int) (h10.f86706a >> 32)) < 0)) {
            if (z11) {
                return new b(true, true);
            }
            long jD = androidx.collection.H.d(C4811b.o(this.f90568c), (((int) (j10 & ZipKt.f225990j)) - this.f90571f) - i13);
            long j11 = h10.f86706a;
            return new b(true, b(z10, 0, jD, new androidx.collection.H(androidx.collection.H.d(((int) (j11 >> 32)) - this.f90570e, (int) (j11 & ZipKt.f225990j))), i11 + 1, i14, 0, true, false).f90579b);
        }
        int iMax = Math.max(i13, (int) (h10.f86706a & ZipKt.f225990j)) + i12;
        androidx.collection.H hK = z12 ? null : this.f90567b.k(z10, i11, iMax);
        if (hK == null || (i10 + 1 < this.f90566a && ((((int) (j10 >> 32)) - ((int) (h10.f86706a >> 32))) - this.f90570e) - ((int) (hK.f86706a >> 32)) >= 0)) {
            return new b(false, false);
        }
        if (z12) {
            return new b(true, true);
        }
        boolean z13 = b(false, 0, androidx.collection.H.d(C4811b.o(this.f90568c), (((int) (j10 & ZipKt.f225990j)) - this.f90571f) - Math.max(i13, (int) (ZipKt.f225990j & h10.f86706a))), hK, i11 + 1, iMax, 0, true, true).f90579b;
        return new b(z13, z13);
    }

    public O(int i10, FlowLayoutOverflowState flowLayoutOverflowState, long j10, int i11, int i12, int i13) {
        this.f90566a = i10;
        this.f90567b = flowLayoutOverflowState;
        this.f90568c = j10;
        this.f90569d = i11;
        this.f90570e = i12;
        this.f90571f = i13;
    }
}
