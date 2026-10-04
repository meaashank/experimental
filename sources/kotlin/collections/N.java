package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class N extends M {
    @Xc.f
    public static final <T> void A0(Collection<? super T> collection, InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        L0(collection, elements);
    }

    @Xc.f
    public static final <T> void B0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        M0(collection, elements);
    }

    @Xc.f
    public static final <T> void C0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        s0(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <T> void D0(Collection<? super T> collection, T t10) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        collection.add(t10);
    }

    @Xc.f
    public static final <T> void E0(Collection<? super T> collection, InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        t0(collection, elements);
    }

    @Xc.f
    public static final <T> void F0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        u0(collection, elements);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @InterfaceC4852c0(expression = "removeAt(index)", imports = {}))
    @Xc.f
    public static final <T> T G0(List<T> list, int i10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.remove(i10);
    }

    @kotlin.C
    @Xc.f
    public static final <T> boolean H0(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return kotlin.jvm.internal.Y.a(collection).remove(t10);
    }

    @kotlin.C
    public static <T> boolean I0(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        return w0(iterable, predicate, true);
    }

    @kotlin.C
    public static <T> boolean J0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return collection.removeAll(v0(elements));
    }

    @kotlin.C
    @Xc.f
    public static final <T> boolean K0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return kotlin.jvm.internal.Y.a(collection).removeAll(elements);
    }

    @kotlin.C
    public static <T> boolean L0(@NotNull Collection<? super T> collection, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        List listI3 = SequencesKt___SequencesKt.I3(elements);
        return !listI3.isEmpty() && collection.removeAll(listI3);
    }

    @kotlin.C
    public static <T> boolean M0(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(C4875q.t(elements));
    }

    @kotlin.C
    public static <T> boolean N0(@NotNull List<T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        return x0(list, predicate, true);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    public static <T> T O0(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Nullable
    public static <T> T P0(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    public static <T> T Q0(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(I.L(list));
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Nullable
    public static <T> T R0(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(I.L(list));
    }

    @kotlin.C
    public static <T> boolean S0(@NotNull Iterable<? extends T> iterable, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        return w0(iterable, predicate, false);
    }

    @kotlin.C
    public static <T> boolean T0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return collection.retainAll(v0(elements));
    }

    @kotlin.C
    @Xc.f
    public static final <T> boolean U0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return kotlin.jvm.internal.Y.a(collection).retainAll(elements);
    }

    @kotlin.C
    public static final <T> boolean V0(@NotNull Collection<? super T> collection, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        List listI3 = SequencesKt___SequencesKt.I3(elements);
        if (!listI3.isEmpty()) {
            return collection.retainAll(listI3);
        }
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    @kotlin.C
    public static final <T> boolean W0(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        if (!(elements.length == 0)) {
            return collection.retainAll(C4875q.t(elements));
        }
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    @kotlin.C
    public static final <T> boolean X0(@NotNull List<T> list, @NotNull ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        return x0(list, predicate, false);
    }

    @kotlin.C
    public static final boolean Y0(Collection<?> collection) {
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    @kotlin.C
    public static <T> boolean s0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @kotlin.C
    public static <T> boolean t0(@NotNull Collection<? super T> collection, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @kotlin.C
    public static <T> boolean u0(@NotNull Collection<? super T> collection, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return collection.addAll(C4875q.t(elements));
    }

    @NotNull
    public static <T> Collection<T> v0(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : U.a6(iterable);
    }

    public static final <T> boolean w0(Iterable<? extends T> iterable, ed.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final <T> boolean x0(List<T> list, ed.l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.G.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return w0(kotlin.jvm.internal.Y.c(list), lVar, z10);
        }
        int iL = I.L(list);
        if (iL >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == iL) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iL2 = I.L(list);
        if (i10 > iL2) {
            return true;
        }
        while (true) {
            list.remove(iL2);
            if (iL2 == i10) {
                return true;
            }
            iL2--;
        }
    }

    @Xc.f
    public static final <T> void y0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        J0(collection, elements);
    }

    @Xc.f
    public static final <T> void z0(Collection<? super T> collection, T t10) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        collection.remove(t10);
    }
}
