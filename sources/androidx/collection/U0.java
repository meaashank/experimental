package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,770:1\n298#1,5:771\n298#1,5:776\n46#2,5:781\n46#2,5:786\n46#2,5:791\n46#2,5:797\n1#3:796\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n277#1:771,5\n292#1:776,5\n314#1:781,5\n330#1:786,5\n347#1:791,5\n516#1:797,5\n*E\n"})
public class U0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f86899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f86900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86901c;

    @dd.k
    public U0() {
        this(0, 1, null);
    }

    @dd.j(name = "__restricted$indexOfValue")
    public final int a(V v10) {
        int i10 = this.f86901c * 2;
        Object[] objArr = this.f86900b;
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

    public void b(int i10) {
        int i11 = this.f86901c;
        int[] iArr = this.f86899a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86899a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86900b, i10 * 2);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86900b = objArrCopyOf;
        }
        if (this.f86901c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f86901c > 0) {
            this.f86899a = A.a.f11a;
            this.f86900b = A.a.f13c;
            this.f86901c = 0;
        }
        if (this.f86901c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return f(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V> T d(Object obj, T t10) {
        int iF = f(obj);
        return iF >= 0 ? (T) this.f86900b[(iF << 1) + 1] : t10;
    }

    public final int e(K k10, int i10) {
        int i11 = this.f86901c;
        if (i11 == 0) {
            return -1;
        }
        int iA = A.a.a(this.f86899a, i11, i10);
        if (iA < 0 || kotlin.jvm.internal.G.g(k10, this.f86900b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f86899a[i12] == i10) {
            if (kotlin.jvm.internal.G.g(k10, this.f86900b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f86899a[i13] == i10; i13--) {
            if (kotlin.jvm.internal.G.g(k10, this.f86900b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        int i11;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof U0) {
                if (size() == ((U0) obj).size()) {
                    U0 u02 = (U0) obj;
                    int i12 = this.f86901c;
                    for (0; i11 < i12; i11 + 1) {
                        K kI = i(i11);
                        V vO = o(i11);
                        Object obj2 = u02.get(kI);
                        if (vO == null) {
                            i11 = (obj2 == null && u02.containsKey(kI)) ? i11 + 1 : 0;
                        } else if (vO.equals(obj2)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Map) && size() == ((Map) obj).size()) {
                int i13 = this.f86901c;
                for (0; i10 < i13; i10 + 1) {
                    K kI2 = i(i10);
                    V vO2 = o(i10);
                    Object obj3 = ((Map) obj).get(kI2);
                    if (vO2 == null) {
                        i10 = (obj3 == null && ((Map) obj).containsKey(kI2)) ? i10 + 1 : 0;
                    } else if (vO2.equals(obj3)) {
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int f(K k10) {
        return k10 == null ? h() : e(k10, k10.hashCode());
    }

    @Nullable
    public V get(K k10) {
        int iF = f(k10);
        if (iF >= 0) {
            return (V) this.f86900b[(iF << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@Nullable Object obj, V v10) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.f86900b[(iF << 1) + 1] : v10;
    }

    public final int h() {
        int i10 = this.f86901c;
        if (i10 == 0) {
            return -1;
        }
        int iA = A.a.a(this.f86899a, i10, 0);
        if (iA < 0 || this.f86900b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f86899a[i11] == 0) {
            if (this.f86900b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f86899a[i12] == 0; i12--) {
            if (this.f86900b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public int hashCode() {
        int[] iArr = this.f86899a;
        Object[] objArr = this.f86900b;
        int i10 = this.f86901c;
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

    public K i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f86901c) {
            z10 = true;
        }
        if (z10) {
            return (K) this.f86900b[i10 << 1];
        }
        A.f.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public boolean isEmpty() {
        return this.f86901c <= 0;
    }

    public void j(@NotNull U0<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "map");
        int i10 = map.f86901c;
        b(this.f86901c + i10);
        if (this.f86901c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.i(i11), map.o(i11));
            }
        } else if (i10 > 0) {
            C4875q.z0(map.f86899a, this.f86899a, 0, 0, i10);
            C4875q.B0(map.f86900b, this.f86900b, 0, 0, i10 << 1);
            this.f86901c = i10;
        }
    }

    public V l(int i10) {
        if (!(i10 >= 0 && i10 < this.f86901c)) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f86900b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f86901c;
        if (i12 <= 1) {
            clear();
            return v10;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f86899a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                C4875q.z0(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f86900b;
                C4875q.B0(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f86900b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86899a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86900b, i16 << 1);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86900b = objArrCopyOf;
            if (i12 != this.f86901c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                C4875q.z0(iArr, this.f86899a, 0, 0, i10);
                C4875q.B0(objArr, this.f86900b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                C4875q.z0(iArr, this.f86899a, i10, i17, i12);
                C4875q.B0(objArr, this.f86900b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f86901c) {
            throw new ConcurrentModificationException();
        }
        this.f86901c = i13;
        return v10;
    }

    public V m(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f86901c) {
            z10 = true;
        }
        if (!z10) {
            A.f.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f86900b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V o(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f86901c) {
            z10 = true;
        }
        if (z10) {
            return (V) this.f86900b[(i10 << 1) + 1];
        }
        A.f.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    @Nullable
    public V put(K k10, V v10) {
        int i10 = this.f86901c;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iE = k10 != null ? e(k10, iHashCode) : h();
        if (iE >= 0) {
            int i11 = (iE << 1) + 1;
            Object[] objArr = this.f86900b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iE;
        int[] iArr = this.f86899a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86899a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f86900b, i13 << 1);
            kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86900b = objArrCopyOf;
            if (i10 != this.f86901c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f86899a;
            int i14 = i12 + 1;
            C4875q.z0(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f86900b;
            C4875q.B0(objArr2, objArr2, i14 << 1, i12 << 1, this.f86901c << 1);
        }
        int i15 = this.f86901c;
        if (i10 == i15) {
            int[] iArr3 = this.f86899a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f86900b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f86901c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    @Nullable
    public V remove(K k10) {
        int iF = f(k10);
        if (iF >= 0) {
            return l(iF);
        }
        return null;
    }

    @Nullable
    public V replace(K k10, V v10) {
        int iF = f(k10);
        if (iF >= 0) {
            return m(iF, v10);
        }
        return null;
    }

    public int size() {
        return this.f86901c;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f86901c * 28);
        sb2.append('{');
        int i10 = this.f86901c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(U6.j.f68738d);
            }
            K kI = i(i11);
            if (kI != sb2) {
                sb2.append(kI);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(SignatureVisitor.INSTANCEOF);
            V vO = o(i11);
            if (vO != sb2) {
                sb2.append(vO);
            } else {
                sb2.append("(this Map)");
            }
        }
        return C1526d.a(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    @dd.k
    public U0(int i10) {
        this.f86899a = i10 == 0 ? A.a.f11a : new int[i10];
        this.f86900b = i10 == 0 ? A.a.f13c : new Object[i10 << 1];
    }

    public boolean remove(K k10, V v10) {
        int iF = f(k10);
        if (iF < 0 || !kotlin.jvm.internal.G.g(v10, o(iF))) {
            return false;
        }
        l(iF);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iF = f(k10);
        if (iF < 0 || !kotlin.jvm.internal.G.g(v10, o(iF))) {
            return false;
        }
        m(iF, v11);
        return true;
    }

    public /* synthetic */ U0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public U0(@Nullable U0<? extends K, ? extends V> u02) {
        this(0, 1, null);
        if (u02 != null) {
            j(u02);
        }
    }
}
