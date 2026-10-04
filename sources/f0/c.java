package f0;

import U6.j;
import X3.i;
import androidx.compose.runtime.internal.r;
import dd.k;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class c<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f200373d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f200374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f200375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f200376c;

    @k
    public c() {
        this(0, 1, null);
    }

    public final void a() {
        if (this.f200376c > 0) {
            this.f200374a = C4382a.f200360a;
            this.f200375b = C4382a.f200361b;
            this.f200376c = 0;
        }
        if (this.f200376c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean b(K k10) {
        return i(k10) >= 0;
    }

    public final boolean c(V v10) {
        return k(v10) >= 0;
    }

    public final void d(int i10) {
        int i11 = this.f200376c;
        int[] iArr = this.f200374a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f200374a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f200375b, i10 << 1);
            G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f200375b = objArrCopyOf;
        }
        if (this.f200376c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Nullable
    public final V e(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            return (V) this.f200375b[(i10 << 1) + 1];
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f200376c;
                if (i10 != cVar.f200376c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    K kM = m(i11);
                    V vZ = z(i11);
                    Object objE = cVar.e(kM);
                    if (vZ == null) {
                        if (objE != null || !cVar.b(kM)) {
                            return false;
                        }
                    } else if (!vZ.equals(objE)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f200376c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f200376c;
            for (int i13 = 0; i13 < i12; i13++) {
                K kM2 = m(i13);
                V vZ2 = z(i13);
                Object obj2 = ((Map) obj).get(kM2);
                if (vZ2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(kM2)) {
                        return false;
                    }
                } else if (!vZ2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final V f(K k10, V v10) {
        int i10 = i(k10);
        return i10 >= 0 ? (V) this.f200375b[(i10 << 1) + 1] : v10;
    }

    public final int g() {
        return this.f200376c;
    }

    public final int h(@NotNull Object obj, int i10) {
        int i11 = this.f200376c;
        if (i11 == 0) {
            return -1;
        }
        int iA = C4382a.a(this.f200374a, i11, i10);
        if (iA < 0 || G.g(obj, this.f200375b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f200374a[i12] == i10) {
            if (G.g(obj, this.f200375b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f200374a[i13] == i10; i13--) {
            if (G.g(obj, this.f200375b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public int hashCode() {
        int[] iArr = this.f200374a;
        Object[] objArr = this.f200375b;
        int i10 = this.f200376c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final int i(@Nullable Object obj) {
        return obj == null ? j() : h(obj, obj.hashCode());
    }

    public final int j() {
        int i10 = this.f200376c;
        if (i10 == 0) {
            return -1;
        }
        int iA = C4382a.a(this.f200374a, i10, 0);
        if (iA < 0 || this.f200375b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f200374a[i11] == 0) {
            if (this.f200375b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f200374a[i12] == 0; i12--) {
            if (this.f200375b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int k(V v10) {
        int i10 = this.f200376c << 1;
        Object[] objArr = this.f200375b;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (v10.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final boolean l() {
        return this.f200376c <= 0;
    }

    public final K m(int i10) {
        return (K) this.f200375b[i10 << 1];
    }

    @Nullable
    public final V n(K k10, V v10) {
        int iHashCode;
        int iH;
        int i10 = this.f200376c;
        if (k10 == null) {
            iH = j();
            iHashCode = 0;
        } else {
            iHashCode = k10.hashCode();
            iH = h(k10, iHashCode);
        }
        if (iH >= 0) {
            int i11 = (iH << 1) + 1;
            Object[] objArr = this.f200375b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iH;
        int[] iArr = this.f200374a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f200374a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f200375b, i13 << 1);
            G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f200375b = objArrCopyOf;
            if (i10 != this.f200376c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f200374a;
            int i14 = i12 + 1;
            C4875q.z0(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f200375b;
            C4875q.B0(objArr2, objArr2, i14 << 1, i12 << 1, this.f200376c << 1);
        }
        int i15 = this.f200376c;
        if (i10 == i15) {
            int[] iArr3 = this.f200374a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f200375b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f200376c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void o(@NotNull c<? extends K, ? extends V> cVar) {
        int i10 = cVar.f200376c;
        d(this.f200376c + i10);
        if (this.f200376c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                n(cVar.m(i11), cVar.z(i11));
            }
        } else if (i10 > 0) {
            C4875q.z0(cVar.f200374a, this.f200374a, 0, 0, i10);
            C4875q.B0(cVar.f200375b, this.f200375b, 0, 0, i10 << 1);
            this.f200376c = i10;
        }
    }

    @Nullable
    public final V p(K k10, V v10) {
        V vE = e(k10);
        return vE == null ? n(k10, v10) : vE;
    }

    @Nullable
    public final V q(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            return s(i10);
        }
        return null;
    }

    public final boolean r(K k10, V v10) {
        int i10 = i(k10);
        if (i10 < 0 || !G.g(v10, z(i10))) {
            return false;
        }
        s(i10);
        return true;
    }

    @Nullable
    public final V s(int i10) {
        Object[] objArr = this.f200375b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f200376c;
        if (i12 <= 1) {
            a();
            return v10;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f200374a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                C4875q.z0(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f200375b;
                C4875q.B0(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f200375b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArr2 = new int[i16];
            this.f200374a = iArr2;
            this.f200375b = new Object[i16 << 1];
            if (i10 > 0) {
                C4875q.z0(iArr, iArr2, 0, 0, i10);
                C4875q.B0(objArr, this.f200375b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                C4875q.z0(iArr, this.f200374a, i10, i17, i12);
                C4875q.B0(objArr, this.f200375b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f200376c) {
            throw new ConcurrentModificationException();
        }
        this.f200376c = i13;
        return v10;
    }

    @Nullable
    public final V t(K k10, V v10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            return v(i10, v10);
        }
        return null;
    }

    @NotNull
    public String toString() {
        if (l()) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f200376c * 28);
        sb2.append('{');
        int i10 = this.f200376c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(j.f68738d);
            }
            K kM = m(i11);
            if (kM != this) {
                sb2.append(kM);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(SignatureVisitor.INSTANCEOF);
            V vZ = z(i11);
            if (vZ != this) {
                sb2.append(vZ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(K k10, V v10, V v11) {
        int i10 = i(k10);
        if (i10 < 0 || z(i10) != v10) {
            return false;
        }
        v(i10, v11);
        return true;
    }

    public final V v(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f200375b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public final void w(int i10) {
        this.f200376c = i10;
    }

    @dd.j(name = i.f76775k)
    public final int x() {
        return this.f200376c;
    }

    public final V z(int i10) {
        return (V) this.f200375b[(i10 << 1) + 1];
    }

    @k
    public c(int i10) {
        if (i10 == 0) {
            this.f200374a = C4382a.f200360a;
            this.f200375b = C4382a.f200361b;
        } else {
            this.f200374a = new int[i10];
            this.f200375b = new Object[i10 << 1];
        }
        this.f200376c = 0;
    }

    public /* synthetic */ c(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Nullable c<K, V> cVar) {
        this(0, 1, null);
        if (cVar != 0) {
            o(cVar);
        }
    }

    public static /* synthetic */ void y() {
    }
}
