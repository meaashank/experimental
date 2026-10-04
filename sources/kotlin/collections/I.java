package kotlin.collections;

import androidx.collection.M0;
import androidx.collection.N0;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC4849b;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.collections.builders.ListBuilder;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,529:1\n1#2:530\n*E\n"})
public class I extends H {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.V({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,529:1\n*E\n"})
    public static final class a<T> implements ed.l<T, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f217513a;

        /* JADX INFO: Incorrect field signature: TK; */
        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparable f217514b;

        /* JADX WARN: Incorrect types in method signature: (Led/l<-TT;+TK;>;TK;)V */
        public a(ed.l lVar, Comparable comparable) {
            this.f217513a = lVar;
            this.f217514b = comparable;
        }

        @Override // ed.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(T t10) {
            return Integer.valueOf(Oc.g.l((Comparable) this.f217513a.invoke(t10), this.f217514b));
        }
    }

    public static /* synthetic */ int A(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return x(list, comparable, i10, i11);
    }

    public static /* synthetic */ int B(List list, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = list.size();
        }
        return y(list, obj, comparator, i10, i11);
    }

    public static final <T, K extends Comparable<? super K>> int C(@NotNull List<? extends T> list, @Nullable K k10, int i10, int i11, @NotNull ed.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return w(list, i10, i11, new a(selector, k10));
    }

    public static /* synthetic */ int D(List list, Comparable comparable, int i10, int i11, ed.l selector, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        return w(list, i10, i11, new a(selector, comparable));
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final <E> List<E> E(int i10, @InterfaceC4849b ed.l<? super List<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        ListBuilder listBuilder = new ListBuilder(i10);
        builderAction.invoke(listBuilder);
        return listBuilder.A();
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final <E> List<E> F(@InterfaceC4849b ed.l<? super List<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        List listJ = H.j();
        builderAction.invoke(listJ);
        return H.b(listJ);
    }

    @NotNull
    public static final Object[] G(@NotNull Collection<?> collection) {
        kotlin.jvm.internal.G.p(collection, "collection");
        int i10 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    @NotNull
    public static final <T> T[] H(@NotNull Collection<?> collection, @NotNull T[] array) {
        kotlin.jvm.internal.G.p(collection, "collection");
        kotlin.jvm.internal.G.p(array, "array");
        int i10 = 0;
        if (collection.isEmpty()) {
            H.o(0, array);
            return array;
        }
        if (array.length < collection.size()) {
            array = (T[]) C4873o.a(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            array[i10] = it.next();
            i10++;
        }
        H.o(collection.size(), array);
        return array;
    }

    @Xc.f
    public static final <T> boolean I(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        return collection.containsAll(elements);
    }

    @NotNull
    public static <T> List<T> J() {
        return EmptyList.f217510a;
    }

    @NotNull
    public static md.l K(@NotNull Collection<?> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return new md.l(0, collection.size() - 1, 1);
    }

    public static <T> int L(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Led/a<+TR;>;)TR; */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final Object M(Collection collection, InterfaceC4376a defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    @Xc.f
    public static final <T> boolean N(Collection<? extends T> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> boolean O(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @Xc.f
    public static final <T> List<T> P() {
        return EmptyList.f217510a;
    }

    @NotNull
    public static <T> List<T> Q(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return elements.length > 0 ? C4875q.t(elements) : EmptyList.f217510a;
    }

    @NotNull
    public static <T> List<T> R(@Nullable T t10) {
        return t10 != null ? H.l(t10) : EmptyList.f217510a;
    }

    @NotNull
    public static <T> List<T> S(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return B.lb(elements);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> List<T> T() {
        return new ArrayList();
    }

    @NotNull
    public static <T> List<T> U(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(u(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> V(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : H.l(list.get(0)) : EmptyList.f217510a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <T> Collection<T> W(Collection<? extends T> collection) {
        return collection == 0 ? EmptyList.f217510a : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <T> List<T> X(List<? extends T> list) {
        return list == 0 ? EmptyList.f217510a : list;
    }

    public static final void Y(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(M0.a("fromIndex (", i11, ") is greater than toIndex (", i12, ")."));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(N0.a("fromIndex (", i11, ") is less than zero."));
        }
        if (i12 > i10) {
            throw new IndexOutOfBoundsException(M0.a("toIndex (", i12, ") is greater than size (", i10, ")."));
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final <T> List<T> Z(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        List<T> listC6 = U.c6(iterable);
        U.j5(listC6, random);
        return listC6;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    public static void a0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> List<T> q(int i10, ed.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.G.p(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> List<T> r(int i10, ed.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.G.p(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> ArrayList<T> s() {
        return new ArrayList<>();
    }

    @NotNull
    public static <T> ArrayList<T> t(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(u(elements, true));
    }

    @NotNull
    public static final <T> Collection<T> u(@NotNull T[] tArr, boolean z10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return new C4870l(tArr, z10);
    }

    public static /* synthetic */ Collection v(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return u(objArr, z10);
    }

    public static <T> int w(@NotNull List<? extends T> list, int i10, int i11, @NotNull ed.l<? super T, Integer> comparison) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(comparison, "comparison");
        Y(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = comparison.invoke(list.get(i13)).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int x(@NotNull List<? extends T> list, @Nullable T t10, int i10, int i11) {
        kotlin.jvm.internal.G.p(list, "<this>");
        Y(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iL = Oc.g.l(list.get(i13), t10);
            if (iL < 0) {
                i10 = i13 + 1;
            } else {
                if (iL <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T> int y(@NotNull List<? extends T> list, T t10, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Y(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iCompare = comparator.compare(list.get(i13), t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int z(List list, int i10, int i11, ed.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return w(list, i10, i11, lVar);
    }
}
