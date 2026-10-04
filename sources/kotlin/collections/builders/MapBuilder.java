package kotlin.collections.builders;

import U6.j;
import fd.InterfaceC4421d;
import fd.InterfaceC4424g;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C;
import kotlin.collections.AbstractC4859d;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,752:1\n1#2:753\n*E\n"})
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, InterfaceC4424g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f217560n = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f217561o = -1640531527;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f217562p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f217563q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f217564r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final MapBuilder f217565s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public K[] f217566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public V[] f217567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public int[] f217568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public int[] f217569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f217570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f217571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f217572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f217573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f217574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public kotlin.collections.builders.d<K> f217575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public kotlin.collections.builders.e<V> f217576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public kotlin.collections.builders.c<K, V> f217577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f217578m;

    public static final class a {
        public a() {
        }

        public final int c(int i10) {
            if (i10 < 1) {
                i10 = 1;
            }
            return Integer.highestOneBit(i10 * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        @NotNull
        public final MapBuilder e() {
            return MapBuilder.f217565s;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC4421d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull MapBuilder<K, V> map) {
            super(map);
            G.p(map, "map");
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            int i10 = this.f217583b;
            MapBuilder<K, V> mapBuilder = this.f217582a;
            if (i10 >= mapBuilder.f217571f) {
                throw new NoSuchElementException();
            }
            this.f217583b = i10 + 1;
            this.f217584c = i10;
            c<K, V> cVar = new c<>(mapBuilder, i10);
            g();
            return cVar;
        }

        public final void m(@NotNull StringBuilder sb2) {
            G.p(sb2, "sb");
            if (this.f217583b >= this.f217582a.f217571f) {
                throw new NoSuchElementException();
            }
            int i10 = this.f217583b;
            this.f217583b = i10 + 1;
            this.f217584c = i10;
            MapBuilder<K, V> mapBuilder = this.f217582a;
            K k10 = mapBuilder.f217566a[i10];
            if (k10 == mapBuilder) {
                sb2.append("(this Map)");
            } else {
                sb2.append(k10);
            }
            sb2.append(SignatureVisitor.INSTANCEOF);
            V[] vArr = this.f217582a.f217567b;
            G.m(vArr);
            V v10 = vArr[this.f217584c];
            if (v10 == this.f217582a) {
                sb2.append("(this Map)");
            } else {
                sb2.append(v10);
            }
            g();
        }

        public final int o() {
            if (this.f217583b >= this.f217582a.f217571f) {
                throw new NoSuchElementException();
            }
            int i10 = this.f217583b;
            this.f217583b = i10 + 1;
            this.f217584c = i10;
            K k10 = this.f217582a.f217566a[i10];
            int iHashCode = k10 != null ? k10.hashCode() : 0;
            V[] vArr = this.f217582a.f217567b;
            G.m(vArr);
            V v10 = vArr[this.f217584c];
            int iHashCode2 = iHashCode ^ (v10 != null ? v10.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    public static final class c<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MapBuilder<K, V> f217579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f217581c;

        public c(@NotNull MapBuilder<K, V> map, int i10) {
            G.p(map, "map");
            this.f217579a = map;
            this.f217580b = i10;
            this.f217581c = map.f217573h;
        }

        private final void b() {
            if (this.f217579a.f217573h != this.f217581c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return G.g(entry.getKey(), getKey()) && G.g(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            b();
            return this.f217579a.f217566a[this.f217580b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            b();
            V[] vArr = this.f217579a.f217567b;
            G.m(vArr);
            return vArr[this.f217580b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            b();
            this.f217579a.r();
            V[] vArrP = this.f217579a.p();
            int i10 = this.f217580b;
            V v11 = vArrP[i10];
            vArrP[i10] = v10;
            return v11;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(SignatureVisitor.INSTANCEOF);
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    @V({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,752:1\n1#2:753\n*E\n"})
    public static class d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MapBuilder<K, V> f217582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f217583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f217584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f217585d;

        public d(@NotNull MapBuilder<K, V> map) {
            G.p(map, "map");
            this.f217582a = map;
            this.f217584c = -1;
            this.f217585d = map.f217573h;
            g();
        }

        public final void b() {
            if (this.f217582a.f217573h != this.f217585d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.f217583b;
        }

        public final int e() {
            return this.f217584c;
        }

        @NotNull
        public final MapBuilder<K, V> f() {
            return this.f217582a;
        }

        public final void g() {
            while (this.f217583b < this.f217582a.f217571f) {
                int[] iArr = this.f217582a.f217568c;
                int i10 = this.f217583b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f217583b = i10 + 1;
                }
            }
        }

        public final void h(int i10) {
            this.f217583b = i10;
        }

        public final boolean hasNext() {
            return this.f217583b < this.f217582a.f217571f;
        }

        public final void i(int i10) {
            this.f217584c = i10;
        }

        public final void remove() {
            b();
            if (this.f217584c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f217582a.r();
            this.f217582a.R(this.f217584c);
            this.f217584c = -1;
            this.f217585d = this.f217582a.f217573h;
        }
    }

    public static final class e<K, V> extends d<K, V> implements Iterator<K>, InterfaceC4421d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull MapBuilder<K, V> map) {
            super(map);
            G.p(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            int i10 = this.f217583b;
            MapBuilder<K, V> mapBuilder = this.f217582a;
            if (i10 >= mapBuilder.f217571f) {
                throw new NoSuchElementException();
            }
            this.f217583b = i10 + 1;
            this.f217584c = i10;
            K k10 = mapBuilder.f217566a[i10];
            g();
            return k10;
        }
    }

    public static final class f<K, V> extends d<K, V> implements Iterator<V>, InterfaceC4421d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull MapBuilder<K, V> map) {
            super(map);
            G.p(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            int i10 = this.f217583b;
            MapBuilder<K, V> mapBuilder = this.f217582a;
            if (i10 >= mapBuilder.f217571f) {
                throw new NoSuchElementException();
            }
            this.f217583b = i10 + 1;
            this.f217584c = i10;
            V[] vArr = mapBuilder.f217567b;
            G.m(vArr);
            V v10 = vArr[this.f217584c];
            g();
            return v10;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f217578m = true;
        f217565s = mapBuilder;
    }

    public MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f217566a = kArr;
        this.f217567b = vArr;
        this.f217568c = iArr;
        this.f217569d = iArr2;
        this.f217570e = i10;
        this.f217571f = i11;
        this.f217572g = f217560n.d(iArr2.length);
    }

    private final void O() {
        this.f217573h++;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f217578m) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void x(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        K[] kArr = this.f217566a;
        if (i10 > kArr.length) {
            int iE = AbstractC4859d.f217603a.e(kArr.length, i10);
            this.f217566a = (K[]) kotlin.collections.builders.b.e(this.f217566a, iE);
            V[] vArr = this.f217567b;
            this.f217567b = vArr != null ? (V[]) kotlin.collections.builders.b.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f217568c, iE);
            G.o(iArrCopyOf, "copyOf(...)");
            this.f217568c = iArrCopyOf;
            int iC = f217560n.c(iE);
            if (iC > this.f217569d.length) {
                P(iC);
            }
        }
    }

    private final void z(int i10) {
        if (V(i10)) {
            t(true);
        } else {
            x(this.f217571f + i10);
        }
    }

    @NotNull
    public final b<K, V> A() {
        return new b<>(this);
    }

    public final int B(K k10) {
        int I10 = I(k10);
        int i10 = this.f217570e;
        while (true) {
            int i11 = this.f217569d[I10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (G.g(this.f217566a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            I10 = I10 == 0 ? this.f217569d.length - 1 : I10 - 1;
        }
    }

    public final int C(V v10) {
        int i10 = this.f217571f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f217568c[i10] >= 0) {
                V[] vArr = this.f217567b;
                G.m(vArr);
                if (G.g(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public final int D() {
        return this.f217566a.length;
    }

    @NotNull
    public Set<Map.Entry<K, V>> E() {
        kotlin.collections.builders.c<K, V> cVar = this.f217577l;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<K, V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.f217577l = cVar2;
        return cVar2;
    }

    public final int F() {
        return this.f217569d.length;
    }

    @NotNull
    public Set<K> G() {
        kotlin.collections.builders.d<K> dVar = this.f217575j;
        if (dVar != null) {
            return dVar;
        }
        kotlin.collections.builders.d<K> dVar2 = new kotlin.collections.builders.d<>(this);
        this.f217575j = dVar2;
        return dVar2;
    }

    @NotNull
    public Collection<V> H() {
        kotlin.collections.builders.e<V> eVar = this.f217576k;
        if (eVar != null) {
            return eVar;
        }
        kotlin.collections.builders.e<V> eVar2 = new kotlin.collections.builders.e<>(this);
        this.f217576k = eVar2;
        return eVar2;
    }

    public final int I(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f217572g;
    }

    public final boolean J() {
        return this.f217578m;
    }

    @NotNull
    public final e<K, V> K() {
        return new e<>(this);
    }

    @C
    public final boolean L(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        z(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (M(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean M(Map.Entry<? extends K, ? extends V> entry) {
        int iO = o(entry.getKey());
        V[] vArrP = p();
        if (iO >= 0) {
            vArrP[iO] = entry.getValue();
            return true;
        }
        int i10 = (-iO) - 1;
        if (G.g(entry.getValue(), vArrP[i10])) {
            return false;
        }
        vArrP[i10] = entry.getValue();
        return true;
    }

    public final boolean N(int i10) {
        int I10 = I(this.f217566a[i10]);
        int i11 = this.f217570e;
        while (true) {
            int[] iArr = this.f217569d;
            if (iArr[I10] == 0) {
                iArr[I10] = i10 + 1;
                this.f217568c[i10] = I10;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            I10 = I10 == 0 ? iArr.length - 1 : I10 - 1;
        }
    }

    public final void P(int i10) {
        O();
        int i11 = 0;
        if (this.f217571f > this.f217574i) {
            t(false);
        }
        this.f217569d = new int[i10];
        this.f217572g = f217560n.d(i10);
        while (i11 < this.f217571f) {
            int i12 = i11 + 1;
            if (!N(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    public final boolean Q(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        G.p(entry, "entry");
        r();
        int iB = B(entry.getKey());
        if (iB < 0) {
            return false;
        }
        V[] vArr = this.f217567b;
        G.m(vArr);
        if (!G.g(vArr[iB], entry.getValue())) {
            return false;
        }
        R(iB);
        return true;
    }

    public final void R(int i10) {
        kotlin.collections.builders.b.f(this.f217566a, i10);
        V[] vArr = this.f217567b;
        if (vArr != null) {
            vArr[i10] = null;
        }
        S(this.f217568c[i10]);
        this.f217568c[i10] = -1;
        this.f217574i--;
        O();
    }

    public final void S(int i10) {
        int i11 = this.f217570e * 2;
        int length = this.f217569d.length / 2;
        if (i11 > length) {
            i11 = length;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = i10;
        do {
            i10 = i10 == 0 ? this.f217569d.length - 1 : i10 - 1;
            i13++;
            if (i13 > this.f217570e) {
                this.f217569d[i14] = 0;
                return;
            }
            int[] iArr = this.f217569d;
            int i15 = iArr[i10];
            if (i15 == 0) {
                iArr[i14] = 0;
                return;
            }
            if (i15 < 0) {
                iArr[i14] = -1;
            } else {
                int i16 = i15 - 1;
                int I10 = I(this.f217566a[i16]) - i10;
                int[] iArr2 = this.f217569d;
                if ((I10 & (iArr2.length - 1)) >= i13) {
                    iArr2[i14] = i15;
                    this.f217568c[i16] = i14;
                }
                i12--;
            }
            i14 = i10;
            i13 = 0;
            i12--;
        } while (i12 >= 0);
        this.f217569d[i14] = -1;
    }

    public final boolean T(K k10) {
        r();
        int iB = B(k10);
        if (iB < 0) {
            return false;
        }
        R(iB);
        return true;
    }

    public final boolean U(V v10) {
        r();
        int iC = C(v10);
        if (iC < 0) {
            return false;
        }
        R(iC);
        return true;
    }

    public final boolean V(int i10) {
        K[] kArr = this.f217566a;
        int length = kArr.length;
        int i11 = this.f217571f;
        int i12 = length - i11;
        int i13 = i11 - this.f217574i;
        return i12 < i10 && i12 + i13 >= i10 && i13 >= kArr.length / 4;
    }

    @NotNull
    public final f<K, V> W() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        r();
        int i10 = this.f217571f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f217568c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f217569d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        kotlin.collections.builders.b.g(this.f217566a, 0, this.f217571f);
        V[] vArr = this.f217567b;
        if (vArr != null) {
            kotlin.collections.builders.b.g(vArr, 0, this.f217571f);
        }
        this.f217574i = 0;
        this.f217571f = 0;
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return B(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return C(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return E();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && w((Map) obj);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int iB = B(obj);
        if (iB < 0) {
            return null;
        }
        V[] vArr = this.f217567b;
        G.m(vArr);
        return vArr[iB];
    }

    public int getSize() {
        return this.f217574i;
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVar = new b(this);
        int iO = 0;
        while (bVar.hasNext()) {
            iO += bVar.o();
        }
        return iO;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f217574i == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return G();
    }

    public final int o(K k10) {
        r();
        while (true) {
            int I10 = I(k10);
            int i10 = this.f217570e * 2;
            int length = this.f217569d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f217569d;
                int i12 = iArr[I10];
                if (i12 <= 0) {
                    int i13 = this.f217571f;
                    K[] kArr = this.f217566a;
                    if (i13 < kArr.length) {
                        int i14 = i13 + 1;
                        this.f217571f = i14;
                        kArr[i13] = k10;
                        this.f217568c[i13] = I10;
                        iArr[I10] = i14;
                        this.f217574i++;
                        O();
                        if (i11 > this.f217570e) {
                            this.f217570e = i11;
                        }
                        return i13;
                    }
                    z(1);
                } else {
                    if (G.g(this.f217566a[i12 - 1], k10)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        P(this.f217569d.length * 2);
                        break;
                    }
                    I10 = I10 == 0 ? this.f217569d.length - 1 : I10 - 1;
                }
            }
        }
    }

    public final V[] p() {
        V[] vArr = this.f217567b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.b.d(this.f217566a.length);
        this.f217567b = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        r();
        int iO = o(k10);
        V[] vArrP = p();
        if (iO >= 0) {
            vArrP[iO] = v10;
            return null;
        }
        int i10 = (-iO) - 1;
        V v11 = vArrP[i10];
        vArrP[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        G.p(from, "from");
        r();
        L(from.entrySet());
    }

    @NotNull
    public final Map<K, V> q() {
        r();
        this.f217578m = true;
        if (this.f217574i > 0) {
            return this;
        }
        MapBuilder mapBuilder = f217565s;
        G.n(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void r() {
        if (this.f217578m) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        r();
        int iB = B(obj);
        if (iB < 0) {
            return null;
        }
        V[] vArr = this.f217567b;
        G.m(vArr);
        V v10 = vArr[iB];
        R(iB);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f217574i;
    }

    public final void t(boolean z10) {
        int i10;
        V[] vArr = this.f217567b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f217571f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f217568c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.f217566a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f217569d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        kotlin.collections.builders.b.g(this.f217566a, i12, i10);
        if (vArr != null) {
            kotlin.collections.builders.b.g(vArr, i12, this.f217571f);
        }
        this.f217571f = i12;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f217574i * 3) + 2);
        sb2.append("{");
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(j.f68738d);
            }
            bVar.m(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        G.o(string, "toString(...)");
        return string;
    }

    public final boolean u(@NotNull Collection<?> m10) {
        G.p(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!v((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean v(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        G.p(entry, "entry");
        int iB = B(entry.getKey());
        if (iB < 0) {
            return false;
        }
        V[] vArr = this.f217567b;
        G.m(vArr);
        return G.g(vArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return H();
    }

    public final boolean w(Map<?, ?> map) {
        return this.f217574i == map.size() && u(map.entrySet());
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(kotlin.collections.builders.b.d(i10), null, new int[i10], new int[f217560n.c(i10)], 2, 0);
    }
}
