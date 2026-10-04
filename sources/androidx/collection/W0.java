package androidx.collection;

import java.util.Arrays;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
public class W0<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    public /* synthetic */ boolean f86909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public /* synthetic */ int[] f86910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public /* synthetic */ Object[] f86911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public /* synthetic */ int f86912d;

    @dd.k
    public W0() {
        this(0, 1, null);
    }

    public void a(int i10, E e10) {
        int i11 = this.f86912d;
        if (i11 != 0 && i10 <= this.f86910b[i11 - 1]) {
            n(i10, e10);
            return;
        }
        if (this.f86909a && i11 >= this.f86910b.length) {
            X0.z(this);
        }
        int i12 = this.f86912d;
        if (i12 >= this.f86910b.length) {
            int iE = A.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f86910b, iE);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86910b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86911c, iE);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86911c = objArrCopyOf;
        }
        this.f86910b[i12] = i10;
        this.f86911c[i12] = e10;
        this.f86912d = i12 + 1;
    }

    public void b() {
        int i10 = this.f86912d;
        Object[] objArr = this.f86911c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f86912d = 0;
        this.f86909a = false;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public W0<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.G.n(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        W0<E> w02 = (W0) objClone;
        w02.f86910b = (int[]) this.f86910b.clone();
        w02.f86911c = (Object[]) this.f86911c.clone();
        return w02;
    }

    public boolean d(int i10) {
        return j(i10) >= 0;
    }

    public boolean e(E e10) {
        if (this.f86909a) {
            X0.z(this);
        }
        int i10 = this.f86912d;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (this.f86911c[i11] == e10) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @InterfaceC4982o(message = "Alias for remove(int).", replaceWith = @InterfaceC4852c0(expression = "remove(key)", imports = {}))
    public void f(int i10) {
        r(i10);
    }

    @Nullable
    public E g(int i10) {
        return (E) X0.g(this, i10);
    }

    public E h(int i10, E e10) {
        return (E) X0.h(this, i10, e10);
    }

    @dd.j(name = "getIsEmpty")
    public final boolean i() {
        return l();
    }

    public int j(int i10) {
        if (this.f86909a) {
            X0.z(this);
        }
        return A.a.a(this.f86910b, this.f86912d, i10);
    }

    public int k(E e10) {
        if (this.f86909a) {
            X0.z(this);
        }
        int i10 = this.f86912d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f86911c[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean l() {
        return y() == 0;
    }

    public int m(int i10) {
        if (this.f86909a) {
            X0.z(this);
        }
        return this.f86910b[i10];
    }

    public void n(int i10, E e10) {
        int iA = A.a.a(this.f86910b, this.f86912d, i10);
        if (iA >= 0) {
            this.f86911c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f86912d;
        if (i11 < i12) {
            Object[] objArr = this.f86911c;
            if (objArr[i11] == X0.f86914a) {
                this.f86910b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f86909a && i12 >= this.f86910b.length) {
            X0.z(this);
            i11 = ~A.a.a(this.f86910b, this.f86912d, i10);
        }
        int i13 = this.f86912d;
        if (i13 >= this.f86910b.length) {
            int iE = A.a.e(i13 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f86910b, iE);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86910b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86911c, iE);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86911c = objArrCopyOf;
        }
        int i14 = this.f86912d;
        if (i14 - i11 != 0) {
            int[] iArr = this.f86910b;
            int i15 = i11 + 1;
            C4875q.z0(iArr, iArr, i15, i11, i14);
            Object[] objArr2 = this.f86911c;
            C4875q.B0(objArr2, objArr2, i15, i11, this.f86912d);
        }
        this.f86910b[i11] = i10;
        this.f86911c[i11] = e10;
        this.f86912d++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(@org.jetbrains.annotations.NotNull androidx.collection.W0<? extends E> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.G.p(r10, r0)
            int r0 = r10.y()
            r1 = 0
        La:
            if (r1 >= r0) goto L97
            int r2 = r10.m(r1)
            java.lang.Object r3 = r10.z(r1)
            int[] r4 = r9.f86910b
            int r5 = r9.f86912d
            int r4 = A.a.a(r4, r5, r2)
            if (r4 < 0) goto L23
            java.lang.Object[] r2 = r9.f86911c
            r2[r4] = r3
            goto L93
        L23:
            int r4 = ~r4
            int r5 = r9.f86912d
            if (r4 >= r5) goto L37
            java.lang.Object[] r6 = r9.f86911c
            r7 = r6[r4]
            java.lang.Object r8 = androidx.collection.X0.f86914a
            if (r7 != r8) goto L37
            int[] r5 = r9.f86910b
            r5[r4] = r2
            r6[r4] = r3
            goto L93
        L37:
            boolean r6 = r9.f86909a
            if (r6 == 0) goto L4c
            int[] r6 = r9.f86910b
            int r6 = r6.length
            if (r5 < r6) goto L4c
            androidx.collection.X0.z(r9)
            int[] r4 = r9.f86910b
            int r5 = r9.f86912d
            int r4 = A.a.a(r4, r5, r2)
            int r4 = ~r4
        L4c:
            int r5 = r9.f86912d
            int[] r6 = r9.f86910b
            int r6 = r6.length
            if (r5 < r6) goto L71
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
        L71:
            int r5 = r9.f86912d
            int r6 = r5 - r4
            if (r6 == 0) goto L85
            int[] r6 = r9.f86910b
            int r7 = r4 + 1
            kotlin.collections.C4875q.z0(r6, r6, r7, r4, r5)
            java.lang.Object[] r5 = r9.f86911c
            int r6 = r9.f86912d
            kotlin.collections.C4875q.B0(r5, r5, r7, r4, r6)
        L85:
            int[] r5 = r9.f86910b
            r5[r4] = r2
            java.lang.Object[] r2 = r9.f86911c
            r2[r4] = r3
            int r2 = r9.f86912d
            int r2 = r2 + 1
            r9.f86912d = r2
        L93:
            int r1 = r1 + 1
            goto La
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.W0.p(androidx.collection.W0):void");
    }

    @Nullable
    public E q(int i10, E e10) {
        E e11 = (E) X0.g(this, i10);
        if (e11 == null) {
            int iA = A.a.a(this.f86910b, this.f86912d, i10);
            if (iA >= 0) {
                this.f86911c[iA] = e10;
                return e11;
            }
            int i11 = ~iA;
            int i12 = this.f86912d;
            if (i11 < i12) {
                Object[] objArr = this.f86911c;
                if (objArr[i11] == X0.f86914a) {
                    this.f86910b[i11] = i10;
                    objArr[i11] = e10;
                    return e11;
                }
            }
            if (this.f86909a && i12 >= this.f86910b.length) {
                X0.z(this);
                i11 = ~A.a.a(this.f86910b, this.f86912d, i10);
            }
            int i13 = this.f86912d;
            if (i13 >= this.f86910b.length) {
                int iE = A.a.e(i13 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.f86910b, iE);
                kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
                this.f86910b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f86911c, iE);
                kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
                this.f86911c = objArrCopyOf;
            }
            int i14 = this.f86912d;
            if (i14 - i11 != 0) {
                int[] iArr = this.f86910b;
                int i15 = i11 + 1;
                C4875q.z0(iArr, iArr, i15, i11, i14);
                Object[] objArr2 = this.f86911c;
                C4875q.B0(objArr2, objArr2, i15, i11, this.f86912d);
            }
            this.f86910b[i11] = i10;
            this.f86911c[i11] = e10;
            this.f86912d++;
        }
        return e11;
    }

    public void r(int i10) {
        X0.p(this, i10);
    }

    public boolean s(int i10, @Nullable Object obj) {
        int iJ = j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.G.g(obj, z(iJ))) {
            return false;
        }
        t(iJ);
        return true;
    }

    public void t(int i10) {
        Object[] objArr = this.f86911c;
        Object obj = objArr[i10];
        Object obj2 = X0.f86914a;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f86909a = true;
        }
    }

    @NotNull
    public String toString() {
        if (y() <= 0) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f86912d * 28);
        sb2.append('{');
        int i10 = this.f86912d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(U6.j.f68738d);
            }
            sb2.append(m(i11));
            sb2.append(SignatureVisitor.INSTANCEOF);
            E eZ = z(i11);
            if (eZ != this) {
                sb2.append(eZ);
            } else {
                sb2.append("(this Map)");
            }
        }
        return C1526d.a(sb2, '}', "buffer.toString()");
    }

    public void u(int i10, int i11) {
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            t(i10);
            i10++;
        }
    }

    @Nullable
    public E v(int i10, E e10) {
        int iJ = j(i10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f86911c;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    public boolean w(int i10, E e10, E e11) {
        int iJ = j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.G.g(this.f86911c[iJ], e10)) {
            return false;
        }
        this.f86911c[iJ] = e11;
        return true;
    }

    public void x(int i10, E e10) {
        if (this.f86909a) {
            X0.z(this);
        }
        this.f86911c[i10] = e10;
    }

    public int y() {
        if (this.f86909a) {
            X0.z(this);
        }
        return this.f86912d;
    }

    public E z(int i10) {
        if (this.f86909a) {
            X0.z(this);
        }
        return (E) this.f86911c[i10];
    }

    @dd.k
    public W0(int i10) {
        if (i10 == 0) {
            this.f86910b = A.a.f11a;
            this.f86911c = A.a.f13c;
        } else {
            int iE = A.a.e(i10);
            this.f86910b = new int[iE];
            this.f86911c = new Object[iE];
        }
    }

    public /* synthetic */ W0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
