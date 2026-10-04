package androidx.compose.runtime;

import androidx.collection.C1562v0;
import androidx.collection.C1564w0;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.runtime.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4179:1\n82#2,3:4180\n33#2,4:4183\n85#2,2:4187\n38#2:4189\n87#2:4190\n1#3:4191\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3969#1:4180,3\n3969#1:4183,4\n3969#1:4187,2\n3969#1:4189\n3969#1:4190\n*E\n"})
public final class C1979x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f100267a = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100268b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100269c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100270d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100271e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100272f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100273g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100274h = 1073741824;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f100275i = 536870912;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f100276j = 29;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100277k = 268435456;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100278l = 28;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100279m = 134217728;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f100280n = 67108864;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100281o = 28;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f100282p = 67108863;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100283q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f100284r = 32;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f100285s = -3;

    public static final void A0(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | f100279m;
        } else {
            iArr[i11] = iArr[i11] & (-134217729);
        }
    }

    public static final void B0(int[] iArr, int i10, int i11) {
        C1968u.j0(i11 >= 0 && i11 < 67108863);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final void C0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }

    public static final void K(C1562v0<C1564w0> c1562v0, int i10, int i11) {
        C1564w0 c1564w0N = c1562v0.n(i10);
        if (c1564w0N == null) {
            c1564w0N = new C1564w0(0, 1, null);
            c1562v0.j0(i10, c1564w0N);
        }
        c1564w0N.G(i11);
    }

    public static final void L(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | 268435456;
    }

    public static final int M(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return P(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    public static final boolean N(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    public static final boolean O(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    public static final int P(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int Q(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    public static final List<Integer> R(int[] iArr, int i10) {
        return t0(iArr, md.u.D1(md.u.Y1(4, i10), 5));
    }

    public static /* synthetic */ List S(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return R(iArr, i10);
    }

    public static final <T> int T(ArrayList<T> arrayList, ed.l<? super T, Boolean> lVar) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (lVar.invoke(arrayList.get(i10)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> T U(ArrayList<T> arrayList, ed.l<? super T, Boolean> lVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t10 = arrayList.get(size);
            if (lVar.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static final C1889c V(ArrayList<C1889c> arrayList, int i10, int i11) {
        int iS0 = s0(arrayList, i10, i11);
        if (iS0 >= 0) {
            return arrayList.get(iS0);
        }
        return null;
    }

    public static final C1889c W(ArrayList<C1889c> arrayList, int i10, int i11, InterfaceC4376a<C1889c> interfaceC4376a) {
        int iS0 = s0(arrayList, i10, i11);
        if (iS0 >= 0) {
            return arrayList.get(iS0);
        }
        C1889c c1889cInvoke = interfaceC4376a.invoke();
        arrayList.add(-(iS0 + 1), c1889cInvoke);
        return c1889cInvoke;
    }

    public static final int X(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    public static final int Y(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final List<Integer> Z(int[] iArr, int i10) {
        return t0(iArr, md.u.D1(md.u.Y1(3, i10), 5));
    }

    public static /* synthetic */ List a0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return Z(iArr, i10);
    }

    public static final boolean b0(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean c0(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & f100279m) != 0;
    }

    public static final boolean d0(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 536870912) != 0;
    }

    public static final void e0(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = z10 ? 1073741824 : 0;
        int i15 = z11 ? 536870912 : 0;
        int i16 = z12 ? 268435456 : 0;
        int i17 = i10 * 5;
        iArr[i17] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    public static final boolean f0(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public static final int g0(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    public static final List<Integer> h0(int[] iArr, int i10) {
        return t0(iArr, md.u.D1(md.u.Y1(0, i10), 5));
    }

    public static /* synthetic */ List i0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return h0(iArr, i10);
    }

    public static final int j0(ArrayList<C1889c> arrayList, int i10, int i11) {
        int iS0 = s0(arrayList, i10, i11);
        return iS0 >= 0 ? iS0 : -(iS0 + 1);
    }

    public static final int k0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & f100282p;
    }

    public static final List<Integer> l0(int[] iArr, int i10) {
        ArrayList arrayList = (ArrayList) t0(iArr, md.u.D1(md.u.Y1(1, i10), 5));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(Integer.valueOf(((Number) arrayList.get(i11)).intValue() & f100282p));
        }
        return arrayList2;
    }

    public static /* synthetic */ List m0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return l0(iArr, i10);
    }

    public static final int n0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    public static final int o0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return P(iArr[i11 + 1] >> 30) + iArr[i11 + 4];
    }

    public static final int p0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    public static final List<Integer> q0(int[] iArr, int i10) {
        return t0(iArr, md.u.D1(md.u.Y1(2, i10), 5));
    }

    public static final int r(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    public static /* synthetic */ List r0(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return q0(iArr, i10);
    }

    public static final int s0(ArrayList<C1889c> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = arrayList.get(i13).f99427a;
            if (i14 < 0) {
                i14 += i11;
            }
            int iT = kotlin.jvm.internal.G.t(i14, i10);
            if (iT < 0) {
                i12 = i13 + 1;
            } else {
                if (iT <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final List<Integer> t0(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final int u0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return P(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final String v0(String str, int i10) {
        String strB2 = kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(kotlin.text.F.B2(str, "androidx.", "a.", false, 4, null), "compose.", "c.", false, 4, null), "runtime.", "r.", false, 4, null), "internal.", "ι.", false, 4, null), "ui.", "u.", false, 4, null), "Modifier", "μ", false, 4, null), "material.", "m.", false, 4, null), "Function", "λ", false, 4, null), "OpaqueKey", "κ", false, 4, null), "MutableState", "σ", false, 4, null);
        String strSubstring = strB2.substring(0, Math.min(i10, strB2.length()));
        kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void w0(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 67108864;
        } else {
            iArr[i11] = iArr[i11] & (-67108865);
        }
    }

    public static final void x0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    public static final void y0(int[] iArr, int i10, int i11) {
        iArr[i10 * 5] = i11;
    }

    public static final void z0(int[] iArr, int i10, int i11) {
        C1968u.j0(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }
}
