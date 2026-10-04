package androidx.collection;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1980:1\n635#1:1981\n636#1:1985\n638#1,2:1987\n640#1,4:1990\n644#1:1997\n645#1:2001\n646#1:2003\n647#1,4:2006\n653#1:2011\n654#1,8:2013\n635#1:2021\n636#1:2025\n638#1,2:2027\n640#1,4:2030\n644#1:2037\n645#1:2041\n646#1:2043\n647#1,4:2046\n653#1:2051\n654#1,8:2053\n365#1,6:2063\n375#1,3:2070\n378#1,9:2074\n365#1,6:2083\n375#1,3:2090\n378#1,9:2094\n365#1,6:2103\n375#1,3:2110\n378#1,9:2114\n393#1,4:2123\n365#1,6:2127\n375#1,3:2134\n378#1,2:2138\n398#1,2:2140\n381#1,6:2142\n400#1:2148\n393#1,4:2149\n365#1,6:2153\n375#1,3:2160\n378#1,2:2164\n398#1,2:2166\n381#1,6:2168\n400#1:2174\n393#1,4:2175\n365#1,6:2179\n375#1,3:2186\n378#1,2:2190\n398#1,2:2192\n381#1,6:2194\n400#1:2200\n635#1:2201\n636#1:2205\n638#1,2:2207\n640#1,4:2210\n644#1:2217\n645#1:2221\n646#1:2223\n647#1,4:2226\n653#1:2231\n654#1,8:2233\n635#1:2241\n636#1:2245\n638#1,2:2247\n640#1,4:2250\n644#1:2257\n645#1:2261\n646#1:2263\n647#1,4:2266\n653#1:2271\n654#1,8:2273\n420#1,3:2281\n365#1,6:2284\n375#1,3:2291\n378#1,2:2295\n424#1,2:2297\n381#1,6:2299\n426#1:2305\n393#1,4:2306\n365#1,6:2310\n375#1,3:2317\n378#1,2:2321\n398#1,2:2323\n381#1,6:2325\n400#1:2331\n393#1,4:2332\n365#1,6:2336\n375#1,3:2343\n378#1,2:2347\n398#1,2:2349\n381#1,6:2351\n400#1:2357\n393#1,4:2358\n365#1,6:2362\n375#1,3:2369\n378#1,2:2373\n398#1,2:2375\n381#1,6:2377\n400#1:2383\n393#1,4:2384\n365#1,6:2388\n375#1,3:2395\n378#1,2:2399\n398#1,2:2401\n381#1,6:2403\n400#1:2409\n1714#2,3:1982\n1728#2:1986\n1724#2:1989\n1925#2,3:1994\n1939#2,3:1998\n1865#2:2002\n1853#2:2004\n1847#2:2005\n1860#2:2010\n1948#2:2012\n1714#2,3:2022\n1728#2:2026\n1724#2:2029\n1925#2,3:2034\n1939#2,3:2038\n1865#2:2042\n1853#2:2044\n1847#2:2045\n1860#2:2050\n1948#2:2052\n1956#2:2061\n1820#2:2062\n1956#2:2069\n1820#2:2073\n1956#2:2089\n1820#2:2093\n1956#2:2109\n1820#2:2113\n1956#2:2133\n1820#2:2137\n1956#2:2159\n1820#2:2163\n1956#2:2185\n1820#2:2189\n1714#2,3:2202\n1728#2:2206\n1724#2:2209\n1925#2,3:2214\n1939#2,3:2218\n1865#2:2222\n1853#2:2224\n1847#2:2225\n1860#2:2230\n1948#2:2232\n1714#2,3:2242\n1728#2:2246\n1724#2:2249\n1925#2,3:2254\n1939#2,3:2258\n1865#2:2262\n1853#2:2264\n1847#2:2265\n1860#2:2270\n1948#2:2272\n1956#2:2290\n1820#2:2294\n1956#2:2316\n1820#2:2320\n1956#2:2342\n1820#2:2346\n1956#2:2368\n1820#2:2372\n1956#2:2394\n1820#2:2398\n1770#2:2410\n1714#2,3:2411\n1728#2:2414\n1724#2:2415\n1925#2,3:2416\n1939#2,3:2419\n1865#2:2422\n1853#2:2423\n1847#2:2424\n1860#2:2425\n1948#2:2426\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n332#1:1981\n332#1:1985\n332#1:1987,2\n332#1:1990,4\n332#1:1997\n332#1:2001\n332#1:2003\n332#1:2006,4\n332#1:2011\n332#1:2013,8\n342#1:2021\n342#1:2025\n342#1:2027,2\n342#1:2030,4\n342#1:2037\n342#1:2041\n342#1:2043\n342#1:2046,4\n342#1:2051\n342#1:2053,8\n396#1:2063,6\n396#1:2070,3\n396#1:2074,9\n409#1:2083,6\n409#1:2090,3\n409#1:2094,9\n422#1:2103,6\n422#1:2110,3\n422#1:2114,9\n432#1:2123,4\n432#1:2127,6\n432#1:2134,3\n432#1:2138,2\n432#1:2140,2\n432#1:2142,6\n432#1:2148\n442#1:2149,4\n442#1:2153,6\n442#1:2160,3\n442#1:2164,2\n442#1:2166,2\n442#1:2168,6\n442#1:2174\n458#1:2175,4\n458#1:2179,6\n458#1:2186,3\n458#1:2190,2\n458#1:2192,2\n458#1:2194,6\n458#1:2200\n468#1:2201\n468#1:2205\n468#1:2207,2\n468#1:2210,4\n468#1:2217\n468#1:2221\n468#1:2223\n468#1:2226,4\n468#1:2231\n468#1:2233,8\n474#1:2241\n474#1:2245\n474#1:2247,2\n474#1:2250,4\n474#1:2257\n474#1:2261\n474#1:2263\n474#1:2266,4\n474#1:2271\n474#1:2273,8\n481#1:2281,3\n481#1:2284,6\n481#1:2291,3\n481#1:2295,2\n481#1:2297,2\n481#1:2299,6\n481#1:2305\n508#1:2306,4\n508#1:2310,6\n508#1:2317,3\n508#1:2321,2\n508#1:2323,2\n508#1:2325,6\n508#1:2331\n535#1:2332,4\n535#1:2336,6\n535#1:2343,3\n535#1:2347,2\n535#1:2349,2\n535#1:2351,6\n535#1:2357\n564#1:2358,4\n564#1:2362,6\n564#1:2369,3\n564#1:2373,2\n564#1:2375,2\n564#1:2377,6\n564#1:2383\n590#1:2384,4\n590#1:2388,6\n590#1:2395,3\n590#1:2399,2\n590#1:2401,2\n590#1:2403,6\n590#1:2409\n332#1:1982,3\n332#1:1986\n332#1:1989\n332#1:1994,3\n332#1:1998,3\n332#1:2002\n332#1:2004\n332#1:2005\n332#1:2010\n332#1:2012\n342#1:2022,3\n342#1:2026\n342#1:2029\n342#1:2034,3\n342#1:2038,3\n342#1:2042\n342#1:2044\n342#1:2045\n342#1:2050\n342#1:2052\n370#1:2061\n377#1:2062\n396#1:2069\n396#1:2073\n409#1:2089\n409#1:2093\n422#1:2109\n422#1:2113\n432#1:2133\n432#1:2137\n442#1:2159\n442#1:2163\n458#1:2185\n458#1:2189\n468#1:2202,3\n468#1:2206\n468#1:2209\n468#1:2214,3\n468#1:2218,3\n468#1:2222\n468#1:2224\n468#1:2225\n468#1:2230\n468#1:2232\n474#1:2242,3\n474#1:2246\n474#1:2249\n474#1:2254,3\n474#1:2258,3\n474#1:2262\n474#1:2264\n474#1:2265\n474#1:2270\n474#1:2272\n481#1:2290\n481#1:2294\n508#1:2316\n508#1:2320\n535#1:2342\n535#1:2346\n564#1:2368\n564#1:2372\n590#1:2394\n590#1:2398\n607#1:2410\n635#1:2411,3\n636#1:2414\n639#1:2415\n643#1:2416,3\n644#1:2419,3\n645#1:2422\n646#1:2423\n646#1:2424\n650#1:2425\n653#1:2426\n*E\n"})
public abstract class ScatterMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public long[] f86837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public Object[] f86838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public Object[] f86839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public int f86840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    public int f86841e;

    public class MapWrapper implements Map<K, V>, InterfaceC4418a {
        public MapWrapper() {
        }

        @NotNull
        public Set<Map.Entry<K, V>> b() {
            return new ScatterMap$MapWrapper$entries$1(ScatterMap.this);
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return ScatterMap.this.g(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return ScatterMap.this.h(obj);
        }

        @NotNull
        public Set<K> d() {
            return new ScatterMap$MapWrapper$keys$1(ScatterMap.this);
        }

        @NotNull
        public Collection<V> e() {
            return new ScatterMap$MapWrapper$values$1(ScatterMap.this);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return b();
        }

        @Override // java.util.Map
        @Nullable
        public V get(Object obj) {
            return ScatterMap.this.p(obj);
        }

        public int getSize() {
            return ScatterMap.this.f86841e;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return ScatterMap.this.x();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return d();
        }

        @Override // java.util.Map
        public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V put(K k10, V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V putIfAbsent(K k10, V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V replace(K k10, V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<V> values() {
            return e();
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(K k10, V v10, V v11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ ScatterMap(C4969v c4969v) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String G(ScatterMap scatterMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.p pVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            pVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.p pVar2 = pVar;
        return scatterMap.F(charSequence, charSequence2, charSequence3, i10, charSequence5, pVar2);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void r() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void s() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void w() {
    }

    @dd.k
    @NotNull
    public final String A(@NotNull CharSequence separator) {
        kotlin.jvm.internal.G.p(separator, "separator");
        return G(this, separator, null, null, 0, null, null, 62, null);
    }

    @dd.k
    @NotNull
    public final String B(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return G(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @dd.k
    @NotNull
    public final String C(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return G(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @dd.k
    @NotNull
    public final String D(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return G(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @dd.k
    @NotNull
    public final String E(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        return G(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @dd.k
    @NotNull
    public final String F(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2, @Nullable ed.p<? super K, ? super V, ? extends CharSequence> pVar) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1544m.a(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr5 = this.f86838b;
        Object[] objArr6 = this.f86839c;
        long[] jArr = this.f86837a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                int i13 = i11;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = objArr5[i16];
                            objArr3 = objArr5;
                            Object obj2 = objArr6[i16];
                            objArr4 = objArr6;
                            if (i12 == i10) {
                                sbA.append(charSequence2);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sbA.append(separator);
                            }
                            if (pVar == null) {
                                sbA.append(obj);
                                sbA.append(SignatureVisitor.INSTANCEOF);
                                sbA.append(obj2);
                            } else {
                                sbA.append(pVar.invoke(obj, obj2));
                            }
                            i12++;
                        } else {
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                        }
                        j10 >>= 8;
                        i15++;
                        objArr6 = objArr4;
                        objArr5 = objArr3;
                    }
                    objArr = objArr5;
                    objArr2 = objArr6;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    objArr2 = objArr6;
                }
                if (i13 == length) {
                    break;
                }
                i11 = i13 + 1;
                objArr6 = objArr2;
                objArr5 = objArr;
            }
            sbA.append(charSequence);
        } else {
            sbA.append(charSequence);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean H() {
        return this.f86841e == 0;
    }

    public final boolean a(@NotNull ed.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86838b;
        Object[] objArr2 = this.f86839c;
        long[] jArr = this.f86837a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(objArr[i13], objArr2[i13]).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean b() {
        return this.f86841e != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(@org.jetbrains.annotations.NotNull ed.p<? super K, ? super V, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.G.p(r1, r2)
            java.lang.Object[] r2 = r0.f86838b
            java.lang.Object[] r3 = r0.f86839c
            long[] r4 = r0.f86837a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5b
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L56
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L54
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L50
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L50
            r1 = 1
            return r1
        L50:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L54:
            if (r10 != r11) goto L5b
        L56:
            if (r7 == r5) goto L5b
            int r7 = r7 + 1
            goto L16
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.c(ed.p):boolean");
    }

    @NotNull
    public final String d() {
        StringBuilder sb2 = new StringBuilder("{metadata=[");
        int i10 = this.f86840d;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = (this.f86837a[i11 >> 3] >> ((i11 & 7) << 3)) & 255;
            if (j10 == 128) {
                sb2.append("Empty");
            } else if (j10 == 254) {
                sb2.append("Deleted");
            } else {
                sb2.append(j10);
            }
            sb2.append(U6.j.f68738d);
        }
        sb2.append("], keys=[");
        int length = this.f86838b.length;
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append(this.f86838b[i12]);
            sb2.append(U6.j.f68738d);
        }
        sb2.append("], values=[");
        int length2 = this.f86839c.length;
        for (int i13 = 0; i13 < length2; i13++) {
            sb2.append(this.f86839c[i13]);
            sb2.append(U6.j.f68738d);
        }
        sb2.append("]}");
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final Map<K, V> e() {
        return new MapWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.ScatterMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            int r3 = r1.f86841e
            int r5 = r0.f86841e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f86838b
            java.lang.Object[] r5 = r0.f86839c
            long[] r6 = r0.f86837a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L69
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L5e
            java.lang.Object r14 = r1.p(r15)
            if (r14 != 0) goto L5d
            boolean r14 = r1.g(r15)
            if (r14 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r15 = r1.p(r15)
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L69
            return r4
        L69:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L6d:
            if (r11 != r12) goto L74
        L6f:
            if (r8 == r7) goto L74
            int r8 = r8 + 1
            goto L23
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(K r18) {
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.f(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(K r18) {
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(V r15) {
        /*
            r14 = this;
            java.lang.Object[] r0 = r14.f86839c
            long[] r1 = r14.f86837a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L48
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L43
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L41
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r10 = kotlin.jvm.internal.G.g(r15, r10)
            if (r10 == 0) goto L3d
            r15 = 1
            return r15
        L3d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L41:
            if (r7 != r8) goto L48
        L43:
            if (r4 == r2) goto L48
            int r4 = r4 + 1
            goto Lb
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.h(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.f86838b;
        Object[] objArr2 = this.f86839c;
        long[] jArr = this.f86837a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final int i() {
        return this.f86841e;
    }

    public final int j(@NotNull ed.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86838b;
        Object[] objArr2 = this.f86839c;
        long[] jArr = this.f86837a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(objArr[i14], objArr2[i14]).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final int k(K k10) {
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * S0.f86834j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f86840d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f86837a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * S0.f86835k) ^ j10;
            for (long j12 = (~j11) & (j11 - S0.f86835k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.G.g(this.f86838b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void l(@NotNull ed.p<? super K, ? super V, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f86838b;
        Object[] objArr2 = this.f86839c;
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
                        block.invoke(objArr[i13], objArr2[i13]);
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
    public final void m(@NotNull ed.l<? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
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
                        C1540k.a(i10 << 3, i12, block);
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

    public final void n(@NotNull ed.l<? super K, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f86838b;
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
                        block.invoke(objArr[(i10 << 3) + i12]);
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

    public final void o(@NotNull ed.l<? super V, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f86839c;
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
                        block.invoke(objArr[(i10 << 3) + i12]);
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
    public final V p(K r14) {
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
            java.lang.Object[] r14 = r13.f86839c
            r14 = r14[r10]
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.p(java.lang.Object):java.lang.Object");
    }

    public final int q() {
        return this.f86840d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V t(K r14, V r15) {
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
            if (r4 == 0) goto L74
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f86839c
            r14 = r14[r10]
            return r14
        L73:
            return r15
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.t(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.x()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f86838b
            java.lang.Object[] r3 = r0.f86839c
            long[] r4 = r0.f86837a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L77
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L72
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L52
            r15 = r16
        L52:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5e
            r14 = r16
        L5e:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f86841e
            if (r8 >= r14) goto L6c
            java.lang.String r14 = ", "
            r1.append(r14)
        L6c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L70:
            if (r11 != r12) goto L77
        L72:
            if (r7 == r5) goto L77
            int r7 = r7 + 1
            goto L20
        L77:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = "s.append('}').toString()"
            java.lang.String r1 = androidx.collection.C1526d.a(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.toString():java.lang.String");
    }

    public final V u(K k10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V vP = p(k10);
        return vP == null ? defaultValue.invoke() : vP;
    }

    public final int v() {
        return this.f86841e;
    }

    public final boolean x() {
        return this.f86841e == 0;
    }

    public final boolean y() {
        return this.f86841e != 0;
    }

    @dd.k
    @NotNull
    public final String z() {
        return G(this, null, null, null, 0, null, null, 63, null);
    }

    public ScatterMap() {
        this.f86837a = S0.f86829e;
        Object[] objArr = A.a.f13c;
        this.f86838b = objArr;
        this.f86839c = objArr;
    }
}
