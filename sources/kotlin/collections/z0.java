package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n873#2,2:142\n862#2,2:144\n1#3:146\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n30#1:142,2\n54#1:144,2\n*E\n"})
public class z0 extends y0 {
    @NotNull
    public static final <T> Set<T> A(@NotNull Set<? extends T> set, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(set, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        N.M0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @Xc.f
    public static final <T> Set<T> B(Set<? extends T> set, T t10) {
        kotlin.jvm.internal.G.p(set, "<this>");
        return y(set, t10);
    }

    @NotNull
    public static <T> Set<T> C(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.G.p(set, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        Integer numE0 = J.e0(elements);
        if (numE0 != null) {
            size = set.size() + numE0.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(size));
        linkedHashSet.addAll(set);
        N.s0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    public static <T> Set<T> D(@NotNull Set<? extends T> set, T t10) {
        kotlin.jvm.internal.G.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> E(@NotNull Set<? extends T> set, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(set, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(set.size() * 2));
        linkedHashSet.addAll(set);
        N.t0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> F(@NotNull Set<? extends T> set, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(set, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(set.size() + elements.length));
        linkedHashSet.addAll(set);
        N.u0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @Xc.f
    public static final <T> Set<T> G(Set<? extends T> set, T t10) {
        kotlin.jvm.internal.G.p(set, "<this>");
        return D(set, t10);
    }

    @NotNull
    public static <T> Set<T> x(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> elements) {
        kotlin.jvm.internal.G.p(set, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        Collection<?> collectionV0 = N.v0(elements);
        if (collectionV0.isEmpty()) {
            return U.f6(set);
        }
        if (!(collectionV0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionV0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t10 : set) {
            if (!((Set) collectionV0).contains(t10)) {
                linkedHashSet2.add(t10);
            }
        }
        return linkedHashSet2;
    }

    @NotNull
    public static <T> Set<T> y(@NotNull Set<? extends T> set, T t10) {
        kotlin.jvm.internal.G.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(set.size()));
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.G.g(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> z(@NotNull Set<? extends T> set, @NotNull InterfaceC5000m<? extends T> elements) {
        kotlin.jvm.internal.G.p(set, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        N.L0(linkedHashSet, elements);
        return linkedHashSet;
    }
}
