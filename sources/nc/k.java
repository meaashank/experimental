package Nc;

import androidx.collection.N0;
import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.C1922j1;
import ed.InterfaceC4376a;
import ed.l;
import ed.p;
import ed.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.B0;
import kotlin.C;
import kotlin.C0;
import kotlin.H0;
import kotlin.I0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.InterfaceC5043v;
import kotlin.InterfaceC5045x;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.A;
import kotlin.collections.AbstractC4859d;
import kotlin.collections.B;
import kotlin.collections.C4858c0;
import kotlin.collections.C4860d0;
import kotlin.collections.C4875q;
import kotlin.collections.D0;
import kotlin.collections.EmptyList;
import kotlin.collections.H;
import kotlin.collections.J;
import kotlin.collections.N;
import kotlin.collections.U;
import kotlin.collections.m0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.random.Random;
import kotlin.t0;
import kotlin.u0;
import kotlin.x0;
import kotlin.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,11271:1\n3993#1:11321\n4001#1:11322\n4009#1:11323\n4017#1:11324\n3993#1:11325\n4001#1:11326\n4009#1:11327\n4017#1:11328\n3993#1:11329\n4001#1:11330\n4009#1:11331\n4017#1:11332\n3993#1:11389\n4001#1:11390\n4009#1:11391\n4017#1:11392\n3993#1:11393\n4001#1:11394\n4009#1:11395\n4017#1:11396\n3993#1:11397\n4001#1:11398\n4009#1:11399\n4017#1:11400\n3993#1:11401\n4001#1:11402\n4009#1:11403\n4017#1:11404\n3993#1:11405\n4001#1:11406\n4009#1:11407\n4017#1:11408\n3993#1:11409\n4001#1:11410\n4009#1:11411\n4017#1:11412\n3993#1:11413\n4001#1:11414\n4009#1:11415\n4017#1:11416\n3993#1:11417\n4001#1:11418\n4009#1:11419\n4017#1:11420\n3993#1:11421\n4001#1:11422\n4009#1:11423\n4017#1:11424\n3993#1:11425\n4001#1:11426\n4009#1:11427\n4017#1:11428\n3993#1:11429\n4001#1:11430\n4009#1:11431\n4017#1:11432\n3993#1:11433\n4001#1:11434\n4009#1:11435\n4017#1:11436\n3993#1:11437\n4001#1:11438\n4009#1:11439\n4017#1:11440\n3993#1:11441\n4001#1:11442\n4009#1:11443\n4017#1:11444\n3993#1:11445\n4001#1:11446\n4009#1:11447\n4017#1:11448\n3993#1:11449\n4001#1:11450\n4009#1:11451\n4017#1:11452\n3993#1:11453\n4001#1:11454\n4009#1:11455\n4017#1:11456\n3993#1:11457\n4001#1:11458\n4009#1:11459\n4017#1:11460\n3993#1:11461\n4001#1:11462\n4009#1:11463\n4017#1:11464\n3993#1:11465\n4001#1:11466\n4009#1:11467\n4017#1:11468\n3993#1:11469\n4001#1:11470\n4009#1:11471\n4017#1:11472\n3993#1:11473\n4001#1:11474\n4009#1:11475\n4017#1:11476\n3993#1:11477\n4001#1:11478\n4009#1:11479\n4017#1:11480\n3993#1:11481\n4001#1:11482\n4009#1:11483\n4017#1:11484\n3993#1:11485\n4001#1:11486\n4009#1:11487\n4017#1:11488\n3993#1:11489\n4001#1:11490\n4009#1:11491\n4017#1:11492\n3993#1:11493\n4001#1:11494\n4009#1:11495\n4017#1:11496\n3993#1:11497\n4001#1:11498\n4009#1:11499\n4017#1:11500\n3993#1:11501\n4001#1:11502\n4009#1:11503\n4017#1:11504\n3993#1:11505\n4001#1:11506\n4009#1:11507\n4017#1:11508\n3993#1:11509\n4001#1:11510\n4009#1:11511\n4017#1:11512\n3993#1:11513\n4001#1:11514\n4009#1:11515\n4017#1:11516\n3993#1:11517\n4001#1:11518\n4009#1:11519\n4017#1:11520\n3993#1:11521\n4001#1:11522\n4009#1:11523\n4017#1:11524\n3993#1:11525\n4001#1:11526\n4009#1:11527\n4017#1:11528\n3993#1:11529\n4001#1:11530\n4009#1:11531\n4017#1:11532\n3993#1:11533\n4001#1:11534\n4009#1:11535\n4017#1:11536\n3993#1:11537\n4001#1:11538\n4009#1:11539\n4017#1:11540\n1827#2,6:11272\n1839#2,6:11278\n1803#2,6:11284\n1815#2,6:11290\n1935#2,6:11296\n1947#2,6:11302\n1911#2,6:11308\n1923#2,6:11314\n1#3:11320\n383#4,7:11333\n383#4,7:11340\n383#4,7:11347\n383#4,7:11354\n383#4,7:11361\n383#4,7:11368\n383#4,7:11375\n383#4,7:11382\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n1784#1:11321\n1801#1:11322\n1818#1:11323\n1835#1:11324\n2624#1:11325\n2641#1:11326\n2658#1:11327\n2675#1:11328\n2991#1:11329\n3007#1:11330\n3023#1:11331\n3039#1:11332\n5819#1:11389\n5839#1:11390\n5859#1:11391\n5879#1:11392\n5900#1:11393\n5922#1:11394\n5944#1:11395\n5966#1:11396\n6081#1:11397\n6102#1:11398\n6123#1:11399\n6144#1:11400\n6173#1:11401\n6209#1:11402\n6245#1:11403\n6281#1:11404\n6313#1:11405\n6345#1:11406\n6377#1:11407\n6409#1:11408\n6441#1:11409\n6466#1:11410\n6491#1:11411\n6516#1:11412\n6541#1:11413\n6566#1:11414\n6591#1:11415\n6616#1:11416\n6641#1:11417\n6668#1:11418\n6695#1:11419\n6722#1:11420\n6747#1:11421\n6770#1:11422\n6793#1:11423\n6816#1:11424\n6839#1:11425\n6862#1:11426\n6885#1:11427\n6908#1:11428\n6931#1:11429\n6956#1:11430\n6981#1:11431\n7006#1:11432\n7033#1:11433\n7060#1:11434\n7087#1:11435\n7114#1:11436\n7139#1:11437\n7164#1:11438\n7189#1:11439\n7214#1:11440\n7233#1:11441\n7250#1:11442\n7267#1:11443\n7284#1:11444\n7303#1:11445\n7322#1:11446\n7341#1:11447\n7360#1:11448\n7375#1:11449\n7390#1:11450\n7405#1:11451\n7420#1:11452\n7441#1:11453\n7462#1:11454\n7483#1:11455\n7504#1:11456\n7533#1:11457\n7569#1:11458\n7605#1:11459\n7641#1:11460\n7673#1:11461\n7705#1:11462\n7737#1:11463\n7769#1:11464\n7801#1:11465\n7826#1:11466\n7851#1:11467\n7876#1:11468\n7901#1:11469\n7926#1:11470\n7951#1:11471\n7976#1:11472\n8001#1:11473\n8028#1:11474\n8055#1:11475\n8082#1:11476\n8107#1:11477\n8130#1:11478\n8153#1:11479\n8176#1:11480\n8199#1:11481\n8222#1:11482\n8245#1:11483\n8268#1:11484\n8291#1:11485\n8316#1:11486\n8341#1:11487\n8366#1:11488\n8393#1:11489\n8420#1:11490\n8447#1:11491\n8474#1:11492\n8499#1:11493\n8524#1:11494\n8549#1:11495\n8574#1:11496\n8593#1:11497\n8610#1:11498\n8627#1:11499\n8644#1:11500\n8663#1:11501\n8682#1:11502\n8701#1:11503\n8720#1:11504\n8735#1:11505\n8750#1:11506\n8765#1:11507\n8780#1:11508\n8998#1:11509\n9023#1:11510\n9048#1:11511\n9073#1:11512\n9098#1:11513\n9123#1:11514\n9148#1:11515\n9173#1:11516\n9197#1:11517\n9221#1:11518\n9245#1:11519\n9269#1:11520\n9293#1:11521\n9317#1:11522\n9341#1:11523\n9365#1:11524\n9387#1:11525\n9412#1:11526\n9437#1:11527\n9462#1:11528\n9487#1:11529\n9513#1:11530\n9539#1:11531\n9565#1:11532\n9590#1:11533\n9615#1:11534\n9640#1:11535\n9665#1:11536\n9690#1:11537\n9714#1:11538\n9738#1:11539\n9762#1:11540\n890#1:11272,6\n900#1:11278,6\n910#1:11284,6\n920#1:11290,6\n930#1:11296,6\n940#1:11302,6\n950#1:11308,6\n960#1:11314,6\n5022#1:11333,7\n5043#1:11340,7\n5064#1:11347,7\n5085#1:11354,7\n5107#1:11361,7\n5129#1:11368,7\n5151#1:11375,7\n5173#1:11382,7\n*E\n"})
public class k extends f {
    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <V, M extends Map<? super B0, ? super V>> M A0(long[] jArr, M destination, l<? super B0, ? extends V> valueSelector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$associateWithTo$0");
        G.p(destination, "destination");
        G.p(valueSelector, "valueSelector");
        for (long j10 : jArr) {
            destination.put(new B0(j10), valueSelector.invoke(new B0(j10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] A1(long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOf$0");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        G.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super t0>> C A2(byte[] bArr, C destination, p<? super Integer, ? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterIndexedTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new t0(b10)).booleanValue()) {
                destination.add(new t0(b10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C A3(int[] iArr, C destination, l<? super x0, ? extends Iterable<? extends R>> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (int i10 : iArr) {
            N.s0(destination, (Iterable) e.a(i10, transform));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K> Map<K, List<t0>> A4(byte[] bArr, l<? super t0, ? extends K> keySelector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            Object objA = d.a(b10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(new t0(b10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> A5(long[] jArr, p<? super Integer, ? super B0, ? extends R> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$mapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), new B0(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final B0 A6(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOrNull$0");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R A7(short[] sArr, Comparator<? super R> comparator, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r10 = (Object) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) b.a(sArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short A8(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$random$0");
        return B8(sArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> A9(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reversed$0");
        if (jArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<B0> listD6 = U.d6(new C0(jArr));
        Collections.reverse(listD6);
        return listD6;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final H0 Aa(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$singleOrNull$0");
        if (sArr.length == 1) {
            return new H0(sArr[0]);
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> Ab(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortedDescending$0");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        ab(jArrCopyOf);
        return A9(jArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> Ac(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$takeWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!((Boolean) e.a(i10, predicate)).booleanValue()) {
                break;
            }
            arrayList.add(new x0(i10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <V, M extends Map<? super H0, ? super V>> M B0(short[] sArr, M destination, l<? super H0, ? extends V> valueSelector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$associateWithTo$0");
        G.p(destination, "destination");
        G.p(valueSelector, "valueSelector");
        for (short s10 : sArr) {
            destination.put(new H0(s10), valueSelector.invoke(new H0(s10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] B1(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOf$0");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super B0>> C B2(long[] jArr, C destination, p<? super Integer, ? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterIndexedTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new B0(j10)).booleanValue()) {
                destination.add(new B0(j10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C B3(byte[] bArr, C destination, l<? super t0, ? extends Iterable<? extends R>> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (byte b10 : bArr) {
            N.s0(destination, (Iterable) d.a(b10, transform));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K, V> Map<K, List<V>> B4(int[] iArr, l<? super x0, ? extends K> keySelector, l<? super x0, ? extends V> valueTransform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            Object objA = e.a(i10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new x0(i10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> B5(short[] sArr, p<? super Integer, ? super H0, ? extends R> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$mapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), new H0(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final H0 B6(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOrNull$0");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (G.t(s10 & H0.f217455d, 65535 & s11) < 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R B7(int[] iArr, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r10 = (Object) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) e.a(iArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final short B8(@NotNull short[] sArr, @NotNull Random random) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$random$0");
        G.p(random, "random");
        if (sArr.length != 0) {
            return sArr[random.q(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> B9(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reversed$0");
        if (sArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<H0> listD6 = U.d6(new I0(sArr));
        Collections.reverse(listD6);
        return listD6;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final H0 Ba(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$singleOrNull$0");
        G.p(predicate, "predicate");
        H0 h02 = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                if (z10) {
                    return null;
                }
                h02 = new H0(s10);
                z10 = true;
            }
        }
        if (z10) {
            return h02;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> Bb(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortedDescending$0");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        db(sArrCopyOf);
        return B9(sArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> Bc(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$takeWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!((Boolean) b.a(s10, predicate)).booleanValue()) {
                break;
            }
            arrayList.add(new H0(s10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int C0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$component1$0");
        return iArr[0];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] C1(long[] jArr, int i10, int i11) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOfRange$0");
        return C4875q.k1(jArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> C2(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterNot$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!((Boolean) d.a(b10, predicate)).booleanValue()) {
                arrayList.add(new t0(b10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R C3(long[] jArr, R r10, p<? super R, ? super B0, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$fold$0");
        G.p(operation, "operation");
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, new B0(j10));
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K> Map<K, List<B0>> C4(long[] jArr, l<? super B0, ? extends K> keySelector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            Object objA = c.a(j10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(new B0(j10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C C5(int[] iArr, C destination, p<? super Integer, ? super x0, ? extends R> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$mapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), new x0(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxOrThrow-U")
    public static final byte C6(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$max$0");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (G.t(b10 & 255, b11 & 255) < 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final x0 C7(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOrNull$0");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final x0 C8(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$randomOrNull$0");
        return D8(iArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] C9(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reversedArray$0");
        return B.Or(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> Ca(@NotNull long[] jArr, @NotNull Iterable<Integer> indices) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$slice$0");
        G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(new B0(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int Cb(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sum$0");
        return B.uw(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] Cc(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$toByteArray$0");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte D0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$component1$0");
        return bArr[0];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] D1(byte[] bArr, int i10, int i11) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOfRange$0");
        return C4875q.f1(bArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> D2(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterNot$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!((Boolean) c.a(j10, predicate)).booleanValue()) {
                arrayList.add(new B0(j10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R D3(byte[] bArr, R r10, p<? super R, ? super t0, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$fold$0");
        G.p(operation, "operation");
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, new t0(b10));
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K, V> Map<K, List<V>> D4(byte[] bArr, l<? super t0, ? extends K> keySelector, l<? super t0, ? extends V> valueTransform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            Object objA = d.a(b10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new t0(b10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C D5(short[] sArr, C destination, p<? super Integer, ? super H0, ? extends R> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$mapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), new H0(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxOrThrow-U")
    public static final int D6(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$max$0");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) < 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final t0 D7(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOrNull$0");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (G.t(b10 & 255, b11 & 255) > 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final x0 D8(@NotNull int[] iArr, @NotNull Random random) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$randomOrNull$0");
        G.p(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return new x0(iArr[random.q(iArr.length)]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] D9(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reversedArray$0");
        return B.Kr(bArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> Da(@NotNull int[] iArr, @NotNull Iterable<Integer> indices) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$slice$0");
        G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(new x0(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int Db(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sum$0");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10 & 255;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] Dc(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$toIntArray$0");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long E0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$component1$0");
        return jArr[0];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] E1(short[] sArr, int i10, int i11) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOfRange$0");
        return C4875q.m1(sArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> E2(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterNot$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!((Boolean) e.a(i10, predicate)).booleanValue()) {
                arrayList.add(new x0(i10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R E3(int[] iArr, R r10, p<? super R, ? super x0, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$fold$0");
        G.p(operation, "operation");
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, new x0(i10));
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K> Map<K, List<x0>> E4(int[] iArr, l<? super x0, ? extends K> keySelector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            Object objA = e.a(i10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(new x0(i10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C E5(byte[] bArr, C destination, p<? super Integer, ? super t0, ? extends R> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$mapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), new t0(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxOrThrow-U")
    public static final long E6(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$max$0");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final B0 E7(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOrNull$0");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final t0 E8(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$randomOrNull$0");
        return H8(bArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] E9(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reversedArray$0");
        return B.Pr(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> Ea(@NotNull short[] sArr, @NotNull Iterable<Integer> indices) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$slice$0");
        G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(new H0(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long Eb(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sum$0");
        return B.ww(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] Ec(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$toLongArray$0");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short F0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$component1$0");
        return sArr[0];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] F1(int[] iArr, int i10, int i11) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOfRange$0");
        return C4875q.j1(iArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> F2(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterNot$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!((Boolean) b.a(s10, predicate)).booleanValue()) {
                arrayList.add(new H0(s10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R F3(short[] sArr, R r10, p<? super R, ? super H0, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$fold$0");
        G.p(operation, "operation");
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, new H0(s10));
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K> Map<K, List<H0>> F4(short[] sArr, l<? super H0, ? extends K> keySelector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            Object objA = b.a(s10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(new H0(s10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C F5(long[] jArr, C destination, p<? super Integer, ? super B0, ? extends R> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$mapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), new B0(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxOrThrow-U")
    public static final short F6(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$max$0");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (G.t(s10 & H0.f217455d, 65535 & s11) < 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final H0 F7(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOrNull$0");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (G.t(s10 & H0.f217455d, 65535 & s11) > 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final B0 F8(@NotNull long[] jArr, @NotNull Random random) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$randomOrNull$0");
        G.p(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return new B0(jArr[random.q(jArr.length)]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] F9(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reversedArray$0");
        return B.Rr(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> Fa(@NotNull byte[] bArr, @NotNull Iterable<Integer> indices) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$slice$0");
        G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(new t0(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int Fb(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sum$0");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += s10 & H0.f217455d;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] Fc(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$toShortArray$0");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int G0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$component2$0");
        return iArr[1];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int G1(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$count$0");
        G.p(predicate, "predicate");
        int i10 = 0;
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super B0>> C G2(long[] jArr, C destination, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterNotTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (!((Boolean) c.a(j10, predicate)).booleanValue()) {
                destination.add(new B0(j10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R G3(byte[] bArr, R r10, q<? super Integer, ? super R, ? super t0, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$foldIndexed$0");
        G.p(operation, "operation");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, new t0(bArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, M extends Map<? super K, List<x0>>> M G4(int[] iArr, M destination, l<? super x0, ? extends K> keySelector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        for (int i10 : iArr) {
            Object objA = e.a(i10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(new x0(i10));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C G5(long[] jArr, C destination, l<? super B0, ? extends R> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$mapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (long j10 : jArr) {
            destination.add(transform.invoke(new B0(j10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final t0 G6(@NotNull byte[] bArr, @NotNull Comparator<? super t0> comparator) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxWithOrNull$0");
        G.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(new t0(b10), new t0(b11)) < 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minOrThrow-U")
    public static final byte G7(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$min$0");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (G.t(b10 & 255, b11 & 255) > 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final B0 G8(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$randomOrNull$0");
        return F8(jArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> G9(long[] jArr, R r10, p<? super R, ? super B0, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningFold$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, new B0(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> Ga(@NotNull short[] sArr, @NotNull md.l indices) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$slice$0");
        G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : f.d(C4875q.m1(sArr, indices.f221139a, indices.f221140b + 1));
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final int Gb(byte[] bArr, l<? super t0, x0> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumBy$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += ((x0) d.a(b10, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final x0[] Gc(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$toTypedArray$0");
        int length = iArr.length;
        x0[] x0VarArr = new x0[length];
        for (int i10 = 0; i10 < length; i10++) {
            x0VarArr[i10] = new x0(iArr[i10]);
        }
        return x0VarArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte H0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$component2$0");
        return bArr[1];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int H1(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$count$0");
        G.p(predicate, "predicate");
        int i10 = 0;
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super H0>> C H2(short[] sArr, C destination, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterNotTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (!((Boolean) b.a(s10, predicate)).booleanValue()) {
                destination.add(new H0(s10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R H3(short[] sArr, R r10, q<? super Integer, ? super R, ? super H0, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$foldIndexed$0");
        G.p(operation, "operation");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, new H0(sArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, M extends Map<? super K, List<t0>>> M H4(byte[] bArr, M destination, l<? super t0, ? extends K> keySelector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        for (byte b10 : bArr) {
            Object objA = d.a(b10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(new t0(b10));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C H5(short[] sArr, C destination, l<? super H0, ? extends R> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$mapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (short s10 : sArr) {
            destination.add(transform.invoke(new H0(s10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final x0 H6(@NotNull int[] iArr, @NotNull Comparator<? super x0> comparator) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxWithOrNull$0");
        G.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(new x0(i10), new x0(i12)) < 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minOrThrow-U")
    public static final int H7(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$min$0");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final t0 H8(@NotNull byte[] bArr, @NotNull Random random) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$randomOrNull$0");
        G.p(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return new t0(bArr[random.q(bArr.length)]);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> H9(byte[] bArr, R r10, p<? super R, ? super t0, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningFold$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, new t0(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> Ha(@NotNull long[] jArr, @NotNull md.l indices) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$slice$0");
        G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : f.c(C4875q.k1(jArr, indices.f221139a, indices.f221140b + 1));
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final int Hb(long[] jArr, l<? super B0, x0> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumBy$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (long j10 : jArr) {
            i10 += ((x0) c.a(j10, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final t0[] Hc(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$toTypedArray$0");
        int length = bArr.length;
        t0[] t0VarArr = new t0[length];
        for (int i10 = 0; i10 < length; i10++) {
            t0VarArr[i10] = new t0(bArr[i10]);
        }
        return t0VarArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long I0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$component2$0");
        return jArr[1];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int I1(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$count$0");
        G.p(predicate, "predicate");
        int i10 = 0;
        for (int i11 : iArr) {
            if (((Boolean) e.a(i11, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super x0>> C I2(int[] iArr, C destination, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterNotTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (!((Boolean) e.a(i10, predicate)).booleanValue()) {
                destination.add(new x0(i10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R I3(long[] jArr, R r10, q<? super Integer, ? super R, ? super B0, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$foldIndexed$0");
        G.p(operation, "operation");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, new B0(jArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, V, M extends Map<? super K, List<V>>> M I4(int[] iArr, M destination, l<? super x0, ? extends K> keySelector, l<? super x0, ? extends V> valueTransform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            Object objA = e.a(i10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new x0(i10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C I5(int[] iArr, C destination, l<? super x0, ? extends R> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$mapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (int i10 : iArr) {
            destination.add(transform.invoke(new x0(i10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final H0 I6(@NotNull short[] sArr, @NotNull Comparator<? super H0> comparator) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxWithOrNull$0");
        G.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(new H0(s10), new H0(s11)) < 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minOrThrow-U")
    public static final long I7(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$min$0");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final H0 I8(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$randomOrNull$0");
        return J8(sArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> I9(int[] iArr, R r10, p<? super R, ? super x0, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningFold$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, new x0(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> Ia(@NotNull byte[] bArr, @NotNull md.l indices) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$slice$0");
        G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : f.b(C4875q.f1(bArr, indices.f221139a, indices.f221140b + 1));
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final int Ib(int[] iArr, l<? super x0, x0> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumBy$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += ((x0) e.a(i11, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final B0[] Ic(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$toTypedArray$0");
        int length = jArr.length;
        B0[] b0Arr = new B0[length];
        for (int i10 = 0; i10 < length; i10++) {
            b0Arr[i10] = new B0(jArr[i10]);
        }
        return b0Arr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short J0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$component2$0");
        return sArr[1];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int J1(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$count$0");
        G.p(predicate, "predicate");
        int i10 = 0;
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super t0>> C J2(byte[] bArr, C destination, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterNotTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!((Boolean) d.a(b10, predicate)).booleanValue()) {
                destination.add(new t0(b10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R J3(int[] iArr, R r10, q<? super Integer, ? super R, ? super x0, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$foldIndexed$0");
        G.p(operation, "operation");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, new x0(iArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, V, M extends Map<? super K, List<V>>> M J4(long[] jArr, M destination, l<? super B0, ? extends K> keySelector, l<? super B0, ? extends V> valueTransform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            Object objA = c.a(j10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new B0(j10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C J5(byte[] bArr, C destination, l<? super t0, ? extends R> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$mapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (byte b10 : bArr) {
            destination.add(transform.invoke(new t0(b10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final B0 J6(@NotNull long[] jArr, @NotNull Comparator<? super B0> comparator) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxWithOrNull$0");
        G.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(new B0(j10), new B0(j11)) < 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minOrThrow-U")
    public static final short J7(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$min$0");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (G.t(s10 & H0.f217455d, 65535 & s11) > 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final H0 J8(@NotNull short[] sArr, @NotNull Random random) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$randomOrNull$0");
        G.p(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return new H0(sArr[random.q(sArr.length)]);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> J9(short[] sArr, R r10, p<? super R, ? super H0, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningFold$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, new H0(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> Ja(@NotNull int[] iArr, @NotNull md.l indices) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$slice$0");
        G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : f.a(C4875q.j1(iArr, indices.f221139a, indices.f221140b + 1));
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final int Jb(short[] sArr, l<? super H0, x0> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumBy$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += ((x0) b.a(s10, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final H0[] Jc(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$toTypedArray$0");
        int length = sArr.length;
        H0[] h0Arr = new H0[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0Arr[i10] = new H0(sArr[i10]);
        }
        return h0Arr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int K0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$component3$0");
        return iArr[2];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> K1(@NotNull byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$drop$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = bArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return qc(bArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super B0>> C K2(long[] jArr, C destination, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                destination.add(new B0(j10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R K3(long[] jArr, R r10, p<? super B0, ? super R, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$foldRight$0");
        G.p(operation, "operation");
        for (int length = jArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(new B0(jArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, M extends Map<? super K, List<B0>>> M K4(long[] jArr, M destination, l<? super B0, ? extends K> keySelector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        for (long j10 : jArr) {
            Object objA = c.a(j10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(new B0(j10));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> t0 K5(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxByOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length == 0) {
            return new t0(b10);
        }
        Comparable comparable = (Comparable) d.a(b10, selector);
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                Comparable comparable2 = (Comparable) d.a(b11, selector);
                if (comparable.compareTo(comparable2) < 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxWithOrThrow-U")
    public static final byte K6(@NotNull byte[] bArr, @NotNull Comparator<? super t0> comparator) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxWith$0");
        G.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(new t0(b10), new t0(b11)) < 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final t0 K7(@NotNull byte[] bArr, @NotNull Comparator<? super t0> comparator) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minWithOrNull$0");
        G.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(new t0(b10), new t0(b11)) > 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte K8(byte[] bArr, p<? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduce$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                b10 = operation.invoke(new t0(b10), new t0(bArr[i10])).f218221a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> K9(byte[] bArr, R r10, q<? super Integer, ? super R, ? super t0, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningFoldIndexed$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new t0(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] Ka(@NotNull int[] iArr, @NotNull Collection<Integer> indices) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.yu(iArr, indices);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final double Kb(byte[] bArr, l<? super t0, Double> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumByDouble$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += ((Number) d.a(b10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] Kc(byte[] bArr) {
        G.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte L0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$component3$0");
        return bArr[2];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> L1(@NotNull short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$drop$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = sArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return rc(sArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super H0>> C L2(short[] sArr, C destination, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                destination.add(new H0(s10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R L3(byte[] bArr, R r10, p<? super t0, ? super R, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$foldRight$0");
        G.p(operation, "operation");
        for (int length = bArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(new t0(bArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, M extends Map<? super K, List<H0>>> M L4(short[] sArr, M destination, l<? super H0, ? extends K> keySelector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        for (short s10 : sArr) {
            Object objA = b.a(s10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(new H0(s10));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> B0 L5(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxByOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length == 0) {
            return new B0(j10);
        }
        Comparable comparable = (Comparable) c.a(j10, selector);
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                Comparable comparable2 = (Comparable) c.a(j11, selector);
                if (comparable.compareTo(comparable2) < 0) {
                    j10 = j11;
                    comparable = comparable2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxWithOrThrow-U")
    public static final int L6(@NotNull int[] iArr, @NotNull Comparator<? super x0> comparator) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxWith$0");
        G.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(new x0(i10), new x0(i12)) < 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final x0 L7(@NotNull int[] iArr, @NotNull Comparator<? super x0> comparator) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minWithOrNull$0");
        G.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(new x0(i10), new x0(i12)) > 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int L8(int[] iArr, p<? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduce$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                i10 = operation.invoke(new x0(i10), new x0(iArr[i11])).f218498a;
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> L9(short[] sArr, R r10, q<? super Integer, ? super R, ? super H0, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningFoldIndexed$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new H0(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] La(@NotNull short[] sArr, @NotNull md.l indices) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.Fu(sArr, indices);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final double Lb(long[] jArr, l<? super B0, Double> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumByDouble$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += ((Number) c.a(j10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] Lc(@NotNull t0[] t0VarArr) {
        G.p(t0VarArr, "<this>");
        int length = t0VarArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = t0VarArr[i10].f218221a;
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long M0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$component3$0");
        return jArr[2];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> M1(@NotNull int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$drop$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = iArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return sc(iArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super x0>> C M2(int[] iArr, C destination, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                destination.add(new x0(i10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R M3(int[] iArr, R r10, p<? super x0, ? super R, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$foldRight$0");
        G.p(operation, "operation");
        for (int length = iArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(new x0(iArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, V, M extends Map<? super K, List<V>>> M M4(short[] sArr, M destination, l<? super H0, ? extends K> keySelector, l<? super H0, ? extends V> valueTransform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            Object objA = b.a(s10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new H0(s10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> x0 M5(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxByOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length == 0) {
            return new x0(i10);
        }
        Comparable comparable = (Comparable) e.a(i10, selector);
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                Comparable comparable2 = (Comparable) e.a(i12, selector);
                if (comparable.compareTo(comparable2) < 0) {
                    i10 = i12;
                    comparable = comparable2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxWithOrThrow-U")
    public static final long M6(@NotNull long[] jArr, @NotNull Comparator<? super B0> comparator) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxWith$0");
        G.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(new B0(j10), new B0(j11)) < 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final H0 M7(@NotNull short[] sArr, @NotNull Comparator<? super H0> comparator) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minWithOrNull$0");
        G.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(new H0(s10), new H0(s11)) > 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long M8(long[] jArr, p<? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduce$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                j10 = operation.invoke(new B0(j10), new B0(jArr[i10])).f217440a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> M9(long[] jArr, R r10, q<? super Integer, ? super R, ? super B0, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningFoldIndexed$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new B0(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] Ma(@NotNull long[] jArr, @NotNull md.l indices) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.Bu(jArr, indices);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final double Mb(int[] iArr, l<? super x0, Double> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumByDouble$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += ((Number) e.a(i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] Mc(int[] iArr) {
        G.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short N0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$component3$0");
        return sArr[2];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> N1(@NotNull long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$drop$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = jArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return tc(jArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super t0>> C N2(byte[] bArr, C destination, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                destination.add(new t0(b10));
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R N3(short[] sArr, R r10, p<? super H0, ? super R, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$foldRight$0");
        G.p(operation, "operation");
        for (int length = sArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(new H0(sArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <K, V, M extends Map<? super K, List<V>>> M N4(byte[] bArr, M destination, l<? super t0, ? extends K> keySelector, l<? super t0, ? extends V> valueTransform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupByTo$0");
        G.p(destination, "destination");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            Object objA = d.a(b10, keySelector);
            Object objA2 = destination.get(objA);
            if (objA2 == null) {
                objA2 = C1922j1.a(destination, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new t0(b10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> H0 N5(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxByOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length == 0) {
            return new H0(s10);
        }
        Comparable comparable = (Comparable) b.a(s10, selector);
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                Comparable comparable2 = (Comparable) b.a(s11, selector);
                if (comparable.compareTo(comparable2) < 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "maxWithOrThrow-U")
    public static final short N6(@NotNull short[] sArr, @NotNull Comparator<? super H0> comparator) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxWith$0");
        G.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(new H0(s10), new H0(s11)) < 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final B0 N7(@NotNull long[] jArr, @NotNull Comparator<? super B0> comparator) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minWithOrNull$0");
        G.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(new B0(j10), new B0(j11)) > 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short N8(short[] sArr, p<? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduce$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                s10 = operation.invoke(new H0(s10), new H0(sArr[i10])).f217458a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> N9(int[] iArr, R r10, q<? super Integer, ? super R, ? super x0, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningFoldIndexed$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new x0(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] Na(@NotNull byte[] bArr, @NotNull md.l indices) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.ru(bArr, indices);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    @InterfaceC5045x
    public static final double Nb(short[] sArr, l<? super H0, Double> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumByDouble$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += ((Number) b.a(s10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] Nc(@NotNull x0[] x0VarArr) {
        G.p(x0VarArr, "<this>");
        int length = x0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = x0VarArr[i10].f218498a;
        }
        return iArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int O0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$component4$0");
        return iArr[3];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> O1(@NotNull byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$dropLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = bArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return mc(bArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final t0 O2(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$find$0");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return new t0(b10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R O3(byte[] bArr, R r10, q<? super Integer, ? super t0, ? super R, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$foldRightIndexed$0");
        G.p(operation, "operation");
        for (int length = bArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), new t0(bArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int O4(long[] jArr, long j10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$indexOf$0");
        return B.ag(jArr, j10);
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "maxByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> byte O5(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxBy$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) d.a(b10, selector);
            if (1 <= length) {
                while (true) {
                    byte b11 = bArr[i10];
                    Comparable comparable2 = (Comparable) d.a(b11, selector);
                    if (comparable.compareTo(comparable2) < 0) {
                        b10 = b11;
                        comparable = comparable2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> t0 O6(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minByOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length == 0) {
            return new t0(b10);
        }
        Comparable comparable = (Comparable) d.a(b10, selector);
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                Comparable comparable2 = (Comparable) d.a(b11, selector);
                if (comparable.compareTo(comparable2) > 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minWithOrThrow-U")
    public static final byte O7(@NotNull byte[] bArr, @NotNull Comparator<? super t0> comparator) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minWith$0");
        G.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(new t0(b10), new t0(b11)) > 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int O8(int[] iArr, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceIndexed$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                i10 = operation.invoke(Integer.valueOf(i11), new x0(i10), new x0(iArr[i11])).f218498a;
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> O9(byte[] bArr, p<? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningReduce$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return EmptyList.f217510a;
        }
        byte b10 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(new t0(b10));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            b10 = operation.invoke(new t0(b10), new t0(bArr[i10])).f218221a;
            arrayList.add(new t0(b10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] Oa(@NotNull long[] jArr, @NotNull Collection<Integer> indices) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.Au(jArr, indices);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    @InterfaceC5045x
    public static final double Ob(byte[] bArr, l<? super t0, Double> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += ((Number) d.a(b10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] Oc(long[] jArr) {
        G.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte P0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$component4$0");
        return bArr[3];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> P1(@NotNull short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$dropLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = sArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return nc(sArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final B0 P2(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$find$0");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return new B0(j10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R P3(short[] sArr, R r10, q<? super Integer, ? super H0, ? super R, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$foldRightIndexed$0");
        G.p(operation, "operation");
        for (int length = sArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), new H0(sArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int P4(short[] sArr, short s10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$indexOf$0");
        return B.cg(sArr, s10);
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "maxByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> int P5(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxBy$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) e.a(i10, selector);
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    Comparable comparable2 = (Comparable) e.a(i12, selector);
                    if (comparable.compareTo(comparable2) < 0) {
                        i10 = i12;
                        comparable = comparable2;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> B0 P6(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minByOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length == 0) {
            return new B0(j10);
        }
        Comparable comparable = (Comparable) c.a(j10, selector);
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                Comparable comparable2 = (Comparable) c.a(j11, selector);
                if (comparable.compareTo(comparable2) > 0) {
                    j10 = j11;
                    comparable = comparable2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minWithOrThrow-U")
    public static final int P7(@NotNull int[] iArr, @NotNull Comparator<? super x0> comparator) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minWith$0");
        G.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(new x0(i10), new x0(i12)) > 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte P8(byte[] bArr, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceIndexed$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                b10 = operation.invoke(Integer.valueOf(i10), new t0(b10), new t0(bArr[i10])).f218221a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> P9(int[] iArr, p<? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningReduce$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return EmptyList.f217510a;
        }
        int i10 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(new x0(i10));
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            i10 = operation.invoke(new x0(i10), new x0(iArr[i11])).f218498a;
            arrayList.add(new x0(i10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] Pa(@NotNull short[] sArr, @NotNull Collection<Integer> indices) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.Eu(sArr, indices);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    @InterfaceC5045x
    public static final double Pb(int[] iArr, l<? super x0, Double> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += ((Number) e.a(i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] Pc(@NotNull B0[] b0Arr) {
        G.p(b0Arr, "<this>");
        int length = b0Arr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = b0Arr[i10].f217440a;
        }
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long Q0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$component4$0");
        return jArr[3];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> Q1(@NotNull int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$dropLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = iArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return oc(iArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final x0 Q2(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$find$0");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                return new x0(i10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R Q3(long[] jArr, R r10, q<? super Integer, ? super B0, ? super R, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$foldRightIndexed$0");
        G.p(operation, "operation");
        for (int length = jArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), new B0(jArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int Q4(byte[] bArr, byte b10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$indexOf$0");
        return B.Vf(bArr, b10);
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "maxByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> long Q5(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxBy$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) c.a(j10, selector);
            if (1 <= length) {
                while (true) {
                    long j11 = jArr[i10];
                    Comparable comparable2 = (Comparable) c.a(j11, selector);
                    if (comparable.compareTo(comparable2) < 0) {
                        j10 = j11;
                        comparable = comparable2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> x0 Q6(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minByOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length == 0) {
            return new x0(i10);
        }
        Comparable comparable = (Comparable) e.a(i10, selector);
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                Comparable comparable2 = (Comparable) e.a(i12, selector);
                if (comparable.compareTo(comparable2) > 0) {
                    i10 = i12;
                    comparable = comparable2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minWithOrThrow-U")
    public static final long Q7(@NotNull long[] jArr, @NotNull Comparator<? super B0> comparator) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minWith$0");
        G.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(new B0(j10), new B0(j11)) > 0) {
                    j10 = j11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short Q8(short[] sArr, q<? super Integer, ? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceIndexed$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                s10 = operation.invoke(Integer.valueOf(i10), new H0(s10), new H0(sArr[i10])).f217458a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> Q9(long[] jArr, p<? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningReduce$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return EmptyList.f217510a;
        }
        long j10 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(new B0(j10));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            j10 = operation.invoke(new B0(j10), new B0(jArr[i10])).f217440a;
            arrayList.add(new B0(j10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] Qa(@NotNull int[] iArr, @NotNull md.l indices) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.zu(iArr, indices);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    @InterfaceC5045x
    public static final double Qb(long[] jArr, l<? super B0, Double> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += ((Number) c.a(j10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] Qc(@NotNull H0[] h0Arr) {
        G.p(h0Arr, "<this>");
        int length = h0Arr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = h0Arr[i10].f217458a;
        }
        return sArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short R0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$component4$0");
        return sArr[3];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> R1(@NotNull long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$dropLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        int length = jArr.length - i10;
        if (length < 0) {
            length = 0;
        }
        return pc(jArr, length);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final H0 R2(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$find$0");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return new H0(s10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> R R3(int[] iArr, R r10, q<? super Integer, ? super x0, ? super R, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$foldRightIndexed$0");
        G.p(operation, "operation");
        for (int length = iArr.length - 1; length >= 0; length--) {
            r10 = operation.invoke(Integer.valueOf(length), new x0(iArr[length]), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int R4(int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$indexOf$0");
        return B.Zf(iArr, i10);
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "maxByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> short R5(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxBy$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) b.a(s10, selector);
            if (1 <= length) {
                while (true) {
                    short s11 = sArr[i10];
                    Comparable comparable2 = (Comparable) b.a(s11, selector);
                    if (comparable.compareTo(comparable2) < 0) {
                        s10 = s11;
                        comparable = comparable2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R extends Comparable<? super R>> H0 R6(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minByOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length == 0) {
            return new H0(s10);
        }
        Comparable comparable = (Comparable) b.a(s10, selector);
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                Comparable comparable2 = (Comparable) b.a(s11, selector);
                if (comparable.compareTo(comparable2) > 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.7")
    @InterfaceC5045x
    @dd.j(name = "minWithOrThrow-U")
    public static final short R7(@NotNull short[] sArr, @NotNull Comparator<? super H0> comparator) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minWith$0");
        G.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(new H0(s10), new H0(s11)) > 0) {
                    s10 = s11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long R8(long[] jArr, q<? super Integer, ? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceIndexed$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                j10 = operation.invoke(Integer.valueOf(i10), new B0(j10), new B0(jArr[i10])).f217440a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> R9(short[] sArr, p<? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningReduce$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return EmptyList.f217510a;
        }
        short s10 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(new H0(s10));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            s10 = operation.invoke(new H0(s10), new H0(sArr[i10])).f217458a;
            arrayList.add(new H0(s10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] Ra(@NotNull byte[] bArr, @NotNull Collection<Integer> indices) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sliceArray$0");
        G.p(indices, "indices");
        return B.qu(bArr, indices);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    @InterfaceC5045x
    public static final double Rb(short[] sArr, l<? super H0, Double> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += ((Number) b.a(s10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] Rc(short[] sArr) {
        G.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int S0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$component5$0");
        return iArr[4];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> S1(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$dropLastWhile$0");
        G.p(predicate, "predicate");
        int length = bArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (((Boolean) d.a(bArr[length], predicate)).booleanValue());
        return mc(bArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final t0 S2(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$findLast$0");
        G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return new t0(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void S3(byte[] bArr, l<? super t0, L0> action) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$forEach$0");
        G.p(action, "action");
        for (byte b10 : bArr) {
            action.invoke(new t0(b10));
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int S4(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$indexOfFirst$0");
        G.p(predicate, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (((Boolean) d.a(bArr[i10], predicate)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double S5(byte[] bArr, l<? super t0, Double> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) d.a(bArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) d.a(bArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "minByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> byte S6(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minBy$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) d.a(b10, selector);
            if (1 <= length) {
                while (true) {
                    byte b11 = bArr[i10];
                    Comparable comparable2 = (Comparable) d.a(b11, selector);
                    if (comparable.compareTo(comparable2) > 0) {
                        b10 = b11;
                        comparable = comparable2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean S7(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$none$0");
        return iArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final x0 S8(int[] iArr, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceIndexedOrNull$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                i10 = operation.invoke(Integer.valueOf(i11), new x0(i10), new x0(iArr[i11])).f218498a;
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> S9(int[] iArr, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningReduceIndexed$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return EmptyList.f217510a;
        }
        int i10 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(new x0(i10));
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            i10 = operation.invoke(Integer.valueOf(i11), new x0(i10), new x0(iArr[i11])).f218498a;
            arrayList.add(new x0(i10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void Sa(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sort$0");
        if (iArr.length > 1) {
            D0.l(iArr, 0, iArr.length);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    @InterfaceC5045x
    public static final int Sb(byte[] bArr, l<? super t0, Integer> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += ((Number) d.a(b10, selector)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final Iterable<C4858c0<x0>> Sc(@NotNull final int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$withIndex$0");
        return new C4860d0(new InterfaceC4376a() { // from class: Nc.g
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return new y0.a(iArr);
            }
        });
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte T0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$component5$0");
        return bArr[4];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> T1(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$dropLastWhile$0");
        G.p(predicate, "predicate");
        int length = jArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (((Boolean) c.a(jArr[length], predicate)).booleanValue());
        return pc(jArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final B0 T2(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$findLast$0");
        G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return new B0(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void T3(long[] jArr, l<? super B0, L0> action) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$forEach$0");
        G.p(action, "action");
        for (long j10 : jArr) {
            action.invoke(new B0(j10));
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int T4(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$indexOfFirst$0");
        G.p(predicate, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (((Boolean) c.a(jArr[i10], predicate)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float T5(byte[] bArr, l<? super t0, Float> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) d.a(bArr[0], selector)).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) d.a(bArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "minByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> int T6(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minBy$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) e.a(i10, selector);
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    Comparable comparable2 = (Comparable) e.a(i12, selector);
                    if (comparable.compareTo(comparable2) > 0) {
                        i10 = i12;
                        comparable = comparable2;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean T7(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$none$0");
        return bArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final t0 T8(byte[] bArr, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceIndexedOrNull$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                b10 = operation.invoke(Integer.valueOf(i10), new t0(b10), new t0(bArr[i10])).f218221a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> T9(byte[] bArr, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningReduceIndexed$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return EmptyList.f217510a;
        }
        byte b10 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(new t0(b10));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            b10 = operation.invoke(Integer.valueOf(i10), new t0(b10), new t0(bArr[i10])).f218221a;
            arrayList.add(new t0(b10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void Ta(@NotNull long[] jArr, int i10, int i11) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sort$0");
        AbstractC4859d.f217603a.d(i10, i11, jArr.length);
        if (i10 < i11 - 1) {
            D0.i(jArr, i10, i11);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    @InterfaceC5045x
    public static final int Tb(int[] iArr, l<? super x0, Integer> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += ((Number) e.a(i10, selector)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final Iterable<C4858c0<t0>> Tc(@NotNull final byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$withIndex$0");
        return new C4860d0(new InterfaceC4376a() { // from class: Nc.i
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return new u0.a(bArr);
            }
        });
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long U0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$component5$0");
        return jArr[4];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> U1(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$dropLastWhile$0");
        G.p(predicate, "predicate");
        int length = iArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (((Boolean) e.a(iArr[length], predicate)).booleanValue());
        return oc(iArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final x0 U2(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$findLast$0");
        G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (((Boolean) e.a(i11, predicate)).booleanValue()) {
                return new x0(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void U3(int[] iArr, l<? super x0, L0> action) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$forEach$0");
        G.p(action, "action");
        for (int i10 : iArr) {
            action.invoke(new x0(i10));
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int U4(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$indexOfFirst$0");
        G.p(predicate, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (((Boolean) e.a(iArr[i10], predicate)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R U5(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) d.a(bArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "minByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> long U6(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minBy$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) c.a(j10, selector);
            if (1 <= length) {
                while (true) {
                    long j11 = jArr[i10];
                    Comparable comparable2 = (Comparable) c.a(j11, selector);
                    if (comparable.compareTo(comparable2) > 0) {
                        j10 = j11;
                        comparable = comparable2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean U7(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$none$0");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final H0 U8(short[] sArr, q<? super Integer, ? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceIndexedOrNull$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                s10 = operation.invoke(Integer.valueOf(i10), new H0(s10), new H0(sArr[i10])).f217458a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> U9(short[] sArr, q<? super Integer, ? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningReduceIndexed$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return EmptyList.f217510a;
        }
        short s10 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(new H0(s10));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            s10 = operation.invoke(Integer.valueOf(i10), new H0(s10), new H0(sArr[i10])).f217458a;
            arrayList.add(new H0(s10));
        }
        return arrayList;
    }

    public static void Ua(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        Ta(jArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    @InterfaceC5045x
    public static final int Ub(long[] jArr, l<? super B0, Integer> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += ((Number) c.a(j10, selector)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final Iterable<C4858c0<B0>> Uc(@NotNull final long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$withIndex$0");
        return new C4860d0(new InterfaceC4376a() { // from class: Nc.h
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return new C0.a(jArr);
            }
        });
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short V0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$component5$0");
        return sArr[4];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> V1(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$dropLastWhile$0");
        G.p(predicate, "predicate");
        int length = sArr.length;
        do {
            length--;
            if (-1 >= length) {
                return EmptyList.f217510a;
            }
        } while (((Boolean) b.a(sArr[length], predicate)).booleanValue());
        return nc(sArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final H0 V2(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$findLast$0");
        G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return new H0(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void V3(short[] sArr, l<? super H0, L0> action) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$forEach$0");
        G.p(action, "action");
        for (short s10 : sArr) {
            action.invoke(new H0(s10));
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int V4(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$indexOfFirst$0");
        G.p(predicate, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (((Boolean) b.a(sArr[i10], predicate)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double V5(long[] jArr, l<? super B0, Double> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) c.a(jArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) c.a(jArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "minByOrThrow-U")
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> short V6(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minBy$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length != 0) {
            Comparable comparable = (Comparable) b.a(s10, selector);
            if (1 <= length) {
                while (true) {
                    short s11 = sArr[i10];
                    Comparable comparable2 = (Comparable) b.a(s11, selector);
                    if (comparable.compareTo(comparable2) > 0) {
                        s10 = s11;
                        comparable = comparable2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean V7(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$none$0");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final B0 V8(long[] jArr, q<? super Integer, ? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceIndexedOrNull$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                j10 = operation.invoke(Integer.valueOf(i10), new B0(j10), new B0(jArr[i10])).f217440a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> V9(long[] jArr, q<? super Integer, ? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningReduceIndexed$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return EmptyList.f217510a;
        }
        long j10 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(new B0(j10));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            j10 = operation.invoke(Integer.valueOf(i10), new B0(j10), new B0(jArr[i10])).f217440a;
            arrayList.add(new B0(j10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void Va(@NotNull byte[] bArr, int i10, int i11) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sort$0");
        AbstractC4859d.f217603a.d(i10, i11, bArr.length);
        if (i10 < i11 - 1) {
            D0.j(bArr, i10, i11);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    @InterfaceC5045x
    public static final int Vb(short[] sArr, l<? super H0, Integer> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += ((Number) b.a(s10, selector)).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final Iterable<C4858c0<H0>> Vc(@NotNull final short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$withIndex$0");
        return new C4860d0(new InterfaceC4376a() { // from class: Nc.j
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return new I0.a(sArr);
            }
        });
    }

    public static Iterator W(short[] sArr) {
        return new I0.a(sArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static boolean W0(@Nullable short[] sArr, @Nullable short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> W1(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$dropWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (z10) {
                arrayList.add(new t0(b10));
            } else if (!((Boolean) d.a(b10, predicate)).booleanValue()) {
                arrayList.add(new t0(b10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int W2(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$first$0");
        return B.fc(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void W3(byte[] bArr, p<? super Integer, ? super t0, L0> action) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$forEachIndexed$0");
        G.p(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new t0(bArr[i10]));
            i10++;
            i11++;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int W4(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$indexOfLast$0");
        G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) d.a(bArr[length], predicate)).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float W5(long[] jArr, l<? super B0, Float> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) c.a(jArr[0], selector)).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) c.a(jArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double W6(byte[] bArr, l<? super t0, Double> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) d.a(bArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) d.a(bArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean W7(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$none$0");
        return jArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final t0 W8(byte[] bArr, p<? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceOrNull$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                b10 = operation.invoke(new t0(b10), new t0(bArr[i10])).f218221a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> W9(long[] jArr, R r10, p<? super R, ? super B0, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$scan$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, new B0(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static void Wa(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        Va(bArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    @InterfaceC5045x
    public static final long Wb(byte[] bArr, l<? super t0, Long> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long jLongValue = 0;
        for (byte b10 : bArr) {
            jLongValue += ((Number) d.a(b10, selector)).longValue();
        }
        return jLongValue;
    }

    public static final Iterator Wc(byte[] bArr) {
        return new u0.a(bArr);
    }

    public static Iterator X(int[] iArr) {
        return new y0.a(iArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static boolean X0(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> X1(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$dropWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (long j10 : jArr) {
            if (z10) {
                arrayList.add(new B0(j10));
            } else if (!((Boolean) c.a(j10, predicate)).booleanValue()) {
                arrayList.add(new B0(j10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte X2(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$first$0");
        return B.Xb(bArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void X3(int[] iArr, p<? super Integer, ? super x0, L0> action) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$forEachIndexed$0");
        G.p(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new x0(iArr[i10]));
            i10++;
            i11++;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int X4(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$indexOfLast$0");
        G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) c.a(jArr[length], predicate)).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R X5(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) c.a(jArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float X6(byte[] bArr, l<? super t0, Float> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) d.a(bArr[0], selector)).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) d.a(bArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean X7(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$none$0");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final x0 X8(int[] iArr, p<? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceOrNull$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                i10 = operation.invoke(new x0(i10), new x0(iArr[i11])).f218498a;
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> X9(byte[] bArr, R r10, p<? super R, ? super t0, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$scan$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, new t0(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void Xa(@NotNull short[] sArr, int i10, int i11) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sort$0");
        AbstractC4859d.f217603a.d(i10, i11, sArr.length);
        if (i10 < i11 - 1) {
            D0.k(sArr, i10, i11);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    @InterfaceC5045x
    public static final long Xb(int[] iArr, l<? super x0, Long> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long jLongValue = 0;
        for (int i10 : iArr) {
            jLongValue += ((Number) e.a(i10, selector)).longValue();
        }
        return jLongValue;
    }

    public static final Iterator Xc(long[] jArr) {
        return new C0.a(jArr);
    }

    public static Iterator Y(byte[] bArr) {
        return new u0.a(bArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static boolean Y0(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> Y1(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$dropWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (z10) {
                arrayList.add(new x0(i10));
            } else if (!((Boolean) e.a(i10, predicate)).booleanValue()) {
                arrayList.add(new x0(i10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte Y2(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$first$0");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return b10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void Y3(long[] jArr, p<? super Integer, ? super B0, L0> action) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$forEachIndexed$0");
        G.p(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new B0(jArr[i10]));
            i10++;
            i11++;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int Y4(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$indexOfLast$0");
        G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) e.a(iArr[length], predicate)).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double Y5(int[] iArr, l<? super x0, Double> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) e.a(iArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) e.a(iArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R Y6(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) d.a(bArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean Y7(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$none$0");
        return sArr.length == 0;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final B0 Y8(long[] jArr, p<? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceOrNull$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                j10 = operation.invoke(new B0(j10), new B0(jArr[i10])).f217440a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> Y9(int[] iArr, R r10, p<? super R, ? super x0, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$scan$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, new x0(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static void Ya(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        Xa(sArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    @InterfaceC5045x
    public static final long Yb(long[] jArr, l<? super B0, Long> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long jLongValue = 0;
        for (long j10 : jArr) {
            jLongValue += ((Number) c.a(j10, selector)).longValue();
        }
        return jLongValue;
    }

    public static final Iterator Yc(int[] iArr) {
        return new y0.a(iArr);
    }

    public static Iterator Z(long[] jArr) {
        return new C0.a(jArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static boolean Z0(@Nullable long[] jArr, @Nullable long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> Z1(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$dropWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (short s10 : sArr) {
            if (z10) {
                arrayList.add(new H0(s10));
            } else if (!((Boolean) b.a(s10, predicate)).booleanValue()) {
                arrayList.add(new H0(s10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long Z2(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$first$0");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void Z3(short[] sArr, p<? super Integer, ? super H0, L0> action) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$forEachIndexed$0");
        G.p(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new H0(sArr[i10]));
            i10++;
            i11++;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int Z4(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$indexOfLast$0");
        G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) b.a(sArr[length], predicate)).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float Z5(int[] iArr, l<? super x0, Float> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) e.a(iArr[0], selector)).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) e.a(iArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double Z6(long[] jArr, l<? super B0, Double> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) c.a(jArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) c.a(jArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean Z7(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$none$0");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final H0 Z8(short[] sArr, p<? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceOrNull$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                s10 = operation.invoke(new H0(s10), new H0(sArr[i10])).f217458a;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> Z9(short[] sArr, R r10, p<? super R, ? super H0, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$scan$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, new H0(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void Za(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sort$0");
        if (bArr.length > 1) {
            D0.j(bArr, 0, bArr.length);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    @InterfaceC5045x
    public static final long Zb(short[] sArr, l<? super H0, Long> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long jLongValue = 0;
        for (short s10 : sArr) {
            jLongValue += ((Number) b.a(s10, selector)).longValue();
        }
        return jLongValue;
    }

    public static final Iterator Zc(short[] sArr) {
        return new I0.a(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean a0(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$all$0");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!((Boolean) d.a(b10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final int a1(@Nullable byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short a2(short[] sArr, int i10, l<? super Integer, H0> defaultValue) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$elementAtOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f217458a : sArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long a3(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$first$0");
        return B.hc(jArr);
    }

    @NotNull
    public static final md.l a4(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$indices$0");
        return B.De(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int a5(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$last$0");
        return B.Ph(iArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R a6(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) e.a(iArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float a7(long[] jArr, l<? super B0, Float> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) c.a(jArr[0], selector)).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) c.a(jArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] a8(byte[] bArr, l<? super t0, L0> action) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$onEach$0");
        G.p(action, "action");
        for (byte b10 : bArr) {
            action.invoke(new t0(b10));
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte a9(byte[] bArr, p<? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRight$0");
        G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b10 = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            b10 = operation.invoke(new t0(bArr[i11]), new t0(b10)).f218221a;
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> aa(byte[] bArr, R r10, q<? super Integer, ? super R, ? super t0, ? extends R> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$scanIndexed$0");
        G.p(operation, "operation");
        if (bArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new t0(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void ab(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sort$0");
        if (jArr.length > 1) {
            D0.i(jArr, 0, jArr.length);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUByte")
    public static final int ac(@NotNull t0[] t0VarArr) {
        G.p(t0VarArr, "<this>");
        int i10 = 0;
        for (t0 t0Var : t0VarArr) {
            i10 += t0Var.f218221a & 255;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> ad(int[] iArr, Iterable<? extends R> other, p<? super x0, ? super R, ? extends V> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(new x0(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean b0(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$all$0");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (!((Boolean) c.a(j10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final int b1(@Nullable int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int b2(int[] iArr, int i10, l<? super Integer, x0> defaultValue) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$elementAtOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f218498a : iArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int b3(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$first$0");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte b5(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$last$0");
        return B.Hh(bArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double b6(short[] sArr, l<? super H0, Double> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) b.a(sArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) b.a(sArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R b7(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) c.a(jArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final long[] b8(long[] jArr, l<? super B0, L0> action) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$onEach$0");
        G.p(action, "action");
        for (long j10 : jArr) {
            action.invoke(new B0(j10));
        }
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int b9(int[] iArr, p<? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRight$0");
        G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i11 = iArr[i10];
        for (int i12 = length - 2; i12 >= 0; i12--) {
            i11 = operation.invoke(new x0(iArr[i12]), new x0(i11)).f218498a;
        }
        return i11;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> ba(short[] sArr, R r10, q<? super Integer, ? super R, ? super H0, ? extends R> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$scanIndexed$0");
        G.p(operation, "operation");
        if (sArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new H0(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void bb(@NotNull int[] iArr, int i10, int i11) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sort$0");
        AbstractC4859d.f217603a.d(i10, i11, iArr.length);
        if (i10 < i11 - 1) {
            D0.l(iArr, i10, i11);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    @InterfaceC5045x
    public static final int bc(byte[] bArr, l<? super t0, x0> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += ((x0) d.a(b10, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> bd(long[] jArr, R[] other, p<? super B0, ? super R, ? extends V> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new B0(jArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean c0(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$all$0");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (!((Boolean) e.a(i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final int c1(@Nullable short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long c2(long[] jArr, int i10, l<? super Integer, B0> defaultValue) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$elementAtOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f217440a : jArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short c3(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$first$0");
        return B.lc(sArr);
    }

    @NotNull
    public static final md.l c4(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$indices$0");
        return B.ze(bArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte c5(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$last$0");
        G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (!((Boolean) d.a(b10, predicate)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return b10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float c6(short[] sArr, l<? super H0, Float> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) b.a(sArr[0], selector)).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) b.a(sArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double c7(int[] iArr, l<? super x0, Double> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) e.a(iArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) e.a(iArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final int[] c8(int[] iArr, l<? super x0, L0> action) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$onEach$0");
        G.p(action, "action");
        for (int i10 : iArr) {
            action.invoke(new x0(i10));
        }
        return iArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long c9(long[] jArr, p<? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRight$0");
        G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j10 = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            j10 = operation.invoke(new B0(jArr[i11]), new B0(j10)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> ca(long[] jArr, R r10, q<? super Integer, ? super R, ? super B0, ? extends R> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$scanIndexed$0");
        G.p(operation, "operation");
        if (jArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new B0(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static void cb(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        bb(iArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    @InterfaceC5045x
    public static final int cc(int[] iArr, l<? super x0, x0> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += ((x0) e.a(i11, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<x0, R>> cd(@NotNull int[] iArr, @NotNull R[] other) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        G.p(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(new Pair(new x0(i11), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean d0(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$all$0");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (!((Boolean) b.a(s10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final int d1(@Nullable long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte d2(byte[] bArr, int i10, l<? super Integer, t0> defaultValue) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$elementAtOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f218221a : bArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short d3(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$first$0");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return s10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long d5(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$last$0");
        G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (!((Boolean) c.a(j10, predicate)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return j10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R d6(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOf$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) b.a(sArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float d7(int[] iArr, l<? super x0, Float> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) e.a(iArr[0], selector)).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) e.a(iArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final short[] d8(short[] sArr, l<? super H0, L0> action) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$onEach$0");
        G.p(action, "action");
        for (short s10 : sArr) {
            action.invoke(new H0(s10));
        }
        return sArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short d9(short[] sArr, p<? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRight$0");
        G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            s10 = operation.invoke(new H0(sArr[i11]), new H0(s10)).f217458a;
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> da(int[] iArr, R r10, q<? super Integer, ? super R, ? super x0, ? extends R> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$scanIndexed$0");
        G.p(operation, "operation");
        if (iArr.length == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, new x0(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void db(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sort$0");
        if (sArr.length > 1) {
            D0.k(sArr, 0, sArr.length);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    @InterfaceC5045x
    public static final int dc(long[] jArr, l<? super B0, x0> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (long j10 : jArr) {
            i10 += ((x0) c.a(j10, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<B0, R>> dd(@NotNull long[] jArr, @NotNull Iterable<? extends R> other) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        G.p(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(new B0(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean e0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$any$0");
        return B.u5(iArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @NotNull
    public static String e1(@Nullable byte[] bArr) {
        String strR3;
        return (bArr == null || (strR3 = U.r3(new u0(bArr), U6.j.f68738d, "[", "]", 0, null, null, 56, null)) == null) ? "null" : strR3;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final t0 e2(byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$elementAtOrNull$0");
        return u4(bArr, i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final x0 e3(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$firstOrNull$0");
        if (iArr.length == 0) {
            return null;
        }
        return new x0(iArr[0]);
    }

    @NotNull
    public static final md.l e4(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$indices$0");
        return B.Ee(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long e5(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$last$0");
        return B.Rh(jArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R e6(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r10 = (R) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) d.a(bArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R e7(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) e.a(iArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] e8(byte[] bArr, p<? super Integer, ? super t0, L0> action) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$onEachIndexed$0");
        G.p(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new t0(bArr[i10]));
            i10++;
            i11++;
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int e9(int[] iArr, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRightIndexed$0");
        G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i11 = iArr[i10];
        for (int i12 = length - 2; i12 >= 0; i12--) {
            i11 = operation.invoke(Integer.valueOf(i12), new x0(iArr[i12]), new x0(i11)).f218498a;
        }
        return i11;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void ea(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$shuffle$0");
        fa(iArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void eb(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortDescending$0");
        if (iArr.length > 1) {
            Sa(iArr);
            B.rr(iArr);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUInt")
    public static final int ec(@NotNull x0[] x0VarArr) {
        G.p(x0VarArr, "<this>");
        int i10 = 0;
        for (x0 x0Var : x0VarArr) {
            i10 += x0Var.f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<x0, R>> ed(@NotNull int[] iArr, @NotNull Iterable<? extends R> other) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        G.p(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(new x0(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean f0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$any$0");
        return B.m5(bArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @NotNull
    public static String f1(@Nullable int[] iArr) {
        String strR3;
        return (iArr == null || (strR3 = U.r3(new y0(iArr), U6.j.f68738d, "[", "]", 0, null, null, 56, null)) == null) ? "null" : strR3;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final H0 f2(short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$elementAtOrNull$0");
        return v4(sArr, i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final t0 f3(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$firstOrNull$0");
        if (bArr.length == 0) {
            return null;
        }
        return new t0(bArr[0]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int f5(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$last$0");
        G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (!((Boolean) e.a(i11, predicate)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return i11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double f6(byte[] bArr, l<? super t0, Double> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) d.a(bArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) d.a(bArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final double f7(short[] sArr, l<? super H0, Double> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) b.a(sArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) b.a(sArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final int[] f8(int[] iArr, p<? super Integer, ? super x0, L0> action) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$onEachIndexed$0");
        G.p(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new x0(iArr[i10]));
            i10++;
            i11++;
        }
        return iArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte f9(byte[] bArr, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRightIndexed$0");
        G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b10 = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            b10 = operation.invoke(Integer.valueOf(i11), new t0(bArr[i11]), new t0(b10)).f218221a;
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void fa(@NotNull int[] iArr, @NotNull Random random) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$shuffle$0");
        G.p(random, "random");
        for (int length = iArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            int i10 = iArr[length];
            iArr[length] = iArr[iQ];
            iArr[iQ] = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void fb(@NotNull long[] jArr, int i10, int i11) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortDescending$0");
        Ta(jArr, i10, i11);
        B.ur(jArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    @InterfaceC5045x
    public static final int fc(short[] sArr, l<? super H0, x0> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        G.p(selector, "selector");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += ((x0) b.a(s10, selector)).f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <V> List<V> fd(byte[] bArr, byte[] bArr2, p<? super t0, ? super t0, ? extends V> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        G.p(bArr2, "$v$c$kotlin-UByteArray$-other$0");
        G.p(transform, "transform");
        int iMin = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new t0(bArr[i10]), new t0(bArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean g0(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$any$0");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @NotNull
    public static String g1(@Nullable short[] sArr) {
        String strR3;
        return (sArr == null || (strR3 = U.r3(new I0(sArr), U6.j.f68738d, "[", "]", 0, null, null, 56, null)) == null) ? "null" : strR3;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final x0 g2(int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$elementAtOrNull$0");
        return w4(iArr, i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final t0 g3(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$firstOrNull$0");
        G.p(predicate, "predicate");
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return new t0(b10);
            }
        }
        return null;
    }

    @NotNull
    public static final md.l g4(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$indices$0");
        return B.Ge(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short g5(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$last$0");
        return B.Vh(sArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float g6(byte[] bArr, l<? super t0, Float> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) d.a(bArr[0], selector)).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) d.a(bArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final float g7(short[] sArr, l<? super H0, Float> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) b.a(sArr[0], selector)).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) b.a(sArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final long[] g8(long[] jArr, p<? super Integer, ? super B0, L0> action) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$onEachIndexed$0");
        G.p(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new B0(jArr[i10]));
            i10++;
            i11++;
        }
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short g9(short[] sArr, q<? super Integer, ? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRightIndexed$0");
        G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s10 = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            s10 = operation.invoke(Integer.valueOf(i11), new H0(sArr[i11]), new H0(s10)).f217458a;
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void ga(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$shuffle$0");
        ja(bArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void gb(@NotNull byte[] bArr, int i10, int i11) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortDescending$0");
        Va(bArr, i10, i11);
        B.kr(bArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    @InterfaceC5045x
    public static final long gc(byte[] bArr, l<? super t0, B0> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long j10 = 0;
        for (byte b10 : bArr) {
            j10 += ((B0) d.a(b10, selector)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<H0, R>> gd(@NotNull short[] sArr, @NotNull Iterable<? extends R> other) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        G.p(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(new H0(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean h0(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$any$0");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @NotNull
    public static String h1(@Nullable long[] jArr) {
        String strR3;
        return (jArr == null || (strR3 = U.r3(new C0(jArr), U6.j.f68738d, "[", "]", 0, null, null, 56, null)) == null) ? "null" : strR3;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final B0 h2(long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$elementAtOrNull$0");
        return x4(jArr, i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final B0 h3(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$firstOrNull$0");
        G.p(predicate, "predicate");
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return new B0(j10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short h5(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$last$0");
        G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (!((Boolean) b.a(s10, predicate)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return s10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R h6(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r10 = (R) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) c.a(jArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R h7(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOf$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) b.a(sArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final short[] h8(short[] sArr, p<? super Integer, ? super H0, L0> action) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$onEachIndexed$0");
        G.p(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), new H0(sArr[i10]));
            i10++;
            i11++;
        }
        return sArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long h9(long[] jArr, q<? super Integer, ? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRightIndexed$0");
        G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j10 = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            j10 = operation.invoke(Integer.valueOf(i11), new B0(jArr[i11]), new B0(j10)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void ha(@NotNull long[] jArr, @NotNull Random random) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$shuffle$0");
        G.p(random, "random");
        for (int length = jArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            long j10 = jArr[length];
            jArr[length] = jArr[iQ];
            jArr[iQ] = j10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void hb(@NotNull short[] sArr, int i10, int i11) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortDescending$0");
        Xa(sArr, i10, i11);
        B.yr(sArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    @InterfaceC5045x
    public static final long hc(int[] iArr, l<? super x0, B0> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += ((B0) e.a(i10, selector)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<t0, R>> hd(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        G.p(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(new t0(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean i0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$any$0");
        return B.w5(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final long[] i1(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyInto$0");
        G.p(jArr2, "$v$c$kotlin-ULongArray$-destination$0");
        C4875q.A0(jArr, jArr2, i10, i11, i12);
        return jArr2;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void i2(@NotNull int[] iArr, int i10, int i11, int i12) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$fill$0");
        Arrays.fill(iArr, i11, i12, i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final B0 i3(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$firstOrNull$0");
        if (jArr.length == 0) {
            return null;
        }
        return new B0(jArr[0]);
    }

    public static final int i4(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastIndex$0");
        return iArr.length - 1;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int i5(long[] jArr, long j10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastIndexOf$0");
        return B.ei(jArr, j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double i6(long[] jArr, l<? super B0, Double> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) c.a(jArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) c.a(jArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R i7(byte[] bArr, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r10 = (R) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) d.a(bArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] i8(long[] jArr, long j10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$plus$0");
        return C4875q.t3(jArr, j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final x0 i9(int[] iArr, q<? super Integer, ? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRightIndexedOrNull$0");
        G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        int i11 = iArr[i10];
        for (int i12 = length - 2; i12 >= 0; i12--) {
            i11 = operation.invoke(Integer.valueOf(i12), new x0(iArr[i12]), new x0(i11)).f218498a;
        }
        return new x0(i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void ia(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$shuffle$0");
        ha(jArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void ib(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortDescending$0");
        if (bArr.length > 1) {
            Za(bArr);
            B.jr(bArr);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    @InterfaceC5045x
    public static final long ic(long[] jArr, l<? super B0, B0> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += ((B0) c.a(j11, selector)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <V> List<V> id(int[] iArr, int[] iArr2, p<? super x0, ? super x0, ? extends V> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        G.p(iArr2, "$v$c$kotlin-UIntArray$-other$0");
        G.p(transform, "transform");
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new x0(iArr[i10]), new x0(iArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean j0(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$any$0");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static long[] j1(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyInto$0");
        G.p(jArr2, "$v$c$kotlin-ULongArray$-destination$0");
        C4875q.A0(jArr, jArr2, i10, i11, i12);
        return jArr2;
    }

    public static void j2(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        i2(iArr, i10, i11, i12);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final x0 j3(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$firstOrNull$0");
        G.p(predicate, "predicate");
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                return new x0(i10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int j5(short[] sArr, short s10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastIndexOf$0");
        return B.gi(sArr, s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float j6(long[] jArr, l<? super B0, Float> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) c.a(jArr[0], selector)).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) c.a(jArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double j7(byte[] bArr, l<? super t0, Double> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) d.a(bArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) d.a(bArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] j8(@NotNull int[] iArr, @NotNull Collection<x0> elements) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$plus$0");
        G.p(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        Iterator<x0> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().f218498a;
            length++;
        }
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final t0 j9(byte[] bArr, q<? super Integer, ? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRightIndexedOrNull$0");
        G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        byte b10 = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            b10 = operation.invoke(Integer.valueOf(i11), new t0(bArr[i11]), new t0(b10)).f218221a;
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void ja(@NotNull byte[] bArr, @NotNull Random random) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$shuffle$0");
        G.p(random, "random");
        for (int length = bArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            byte b10 = bArr[length];
            bArr[length] = bArr[iQ];
            bArr[iQ] = b10;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void jb(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortDescending$0");
        if (jArr.length > 1) {
            ab(jArr);
            B.tr(jArr);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfULong")
    public static final long jc(@NotNull B0[] b0Arr) {
        G.p(b0Arr, "<this>");
        long j10 = 0;
        for (B0 b02 : b0Arr) {
            j10 += b02.f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> jd(byte[] bArr, R[] other, p<? super t0, ? super R, ? extends V> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new t0(bArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean k0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$any$0");
        return B.A5(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final short[] k1(short[] sArr, short[] sArr2, int i10, int i11, int i12) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyInto$0");
        G.p(sArr2, "$v$c$kotlin-UShortArray$-destination$0");
        C4875q.C0(sArr, sArr2, i10, i11, i12);
        return sArr2;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void k2(@NotNull short[] sArr, short s10, int i10, int i11) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$fill$0");
        Arrays.fill(sArr, i10, i11, s10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final H0 k3(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$firstOrNull$0");
        if (sArr.length == 0) {
            return null;
        }
        return new H0(sArr[0]);
    }

    public static final int k4(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastIndex$0");
        return bArr.length - 1;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int k5(byte[] bArr, byte b10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastIndexOf$0");
        return B.Zh(bArr, b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R k6(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r10 = (R) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) e.a(iArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float k7(byte[] bArr, l<? super t0, Float> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) d.a(bArr[0], selector)).floatValue();
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) d.a(bArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] k8(short[] sArr, short s10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$plus$0");
        return C4875q.A3(sArr, s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final H0 k9(short[] sArr, q<? super Integer, ? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRightIndexedOrNull$0");
        G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        short s10 = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            s10 = operation.invoke(Integer.valueOf(i11), new H0(sArr[i11]), new H0(s10)).f217458a;
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void ka(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$shuffle$0");
        la(sArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void kb(@NotNull int[] iArr, int i10, int i11) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortDescending$0");
        bb(iArr, i10, i11);
        B.sr(iArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    @InterfaceC5045x
    public static final long kc(short[] sArr, l<? super H0, B0> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        G.p(selector, "selector");
        long j10 = 0;
        for (short s10 : sArr) {
            j10 += ((B0) b.a(s10, selector)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <V> List<V> kd(long[] jArr, long[] jArr2, p<? super B0, ? super B0, ? extends V> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        G.p(jArr2, "$v$c$kotlin-ULongArray$-other$0");
        G.p(transform, "transform");
        int iMin = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new B0(jArr[i10]), new B0(jArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final boolean l0(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$any$0");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static short[] l1(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyInto$0");
        G.p(sArr2, "$v$c$kotlin-UShortArray$-destination$0");
        C4875q.C0(sArr, sArr2, i10, i11, i12);
        return sArr2;
    }

    public static void l2(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        k2(sArr, s10, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final H0 l3(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$firstOrNull$0");
        G.p(predicate, "predicate");
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return new H0(s10);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int l5(int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastIndexOf$0");
        return B.di(iArr, i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double l6(int[] iArr, l<? super x0, Double> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) e.a(iArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) e.a(iArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R l7(long[] jArr, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r10 = (R) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) c.a(jArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] l8(int[] iArr, int[] iArr2) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$plus$0");
        G.p(iArr2, "$v$c$kotlin-UIntArray$-elements$0");
        return C4875q.s3(iArr, iArr2);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final B0 l9(long[] jArr, q<? super Integer, ? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRightIndexedOrNull$0");
        G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        long j10 = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            j10 = operation.invoke(Integer.valueOf(i11), new B0(jArr[i11]), new B0(j10)).f217440a;
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final void la(@NotNull short[] sArr, @NotNull Random random) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$shuffle$0");
        G.p(random, "random");
        for (int length = sArr.length - 1; length > 0; length--) {
            int iQ = random.q(length + 1);
            short s10 = sArr[length];
            sArr[length] = sArr[iQ];
            sArr[iQ] = s10;
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void lb(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortDescending$0");
        if (sArr.length > 1) {
            db(sArr);
            B.xr(sArr);
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUShort")
    public static final int lc(@NotNull H0[] h0Arr) {
        G.p(h0Arr, "<this>");
        int i10 = 0;
        for (H0 h02 : h0Arr) {
            i10 += h02.f217458a & H0.f217455d;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> ld(long[] jArr, Iterable<? extends R> other, p<? super B0, ? super R, ? extends V> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(new B0(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] m0(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$asByteArray$0");
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final byte[] m1(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyInto$0");
        G.p(bArr2, "$v$c$kotlin-UByteArray$-destination$0");
        C4875q.v0(bArr, bArr2, i10, i11, i12);
        return bArr2;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void m2(@NotNull long[] jArr, long j10, int i10, int i11) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$fill$0");
        Arrays.fill(jArr, i10, i11, j10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> m3(byte[] bArr, l<? super t0, ? extends Iterable<? extends R>> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMap$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            N.s0(arrayList, (Iterable) d.a(b10, transform));
        }
        return arrayList;
    }

    public static final int m4(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastIndex$0");
        return jArr.length - 1;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final x0 m5(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastOrNull$0");
        if (iArr.length == 0) {
            return null;
        }
        return new x0(iArr[iArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float m6(int[] iArr, l<? super x0, Float> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) e.a(iArr[0], selector)).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) e.a(iArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double m7(long[] jArr, l<? super B0, Double> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) c.a(jArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) c.a(jArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] m8(byte[] bArr, byte b10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$plus$0");
        return C4875q.e3(bArr, b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final t0 m9(byte[] bArr, p<? super t0, ? super t0, t0> operation) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRightOrNull$0");
        G.p(operation, "operation");
        int length = bArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        byte b10 = bArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            b10 = operation.invoke(new t0(bArr[i11]), new t0(b10)).f218221a;
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int ma(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$single$0");
        return B.wt(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> mb(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sorted$0");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        Sa(iArrCopyOf);
        return f.a(iArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> mc(@NotNull byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$take$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= bArr.length) {
            return U.a6(new u0(bArr));
        }
        if (i10 == 1) {
            return H.l(new t0(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (byte b10 : bArr) {
            arrayList.add(new t0(b10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> md(byte[] bArr, Iterable<? extends R> other, p<? super t0, ? super R, ? extends V> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(new t0(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] n0(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$asIntArray$0");
        return iArr;
    }

    public static byte[] n1(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyInto$0");
        G.p(bArr2, "$v$c$kotlin-UByteArray$-destination$0");
        C4875q.v0(bArr, bArr2, i10, i11, i12);
        return bArr2;
    }

    public static void n2(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        m2(jArr, j10, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> n3(long[] jArr, l<? super B0, ? extends Iterable<? extends R>> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMap$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            N.s0(arrayList, (Iterable) c.a(j10, transform));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final t0 n5(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastOrNull$0");
        if (bArr.length == 0) {
            return null;
        }
        return new t0(bArr[bArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R n6(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r10 = (R) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) b.a(sArr[i10], selector);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float n7(long[] jArr, l<? super B0, Float> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) c.a(jArr[0], selector)).floatValue();
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) c.a(jArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] n8(byte[] bArr, byte[] bArr2) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$plus$0");
        G.p(bArr2, "$v$c$kotlin-UByteArray$-elements$0");
        return C4875q.g3(bArr, bArr2);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final x0 n9(int[] iArr, p<? super x0, ? super x0, x0> operation) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRightOrNull$0");
        G.p(operation, "operation");
        int length = iArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        int i11 = iArr[i10];
        for (int i12 = length - 2; i12 >= 0; i12--) {
            i11 = operation.invoke(new x0(iArr[i12]), new x0(i11)).f218498a;
        }
        return new x0(i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte na(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$single$0");
        return B.ot(bArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> nb(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sorted$0");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        Za(bArrCopyOf);
        return f.b(bArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> nc(@NotNull short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$take$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= sArr.length) {
            return U.a6(new I0(sArr));
        }
        if (i10 == 1) {
            return H.l(new H0(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (short s10 : sArr) {
            arrayList.add(new H0(s10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> nd(int[] iArr, R[] other, p<? super x0, ? super R, ? extends V> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new x0(iArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] o0(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$asLongArray$0");
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final int[] o1(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyInto$0");
        G.p(iArr2, "$v$c$kotlin-UIntArray$-destination$0");
        C4875q.z0(iArr, iArr2, i10, i11, i12);
        return iArr2;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final void o2(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$fill$0");
        Arrays.fill(bArr, i10, i11, b10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> o3(int[] iArr, l<? super x0, ? extends Iterable<? extends R>> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMap$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            N.s0(arrayList, (Iterable) e.a(i10, transform));
        }
        return arrayList;
    }

    public static final int o4(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastIndex$0");
        return sArr.length - 1;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final t0 o5(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastOrNull$0");
        G.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                return new t0(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double o6(short[] sArr, l<? super H0, Double> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) b.a(sArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) b.a(sArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R o7(int[] iArr, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r10 = (R) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) e.a(iArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] o8(@NotNull long[] jArr, @NotNull Collection<B0> elements) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$plus$0");
        G.p(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        Iterator<B0> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().f217440a;
            length++;
        }
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final B0 o9(long[] jArr, p<? super B0, ? super B0, B0> operation) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRightOrNull$0");
        G.p(operation, "operation");
        int length = jArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        long j10 = jArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            j10 = operation.invoke(new B0(jArr[i11]), new B0(j10)).f217440a;
        }
        return new B0(j10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte oa(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$single$0");
        G.p(predicate, "predicate");
        t0 t0Var = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                t0Var = new t0(b10);
                z10 = true;
            }
        }
        if (z10) {
            return t0Var.f218221a;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> ob(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sorted$0");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        ab(jArrCopyOf);
        return f.c(jArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> oc(@NotNull int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$take$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= iArr.length) {
            return U.a6(new y0(iArr));
        }
        if (i10 == 1) {
            return H.l(new x0(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (int i12 : iArr) {
            arrayList.add(new x0(i12));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<Pair<x0, x0>> od(@NotNull int[] iArr, @NotNull int[] iArr2) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        G.p(iArr2, "$v$c$kotlin-UIntArray$-other$0");
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(new x0(iArr[i10]), new x0(iArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] p0(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$asShortArray$0");
        return sArr;
    }

    public static int[] p1(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyInto$0");
        G.p(iArr2, "$v$c$kotlin-UIntArray$-destination$0");
        C4875q.z0(iArr, iArr2, i10, i11, i12);
        return iArr2;
    }

    public static void p2(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        o2(bArr, b10, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> p3(short[] sArr, l<? super H0, ? extends Iterable<? extends R>> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMap$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            N.s0(arrayList, (Iterable) b.a(s10, transform));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final B0 p5(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastOrNull$0");
        G.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                return new B0(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float p6(short[] sArr, l<? super H0, Float> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) b.a(sArr[0], selector)).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) b.a(sArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double p7(int[] iArr, l<? super x0, Double> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) e.a(iArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) e.a(iArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] p8(short[] sArr, short[] sArr2) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$plus$0");
        G.p(sArr2, "$v$c$kotlin-UShortArray$-elements$0");
        return C4875q.B3(sArr, sArr2);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final H0 p9(short[] sArr, p<? super H0, ? super H0, H0> operation) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRightOrNull$0");
        G.p(operation, "operation");
        int length = sArr.length;
        int i10 = length - 1;
        if (i10 < 0) {
            return null;
        }
        short s10 = sArr[i10];
        for (int i11 = length - 2; i11 >= 0; i11--) {
            s10 = operation.invoke(new H0(sArr[i11]), new H0(s10)).f217458a;
        }
        return new H0(s10);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long pa(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$single$0");
        G.p(predicate, "predicate");
        B0 b02 = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                b02 = new B0(j10);
                z10 = true;
            }
        }
        if (z10) {
            return b02.f217440a;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> pb(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sorted$0");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        db(sArrCopyOf);
        return f.d(sArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> pc(@NotNull long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$take$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (i10 >= jArr.length) {
            return U.a6(new C0(jArr));
        }
        if (i10 == 1) {
            return H.l(new B0(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (long j10 : jArr) {
            arrayList.add(new B0(j10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> pd(short[] sArr, R[] other, p<? super H0, ? super R, ? extends V> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new H0(sArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] q0(byte[] bArr) {
        G.p(bArr, "<this>");
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] q1(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOf$0");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> q2(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$filter$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                arrayList.add(new t0(b10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> List<R> q3(byte[] bArr, p<? super Integer, ? super t0, ? extends Iterable<? extends R>> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), new t0(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short q4(short[] sArr, int i10, l<? super Integer, H0> defaultValue) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$getOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f217458a : sArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final B0 q5(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastOrNull$0");
        if (jArr.length == 0) {
            return null;
        }
        return new B0(jArr[jArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R q6(long[] jArr, Comparator<? super R> comparator, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) c.a(jArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float q7(int[] iArr, l<? super x0, Float> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) e.a(iArr[0], selector)).floatValue();
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) e.a(iArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] q8(@NotNull short[] sArr, @NotNull Collection<H0> elements) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$plus$0");
        G.p(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        Iterator<H0> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().f217458a;
            length++;
        }
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void q9(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reverse$0");
        B.rr(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long qa(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$single$0");
        return B.yt(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] qb(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortedArray$0");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        Sa(iArrCopyOf);
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> qc(@NotNull byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$takeLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = bArr.length;
        if (i10 >= length) {
            return U.a6(new u0(bArr));
        }
        if (i10 == 1) {
            return H.l(new t0(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(new t0(bArr[i11]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<B0, R>> qd(@NotNull long[] jArr, @NotNull R[] other) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        G.p(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long j10 = jArr[i10];
            arrayList.add(new Pair(new B0(j10), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] r0(int[] iArr) {
        G.p(iArr, "<this>");
        return iArr;
    }

    @InterfaceC4887e0(version = "2.2")
    @Xc.f
    @InterfaceC5043v
    @InterfaceC5045x
    public static final short[] r1(short[] sArr, int i10, l<? super Integer, H0> init) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOf$0");
        G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        G.o(sArrCopyOf, "copyOf(...)");
        for (int length = sArr.length; length < i10; length++) {
            sArrCopyOf[length] = init.invoke(Integer.valueOf(length)).f217458a;
        }
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> r2(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$filter$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                arrayList.add(new B0(j10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> List<R> r3(int[] iArr, p<? super Integer, ? super x0, ? extends Iterable<? extends R>> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), new x0(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int r4(int[] iArr, int i10, l<? super Integer, x0> defaultValue) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$getOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f218498a : iArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final x0 r5(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastOrNull$0");
        G.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (((Boolean) e.a(i11, predicate)).booleanValue()) {
                return new x0(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R r6(byte[] bArr, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) d.a(bArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R extends Comparable<? super R>> R r7(short[] sArr, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r10 = (R) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable = (Comparable) b.a(sArr[i10], selector);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] r8(int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$plus$0");
        return C4875q.q3(iArr, i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final void r9(long[] jArr, int i10, int i11) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reverse$0");
        B.ur(jArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int ra(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$single$0");
        G.p(predicate, "predicate");
        x0 x0Var = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                x0Var = new x0(i10);
                z10 = true;
            }
        }
        if (z10) {
            return x0Var.f218498a;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] rb(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortedArray$0");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        Za(bArrCopyOf);
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<H0> rc(@NotNull short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$takeLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = sArr.length;
        if (i10 >= length) {
            return U.a6(new I0(sArr));
        }
        if (i10 == 1) {
            return H.l(new H0(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(new H0(sArr[i11]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <V> List<V> rd(short[] sArr, short[] sArr2, p<? super H0, ? super H0, ? extends V> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        G.p(sArr2, "$v$c$kotlin-UShortArray$-other$0");
        G.p(transform, "transform");
        int iMin = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(new H0(sArr[i10]), new H0(sArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] s0(long[] jArr) {
        G.p(jArr, "<this>");
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] s1(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOf$0");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> s2(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$filter$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                arrayList.add(new x0(i10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> List<R> s3(long[] jArr, p<? super Integer, ? super B0, ? extends Iterable<? extends R>> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), new B0(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long s4(long[] jArr, int i10, l<? super Integer, B0> defaultValue) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$getOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f217440a : jArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final H0 s5(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastOrNull$0");
        if (sArr.length == 0) {
            return null;
        }
        return new H0(sArr[sArr.length - 1]);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R s6(short[] sArr, Comparator<? super R> comparator, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) b.a(sArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Double s7(short[] sArr, l<? super H0, Double> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = ((Number) b.a(sArr[0], selector)).doubleValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) b.a(sArr[i10], selector)).doubleValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] s8(long[] jArr, long[] jArr2) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$plus$0");
        G.p(jArr2, "$v$c$kotlin-ULongArray$-elements$0");
        return C4875q.v3(jArr, jArr2);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final void s9(byte[] bArr, int i10, int i11) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reverse$0");
        B.kr(bArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short sa(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$single$0");
        return B.Ct(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] sb(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortedArray$0");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        ab(jArrCopyOf);
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> sc(@NotNull int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$takeLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = iArr.length;
        if (i10 >= length) {
            return U.a6(new y0(iArr));
        }
        if (i10 == 1) {
            return H.l(new x0(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(new x0(iArr[i11]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R, V> List<V> sd(short[] sArr, Iterable<? extends R> other, p<? super H0, ? super R, ? extends V> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        G.p(other, "other");
        G.p(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(new H0(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] t0(short[] sArr) {
        G.p(sArr, "<this>");
        return sArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] t1(byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOf$0");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        G.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> t2(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$filter$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                arrayList.add(new H0(s10));
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> List<R> t3(short[] sArr, p<? super Integer, ? super H0, ? extends Iterable<? extends R>> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(arrayList, transform.invoke(Integer.valueOf(i11), new H0(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte t4(byte[] bArr, int i10, l<? super Integer, t0> defaultValue) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$getOrElse$0");
        G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).f218221a : bArr[i10];
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final H0 t5(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastOrNull$0");
        G.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                return new H0(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R t6(int[] iArr, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) e.a(iArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final Float t7(short[] sArr, l<? super H0, Float> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfOrNull$0");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = ((Number) b.a(sArr[0], selector)).floatValue();
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) b.a(sArr[i10], selector)).floatValue());
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] t8(@NotNull byte[] bArr, @NotNull Collection<t0> elements) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$plus$0");
        G.p(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        Iterator<t0> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().f218221a;
            length++;
        }
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final void t9(short[] sArr, int i10, int i11) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reverse$0");
        B.yr(sArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short ta(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$single$0");
        G.p(predicate, "predicate");
        H0 h02 = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (((Boolean) b.a(s10, predicate)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                h02 = new H0(s10);
                z10 = true;
            }
        }
        if (z10) {
            return h02.f217458a;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] tb(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortedArray$0");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        db(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<B0> tc(@NotNull long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$takeLast$0");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int length = jArr.length;
        if (i10 >= length) {
            return U.a6(new C0(jArr));
        }
        if (i10 == 1) {
            return H.l(new B0(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(new B0(jArr[i11]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<Pair<t0, t0>> td(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        G.p(bArr2, "$v$c$kotlin-UByteArray$-other$0");
        int iMin = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(new t0(bArr[i10]), new t0(bArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <V> Map<t0, V> u0(byte[] bArr, l<? super t0, ? extends V> valueSelector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$associateWith$0");
        G.p(valueSelector, "valueSelector");
        int iJ = m0.j(bArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (byte b10 : bArr) {
            linkedHashMap.put(new t0(b10), valueSelector.invoke(new t0(b10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] u1(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOf$0");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> u2(byte[] bArr, p<? super Integer, ? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterIndexed$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new t0(b10)).booleanValue()) {
                arrayList.add(new t0(b10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C u3(int[] iArr, C destination, p<? super Integer, ? super x0, ? extends Iterable<? extends R>> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), new x0(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final t0 u4(@NotNull byte[] bArr, int i10) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$getOrNull$0");
        if (i10 < 0 || i10 >= bArr.length) {
            return null;
        }
        return new t0(bArr[i10]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> u5(byte[] bArr, l<? super t0, ? extends R> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$map$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(transform.invoke(new t0(b10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R u6(long[] jArr, Comparator<? super R> comparator, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r10 = (Object) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) c.a(jArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R u7(long[] jArr, Comparator<? super R> comparator, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) c.a(jArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int u8(int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$random$0");
        return v8(iArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void u9(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reverse$0");
        B.jr(bArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final x0 ua(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$singleOrNull$0");
        if (iArr.length == 1) {
            return new x0(iArr[0]);
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] ub(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortedArrayDescending$0");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        eb(iArrCopyOf);
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> uc(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$takeLastWhile$0");
        G.p(predicate, "predicate");
        int length = bArr.length;
        do {
            length--;
            if (-1 >= length) {
                return U.a6(new u0(bArr));
            }
        } while (((Boolean) d.a(bArr[length], predicate)).booleanValue());
        return K1(bArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<Pair<H0, H0>> ud(@NotNull short[] sArr, @NotNull short[] sArr2) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        G.p(sArr2, "$v$c$kotlin-UShortArray$-other$0");
        int iMin = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(new H0(sArr[i10]), new H0(sArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <V> Map<B0, V> v0(long[] jArr, l<? super B0, ? extends V> valueSelector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$associateWith$0");
        G.p(valueSelector, "valueSelector");
        int iJ = m0.j(jArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (long j10 : jArr) {
            linkedHashMap.put(new B0(j10), valueSelector.invoke(new B0(j10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "2.2")
    @Xc.f
    @InterfaceC5043v
    @InterfaceC5045x
    public static final int[] v1(int[] iArr, int i10, l<? super Integer, x0> init) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOf$0");
        G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        G.o(iArrCopyOf, "copyOf(...)");
        for (int length = iArr.length; length < i10; length++) {
            iArrCopyOf[length] = init.invoke(Integer.valueOf(length)).f218498a;
        }
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> v2(int[] iArr, p<? super Integer, ? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterIndexed$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new x0(i12)).booleanValue()) {
                arrayList.add(new x0(i12));
            }
            i10++;
            i11 = i13;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C v3(short[] sArr, C destination, p<? super Integer, ? super H0, ? extends Iterable<? extends R>> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), new H0(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final H0 v4(@NotNull short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$getOrNull$0");
        if (i10 < 0 || i10 >= sArr.length) {
            return null;
        }
        return new H0(sArr[i10]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> v5(long[] jArr, l<? super B0, ? extends R> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$map$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(transform.invoke(new B0(j10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R v6(byte[] bArr, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r10 = (Object) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) d.a(bArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R v7(byte[] bArr, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) d.a(bArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final int v8(@NotNull int[] iArr, @NotNull Random random) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$random$0");
        G.p(random, "random");
        if (iArr.length != 0) {
            return iArr[random.q(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void v9(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$reverse$0");
        B.tr(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final t0 va(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$singleOrNull$0");
        if (bArr.length == 1) {
            return new t0(bArr[0]);
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] vb(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortedArrayDescending$0");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        ib(bArrCopyOf);
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> vc(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$takeLastWhile$0");
        G.p(predicate, "predicate");
        int length = jArr.length;
        do {
            length--;
            if (-1 >= length) {
                return U.a6(new C0(jArr));
            }
        } while (((Boolean) c.a(jArr[length], predicate)).booleanValue());
        return N1(jArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<t0, R>> vd(@NotNull byte[] bArr, @NotNull R[] other) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        G.p(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = bArr[i10];
            arrayList.add(new Pair(new t0(b10), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <V> Map<x0, V> w0(int[] iArr, l<? super x0, ? extends V> valueSelector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$associateWith$0");
        G.p(valueSelector, "valueSelector");
        int iJ = m0.j(iArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 : iArr) {
            linkedHashMap.put(new x0(i10), valueSelector.invoke(new x0(i10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "2.2")
    @Xc.f
    @InterfaceC5043v
    @InterfaceC5045x
    public static final long[] w1(long[] jArr, int i10, l<? super Integer, B0> init) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOf$0");
        G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        G.o(jArrCopyOf, "copyOf(...)");
        for (int length = jArr.length; length < i10; length++) {
            jArrCopyOf[length] = init.invoke(Integer.valueOf(length)).f217440a;
        }
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> w2(long[] jArr, p<? super Integer, ? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterIndexed$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new B0(j10)).booleanValue()) {
                arrayList.add(new B0(j10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C w3(byte[] bArr, C destination, p<? super Integer, ? super t0, ? extends Iterable<? extends R>> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), new t0(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final x0 w4(@NotNull int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$getOrNull$0");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return new x0(iArr[i10]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> w5(int[] iArr, l<? super x0, ? extends R> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$map$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(transform.invoke(new x0(i10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R w6(short[] sArr, Comparator<? super R> comparator, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r10 = (Object) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) b.a(sArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R w7(short[] sArr, Comparator<? super R> comparator, l<? super H0, ? extends R> selector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) b.a(sArr[0], selector);
        int i10 = 1;
        int length = sArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) b.a(sArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte w8(byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$random$0");
        return z8(bArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final void w9(int[] iArr, int i10, int i11) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reverse$0");
        B.sr(iArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final t0 wa(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$singleOrNull$0");
        G.p(predicate, "predicate");
        t0 t0Var = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (((Boolean) d.a(b10, predicate)).booleanValue()) {
                if (z10) {
                    return null;
                }
                t0Var = new t0(b10);
                z10 = true;
            }
        }
        if (z10) {
            return t0Var;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] wb(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortedArrayDescending$0");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        G.o(jArrCopyOf, "copyOf(...)");
        jb(jArrCopyOf);
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<x0> wc(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$takeLastWhile$0");
        G.p(predicate, "predicate");
        int length = iArr.length;
        do {
            length--;
            if (-1 >= length) {
                return U.a6(new y0(iArr));
            }
        } while (((Boolean) e.a(iArr[length], predicate)).booleanValue());
        return M1(iArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final <R> List<Pair<H0, R>> wd(@NotNull short[] sArr, @NotNull R[] other) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        G.p(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            short s10 = sArr[i10];
            arrayList.add(new Pair(new H0(s10), other[i10]));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Xc.f
    public static final <V> Map<H0, V> x0(short[] sArr, l<? super H0, ? extends V> valueSelector) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$associateWith$0");
        G.p(valueSelector, "valueSelector");
        int iJ = m0.j(sArr.length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (short s10 : sArr) {
            linkedHashMap.put(new H0(s10), valueSelector.invoke(new H0(s10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "2.2")
    @Xc.f
    @InterfaceC5043v
    @InterfaceC5045x
    public static final byte[] x1(byte[] bArr, int i10, l<? super Integer, t0> init) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOf$0");
        G.p(init, "init");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Invalid new array size: ", i10, '.').toString());
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        G.o(bArrCopyOf, "copyOf(...)");
        for (int length = bArr.length; length < i10; length++) {
            bArrCopyOf[length] = init.invoke(Integer.valueOf(length)).f218221a;
        }
        return bArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> x2(short[] sArr, p<? super Integer, ? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterIndexed$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new H0(s10)).booleanValue()) {
                arrayList.add(new H0(s10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C x3(long[] jArr, C destination, p<? super Integer, ? super B0, ? extends Iterable<? extends R>> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMapIndexedTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            N.s0(destination, transform.invoke(Integer.valueOf(i11), new B0(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final B0 x4(@NotNull long[] jArr, int i10) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$getOrNull$0");
        if (i10 < 0 || i10 >= jArr.length) {
            return null;
        }
        return new B0(jArr[i10]);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> x5(short[] sArr, l<? super H0, ? extends R> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$map$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(transform.invoke(new H0(s10)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R x6(int[] iArr, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r10 = (Object) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) e.a(iArr[i10], selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R x7(int[] iArr, Comparator<? super R> comparator, l<? super x0, ? extends R> selector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfWith$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) e.a(iArr[0], selector);
        int i10 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) e.a(iArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final long x8(@NotNull long[] jArr, @NotNull Random random) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$random$0");
        G.p(random, "random");
        if (jArr.length != 0) {
            return jArr[random.q(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final void x9(short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$reverse$0");
        B.xr(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final B0 xa(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$singleOrNull$0");
        G.p(predicate, "predicate");
        B0 b02 = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (((Boolean) c.a(j10, predicate)).booleanValue()) {
                if (z10) {
                    return null;
                }
                b02 = new B0(j10);
                z10 = true;
            }
        }
        if (z10) {
            return b02;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] xb(@NotNull short[] sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortedArrayDescending$0");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        G.o(sArrCopyOf, "copyOf(...)");
        lb(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<H0> xc(short[] sArr, l<? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$takeLastWhile$0");
        G.p(predicate, "predicate");
        int length = sArr.length;
        do {
            length--;
            if (-1 >= length) {
                return U.a6(new I0(sArr));
            }
        } while (((Boolean) b.a(sArr[length], predicate)).booleanValue());
        return L1(sArr, length + 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<Pair<B0, B0>> xd(@NotNull long[] jArr, @NotNull long[] jArr2) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        G.p(jArr2, "$v$c$kotlin-ULongArray$-other$0");
        int iMin = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(new B0(jArr[i10]), new B0(jArr2[i10])));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <V, M extends Map<? super x0, ? super V>> M y0(int[] iArr, M destination, l<? super x0, ? extends V> valueSelector) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$associateWithTo$0");
        G.p(destination, "destination");
        G.p(valueSelector, "valueSelector");
        for (int i10 : iArr) {
            destination.put(new x0(i10), valueSelector.invoke(new x0(i10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] y1(short[] sArr, int i10) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOf$0");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        G.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super x0>> C y2(int[] iArr, C destination, p<? super Integer, ? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterIndexedTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new x0(i12)).booleanValue()) {
                destination.add(new x0(i12));
            }
            i10++;
            i11 = i13;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C y3(long[] jArr, C destination, l<? super B0, ? extends Iterable<? extends R>> transform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (long j10 : jArr) {
            N.s0(destination, (Iterable) c.a(j10, transform));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K, V> Map<K, List<V>> y4(long[] jArr, l<? super B0, ? extends K> keySelector, l<? super B0, ? extends V> valueTransform) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            Object objA = c.a(j10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new B0(j10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> y5(byte[] bArr, p<? super Integer, ? super t0, ? extends R> transform) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$mapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), new t0(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final x0 y6(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOrNull$0");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) < 0) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new x0(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R y7(long[] jArr, Comparator<? super R> comparator, l<? super B0, ? extends R> selector) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r10 = (Object) c.a(jArr[0], selector);
        int i10 = 1;
        int length = jArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) c.a(jArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long y8(long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$random$0");
        return x8(jArr, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> y9(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$reversed$0");
        if (iArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<x0> listD6 = U.d6(new y0(iArr));
        Collections.reverse(listD6);
        return listD6;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Nullable
    public static final B0 ya(@NotNull long[] jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$singleOrNull$0");
        if (jArr.length == 1) {
            return new B0(jArr[0]);
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<x0> yb(@NotNull int[] iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortedDescending$0");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        G.o(iArrCopyOf, "copyOf(...)");
        Sa(iArrCopyOf);
        return y9(iArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<t0> yc(byte[] bArr, l<? super t0, Boolean> predicate) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$takeWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!((Boolean) d.a(b10, predicate)).booleanValue()) {
                break;
            }
            arrayList.add(new t0(b10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <V, M extends Map<? super t0, ? super V>> M z0(byte[] bArr, M destination, l<? super t0, ? extends V> valueSelector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$associateWithTo$0");
        G.p(destination, "destination");
        G.p(valueSelector, "valueSelector");
        for (byte b10 : bArr) {
            destination.put(new t0(b10), valueSelector.invoke(new t0(b10)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] z1(int[] iArr, int i10) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOf$0");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        G.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <C extends Collection<? super H0>> C z2(short[] sArr, C destination, p<? super Integer, ? super H0, Boolean> predicate) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterIndexedTo$0");
        G.p(destination, "destination");
        G.p(predicate, "predicate");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), new H0(s10)).booleanValue()) {
                destination.add(new H0(s10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    @InterfaceC5045x
    public static final <R, C extends Collection<? super R>> C z3(short[] sArr, C destination, l<? super H0, ? extends Iterable<? extends R>> transform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMapTo$0");
        G.p(destination, "destination");
        G.p(transform, "transform");
        for (short s10 : sArr) {
            N.s0(destination, (Iterable) b.a(s10, transform));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <K, V> Map<K, List<V>> z4(short[] sArr, l<? super H0, ? extends K> keySelector, l<? super H0, ? extends V> valueTransform) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupBy$0");
        G.p(keySelector, "keySelector");
        G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            Object objA = b.a(s10, keySelector);
            Object objA2 = linkedHashMap.get(objA);
            if (objA2 == null) {
                objA2 = A.a(linkedHashMap, objA);
            }
            ((List) objA2).add(valueTransform.invoke(new H0(s10)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final <R> List<R> z5(int[] iArr, p<? super Integer, ? super x0, ? extends R> transform) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$mapIndexed$0");
        G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), new x0(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    @Nullable
    public static final t0 z6(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOrNull$0");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                if (G.t(b10 & 255, b11 & 255) < 0) {
                    b10 = b11;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return new t0(b10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @kotlin.V
    @InterfaceC5045x
    public static final <R> R z7(byte[] bArr, Comparator<? super R> comparator, l<? super t0, ? extends R> selector) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfWithOrNull$0");
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r10 = (Object) d.a(bArr[0], selector);
        int i10 = 1;
        int length = bArr.length - 1;
        if (1 <= length) {
            while (true) {
                Object obj = (Object) d.a(bArr[i10], selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static final byte z8(@NotNull byte[] bArr, @NotNull Random random) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$random$0");
        G.p(random, "random");
        if (bArr.length != 0) {
            return bArr[random.q(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> z9(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$reversed$0");
        if (bArr.length == 0) {
            return EmptyList.f217510a;
        }
        List<t0> listD6 = U.d6(new u0(bArr));
        Collections.reverse(listD6);
        return listD6;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final x0 za(int[] iArr, l<? super x0, Boolean> predicate) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-$this$singleOrNull$0");
        G.p(predicate, "predicate");
        x0 x0Var = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (((Boolean) e.a(i10, predicate)).booleanValue()) {
                if (z10) {
                    return null;
                }
                x0Var = new x0(i10);
                z10 = true;
            }
        }
        if (z10) {
            return x0Var;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final List<t0> zb(@NotNull byte[] bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortedDescending$0");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        G.o(bArrCopyOf, "copyOf(...)");
        Za(bArrCopyOf);
        return z9(bArrCopyOf);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final List<B0> zc(long[] jArr, l<? super B0, Boolean> predicate) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-$this$takeWhile$0");
        G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!((Boolean) c.a(j10, predicate)).booleanValue()) {
                break;
            }
            arrayList.add(new B0(j10));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void b4(int[] iArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void d4(byte[] bArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void f4(long[] jArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void h4(short[] sArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void j4(int[] iArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void l4(byte[] bArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void n4(long[] jArr) {
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    public static /* synthetic */ void p4(short[] sArr) {
    }
}
