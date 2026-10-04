package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC2183s;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,723:1\n33#2,4:724\n38#2:729\n33#2,6:731\n33#2,4:738\n38#2:743\n26#3:728\n26#3:730\n26#3:737\n26#3:742\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n432#1:724,4\n432#1:729\n457#1:731,6\n485#1:738,4\n485#1:743\n439#1:728\n442#1:730\n482#1:737\n493#1:742\n*E\n"})
public final class C1703s0 {
    @Nullable
    public static final B a(@Nullable A0 a02) {
        if (a02 != null) {
            return a02.f90176c;
        }
        return null;
    }

    public static final boolean b(@Nullable A0 a02) {
        if (a02 != null) {
            return a02.f90175b;
        }
        return true;
    }

    @Nullable
    public static final A0 c(@NotNull InterfaceC2183s interfaceC2183s) {
        Object objG = interfaceC2183s.g();
        if (objG instanceof A0) {
            return (A0) objG;
        }
        return null;
    }

    @Nullable
    public static final A0 d(@NotNull androidx.compose.ui.layout.v0 v0Var) {
        Object objG = v0Var.g();
        if (objG instanceof A0) {
            return (A0) objG;
        }
        return null;
    }

    public static final float e(@Nullable A0 a02) {
        if (a02 != null) {
            return a02.f90174a;
        }
        return 0.0f;
    }

    public static final int f(List<? extends InterfaceC2183s> list, ed.p<? super InterfaceC2183s, ? super Integer, Integer> pVar, ed.p<? super InterfaceC2183s, ? super Integer, Integer> pVar2, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2183s interfaceC2183s = list.get(i12);
            float fE = e(c(interfaceC2183s));
            if (fE == 0.0f) {
                int iMin2 = Math.min(pVar.invoke(interfaceC2183s, Integer.MAX_VALUE).intValue(), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pVar2.invoke(interfaceC2183s, Integer.valueOf(iMin2)).intValue());
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2183s interfaceC2183s2 = list.get(i13);
            float fE2 = e(c(interfaceC2183s2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, pVar2.invoke(interfaceC2183s2, Integer.valueOf(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    public static final int g(List<? extends InterfaceC2183s> list, ed.p<? super InterfaceC2183s, ? super Integer, Integer> pVar, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2183s interfaceC2183s = list.get(i13);
            float fE = e(c(interfaceC2183s));
            int iIntValue = pVar.invoke(interfaceC2183s, Integer.valueOf(i10)).intValue();
            if (fE == 0.0f) {
                i12 += iIntValue;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iIntValue / fE));
            }
        }
        return ((list.size() - 1) * i11) + Math.round(iMax * f10) + i12;
    }

    public static final boolean h(@Nullable A0 a02) {
        B b10 = a02 != null ? a02.f90176c : null;
        if (b10 != null) {
            return b10.f();
        }
        return false;
    }
}
