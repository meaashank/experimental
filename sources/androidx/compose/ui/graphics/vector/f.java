package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,419:1\n338#1,7:420\n338#1,7:427\n338#1,7:434\n338#1,7:441\n338#1,7:448\n338#1,7:455\n338#1,7:462\n338#1,7:469\n338#1,7:476\n338#1,7:483\n338#1,7:490\n338#1,7:497\n338#1,7:504\n338#1,7:511\n338#1,7:518\n338#1,7:525\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n158#1:420,7\n167#1:427,7\n171#1:434,7\n180#1:441,7\n189#1:448,7\n198#1:455,7\n207#1:462,7\n223#1:469,7\n234#1:476,7\n248#1:483,7\n262#1:490,7\n276#1:497,7\n285#1:504,7\n294#1:511,7\n303#1:518,7\n315#1:525,7\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f101666A = 4;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f101667B = 2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f101668C = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f101669a = 'z';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f101670b = 'Z';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f101671c = 'm';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f101672d = 'M';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f101673e = 'l';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f101674f = 'L';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f101675g = 'h';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f101676h = 'H';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f101677i = 'v';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f101678j = 'V';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char f101679k = 'c';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f101680l = 'C';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final char f101681m = 's';

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char f101682n = 'S';

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char f101683o = 'q';

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f101684p = 'Q';

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final char f101685q = 't';

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char f101686r = 'T';

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final char f101687s = 'a';

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final char f101688t = 'A';

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f101689u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f101690v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f101691w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f101692x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f101693y = 6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f101694z = 4;

    public static final void a(char c10, @NotNull ArrayList<e> arrayList, @NotNull float[] fArr, int i10) {
        if (c10 == 'z' || c10 == 'Z') {
            arrayList.add(e.b.f101614c);
            return;
        }
        if (c10 == 'm') {
            d(arrayList, fArr, i10);
            return;
        }
        if (c10 == 'M') {
            b(arrayList, fArr, i10);
            return;
        }
        int i11 = 0;
        if (c10 == 'l') {
            int i12 = i10 - 2;
            while (i11 <= i12) {
                arrayList.add(new e.m(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'L') {
            int i13 = i10 - 2;
            while (i11 <= i13) {
                arrayList.add(new e.C0252e(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'h') {
            int i14 = i10 - 1;
            while (i11 <= i14) {
                arrayList.add(new e.l(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'H') {
            int i15 = i10 - 1;
            while (i11 <= i15) {
                arrayList.add(new e.d(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'v') {
            int i16 = i10 - 1;
            while (i11 <= i16) {
                arrayList.add(new e.r(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'V') {
            int i17 = i10 - 1;
            while (i11 <= i17) {
                arrayList.add(new e.s(fArr[i11]));
                i11++;
            }
            return;
        }
        if (c10 == 'c') {
            int i18 = i10 - 6;
            while (i11 <= i18) {
                arrayList.add(new e.k(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                i11 += 6;
            }
            return;
        }
        if (c10 == 'C') {
            int i19 = i10 - 6;
            while (i11 <= i19) {
                arrayList.add(new e.c(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                i11 += 6;
            }
            return;
        }
        if (c10 == 's') {
            int i20 = i10 - 4;
            while (i11 <= i20) {
                arrayList.add(new e.p(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 'S') {
            int i21 = i10 - 4;
            while (i11 <= i21) {
                arrayList.add(new e.h(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 'q') {
            int i22 = i10 - 4;
            while (i11 <= i22) {
                arrayList.add(new e.o(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 'Q') {
            int i23 = i10 - 4;
            while (i11 <= i23) {
                arrayList.add(new e.g(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                i11 += 4;
            }
            return;
        }
        if (c10 == 't') {
            int i24 = i10 - 2;
            while (i11 <= i24) {
                arrayList.add(new e.q(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'T') {
            int i25 = i10 - 2;
            while (i11 <= i25) {
                arrayList.add(new e.i(fArr[i11], fArr[i11 + 1]));
                i11 += 2;
            }
            return;
        }
        if (c10 == 'a') {
            int i26 = i10 - 7;
            for (int i27 = 0; i27 <= i26; i27 += 7) {
                arrayList.add(new e.j(fArr[i27], fArr[i27 + 1], fArr[i27 + 2], Float.compare(fArr[i27 + 3], 0.0f) != 0, Float.compare(fArr[i27 + 4], 0.0f) != 0, fArr[i27 + 5], fArr[i27 + 6]));
            }
            return;
        }
        if (c10 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
        int i28 = i10 - 7;
        for (int i29 = 0; i29 <= i28; i29 += 7) {
            arrayList.add(new e.a(fArr[i29], fArr[i29 + 1], fArr[i29 + 2], Float.compare(fArr[i29 + 3], 0.0f) != 0, Float.compare(fArr[i29 + 4], 0.0f) != 0, fArr[i29 + 5], fArr[i29 + 6]));
        }
    }

    public static final void b(List<e> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new e.f(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new e.C0252e(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    public static final void c(List<e> list, float[] fArr, int i10, int i11, ed.p<? super float[], ? super Integer, ? extends e> pVar) {
        int i12 = i10 - i11;
        int i13 = 0;
        while (i13 <= i12) {
            list.add(pVar.invoke(fArr, Integer.valueOf(i13)));
            i13 += i11;
        }
    }

    public static final void d(List<e> list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new e.n(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new e.m(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
