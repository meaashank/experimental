package androidx.collection;

import ed.InterfaceC4376a;
import fd.InterfaceC4424g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.Pair;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1980:1\n46#2,5:1981\n1804#3,6:1986\n1956#3:2005\n1820#3:2009\n1714#3,3:2022\n1728#3:2026\n1724#3:2029\n1925#3,3:2034\n1939#3,3:2038\n1865#3:2042\n1853#3:2044\n1847#3:2045\n1860#3:2050\n1948#3:2052\n1714#3,3:2062\n1728#3:2066\n1724#3:2069\n1925#3,3:2074\n1939#3,3:2078\n1865#3:2082\n1853#3:2084\n1847#3:2085\n1860#3:2090\n1948#3:2092\n1956#3:2107\n1820#3:2111\n1956#3:2132\n1820#3:2136\n1780#3:2153\n1804#3,6:2154\n1792#3:2160\n1791#3,4:2161\n1804#3,6:2165\n1714#3,3:2171\n1724#3:2174\n1728#3:2175\n1925#3,3:2176\n1939#3,3:2179\n1865#3:2182\n1853#3:2183\n1847#3:2184\n1860#3:2185\n1948#3:2186\n1814#3:2187\n1770#3:2188\n1812#3:2189\n1770#3:2190\n1780#3:2191\n1804#3,6:2192\n1792#3:2198\n1791#3,4:2199\n1925#3,3:2203\n1956#3:2206\n1847#3:2207\n1770#3:2208\n1714#3,3:2209\n1724#3:2212\n1728#3:2213\n1804#3,6:2214\n1770#3:2220\n1728#3:2221\n1804#3,6:2222\n1804#3,6:2228\n1728#3:2234\n1804#3,6:2235\n1817#3:2241\n1770#3:2242\n1714#3,3:2243\n1724#3:2246\n1728#3:2247\n1780#3:2248\n1804#3,6:2249\n1792#3:2255\n1791#3,4:2256\n1804#3,6:2260\n1804#3,6:2266\n1#4:1992\n215#5,2:1993\n393#6,4:1995\n365#6,6:1999\n375#6,3:2006\n378#6,2:2010\n398#6,2:2012\n381#6,6:2014\n400#6:2020\n635#6:2021\n636#6:2025\n638#6,2:2027\n640#6,4:2030\n644#6:2037\n645#6:2041\n646#6:2043\n647#6,4:2046\n653#6:2051\n654#6,8:2053\n635#6:2061\n636#6:2065\n638#6,2:2067\n640#6,4:2070\n644#6:2077\n645#6:2081\n646#6:2083\n647#6,4:2086\n653#6:2091\n654#6,8:2093\n365#6,6:2101\n375#6,3:2108\n378#6,9:2112\n228#7,4:2121\n198#7,7:2125\n209#7,3:2133\n212#7,9:2137\n232#7:2146\n305#8,6:2147\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n822#1:1981,5\n850#1:1986,6\n974#1:2005\n974#1:2009\n1023#1:2022,3\n1023#1:2026\n1023#1:2029\n1023#1:2034,3\n1023#1:2038,3\n1023#1:2042\n1023#1:2044\n1023#1:2045\n1023#1:2050\n1023#1:2052\n1035#1:2062,3\n1035#1:2066\n1035#1:2069\n1035#1:2074,3\n1035#1:2078,3\n1035#1:2082\n1035#1:2084\n1035#1:2085\n1035#1:2090\n1035#1:2092\n1049#1:2107\n1049#1:2111\n1095#1:2132\n1095#1:2136\n1115#1:2153\n1115#1:2154,6\n1115#1:2160\n1115#1:2161,4\n1131#1:2165,6\n1147#1:2171,3\n1148#1:2174\n1149#1:2175\n1156#1:2176,3\n1157#1:2179,3\n1158#1:2182\n1159#1:2183\n1159#1:2184\n1163#1:2185\n1166#1:2186\n1175#1:2187\n1175#1:2188\n1181#1:2189\n1181#1:2190\n1182#1:2191\n1182#1:2192,6\n1182#1:2198\n1182#1:2199,4\n1197#1:2203,3\n1198#1:2206\n1200#1:2207\n1253#1:2208\n1268#1:2209,3\n1269#1:2212\n1280#1:2213\n1281#1:2214,6\n1290#1:2220\n1293#1:2221\n1294#1:2222,6\n1295#1:2228,6\n1307#1:2234\n1308#1:2235,6\n1350#1:2241\n1350#1:2242\n1352#1:2243,3\n1353#1:2246\n1355#1:2247\n1355#1:2248\n1355#1:2249,6\n1355#1:2255\n1355#1:2256,4\n1369#1:2260,6\n1375#1:2266,6\n965#1:1993,2\n974#1:1995,4\n974#1:1999,6\n974#1:2006,3\n974#1:2010,2\n974#1:2012,2\n974#1:2014,6\n974#1:2020\n1023#1:2021\n1023#1:2025\n1023#1:2027,2\n1023#1:2030,4\n1023#1:2037\n1023#1:2041\n1023#1:2043\n1023#1:2046,4\n1023#1:2051\n1023#1:2053,8\n1035#1:2061\n1035#1:2065\n1035#1:2067,2\n1035#1:2070,4\n1035#1:2077\n1035#1:2081\n1035#1:2083\n1035#1:2086,4\n1035#1:2091\n1035#1:2093,8\n1049#1:2101,6\n1049#1:2108,3\n1049#1:2112,9\n1095#1:2121,4\n1095#1:2125,7\n1095#1:2133,3\n1095#1:2137,9\n1095#1:2146\n1104#1:2147,6\n*E\n"})
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86741f;

    @kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1980:1\n215#2,2:1981\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1674#1:1981,2\n*E\n"})
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, InterfaceC4424g {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public Set<Map.Entry<K, V>> b() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.K();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public Set<K> d() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @NotNull
        public Collection<V> e() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @Nullable
        public V put(K k10, V v10) {
            return MutableScatterMap.this.f0(k10, v10);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(@NotNull Map<? extends K, ? extends V> from) {
            kotlin.jvm.internal.G.p(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @Nullable
        public V remove(Object obj) {
            return MutableScatterMap.this.l0(obj);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public final void I() {
        int i10 = this.f86840d;
        if (i10 <= 8 || Long.compare((((long) this.f86841e) * 32) ^ Long.MIN_VALUE, (((long) i10) * 25) ^ Long.MIN_VALUE) > 0) {
            p0(S0.y(this.f86840d));
        } else {
            M();
        }
    }

    @NotNull
    public final Map<K, V> J() {
        return new MutableMapWrapper();
    }

    public final void K() {
        this.f86841e = 0;
        long[] jArr = this.f86837a;
        if (jArr != S0.f86829e) {
            C4875q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f86837a;
            int i10 = this.f86840d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4875q.M1(this.f86839c, null, 0, this.f86840d);
        C4875q.M1(this.f86838b, null, 0, this.f86840d);
        Q();
    }

    public final V L(K k10, @NotNull ed.p<? super K, ? super V, ? extends V> computeBlock) {
        kotlin.jvm.internal.G.p(computeBlock, "computeBlock");
        int iO = O(k10);
        boolean z10 = iO < 0;
        V vInvoke = computeBlock.invoke(k10, z10 ? null : this.f86839c[iO]);
        if (!z10) {
            this.f86839c[iO] = vInvoke;
            return vInvoke;
        }
        int i10 = ~iO;
        this.f86838b[i10] = k10;
        this.f86839c[i10] = vInvoke;
        return vInvoke;
    }

    public final void M() {
        long[] jArr = this.f86837a;
        int i10 = this.f86840d;
        Object[] objArr = this.f86838b;
        Object[] objArr2 = this.f86839c;
        S0.a(jArr, i10);
        int i11 = 0;
        int iC = -1;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j10 = (jArr[i12] >> i13) & 255;
            if (j10 == 128) {
                iC = i11;
                i11++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr[i11];
                    int iHashCode = (obj != null ? obj.hashCode() : 0) * S0.f86834j;
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iN = N(i15);
                    int i16 = i15 & i10;
                    if (((iN - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[jArr.length - 1] = jArr[0];
                    } else {
                        int i17 = iN >> 3;
                        long j11 = jArr[i17];
                        int i18 = (iN & 7) << 3;
                        if (((j11 >> i18) & 255) == 128) {
                            jArr[i17] = (j11 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            objArr[iN] = objArr[i11];
                            objArr[i11] = null;
                            objArr2[iN] = objArr2[i11];
                            objArr2[i11] = null;
                            iC = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            if (iC == -1) {
                                iC = S0.c(jArr, i11 + 1, i10);
                            }
                            objArr[iC] = objArr[iN];
                            objArr[iN] = objArr[i11];
                            objArr[i11] = objArr[iC];
                            objArr2[iC] = objArr2[iN];
                            objArr2[iN] = objArr2[i11];
                            objArr2[i11] = objArr2[iC];
                            i11--;
                        }
                        jArr[jArr.length - 1] = jArr[0];
                    }
                }
                i11++;
            }
        }
        Q();
    }

    public final int N(int i10) {
        int i11 = this.f86840d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f86837a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    @InterfaceC4850b0
    public final int O(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * S0.f86834j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f86840d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f86837a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * S0.f86835k);
            for (long j13 = (~j12) & (j12 - S0.f86835k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.G.g(this.f86838b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = N(i11);
                if (this.f86741f == 0 && ((this.f86837a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    I();
                    iN = N(i11);
                }
                this.f86841e++;
                int i19 = this.f86741f;
                long[] jArr2 = this.f86837a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f86741f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f86840d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iN;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final V P(K k10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V vP = p(k10);
        if (vP != null) {
            return vP;
        }
        V vInvoke = defaultValue.invoke();
        q0(k10, vInvoke);
        return vInvoke;
    }

    public final void Q() {
        this.f86741f = S0.q(this.f86840d) - this.f86841e;
    }

    public final void R(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S0.f86829e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4875q.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f86837a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        Q();
    }

    public final void S(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S0.z(i10)) : 0;
        this.f86840d = iMax;
        R(iMax);
        this.f86838b = new Object[iMax];
        this.f86839c = new Object[iMax];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(@NotNull ObjectList<K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Object[] objArr = keys.f86809a;
        int i10 = keys.f86810b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(@NotNull ScatterSet<K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Object[] objArr = keys.f86877b;
        long[] jArr = keys.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        l0(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void V(@NotNull Iterable<? extends K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            l0(it.next());
        }
    }

    public final void W(K k10) {
        l0(k10);
    }

    public final void X(@NotNull InterfaceC5000m<? extends K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            l0(it.next());
        }
    }

    public final void Y(@NotNull K[] keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        for (K k10 : keys) {
            l0(k10);
        }
    }

    public final void Z(@NotNull ScatterMap<K, V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        g0(from);
    }

    public final void a0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        h0(pairs);
    }

    public final void b0(@NotNull Map<K, ? extends V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        i0(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(@NotNull Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.G.p(pair, "pair");
        q0(pair.f217467a, pair.f217468b);
    }

    public final void d0(@NotNull InterfaceC5000m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        j0(pairs);
    }

    public final void e0(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        k0(pairs);
    }

    @Nullable
    public final V f0(K k10, V v10) {
        int iO = O(k10);
        if (iO < 0) {
            iO = ~iO;
        }
        Object[] objArr = this.f86839c;
        V v11 = (V) objArr[iO];
        this.f86838b[iO] = k10;
        objArr[iO] = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g0(@NotNull ScatterMap<K, V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        Object[] objArr = from.f86838b;
        Object[] objArr2 = from.f86839c;
        long[] jArr = from.f86837a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        q0(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.f217467a, pair.f217468b);
        }
    }

    public final void i0(@NotNull Map<K, ? extends V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            q0(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(@NotNull InterfaceC5000m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.f217467a, pair.f217468b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.f217467a, pair.f217468b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V l0(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f86840d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f86837a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f86838b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.G.g(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.o0(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.l0(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m0(K r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f86840d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f86837a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f86838b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.G.g(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.f86839c
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.G.g(r1, r7)
            if (r1 == 0) goto L83
            r0.o0(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.m0(java.lang.Object, java.lang.Object):boolean");
    }

    public final void n0(@NotNull ed.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        long[] jArr = this.f86837a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(this.f86838b[i13], this.f86839c[i13]).booleanValue()) {
                            o0(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4850b0
    @Nullable
    public final V o0(int i10) {
        this.f86841e--;
        long[] jArr = this.f86837a;
        int i11 = this.f86840d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f86838b[i10] = null;
        Object[] objArr = this.f86839c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void p0(int i10) {
        int i11;
        long[] jArr = this.f86837a;
        Object[] objArr = this.f86838b;
        Object[] objArr2 = this.f86839c;
        int i12 = this.f86840d;
        S(i10);
        long[] jArr2 = this.f86837a;
        Object[] objArr3 = this.f86838b;
        Object[] objArr4 = this.f86839c;
        int i13 = this.f86840d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * S0.f86834j;
                int i15 = iHashCode ^ (iHashCode << 16);
                int iN = N(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iN >> 3;
                int i17 = (iN & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iN - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iN] = obj;
                objArr4[iN] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void q0(K k10, V v10) {
        int iO = O(k10);
        if (iO < 0) {
            iO = ~iO;
        }
        this.f86838b[iO] = k10;
        this.f86839c[iO] = v10;
    }

    public final int r0() {
        int i10 = this.f86840d;
        int iZ = S0.z(S0.B(this.f86841e));
        if (iZ >= i10) {
            return 0;
        }
        p0(iZ);
        return i10 - this.f86840d;
    }

    public final void s0(int i10, long j10) {
        long[] jArr = this.f86837a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f86840d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public MutableScatterMap(int i10) {
        if (i10 >= 0) {
            S(S0.B(i10));
        } else {
            A.f.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ MutableScatterMap(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
