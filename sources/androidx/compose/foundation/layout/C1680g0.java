package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC2183s;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,723:1\n428#2,5:724\n433#2,7:733\n441#2:741\n442#2,2:743\n453#2,5:745\n458#2,17:754\n477#2,6:772\n485#2,17:779\n453#2,5:796\n458#2,17:805\n477#2,6:823\n485#2,17:830\n428#2,5:847\n433#2,7:856\n441#2:864\n442#2,2:866\n428#2,5:868\n433#2,7:877\n441#2:885\n442#2,2:887\n453#2,5:889\n458#2,17:898\n477#2,6:916\n485#2,17:923\n453#2,5:940\n458#2,17:949\n477#2,6:967\n485#2,17:974\n428#2,5:991\n433#2,7:1000\n441#2:1008\n442#2,2:1010\n33#3,4:729\n38#3:742\n33#3,4:750\n38#3:771\n33#3,4:801\n38#3:822\n33#3,4:852\n38#3:865\n33#3,4:873\n38#3:886\n33#3,4:894\n38#3:915\n33#3,4:945\n38#3:966\n33#3,4:996\n38#3:1009\n26#4:740\n26#4:778\n26#4:829\n26#4:863\n26#4:884\n26#4:922\n26#4:973\n26#4:1007\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n325#1:724,5\n325#1:733,7\n325#1:741\n325#1:743,2\n337#1:745,5\n337#1:754,17\n337#1:772,6\n337#1:779,17\n350#1:796,5\n350#1:805,17\n350#1:823,6\n350#1:830,17\n363#1:847,5\n363#1:856,7\n363#1:864\n363#1:866,2\n375#1:868,5\n375#1:877,7\n375#1:885\n375#1:887,2\n387#1:889,5\n387#1:898,17\n387#1:916,6\n387#1:923,17\n400#1:940,5\n400#1:949,17\n400#1:967,6\n400#1:974,17\n413#1:991,5\n413#1:1000,7\n413#1:1008\n413#1:1010,2\n325#1:729,4\n325#1:742\n337#1:750,4\n337#1:771\n350#1:801,4\n350#1:822\n363#1:852,4\n363#1:865\n375#1:873,4\n375#1:886\n387#1:894,4\n387#1:915\n400#1:945,4\n400#1:966\n413#1:996,4\n413#1:1009\n325#1:740\n337#1:778\n350#1:829\n363#1:863\n375#1:884\n387#1:922\n400#1:973\n413#1:1007\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1680g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1680g0 f90917a = new C1680g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90918b = 0;

    public final int a(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2183s interfaceC2183s = list.get(i12);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2183s.z0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2183s.h0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2183s interfaceC2183s2 = list.get(i13);
            float fE2 = C1703s0.e(C1703s0.c(interfaceC2183s2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2183s2.h0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2183s interfaceC2183s = list.get(i13);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            int iZ0 = interfaceC2183s.z0(i10);
            if (fE == 0.0f) {
                i12 += iZ0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iZ0 / fE));
            }
        }
        return ((list.size() - 1) * i11) + Math.round(iMax * f10) + i12;
    }

    public final int c(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2183s interfaceC2183s = list.get(i12);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2183s.z0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2183s.r0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2183s interfaceC2183s2 = list.get(i13);
            float fE2 = C1703s0.e(C1703s0.c(interfaceC2183s2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2183s2.r0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2183s interfaceC2183s = list.get(i13);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            int iW0 = interfaceC2183s.w0(i10);
            if (fE == 0.0f) {
                i12 += iW0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iW0 / fE));
            }
        }
        return ((list.size() - 1) * i11) + Math.round(iMax * f10) + i12;
    }

    public final int e(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2183s interfaceC2183s = list.get(i13);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            int iH0 = interfaceC2183s.h0(i10);
            if (fE == 0.0f) {
                i12 += iH0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iH0 / fE));
            }
        }
        return ((list.size() - 1) * i11) + Math.round(iMax * f10) + i12;
    }

    public final int f(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2183s interfaceC2183s = list.get(i12);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2183s.h0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2183s.z0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2183s interfaceC2183s2 = list.get(i13);
            float fE2 = C1703s0.e(C1703s0.c(interfaceC2183s2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2183s2.z0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2183s interfaceC2183s = list.get(i13);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            int iR0 = interfaceC2183s.r0(i10);
            if (fE == 0.0f) {
                i12 += iR0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iR0 / fE));
            }
        }
        return ((list.size() - 1) * i11) + Math.round(iMax * f10) + i12;
    }

    public final int h(@NotNull List<? extends InterfaceC2183s> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2183s interfaceC2183s = list.get(i12);
            float fE = C1703s0.e(C1703s0.c(interfaceC2183s));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2183s.h0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2183s.w0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2183s interfaceC2183s2 = list.get(i13);
            float fE2 = C1703s0.e(C1703s0.c(interfaceC2183s2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2183s2.w0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
