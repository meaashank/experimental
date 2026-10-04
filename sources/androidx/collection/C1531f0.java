package androidx.collection;

import java.util.Arrays;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.collection.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 3 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,255:1\n244#2:256\n257#2,6:257\n249#2,14:263\n268#2,8:277\n268#2,8:285\n279#2,9:293\n292#2,5:302\n300#2,8:307\n316#2,9:315\n350#2,12:324\n329#2,18:336\n364#2,26:354\n393#2,5:380\n401#2,5:385\n410#2,2:390\n329#2,18:392\n413#2:410\n417#2:411\n421#2:412\n422#2:416\n425#2,2:418\n329#2,18:420\n428#2:438\n433#2:439\n434#2:443\n437#2,2:445\n329#2,18:447\n442#2:465\n447#2:466\n448#2:470\n451#2,2:472\n329#2,18:474\n454#2,2:492\n459#2,2:494\n329#2,18:496\n462#2:514\n467#2,2:515\n329#2,18:517\n470#2,6:535\n480#2:541\n485#2:542\n490#2,8:543\n501#2,6:551\n329#2,18:557\n508#2,10:575\n521#2,21:585\n46#3,3:413\n50#3:417\n46#3,3:440\n50#3:444\n46#3,3:467\n50#3:471\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412\n192#1:416\n192#1:418,2\n192#1:420,18\n192#1:438\n204#1:439\n204#1:443\n204#1:445,2\n204#1:447,18\n204#1:465\n212#1:466\n212#1:470\n212#1:472,2\n212#1:474,18\n212#1:492,2\n219#1:494,2\n219#1:496,18\n219#1:514\n228#1:515,2\n228#1:517,18\n228#1:535,6\n231#1:541\n234#1:542\n239#1:543,8\n245#1:551,6\n245#1:557,18\n245#1:575,10\n253#1:585,21\n192#1:413,3\n192#1:417\n204#1:440,3\n204#1:444\n212#1:467,3\n212#1:471\n*E\n"})
public class C1531f0<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    public /* synthetic */ boolean f86955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public /* synthetic */ long[] f86956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public /* synthetic */ Object[] f86957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public /* synthetic */ int f86958d;

    @dd.k
    public C1531f0() {
        this(0, 1, null);
    }

    public void a(long j10, E e10) {
        int i10 = this.f86958d;
        if (i10 != 0 && j10 <= this.f86956b[i10 - 1]) {
            m(j10, e10);
            return;
        }
        if (this.f86955a) {
            long[] jArr = this.f86956b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f86957c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != C1533g0.f86960a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f86955a = false;
                this.f86958d = i11;
            }
        }
        int i13 = this.f86958d;
        if (i13 >= this.f86956b.length) {
            int iF = A.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f86956b, iF);
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f86956b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86957c, iF);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86957c = objArrCopyOf;
        }
        this.f86956b[i13] = j10;
        this.f86957c[i13] = e10;
        this.f86958d = i13 + 1;
    }

    public void b() {
        int i10 = this.f86958d;
        Object[] objArr = this.f86957c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f86958d = 0;
        this.f86955a = false;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1531f0<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.G.n(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1531f0<E> c1531f0 = (C1531f0) objClone;
        c1531f0.f86956b = (long[]) this.f86956b.clone();
        c1531f0.f86957c = (Object[]) this.f86957c.clone();
        return c1531f0;
    }

    public boolean d(long j10) {
        return i(j10) >= 0;
    }

    public boolean e(E e10) {
        return j(e10) >= 0;
    }

    @InterfaceC4982o(message = "Alias for `remove(key)`.", replaceWith = @InterfaceC4852c0(expression = "remove(key)", imports = {}))
    public void f(long j10) {
        int iB = A.a.b(this.f86956b, this.f86958d, j10);
        if (iB >= 0) {
            Object[] objArr = this.f86957c;
            Object obj = objArr[iB];
            Object obj2 = C1533g0.f86960a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f86955a = true;
            }
        }
    }

    @Nullable
    public E g(long j10) {
        E e10;
        int iB = A.a.b(this.f86956b, this.f86958d, j10);
        if (iB < 0 || (e10 = (E) this.f86957c[iB]) == C1533g0.f86960a) {
            return null;
        }
        return e10;
    }

    public E h(long j10, E e10) {
        E e11;
        int iB = A.a.b(this.f86956b, this.f86958d, j10);
        return (iB < 0 || (e11 = (E) this.f86957c[iB]) == C1533g0.f86960a) ? e10 : e11;
    }

    public int i(long j10) {
        if (this.f86955a) {
            int i10 = this.f86958d;
            long[] jArr = this.f86956b;
            Object[] objArr = this.f86957c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C1533g0.f86960a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f86955a = false;
            this.f86958d = i11;
        }
        return A.a.b(this.f86956b, this.f86958d, j10);
    }

    public int j(E e10) {
        if (this.f86955a) {
            int i10 = this.f86958d;
            long[] jArr = this.f86956b;
            Object[] objArr = this.f86957c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C1533g0.f86960a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f86955a = false;
            this.f86958d = i11;
        }
        int i13 = this.f86958d;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f86957c[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public boolean k() {
        return w() == 0;
    }

    public long l(int i10) {
        if (!(i10 >= 0 && i10 < this.f86958d)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f86955a) {
            int i11 = this.f86958d;
            long[] jArr = this.f86956b;
            Object[] objArr = this.f86957c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C1533g0.f86960a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f86955a = false;
            this.f86958d = i12;
        }
        return this.f86956b[i10];
    }

    public void m(long j10, E e10) {
        int iB = A.a.b(this.f86956b, this.f86958d, j10);
        if (iB >= 0) {
            this.f86957c[iB] = e10;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f86958d;
        if (i10 < i11) {
            Object[] objArr = this.f86957c;
            if (objArr[i10] == C1533g0.f86960a) {
                this.f86956b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f86955a) {
            long[] jArr = this.f86956b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f86957c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr2[i13];
                    if (obj != C1533g0.f86960a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f86955a = false;
                this.f86958d = i12;
                i10 = ~A.a.b(this.f86956b, i12, j10);
            }
        }
        int i14 = this.f86958d;
        if (i14 >= this.f86956b.length) {
            int iF = A.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f86956b, iF);
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f86956b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86957c, iF);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86957c = objArrCopyOf;
        }
        int i15 = this.f86958d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f86956b;
            int i16 = i10 + 1;
            C4875q.A0(jArr2, jArr2, i16, i10, i15);
            Object[] objArr3 = this.f86957c;
            C4875q.B0(objArr3, objArr3, i16, i10, this.f86958d);
        }
        this.f86956b[i10] = j10;
        this.f86957c[i10] = e10;
        this.f86958d++;
    }

    public void n(@NotNull C1531f0<? extends E> other) {
        kotlin.jvm.internal.G.p(other, "other");
        int iW = other.w();
        for (int i10 = 0; i10 < iW; i10++) {
            m(other.l(i10), other.x(i10));
        }
    }

    @Nullable
    public E p(long j10, E e10) {
        E eG = g(j10);
        if (eG == null) {
            m(j10, e10);
        }
        return eG;
    }

    public void q(long j10) {
        int iB = A.a.b(this.f86956b, this.f86958d, j10);
        if (iB >= 0) {
            Object[] objArr = this.f86957c;
            Object obj = objArr[iB];
            Object obj2 = C1533g0.f86960a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f86955a = true;
            }
        }
    }

    public boolean r(long j10, E e10) {
        int i10 = i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.G.g(e10, x(i10))) {
            return false;
        }
        s(i10);
        return true;
    }

    public void s(int i10) {
        Object[] objArr = this.f86957c;
        Object obj = objArr[i10];
        Object obj2 = C1533g0.f86960a;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f86955a = true;
        }
    }

    @Nullable
    public E t(long j10, E e10) {
        int i10 = i(j10);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = this.f86957c;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    @NotNull
    public String toString() {
        if (w() <= 0) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f86958d * 28);
        sb2.append('{');
        int i10 = this.f86958d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(U6.j.f68738d);
            }
            sb2.append(l(i11));
            sb2.append(SignatureVisitor.INSTANCEOF);
            E eX = x(i11);
            if (eX != sb2) {
                sb2.append(eX);
            } else {
                sb2.append("(this Map)");
            }
        }
        return C1526d.a(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public boolean u(long j10, E e10, E e11) {
        int i10 = i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.G.g(this.f86957c[i10], e10)) {
            return false;
        }
        this.f86957c[i10] = e11;
        return true;
    }

    public void v(int i10, E e10) {
        if (!(i10 >= 0 && i10 < this.f86958d)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f86955a) {
            int i11 = this.f86958d;
            long[] jArr = this.f86956b;
            Object[] objArr = this.f86957c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C1533g0.f86960a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f86955a = false;
            this.f86958d = i12;
        }
        this.f86957c[i10] = e10;
    }

    public int w() {
        if (this.f86955a) {
            int i10 = this.f86958d;
            long[] jArr = this.f86956b;
            Object[] objArr = this.f86957c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C1533g0.f86960a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f86955a = false;
            this.f86958d = i11;
        }
        return this.f86958d;
    }

    public E x(int i10) {
        if (!(i10 >= 0 && i10 < this.f86958d)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f86955a) {
            int i11 = this.f86958d;
            long[] jArr = this.f86956b;
            Object[] objArr = this.f86957c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C1533g0.f86960a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f86955a = false;
            this.f86958d = i12;
        }
        return (E) this.f86957c[i10];
    }

    @dd.k
    public C1531f0(int i10) {
        if (i10 == 0) {
            this.f86956b = A.a.f12b;
            this.f86957c = A.a.f13c;
        } else {
            int iF = A.a.f(i10);
            this.f86956b = new long[iF];
            this.f86957c = new Object[iF];
        }
    }

    public /* synthetic */ C1531f0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
