package kotlin.collections;

import A0.a;
import Oc.g;
import androidx.collection.N0;
import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.C1922j1;
import ed.InterfaceC4376a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.L0;
import kotlin.Pair;
import kotlin.random.Random;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C5028u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3843:1\n296#1,2:3844\n531#1,7:3846\n546#1,6:3853\n873#1,2:3860\n800#1:3862\n1924#1,2:3863\n801#1,2:3865\n1926#1:3867\n803#1:3868\n1924#1,3:3869\n822#1,2:3872\n862#1,2:3874\n1282#1,4:3880\n1249#1,4:3884\n1266#1,4:3888\n1315#1,4:3892\n1480#1,5:3896\n1496#1,5:3901\n1538#1,3:3906\n1541#1,3:3916\n1557#1,3:3919\n1560#1,3:3929\n1661#1,3:3946\n1629#1,4:3949\n1617#1:3953\n1924#1,2:3954\n1926#1:3957\n1618#1:3958\n1924#1,3:3959\n1651#1:3962\n1915#1:3963\n1916#1:3965\n1652#1:3966\n1915#1,2:3967\n1924#1,3:3969\n3013#1,3:3972\n3016#1,6:3976\n3038#1,3:3982\n3041#1,7:3986\n873#1,2:3993\n832#1:3995\n862#1,2:3996\n832#1:3998\n862#1,2:3999\n832#1:4001\n862#1,2:4002\n3562#1,8:4008\n3590#1,7:4016\n3621#1,10:4023\n1#2:3859\n1#2:3956\n1#2:3964\n1#2:3975\n1#2:3985\n37#3,2:3876\n37#3,2:3878\n383#4,7:3909\n383#4,7:3922\n383#4,7:3932\n383#4,7:3939\n32#5,2:4004\n32#5,2:4006\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n175#1:3844,2\n185#1:3846,7\n195#1:3853,6\n777#1:3860,2\n788#1:3862\n788#1:3863,2\n788#1:3865,2\n788#1:3867\n788#1:3868\n800#1:3869,3\n812#1:3872,2\n832#1:3874,2\n1206#1:3880,4\n1221#1:3884,4\n1235#1:3888,4\n1301#1:3892,4\n1391#1:3896,5\n1404#1:3901,5\n1512#1:3906,3\n1512#1:3916,3\n1525#1:3919,3\n1525#1:3929,3\n1586#1:3946,3\n1596#1:3949,4\n1606#1:3953\n1606#1:3954,2\n1606#1:3957\n1606#1:3958\n1617#1:3959,3\n1642#1:3962\n1642#1:3963\n1642#1:3965\n1642#1:3966\n1651#1:3967,2\n2813#1:3969,3\n3113#1:3972,3\n3113#1:3976,6\n3130#1:3982,3\n3130#1:3986,7\n3300#1:3993,2\n3308#1:3995\n3308#1:3996,2\n3318#1:3998\n3318#1:3999,2\n3328#1:4001\n3328#1:4002,2\n3551#1:4008,8\n3579#1:4016,7\n3608#1:4023,10\n1606#1:3956\n1642#1:3964\n3113#1:3975\n3130#1:3985\n1054#1:3876,2\n1101#1:3878,2\n1512#1:3909,7\n1525#1:3922,7\n1540#1:3932,7\n1559#1:3939,7\n3496#1:4004,2\n3538#1:4006,2\n*E\n"})
public class U extends Q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,730:1\n3684#2:731\n*E\n"})
    public static final class a<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f217537a;

        public a(Iterable iterable) {
            this.f217537a = iterable;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            return this.f217537a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @kotlin.jvm.internal.V({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3843:1\n*E\n"})
    public static final class b<K, T> implements Y<T, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f217538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f217539b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Iterable<? extends T> iterable, ed.l<? super T, ? extends K> lVar) {
            this.f217538a = iterable;
            this.f217539b = lVar;
        }

        @Override // kotlin.collections.Y
        public K a(T t10) {
            return this.f217539b.invoke(t10);
        }

        @Override // kotlin.collections.Y
        public Iterator<T> b() {
            return this.f217538a.iterator();
        }
    }

    public static final <T> boolean A1(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C A2(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @Nullable
    public static <T> T A3(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) androidx.appcompat.view.menu.d.a(list, 1);
    }

    public static final <T> boolean A4(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T> Set<T> A5(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> other) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Collection collectionV0 = N.v0(other);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t10 : iterable) {
            if (!collectionV0.contains(t10)) {
                linkedHashSet.add(t10);
            }
        }
        return linkedHashSet;
    }

    public static final <T> boolean B1(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Xc.f
    public static final <T> T B2(Iterable<? extends T> iterable, ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        while (itA.hasNext()) {
            ?? r02 = (Object) itA.next();
            if (lVar.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T B3(@NotNull List<? extends T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, C extends Iterable<? extends T>> C B4(@NotNull C c10, @NotNull ed.l<? super T, L0> lVar) {
        Iterator itA = P.a(c10, "<this>", lVar, "action");
        while (itA.hasNext()) {
            lVar.invoke((Object) itA.next());
        }
        return c10;
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final <T> int B5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Integer> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        int iIntValue = 0;
        while (itA.hasNext()) {
            iIntValue += lVar.invoke((Object) itA.next()).intValue();
        }
        return iIntValue;
    }

    public static final <T> boolean C1(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Xc.f
    public static final <T> T C2(Iterable<? extends T> iterable, ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        T t10 = null;
        while (itA.hasNext()) {
            Object obj = (Object) itA.next();
            if (lVar.invoke(obj).booleanValue()) {
                t10 = (T) obj;
            }
        }
        return t10;
    }

    @NotNull
    public static final <T, R> List<R> C3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(J.d0(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, C extends Iterable<? extends T>> C C4(@NotNull C c10, @NotNull ed.p<? super Integer, ? super T, L0> action) {
        kotlin.jvm.internal.G.p(c10, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int i10 = 0;
        for (T t10 : c10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
        return c10;
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final <T> double C5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Double> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        double dDoubleValue = 0.0d;
        while (itA.hasNext()) {
            dDoubleValue += lVar.invoke((Object) itA.next()).doubleValue();
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <T> Iterable<T> D1(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Xc.f
    public static final <T> T D2(List<? extends T> list, ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> List<R> D3(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(J.d0(iterable, 10));
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            arrayList.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> D4(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @dd.j(name = "sumOfByte")
    public static final int D5(@NotNull Iterable<Byte> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @NotNull
    public static <T> InterfaceC5000m<T> E1(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> T E2(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) G2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @NotNull
    public static final <T, R> List<R> E3(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            R rInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10 = i11;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> E4(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        if (iterable instanceof Collection) {
            return I4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        N.s0(arrayList, iterable);
        N.s0(arrayList, elements);
        return arrayList;
    }

    @dd.j(name = "sumOfDouble")
    public static final double E5(@NotNull Iterable<Double> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> F1(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(J.d0(iterable, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            linkedHashMap.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T F2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        while (itA.hasNext()) {
            ?? r02 = (Object) itA.next();
            if (lVar.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C F3(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            R rInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> F4(@NotNull Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return J4((Collection) iterable, t10);
        }
        ArrayList arrayList = new ArrayList();
        N.s0(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final <T> double F5(Iterable<? extends T> iterable, ed.l<? super T, Double> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        double dDoubleValue = 0.0d;
        while (itA.hasNext()) {
            dDoubleValue += lVar.invoke((Object) itA.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final <T, K> Map<K, T> G1(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(J.d0(iterable, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (T t10 : iterable) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    public static <T> T G2(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C G3(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            destination.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> G4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        ArrayList arrayList = new ArrayList();
        N.s0(arrayList, iterable);
        N.t0(arrayList, elements);
        return arrayList;
    }

    @dd.j(name = "sumOfFloat")
    public static final float G5(@NotNull Iterable<Float> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> H1(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(J.d0(iterable, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (T t10 : iterable) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <T, R> R H2(Iterable<? extends T> iterable, ed.l<? super T, ? extends R> lVar) {
        R rInvoke;
        Iterator itA = P.a(iterable, "<this>", lVar, "transform");
        while (true) {
            if (!itA.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = lVar.invoke((Object) itA.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @NotNull
    public static final <T, R> List<R> H3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> H4(@NotNull Iterable<? extends T> iterable, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        if (iterable instanceof Collection) {
            return L4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        N.s0(arrayList, iterable);
        N.u0(arrayList, elements);
        return arrayList;
    }

    @dd.j(name = "sumOfInt")
    public static final int H5(@NotNull Iterable<Integer> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @kotlin.C
    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M I1(@NotNull Iterable<? extends T> iterable, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (T t10 : iterable) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <T, R> R I2(Iterable<? extends T> iterable, ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "transform");
        while (itA.hasNext()) {
            R rInvoke = lVar.invoke((Object) itA.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C I3(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static <T> List<T> I4(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            N.s0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final <T> int I5(Iterable<? extends T> iterable, ed.l<? super T, Integer> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        int iIntValue = 0;
        while (itA.hasNext()) {
            iIntValue += lVar.invoke((Object) itA.next()).intValue();
        }
        return iIntValue;
    }

    @kotlin.C
    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M J1(@NotNull Iterable<? extends T> iterable, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (T t10 : iterable) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @Nullable
    public static <T> T J2(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C J3(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @NotNull
    public static <T> List<T> J4(@NotNull Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    @dd.j(name = "sumOfLong")
    public static final long J5(@NotNull Iterable<Long> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @kotlin.C
    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M K1(@NotNull Iterable<? extends T> iterable, @NotNull M destination, @NotNull ed.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            destination.put(pairInvoke.f217467a, pairInvoke.f217468b);
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T K2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        while (itA.hasNext()) {
            ?? r02 = (Object) itA.next();
            if (lVar.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T K3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        ?? r02 = (Object) itA.next();
        if (!itA.hasNext()) {
            return r02;
        }
        R rInvoke = lVar.invoke(r02);
        do {
            Object obj = (Object) itA.next();
            R rInvoke2 = lVar.invoke(obj);
            r02 = r02;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                r02 = (T) obj;
            }
        } while (itA.hasNext());
        return (T) r02;
    }

    @NotNull
    public static final <T> List<T> K4(@NotNull Collection<? extends T> collection, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        N.t0(arrayList, elements);
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final <T> long K5(Iterable<? extends T> iterable, ed.l<? super T, Long> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        long jLongValue = 0;
        while (itA.hasNext()) {
            jLongValue += lVar.invoke((Object) itA.next()).longValue();
        }
        return jLongValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> L1(@NotNull Iterable<? extends K> iterable, @NotNull ed.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int iJ = m0.j(J.d0(iterable, 10));
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (K k10 : iterable) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @Nullable
    public static <T> T L2(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T L3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r02 = (Object) itA.next();
        if (!itA.hasNext()) {
            return r02;
        }
        R rInvoke = lVar.invoke(r02);
        do {
            Object obj = (Object) itA.next();
            R rInvoke2 = lVar.invoke(obj);
            r02 = r02;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                r02 = (T) obj;
            }
        } while (itA.hasNext());
        return (T) r02;
    }

    @NotNull
    public static final <T> List<T> L4(@NotNull Collection<? extends T> collection, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        N.u0(arrayList, elements);
        return arrayList;
    }

    @dd.j(name = "sumOfShort")
    public static final int L5(@NotNull Iterable<Short> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M M1(@NotNull Iterable<? extends K> iterable, @NotNull M destination, @NotNull ed.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (K k10 : iterable) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    @NotNull
    public static final <T, R> List<R> M2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            N.s0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> double M3(Iterable<? extends T> iterable, ed.l<? super T, Double> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = lVar.invoke((Object) itA.next()).doubleValue();
        while (itA.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, lVar.invoke((Object) itA.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @Xc.f
    public static final <T> List<T> M4(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return F4(iterable, t10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final <T> int M5(Iterable<? extends T> iterable, ed.l<? super T, kotlin.x0> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        int i10 = 0;
        while (itA.hasNext()) {
            i10 += lVar.invoke((Object) itA.next()).f218498a;
        }
        return i10;
    }

    @dd.j(name = "averageOfByte")
    public static final double N1(@NotNull Iterable<Byte> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <T, R> List<R> N2(Iterable<? extends T> iterable, ed.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            N.s0(arrayList, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> float N3(Iterable<? extends T> iterable, ed.l<? super T, Float> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = lVar.invoke((Object) itA.next()).floatValue();
        while (itA.hasNext()) {
            fFloatValue = Math.max(fFloatValue, lVar.invoke((Object) itA.next()).floatValue());
        }
        return fFloatValue;
    }

    @Xc.f
    public static final <T> List<T> N4(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return J4(collection, t10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final <T> long N5(Iterable<? extends T> iterable, ed.l<? super T, kotlin.B0> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        long j10 = 0;
        while (itA.hasNext()) {
            j10 += lVar.invoke((Object) itA.next()).f217440a;
        }
        return j10;
    }

    @dd.j(name = "averageOfDouble")
    public static final double O1(@NotNull Iterable<Double> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <T, R, C extends Collection<? super R>> C O2(Iterable<? extends T> iterable, C destination, ed.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            N.s0(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R O3(Iterable<? extends T> iterable, ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = lVar.invoke((Object) itA.next());
        while (itA.hasNext()) {
            R rInvoke2 = lVar.invoke((Object) itA.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> T O4(Collection<? extends T> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return (T) P4(collection, Random.f218007a);
    }

    @NotNull
    public static <T> List<T> O5(@NotNull Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return a6(iterable);
            }
            if (i10 == 1) {
                return H.l(E2(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return I.V(arrayList);
    }

    @dd.j(name = "averageOfFloat")
    public static final double P1(@NotNull Iterable<Float> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedSequence")
    @kotlin.V
    public static final <T, R> List<R> P2(Iterable<? extends T> iterable, ed.p<? super Integer, ? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            N.t0(arrayList, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R P3(Iterable<? extends T> iterable, ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        R rInvoke = lVar.invoke((Object) itA.next());
        while (itA.hasNext()) {
            R rInvoke2 = lVar.invoke((Object) itA.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.3")
    public static final <T> T P4(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) k2(collection, random.q(collection.size()));
    }

    @NotNull
    public static final <T> List<T> P5(@NotNull List<? extends T> list, int i10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f217510a;
        }
        int size = list.size();
        if (i10 >= size) {
            return a6(list);
        }
        if (i10 == 1) {
            return H.l(u3(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @dd.j(name = "averageOfInt")
    public static final double Q1(@NotNull Iterable<Integer> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedSequenceTo")
    @kotlin.V
    public static final <T, R, C extends Collection<? super R>> C Q2(Iterable<? extends T> iterable, C destination, ed.p<? super Integer, ? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            N.t0(destination, transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Double Q3(Iterable<? extends T> iterable, ed.l<? super T, Double> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        double dDoubleValue = lVar.invoke((Object) itA.next()).doubleValue();
        while (itA.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, lVar.invoke((Object) itA.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> T Q4(Collection<? extends T> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return (T) R4(collection, Random.f218007a);
    }

    @NotNull
    public static final <T> List<T> Q5(@NotNull List<? extends T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (list.isEmpty()) {
            return EmptyList.f217510a;
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return EmptyList.f217510a;
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return a6(list);
    }

    @dd.j(name = "averageOfLong")
    public static final double R1(@NotNull Iterable<Long> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @dd.j(name = "flatMapSequence")
    @NotNull
    @kotlin.V
    public static final <T, R> List<R> R2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            N.t0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Float R3(Iterable<? extends T> iterable, ed.l<? super T, Float> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        float fFloatValue = lVar.invoke((Object) itA.next()).floatValue();
        while (itA.hasNext()) {
            fFloatValue = Math.max(fFloatValue, lVar.invoke((Object) itA.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T R4(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) k2(collection, random.q(collection.size()));
    }

    @NotNull
    public static final <T> List<T> R5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @dd.j(name = "averageOfShort")
    public static final double S1(@NotNull Iterable<Short> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @dd.j(name = "flatMapSequenceTo")
    @NotNull
    @kotlin.V
    public static final <T, R, C extends Collection<? super R>> C S2(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.l<? super T, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            N.t0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R S3(Iterable<? extends T> iterable, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <S, T extends S> S S4(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @NotNull
    public static final boolean[] S5(@NotNull Collection<Boolean> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> List<List<T>> T1(@NotNull Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return i6(iterable, i10, i10, true);
    }

    @kotlin.C
    @NotNull
    public static final <T, R, C extends Collection<? super R>> C T2(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            N.s0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R T3(Iterable<? extends T> iterable, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <S, T extends S> S T4(@NotNull Iterable<? extends T> iterable, @NotNull ed.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @NotNull
    public static final byte[] T5(@NotNull Collection<Byte> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T, R> List<R> U1(@NotNull Iterable<? extends T> iterable, int i10, @NotNull ed.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        return j6(iterable, i10, i10, true, transform);
    }

    public static final <T, R> R U2(@NotNull Iterable<? extends T> iterable, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static <T extends Comparable<? super T>> T U3(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S U4(@NotNull Iterable<? extends T> iterable, @NotNull ed.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @NotNull
    public static final char[] U5(@NotNull Collection<Character> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr[i10] = it.next().charValue();
            i10++;
        }
        return cArr;
    }

    @Xc.f
    public static final <T> T V1(List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.get(0);
    }

    public static final <T, R> R V2(@NotNull Iterable<? extends T> iterable, R r10, @NotNull ed.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            r10 = operation.invoke(Integer.valueOf(i10), r10, t10);
            i10 = i11;
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double V3(@NotNull Iterable<Double> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S V4(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C V5(@NotNull Iterable<? extends T> iterable, @NotNull C destination) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @Xc.f
    public static final <T> T W1(List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.get(1);
    }

    public static final <T, R> R W2(@NotNull List<? extends T> list, R r10, @NotNull ed.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10 = operation.invoke(listIterator.previous(), r10);
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static Float W3(@NotNull Iterable<Float> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final <S, T extends S> S W4(@NotNull List<? extends T> list, @NotNull ed.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @NotNull
    public static final double[] W5(@NotNull Collection<Double> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = it.next().doubleValue();
            i10++;
        }
        return dArr;
    }

    @Xc.f
    public static final <T> T X1(List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.get(2);
    }

    public static final <T, R> R X2(@NotNull List<? extends T> list, R r10, @NotNull ed.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10 = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r10);
            }
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final double X3(@NotNull Iterable<Double> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    public static final <S, T extends S> S X4(@NotNull List<? extends T> list, @NotNull ed.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @NotNull
    public static float[] X5(@NotNull Collection<Float> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    @Xc.f
    public static final <T> T Y1(List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.get(3);
    }

    @Xc.e
    public static final <T> void Y2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, L0> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "action");
        while (itA.hasNext()) {
            lVar.invoke((Object) itA.next());
        }
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final float Y3(@NotNull Iterable<Float> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S Y4(@NotNull List<? extends T> list, @NotNull ed.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @NotNull
    public static <T> HashSet<T> Y5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        HashSet<T> hashSet = new HashSet<>(m0.j(J.d0(iterable, 12)));
        V5(iterable, hashSet);
        return hashSet;
    }

    @Xc.f
    public static final <T> T Z1(List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.get(4);
    }

    public static final <T> void Z2(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super Integer, ? super T, L0> action) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T Z3(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <S, T extends S> S Z4(@NotNull List<? extends T> list, @NotNull ed.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @NotNull
    public static int[] Z5(@NotNull Collection<Integer> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> boolean a2(@NotNull Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : h3(iterable, t10) >= 0;
    }

    @Xc.f
    public static final <T> T a3(List<? extends T> list, int i10, ed.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i10)) : list.get(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T a4(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Iterable<T> a5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @NotNull
    public static <T> List<T> a6(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return I.V(c6(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f217510a;
        }
        if (size != 1) {
            return d6(collection);
        }
        return H.l(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> int b2(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                I.a0();
                throw null;
            }
        }
        return i10;
    }

    @Nullable
    public static <T> T b3(@NotNull List<? extends T> list, int i10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final <T> T b4(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> b5(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @NotNull
    public static long[] b6(@NotNull Collection<Long> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> int c2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                I.a0();
                throw null;
            }
        }
        return i10;
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> c3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(t10);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T c4(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        ?? r02 = (Object) itA.next();
        if (!itA.hasNext()) {
            return r02;
        }
        R rInvoke = lVar.invoke(r02);
        do {
            Object obj = (Object) itA.next();
            R rInvoke2 = lVar.invoke(obj);
            r02 = r02;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                r02 = (T) obj;
            }
        } while (itA.hasNext());
        return (T) r02;
    }

    @NotNull
    public static <T> List<T> c5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return a6(iterable);
        }
        List<T> listC6 = c6(iterable);
        Collections.reverse(listC6);
        return listC6;
    }

    @NotNull
    public static final <T> List<T> c6(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return d6((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        V5(iterable, arrayList);
        return arrayList;
    }

    @Xc.f
    public static final <T> int d2(Collection<? extends T> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return collection.size();
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> d3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T d4(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r02 = (Object) itA.next();
        if (!itA.hasNext()) {
            return r02;
        }
        R rInvoke = lVar.invoke(r02);
        do {
            Object obj = (Object) itA.next();
            R rInvoke2 = lVar.invoke(obj);
            r02 = r02;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                r02 = (T) obj;
            }
        } while (itA.hasNext());
        return (T) r02;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> d5(@NotNull Iterable<? extends T> iterable, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iD0 = J.d0(iterable, 9);
        if (iD0 == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iD0 + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> d6(@NotNull Collection<? extends T> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    public static <T> List<T> e2(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return a6(e6(iterable));
    }

    @kotlin.C
    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M e3(@NotNull Iterable<? extends T> iterable, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(t10);
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> double e4(Iterable<? extends T> iterable, ed.l<? super T, Double> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = lVar.invoke((Object) itA.next()).doubleValue();
        while (itA.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, lVar.invoke((Object) itA.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> e5(@NotNull Iterable<? extends T> iterable, R r10, @NotNull ed.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iD0 = J.d0(iterable, 9);
        if (iD0 == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iD0 + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, it.next());
            arrayList.add(r10);
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static <T> Set<T> e6(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        V5(iterable, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static final <T, K> List<T> f2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M f3(@NotNull Iterable<? extends T> iterable, @NotNull M destination, @NotNull ed.l<? super T, ? extends K> keySelector, @NotNull ed.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (T t10 : iterable) {
            K kInvoke = keySelector.invoke(t10);
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> float f4(Iterable<? extends T> iterable, ed.l<? super T, Float> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = lVar.invoke((Object) itA.next()).floatValue();
        while (itA.hasNext()) {
            fFloatValue = Math.min(fFloatValue, lVar.invoke((Object) itA.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> f5(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return EmptyList.f217510a;
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(J.d0(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @NotNull
    public static <T> Set<T> f6(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            V5(iterable, linkedHashSet);
            return y0.r(linkedHashSet);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptySet.f217512a;
        }
        if (size == 1) {
            return x0.f(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(m0.j(collection.size()));
        V5(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    @NotNull
    public static <T> List<T> g2(@NotNull Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return a6(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return EmptyList.f217510a;
            }
            if (size == 1) {
                return H.l(s3(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return I.V(arrayList);
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K> Y<T, K> g3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        return new b(iterable, keySelector);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R g4(Iterable<? extends T> iterable, ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = lVar.invoke((Object) itA.next());
        while (itA.hasNext()) {
            R rInvoke2 = lVar.invoke((Object) itA.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> g5(@NotNull Iterable<? extends T> iterable, @NotNull ed.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return EmptyList.f217510a;
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(J.d0(iterable, 10));
        arrayList.add(next);
        int i10 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            arrayList.add(next);
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final short[] g6(@NotNull Collection<Short> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr[i10] = it.next().shortValue();
            i10++;
        }
        return sArr;
    }

    @NotNull
    public static <T> List<T> h2(@NotNull List<? extends T> list, int i10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested element count ", i10, " is less than zero.").toString());
        }
        List<? extends T> list2 = list;
        int size = list.size() - i10;
        if (size < 0) {
            size = 0;
        }
        return O5(list2, size);
    }

    public static final <T> int h3(@NotNull Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            if (kotlin.jvm.internal.G.g(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R extends Comparable<? super R>> R h4(Iterable<? extends T> iterable, ed.l<? super T, ? extends R> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        R rInvoke = lVar.invoke((Object) itA.next());
        while (itA.hasNext()) {
            R rInvoke2 = lVar.invoke((Object) itA.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> h5(@NotNull Iterable<? extends T> iterable, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iD0 = J.d0(iterable, 9);
        if (iD0 == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iD0 + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = operation.invoke(r10, it.next());
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Set<T> h6(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> other) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Set<T> setE6 = e6(iterable);
        N.s0(setE6, other);
        return setE6;
    }

    @NotNull
    public static final <T> List<T> i2(@NotNull List<? extends T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return O5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return EmptyList.f217510a;
    }

    public static <T> int i3(@NotNull List<? extends T> list, T t10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.indexOf(t10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Double i4(Iterable<? extends T> iterable, ed.l<? super T, Double> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        double dDoubleValue = lVar.invoke((Object) itA.next()).doubleValue();
        while (itA.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, lVar.invoke((Object) itA.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T, R> List<R> i5(@NotNull Iterable<? extends T> iterable, R r10, @NotNull ed.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iD0 = J.d0(iterable, 9);
        if (iD0 == 0) {
            return H.l(r10);
        }
        ArrayList arrayList = new ArrayList(iD0 + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, it.next());
            arrayList.add(r10);
            i10++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> List<List<T>> i6(@NotNull Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int i13 = size - i12;
            if (i10 <= i13) {
                i13 = i10;
            }
            if (i13 < i10 && !z10) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList3.add(list.get(i14 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    @NotNull
    public static final <T> List<T> j2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : iterable) {
            if (z10) {
                arrayList.add(t10);
            } else if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final <T> int j3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        int i10 = 0;
        while (itA.hasNext()) {
            a.b.C0001a c0001a = (Object) itA.next();
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            if (lVar.invoke(c0001a).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> Float j4(Iterable<? extends T> iterable, ed.l<? super T, Float> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "selector");
        if (!itA.hasNext()) {
            return null;
        }
        float fFloatValue = lVar.invoke((Object) itA.next()).floatValue();
        while (itA.hasNext()) {
            fFloatValue = Math.min(fFloatValue, lVar.invoke((Object) itA.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC4887e0(version = "1.3")
    public static final <T> void j5(@NotNull List<T> list, @NotNull Random random) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        for (int iL = I.L(list); iL > 0; iL--) {
            int iQ = random.q(iL + 1);
            list.set(iQ, list.set(iL, list.get(iQ)));
        }
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T, R> List<R> j6(@NotNull Iterable<? extends T> iterable, int i10, int i11, boolean z10, @NotNull ed.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, true);
            while (itB.hasNext()) {
                arrayList.add(transform.invoke((List) itB.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i12 = 0;
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        q0 q0Var = new q0(list);
        while (i12 >= 0 && i12 < size) {
            int i13 = size - i12;
            if (i10 <= i13) {
                i13 = i10;
            }
            if (!z10 && i13 < i10) {
                return arrayList2;
            }
            q0Var.h(i12, i13 + i12);
            arrayList2.add(transform.invoke(q0Var));
            i12 += i11;
        }
        return arrayList2;
    }

    public static final <T> T k2(@NotNull Iterable<? extends T> iterable, final int i10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) n2(iterable, i10, new ed.l() { // from class: kotlin.collections.T
            @Override // ed.l
            public final Object invoke(Object obj) {
                U.m2(i10, ((Integer) obj).intValue());
                throw null;
            }
        });
    }

    public static final <T> int k3(@NotNull List<? extends T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R k4(Iterable<? extends T> iterable, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static <T> T k5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static /* synthetic */ List k6(Iterable iterable, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return i6(iterable, i10, i11, z10);
    }

    @Xc.f
    public static final <T> T l2(List<? extends T> list, int i10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.get(i10);
    }

    public static final <T> int l3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        int i10 = -1;
        int i11 = 0;
        while (itA.hasNext()) {
            a.b.C0001a c0001a = (Object) itA.next();
            if (i11 < 0) {
                I.b0();
                throw null;
            }
            if (lVar.invoke(c0001a).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, R> R l4(Iterable<? extends T> iterable, Comparator<? super R> comparator, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> T l5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        while (itA.hasNext()) {
            Object obj = (Object) itA.next();
            if (lVar.invoke(obj).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z10 = true;
                t10 = (T) obj;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List l6(Iterable iterable, int i10, int i11, boolean z10, ed.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return j6(iterable, i10, i11, z10, lVar);
    }

    public static final Object m2(int i10, int i11) {
        throw new IndexOutOfBoundsException(C1610t.a("Collection doesn't contain element at index ", i10, '.'));
    }

    public static final <T> int m3(@NotNull List<? extends T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static <T extends Comparable<? super T>> T m4(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T m5(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @NotNull
    public static <T> Iterable<C4858c0<T>> m6(@NotNull final Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.collections.S
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    public static final <T> T n2(@NotNull Iterable<? extends T> iterable, int i10, @NotNull ed.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i10)) : (T) list.get(i10);
        }
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    @NotNull
    public static <T> Set<T> n3(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> other) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Collection collectionV0 = N.v0(other);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t10 : iterable) {
            if (collectionV0.contains(t10)) {
                linkedHashSet.add(t10);
            }
        }
        return linkedHashSet;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Double n4(@NotNull Iterable<Double> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @Nullable
    public static final <T> T n5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final Iterator n6(Iterable iterable) {
        return iterable.iterator();
    }

    @Xc.f
    public static final <T> T o2(List<? extends T> list, int i10, ed.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i10)) : list.get(i10);
    }

    @kotlin.C
    @NotNull
    public static final <T, A extends Appendable> A o3(@NotNull Iterable<? extends T> iterable, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(buffer, "buffer");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C5028u.b(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static Float o4(@NotNull Iterable<Float> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @Nullable
    public static final <T> T o5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        boolean z10 = false;
        T t10 = null;
        while (itA.hasNext()) {
            Object obj = (Object) itA.next();
            if (lVar.invoke(obj).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = (T) obj;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    @NotNull
    public static <T, R> List<Pair<T, R>> o6(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> other) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(J.d0(iterable, 10), J.d0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    @Nullable
    public static final <T> T p2(@NotNull Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) b3((List) iterable, i10);
        }
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    public static /* synthetic */ Appendable p3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) throws IOException {
        o3(iterable, appendable, (i11 & 2) != 0 ? U6.j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final double p4(@NotNull Iterable<Double> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @Nullable
    public static <T> T p5(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @NotNull
    public static final <T, R, V> List<V> p6(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> other, @NotNull ed.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(J.d0(iterable, 10), J.d0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @Xc.f
    public static final <T> T q2(List<? extends T> list, int i10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return (T) b3(list, i10);
    }

    @NotNull
    public static final <T> String q3(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable ed.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        o3(iterable, sb2, separator, prefix, postfix, i10, truncated, lVar);
        return sb2.toString();
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final float q4(@NotNull Iterable<Float> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @NotNull
    public static final <T> List<T> q5(@NotNull List<? extends T> list, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = J.d0(indices, 10);
        if (iD0 == 0) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> q6(@NotNull Iterable<? extends T> iterable, @NotNull R[] other) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(iterable, 10), length));
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new Pair(t10, other[i10]));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> r2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String r3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
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
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return q3(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T r4(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static <T> List<T> r5(@NotNull List<? extends T> list, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? EmptyList.f217510a : a6(list.subList(indices.f221139a, indices.f221140b + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> r6(@NotNull Iterable<? extends T> iterable, @NotNull R[] other, @NotNull ed.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(J.d0(iterable, 10), length));
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t10, other[i10]));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> s2(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final <T> T s3(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) u3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <T> T s4(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T, R extends Comparable<? super R>> void s5(@NotNull List<T> list, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (list.size() > 1) {
            M.r0(list, new g.a(selector));
        }
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> List<Pair<T, T>> s6(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(new Pair(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C t2(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                destination.add(t10);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final <T> T t3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        while (itA.hasNext()) {
            Object obj = (Object) itA.next();
            if (lVar.invoke(obj).booleanValue()) {
                z10 = true;
                t10 = (T) obj;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final <T> T t4(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T, R extends Comparable<? super R>> void t5(@NotNull List<T> list, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (list.size() > 1) {
            M.r0(list, new g.c(selector));
        }
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T, R> List<R> t6(@NotNull Iterable<? extends T> iterable, @NotNull ed.p<? super T, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        a.b.C0001a next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <R> List<R> u2(Iterable<?> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        it.next();
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static <T> T u3(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(I.L(list));
    }

    @NotNull
    public static final <T> List<T> u4(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        Collection collectionV0 = N.v0(elements);
        if (collectionV0.isEmpty()) {
            return a6(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!collectionV0.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void u5(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        M.r0(list, Oc.g.x());
    }

    @kotlin.C
    public static final <R, C extends Collection<? super R>> C v2(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return destination;
        }
        it.next();
        kotlin.jvm.internal.G.P();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T v3(@NotNull List<? extends T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @NotNull
    public static <T> List<T> v4(@NotNull Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(J.d0(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.G.g(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T extends Comparable<? super T>> List<T> v5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listC6 = c6(iterable);
            M.o0(listC6);
            return listC6;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a6(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C4875q.U3((Comparable[]) array);
        return C4875q.t(array);
    }

    @NotNull
    public static final <T> List<T> w2(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> int w3(@NotNull Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t10);
        }
        int i10 = -1;
        int i11 = 0;
        for (T t11 : iterable) {
            if (i11 < 0) {
                I.b0();
                throw null;
            }
            if (kotlin.jvm.internal.G.g(t10, t11)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @NotNull
    public static final <T> List<T> w4(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        List listI3 = SequencesKt___SequencesKt.I3(elements);
        if (listI3.isEmpty()) {
            return a6(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!listI3.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> w5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return z5(iterable, new g.a(selector));
    }

    @NotNull
    public static <T> List<T> x2(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        y2(iterable, arrayList);
        return arrayList;
    }

    public static final <T> int x3(@NotNull List<? extends T> list, T t10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.lastIndexOf(t10);
    }

    @NotNull
    public static final <T> List<T> x4(@NotNull Iterable<? extends T> iterable, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        if (elements.length == 0) {
            return a6(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!B.B8(elements, t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> x5(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return z5(iterable, new g.c(selector));
    }

    public static /* synthetic */ Object y1(int i10, int i11) {
        m2(i10, i11);
        throw null;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super T>, T> C y2(@NotNull Iterable<? extends T> iterable, @NotNull C destination) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @Nullable
    public static final <T> T y3(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) androidx.appcompat.view.menu.d.a(list, 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Xc.f
    public static final <T> List<T> y4(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return v4(iterable, t10);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> y5(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return z5(iterable, Oc.g.x());
    }

    public static Iterator z1(Iterable iterable) {
        return iterable.iterator();
    }

    @kotlin.C
    @NotNull
    public static final <T, C extends Collection<? super T>> C z2(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (T t10 : iterable) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @Nullable
    public static final <T> T z3(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> lVar) {
        Iterator itA = P.a(iterable, "<this>", lVar, "predicate");
        T t10 = null;
        while (itA.hasNext()) {
            Object obj = (Object) itA.next();
            if (lVar.invoke(obj).booleanValue()) {
                t10 = (T) obj;
            }
        }
        return t10;
    }

    public static final <T> boolean z4(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> List<T> z5(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listC6 = c6(iterable);
            M.r0(listC6, comparator);
            return listC6;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a6(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C4875q.h4(array, comparator);
        return C4875q.t(array);
    }
}
