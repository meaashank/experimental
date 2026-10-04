package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.foundation.C1749o;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.c;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,715:1\n706#1,2:721\n709#1,5:726\n706#1,2:731\n709#1,5:736\n706#1,2:744\n709#1,5:750\n706#1,2:758\n709#1,5:764\n706#1,2:772\n709#1,5:778\n706#1,2:786\n709#1,5:792\n149#2:716\n149#2:717\n13032#3,3:718\n13674#3,3:723\n13674#3,3:733\n13032#3,3:741\n13674#3,2:746\n13676#3:749\n13032#3,3:755\n13674#3,2:760\n13676#3:763\n13032#3,3:769\n13674#3,2:774\n13676#3:777\n13032#3,3:783\n13674#3,2:788\n13676#3:791\n13674#3,3:797\n26#4:748\n26#4:762\n26#4:776\n26#4:790\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n619#1:721,2\n619#1:726,5\n627#1:731,2\n627#1:736,5\n641#1:744,2\n641#1:750,5\n656#1:758,2\n656#1:764,5\n680#1:772,2\n680#1:778,5\n699#1:786,2\n699#1:792,5\n355#1:716\n367#1:717\n617#1:718,3\n619#1:723,3\n627#1:733,3\n639#1:741,3\n641#1:746,2\n641#1:749\n653#1:755,3\n656#1:760,2\n656#1:763\n670#1:769,3\n680#1:774,2\n680#1:777\n692#1:783,3\n699#1:788,2\n699#1:791\n707#1:797,3\n642#1:748\n657#1:762\n681#1:776\n700#1:790\n*E\n"})
public final class Arrangement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Arrangement f90199a = new Arrangement();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d f90200b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final d f90201c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final l f90202d = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final l f90203e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e f90204f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final e f90205g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e f90206h = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final e f90207i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f90208j = 0;

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n556#1:716\n*E\n"})
    @InterfaceC1924k0
    public static final class Absolute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final Absolute f90209a = new Absolute();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f90210b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final d f90211c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final d f90212d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final d f90213e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final d f90214f = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final d f90215g = new d();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f90216h = 0;

        public static final class a implements d {
            @Override // androidx.compose.foundation.layout.Arrangement.d
            public float a() {
                return 0;
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                Arrangement.f90199a.t(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        public static final class b implements d {
            @Override // androidx.compose.foundation.layout.Arrangement.d
            public float a() {
                return 0;
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                Arrangement.f90199a.u(iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public static final class c implements d {
            @Override // androidx.compose.foundation.layout.Arrangement.d
            public float a() {
                return 0;
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                Arrangement.f90199a.v(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static final class d implements d {
            @Override // androidx.compose.foundation.layout.Arrangement.d
            public float a() {
                return 0;
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                Arrangement.f90199a.w(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        public static final class e implements d {
            @Override // androidx.compose.foundation.layout.Arrangement.d
            public float a() {
                return 0;
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                Arrangement.f90199a.x(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        public static final class f implements d {
            @Override // androidx.compose.foundation.layout.Arrangement.d
            public float a() {
                return 0;
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
                Arrangement.f90199a.y(i10, iArr, iArr2, false);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        @T1
        public static /* synthetic */ void c() {
        }

        @T1
        public static /* synthetic */ void e() {
        }

        @T1
        public static /* synthetic */ void g() {
        }

        @T1
        public static /* synthetic */ void i() {
        }

        @T1
        public static /* synthetic */ void k() {
        }

        @T1
        public static /* synthetic */ void m() {
        }

        @T1
        @NotNull
        public final d a(@NotNull final c.b bVar) {
            return new i(0, false, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                @NotNull
                public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                    return Integer.valueOf(bVar.a(0, i10, layoutDirection));
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return e(num.intValue(), layoutDirection);
                }
            });
        }

        @NotNull
        public final d b() {
            return f90211c;
        }

        @NotNull
        public final d d() {
            return f90210b;
        }

        @NotNull
        public final d f() {
            return f90212d;
        }

        @NotNull
        public final d h() {
            return f90215g;
        }

        @NotNull
        public final d j() {
            return f90213e;
        }

        @NotNull
        public final d l() {
            return f90214f;
        }

        @T1
        @NotNull
        public final e n(float f10) {
            return new i(f10, false, null);
        }

        @T1
        @NotNull
        public final d o(float f10, @NotNull final c.b bVar) {
            return new i(f10, false, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                @NotNull
                public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                    return Integer.valueOf(bVar.a(0, i10, layoutDirection));
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return e(num.intValue(), layoutDirection);
                }
            });
        }

        @T1
        @NotNull
        public final l p(float f10, @NotNull final c.InterfaceC0245c interfaceC0245c) {
            return new i(f10, false, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                @NotNull
                public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                    return Integer.valueOf(interfaceC0245c.a(0, i10));
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return e(num.intValue(), layoutDirection);
                }
            });
        }
    }

    public static final class a implements l {
        @Override // androidx.compose.foundation.layout.Arrangement.l
        public float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            Arrangement.f90199a.v(i10, iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n191#1:716\n*E\n"})
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f90222a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return this.f90222a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f90199a.t(i10, iArr, iArr2, false);
            } else {
                Arrangement.f90199a.t(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            Arrangement.f90199a.t(i10, iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class c implements d {
        @Override // androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f90199a.v(i10, iArr, iArr2, false);
            } else {
                Arrangement.f90199a.u(iArr, iArr2, true);
            }
        }

        @NotNull
        public String toString() {
            return "Arrangement#End";
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n51#1:716\n*E\n"})
    @T1
    public interface d {

        public static final class a {
            @Deprecated
            public static float a(@NotNull d dVar) {
                return 0;
            }
        }

        float a();

        void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2);
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n108#1:716\n*E\n"})
    @T1
    public interface e extends d, l {

        public static final class a {
            @Deprecated
            public static float a(@NotNull e eVar) {
                return 0;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        float a();
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n279#1:716\n*E\n"})
    public static final class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f90223a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return this.f90223a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f90199a.w(i10, iArr, iArr2, false);
            } else {
                Arrangement.f90199a.w(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            Arrangement.f90199a.w(i10, iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n*L\n249#1:716\n*E\n"})
    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f90224a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return this.f90224a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f90199a.x(i10, iArr, iArr2, false);
            } else {
                Arrangement.f90199a.x(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            Arrangement.f90199a.x(i10, iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n*L\n220#1:716\n*E\n"})
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f90225a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return this.f90225a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f90199a.y(i10, iArr, iArr2, false);
            } else {
                Arrangement.f90199a.y(i10, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            Arrangement.f90199a.y(i10, iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#2,2:716\n709#2,5:721\n13674#3,3:718\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n586#1:716,2\n586#1:721,5\n586#1:718,3\n*E\n"})
    @InterfaceC1924k0
    public static final class i implements e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f90226e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f90227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final ed.p<Integer, LayoutDirection, Integer> f90229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f90230d;

        public /* synthetic */ i(float f10, boolean z10, ed.p pVar, C4969v c4969v) {
            this(f10, z10, pVar);
        }

        public static i h(i iVar, float f10, boolean z10, ed.p pVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = iVar.f90227a;
            }
            if ((i10 & 2) != 0) {
                z10 = iVar.f90228b;
            }
            if ((i10 & 4) != 0) {
                pVar = iVar.f90229c;
            }
            iVar.getClass();
            return new i(f10, z10, pVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return this.f90230d;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            int i11;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iI1 = interfaceC4814e.I1(this.f90227a);
            boolean z10 = this.f90228b && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.f90199a;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i12 = iArr[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iI1, (i10 - iMin2) - i12);
                    i11 = iArr2[length] + i12 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    iArr2[i14] = iMin3;
                    int iMin4 = Math.min(iI1, (i10 - iMin3) - i15);
                    int i16 = iArr2[i14] + i15 + iMin4;
                    i13++;
                    iMin = iMin4;
                    i11 = i16;
                    i14++;
                }
            }
            int i17 = i11 - iMin;
            ed.p<Integer, LayoutDirection, Integer> pVar = this.f90229c;
            if (pVar == null || i17 >= i10) {
                return;
            }
            int iIntValue = pVar.invoke(Integer.valueOf(i10 - i17), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            b(interfaceC4814e, i10, iArr, LayoutDirection.Ltr, iArr2);
        }

        public final float d() {
            return this.f90227a;
        }

        public final boolean e() {
            return this.f90228b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return k0.i.l(this.f90227a, iVar.f90227a) && this.f90228b == iVar.f90228b && kotlin.jvm.internal.G.g(this.f90229c, iVar.f90229c);
        }

        @Nullable
        public final ed.p<Integer, LayoutDirection, Integer> f() {
            return this.f90229c;
        }

        @NotNull
        public final i g(float f10, boolean z10, @Nullable ed.p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            return new i(f10, z10, pVar);
        }

        public int hashCode() {
            int iA = (C1635o.a(this.f90228b) + (Float.floatToIntBits(this.f90227a) * 31)) * 31;
            ed.p<Integer, LayoutDirection, Integer> pVar = this.f90229c;
            return iA + (pVar == null ? 0 : pVar.hashCode());
        }

        @Nullable
        public final ed.p<Integer, LayoutDirection, Integer> i() {
            return this.f90229c;
        }

        public final boolean j() {
            return this.f90228b;
        }

        public final float k() {
            return this.f90227a;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f90228b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            C1749o.a(this.f90227a, sb2, U6.j.f68738d);
            sb2.append(this.f90229c);
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(float f10, boolean z10, ed.p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.f90227a = f10;
            this.f90228b = z10;
            this.f90229c = pVar;
            this.f90230d = f10;
        }
    }

    public static final class j implements d {
        @Override // androidx.compose.foundation.layout.Arrangement.d
        public float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f90199a.u(iArr, iArr2, false);
            } else {
                Arrangement.f90199a.v(i10, iArr, iArr2, true);
            }
        }

        @NotNull
        public String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class k implements l {
        @Override // androidx.compose.foundation.layout.Arrangement.l
        public float a() {
            return 0;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2) {
            Arrangement.f90199a.u(iArr, iArr2, false);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Top";
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n149#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n80#1:716\n*E\n"})
    @T1
    public interface l {

        public static final class a {
            @Deprecated
            public static float a(@NotNull l lVar) {
                return 0;
            }
        }

        float a();

        void c(@NotNull InterfaceC4814e interfaceC4814e, int i10, @NotNull int[] iArr, @NotNull int[] iArr2);
    }

    @T1
    public static /* synthetic */ void e() {
    }

    @T1
    public static /* synthetic */ void g() {
    }

    @T1
    public static /* synthetic */ void i() {
    }

    @T1
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void m() {
    }

    @T1
    public static /* synthetic */ void o() {
    }

    @T1
    public static /* synthetic */ void q() {
    }

    @T1
    public static /* synthetic */ void s() {
    }

    @T1
    @NotNull
    public final d A(float f10, @NotNull final c.b bVar) {
        return new i(f10, true, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @NotNull
            public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                return Integer.valueOf(bVar.a(0, i10, layoutDirection));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return e(num.intValue(), layoutDirection);
            }
        });
    }

    @T1
    @NotNull
    public final l B(float f10, @NotNull final c.InterfaceC0245c interfaceC0245c) {
        return new i(f10, false, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            @NotNull
            public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                return Integer.valueOf(interfaceC0245c.a(0, i10));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return e(num.intValue(), layoutDirection);
            }
        });
    }

    @T1
    @NotNull
    public final d a(@NotNull final c.b bVar) {
        return new i(0, true, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$aligned$1
            {
                super(2);
            }

            @NotNull
            public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                return Integer.valueOf(bVar.a(0, i10, layoutDirection));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return e(num.intValue(), layoutDirection);
            }
        });
    }

    @T1
    @NotNull
    public final l b(@NotNull final c.InterfaceC0245c interfaceC0245c) {
        return new i(0, false, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$aligned$2
            {
                super(2);
            }

            @NotNull
            public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                return Integer.valueOf(interfaceC0245c.a(0, i10));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return e(num.intValue(), layoutDirection);
            }
        });
    }

    public final void c(int[] iArr, boolean z10, ed.p<? super Integer, ? super Integer, kotlin.L0> pVar) {
        if (!z10) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                pVar.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @NotNull
    public final l d() {
        return f90203e;
    }

    @NotNull
    public final e f() {
        return f90204f;
    }

    @NotNull
    public final d h() {
        return f90201c;
    }

    @NotNull
    public final e j() {
        return f90207i;
    }

    @NotNull
    public final e l() {
        return f90206h;
    }

    @NotNull
    public final e n() {
        return f90205g;
    }

    @NotNull
    public final d p() {
        return f90200b;
    }

    @NotNull
    public final l r() {
        return f90202d;
    }

    public final void t(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16;
        }
    }

    public final void u(@NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public final void v(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public final void w(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = !(iArr.length == 0) ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void x(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(iArr.length - 1, 1);
        float f10 = (z10 && iArr.length == 1) ? fMax : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = Math.round(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public final void y(int i10, @NotNull int[] iArr, @NotNull int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = Math.round(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    @T1
    @NotNull
    public final e z(float f10) {
        return new i(f10, true, new ed.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @NotNull
            public final Integer e(int i10, @NotNull LayoutDirection layoutDirection) {
                androidx.compose.ui.c.f100390a.getClass();
                return Integer.valueOf(c.a.f100404n.a(0, i10, layoutDirection));
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return e(num.intValue(), layoutDirection);
            }
        });
    }
}
