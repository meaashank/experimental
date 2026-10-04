package kotlin.collections;

import A0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.Pair;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n99#1,5:677\n115#1,5:682\n158#1,3:687\n148#1:690\n221#1:691\n222#1:693\n149#1:694\n221#1:695\n222#1:697\n1#2:692\n1#2:696\n2015#3,14:698\n2045#3,14:712\n2439#3,14:726\n2469#3,14:740\n1924#3,3:754\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n78#1:677,5\n91#1:682,5\n129#1:687,3\n139#1:690\n139#1:691\n139#1:693\n139#1:694\n148#1:695\n148#1:697\n139#1:692\n243#1:698,14\n261#1:712,14\n441#1:726,14\n459#1:740,14\n656#1:754,3\n*E\n"})
public class p0 extends o0 {
    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> Float A1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return (Map.Entry) U.s4(map.entrySet(), comparator);
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "minWithOrThrow")
    public static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return (Map.Entry) U.t4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@NotNull M m10, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, L0> action) {
        kotlin.jvm.internal.G.p(m10, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        Iterator<Map.Entry<K, V>> it = m10.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m10;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@NotNull M m10, @NotNull ed.p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, L0> action) {
        kotlin.jvm.internal.G.p(m10, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        Iterator<T> it = m10.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a.b.C0001a c0001a = (Object) it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                I.b0();
                throw null;
            }
            action.invoke(Integer.valueOf(i10), c0001a);
            i10 = i11;
        }
        return m10;
    }

    @NotNull
    public static <K, V> List<Pair<K, V>> J1(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        if (map.size() == 0) {
            return EmptyList.f217510a;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return EmptyList.f217510a;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return H.l(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Xc.f
    public static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.entrySet();
    }

    @NotNull
    public static <K, V> InterfaceC5000m<Map.Entry<K, V>> T0(@NotNull Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return U.E1(map.entrySet());
    }

    @Xc.f
    public static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.G.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <K, V, R> R W0(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <K, V, R> R X0(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @NotNull
    public static final <K, V, R> List<R> Y0(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            N.s0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @dd.j(name = "flatMapSequence")
    @NotNull
    @kotlin.V
    public static final <K, V, R> List<R> Z0(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            N.t0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @dd.j(name = "flatMapSequenceTo")
    @NotNull
    @kotlin.V
    public static final <K, V, R, C extends Collection<? super R>> C a1(@NotNull Map<? extends K, ? extends V> map, @NotNull C destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends InterfaceC5000m<? extends R>> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            N.t0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C b1(@NotNull Map<? extends K, ? extends V> map, @NotNull C destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            N.s0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @Xc.e
    public static final <K, V> void c1(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, L0> action) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @NotNull
    public static final <K, V, R> List<R> d1(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R> List<R> e1(@NotNull Map<? extends K, ? extends V> map, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C f1(@NotNull Map<? extends K, ? extends V> map, @NotNull C destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C g1(@NotNull Map<? extends K, ? extends V> map, @NotNull C destination, @NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "maxByOrThrow")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> double j1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> float k1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> Double n1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> Float o1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return (Map.Entry) U.a4(map.entrySet(), comparator);
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "maxWithOrThrow")
    public static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return (Map.Entry) U.b4(map.entrySet(), comparator);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC4887e0(version = "1.7")
    @Xc.f
    @dd.j(name = "minByOrThrow")
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> double v1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> float w1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <K, V> Double z1(Map<? extends K, ? extends V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }
}
