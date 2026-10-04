package androidx.collection;

import java.util.Arrays;
import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f86914a = new Object();

    public static final <E, T extends E> T A(W0<E> w02, int i10, T t10) {
        T t11;
        int iA = A.a.a(w02.f86910b, w02.f86912d, i10);
        return (iA < 0 || (t11 = (T) w02.f86911c[iA]) == f86914a) ? t10 : t11;
    }

    public static final <E> void c(@NotNull W0<E> w02, int i10, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int i11 = w02.f86912d;
        if (i11 != 0 && i10 <= w02.f86910b[i11 - 1]) {
            w02.n(i10, e10);
            return;
        }
        if (w02.f86909a && i11 >= w02.f86910b.length) {
            z(w02);
        }
        int i12 = w02.f86912d;
        if (i12 >= w02.f86910b.length) {
            int iE = A.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(w02.f86910b, iE);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            w02.f86910b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(w02.f86911c, iE);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            w02.f86911c = objArrCopyOf;
        }
        w02.f86910b[i12] = i10;
        w02.f86911c[i12] = e10;
        w02.f86912d = i12 + 1;
    }

    public static final <E> void d(@NotNull W0<E> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int i10 = w02.f86912d;
        Object[] objArr = w02.f86911c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        w02.f86912d = 0;
        w02.f86909a = false;
    }

    public static final <E> boolean e(@NotNull W0<E> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return w02.j(i10) >= 0;
    }

    public static final <E> boolean f(@NotNull W0<E> w02, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        int i10 = w02.f86912d;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (w02.f86911c[i11] == e10) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @Nullable
    public static final <E> E g(@NotNull W0<E> w02, int i10) {
        E e10;
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iA = A.a.a(w02.f86910b, w02.f86912d, i10);
        if (iA < 0 || (e10 = (E) w02.f86911c[iA]) == f86914a) {
            return null;
        }
        return e10;
    }

    public static final <E> E h(@NotNull W0<E> w02, int i10, E e10) {
        E e11;
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iA = A.a.a(w02.f86910b, w02.f86912d, i10);
        return (iA < 0 || (e11 = (E) w02.f86911c[iA]) == f86914a) ? e10 : e11;
    }

    public static final <E> int i(@NotNull W0<E> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        return A.a.a(w02.f86910b, w02.f86912d, i10);
    }

    public static final <E> int j(@NotNull W0<E> w02, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        int i10 = w02.f86912d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (w02.f86911c[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean k(@NotNull W0<E> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        return w02.y() == 0;
    }

    public static final <E> int l(@NotNull W0<E> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        return w02.f86910b[i10];
    }

    public static final <E> void m(@NotNull W0<E> w02, int i10, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iA = A.a.a(w02.f86910b, w02.f86912d, i10);
        if (iA >= 0) {
            w02.f86911c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = w02.f86912d;
        if (i11 < i12) {
            Object[] objArr = w02.f86911c;
            if (objArr[i11] == f86914a) {
                w02.f86910b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (w02.f86909a && i12 >= w02.f86910b.length) {
            z(w02);
            i11 = ~A.a.a(w02.f86910b, w02.f86912d, i10);
        }
        int i13 = w02.f86912d;
        if (i13 >= w02.f86910b.length) {
            int iE = A.a.e(i13 + 1);
            int[] iArrCopyOf = Arrays.copyOf(w02.f86910b, iE);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            w02.f86910b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(w02.f86911c, iE);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            w02.f86911c = objArrCopyOf;
        }
        int i14 = w02.f86912d;
        if (i14 - i11 != 0) {
            int[] iArr = w02.f86910b;
            int i15 = i11 + 1;
            C4875q.z0(iArr, iArr, i15, i11, i14);
            Object[] objArr2 = w02.f86911c;
            C4875q.B0(objArr2, objArr2, i15, i11, w02.f86912d);
        }
        w02.f86910b[i11] = i10;
        w02.f86911c[i11] = e10;
        w02.f86912d++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> void n(@org.jetbrains.annotations.NotNull androidx.collection.W0<E> r9, @org.jetbrains.annotations.NotNull androidx.collection.W0<? extends E> r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.G.p(r9, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.G.p(r10, r0)
            int r0 = r10.y()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L9c
            int r2 = r10.m(r1)
            java.lang.Object r3 = r10.z(r1)
            int[] r4 = r9.f86910b
            int r5 = r9.f86912d
            int r4 = A.a.a(r4, r5, r2)
            if (r4 < 0) goto L28
            java.lang.Object[] r2 = r9.f86911c
            r2[r4] = r3
            goto L98
        L28:
            int r4 = ~r4
            int r5 = r9.f86912d
            if (r4 >= r5) goto L3c
            java.lang.Object[] r6 = r9.f86911c
            r7 = r6[r4]
            java.lang.Object r8 = androidx.collection.X0.f86914a
            if (r7 != r8) goto L3c
            int[] r5 = r9.f86910b
            r5[r4] = r2
            r6[r4] = r3
            goto L98
        L3c:
            boolean r6 = r9.f86909a
            if (r6 == 0) goto L51
            int[] r6 = r9.f86910b
            int r6 = r6.length
            if (r5 < r6) goto L51
            z(r9)
            int[] r4 = r9.f86910b
            int r5 = r9.f86912d
            int r4 = A.a.a(r4, r5, r2)
            int r4 = ~r4
        L51:
            int r5 = r9.f86912d
            int[] r6 = r9.f86910b
            int r6 = r6.length
            if (r5 < r6) goto L76
            int r5 = r5 + 1
            int r5 = A.a.e(r5)
            int[] r6 = r9.f86910b
            int[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "copyOf(this, newSize)"
            kotlin.jvm.internal.G.o(r6, r7)
            r9.f86910b = r6
            java.lang.Object[] r6 = r9.f86911c
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            kotlin.jvm.internal.G.o(r5, r7)
            r9.f86911c = r5
        L76:
            int r5 = r9.f86912d
            int r6 = r5 - r4
            if (r6 == 0) goto L8a
            int[] r6 = r9.f86910b
            int r7 = r4 + 1
            kotlin.collections.C4875q.z0(r6, r6, r7, r4, r5)
            java.lang.Object[] r5 = r9.f86911c
            int r6 = r9.f86912d
            kotlin.collections.C4875q.B0(r5, r5, r7, r4, r6)
        L8a:
            int[] r5 = r9.f86910b
            r5[r4] = r2
            java.lang.Object[] r2 = r9.f86911c
            r2[r4] = r3
            int r2 = r9.f86912d
            int r2 = r2 + 1
            r9.f86912d = r2
        L98:
            int r1 = r1 + 1
            goto Lf
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.X0.n(androidx.collection.W0, androidx.collection.W0):void");
    }

    @Nullable
    public static final <E> E o(@NotNull W0<E> w02, int i10, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        E e11 = (E) g(w02, i10);
        if (e11 == null) {
            int iA = A.a.a(w02.f86910b, w02.f86912d, i10);
            if (iA >= 0) {
                w02.f86911c[iA] = e10;
                return e11;
            }
            int i11 = ~iA;
            int i12 = w02.f86912d;
            if (i11 < i12) {
                Object[] objArr = w02.f86911c;
                if (objArr[i11] == f86914a) {
                    w02.f86910b[i11] = i10;
                    objArr[i11] = e10;
                    return e11;
                }
            }
            if (w02.f86909a && i12 >= w02.f86910b.length) {
                z(w02);
                i11 = ~A.a.a(w02.f86910b, w02.f86912d, i10);
            }
            int i13 = w02.f86912d;
            if (i13 >= w02.f86910b.length) {
                int iE = A.a.e(i13 + 1);
                int[] iArrCopyOf = Arrays.copyOf(w02.f86910b, iE);
                kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
                w02.f86910b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(w02.f86911c, iE);
                kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
                w02.f86911c = objArrCopyOf;
            }
            int i14 = w02.f86912d;
            if (i14 - i11 != 0) {
                int[] iArr = w02.f86910b;
                int i15 = i11 + 1;
                C4875q.z0(iArr, iArr, i15, i11, i14);
                Object[] objArr2 = w02.f86911c;
                C4875q.B0(objArr2, objArr2, i15, i11, w02.f86912d);
            }
            w02.f86910b[i11] = i10;
            w02.f86911c[i11] = e10;
            w02.f86912d++;
        }
        return e11;
    }

    public static final <E> void p(@NotNull W0<E> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iA = A.a.a(w02.f86910b, w02.f86912d, i10);
        if (iA >= 0) {
            Object[] objArr = w02.f86911c;
            Object obj = objArr[iA];
            Object obj2 = f86914a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                w02.f86909a = true;
            }
        }
    }

    public static final <E> boolean q(@NotNull W0<E> w02, int i10, @Nullable Object obj) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iJ = w02.j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.G.g(obj, w02.z(iJ))) {
            return false;
        }
        w02.t(iJ);
        return true;
    }

    public static final <E> void r(@NotNull W0<E> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        Object[] objArr = w02.f86911c;
        Object obj = objArr[i10];
        Object obj2 = f86914a;
        if (obj != obj2) {
            objArr[i10] = obj2;
            w02.f86909a = true;
        }
    }

    public static final <E> void s(@NotNull W0<E> w02, int i10, int i11) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            w02.t(i10);
            i10++;
        }
    }

    @Nullable
    public static final <E> E t(@NotNull W0<E> w02, int i10, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iJ = w02.j(i10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = w02.f86911c;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    public static final <E> boolean u(@NotNull W0<E> w02, int i10, E e10, E e11) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        int iJ = w02.j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.G.g(w02.f86911c[iJ], e10)) {
            return false;
        }
        w02.f86911c[iJ] = e11;
        return true;
    }

    public static final <E> void v(@NotNull W0<E> w02, int i10, E e10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        w02.f86911c[i10] = e10;
    }

    public static final <E> int w(@NotNull W0<E> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        return w02.f86912d;
    }

    @NotNull
    public static final <E> String x(@NotNull W0<E> w02) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.y() <= 0) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(w02.f86912d * 28);
        sb2.append('{');
        int i10 = w02.f86912d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(U6.j.f68738d);
            }
            sb2.append(w02.m(i11));
            sb2.append(SignatureVisitor.INSTANCEOF);
            E eZ = w02.z(i11);
            if (eZ != w02) {
                sb2.append(eZ);
            } else {
                sb2.append("(this Map)");
            }
        }
        return C1526d.a(sb2, '}', "buffer.toString()");
    }

    public static final <E> E y(@NotNull W0<E> w02, int i10) {
        kotlin.jvm.internal.G.p(w02, "<this>");
        if (w02.f86909a) {
            z(w02);
        }
        return (E) w02.f86911c[i10];
    }

    public static final <E> void z(W0<E> w02) {
        int i10 = w02.f86912d;
        int[] iArr = w02.f86910b;
        Object[] objArr = w02.f86911c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f86914a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        w02.f86909a = false;
        w02.f86912d = i11;
    }
}
