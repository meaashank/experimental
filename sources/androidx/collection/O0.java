package androidx.collection;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object[] f86807a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ObjectList<Object> f86808b = new G0(0);

    public static final void d(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException(M0.a("Index ", i10, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void e(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException(M0.a("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(N0.a("fromIndex (", i10, ") is less than 0."));
        }
        if (i11 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
    }

    @NotNull
    public static final <E> ObjectList<E> f() {
        ObjectList<E> objectList = (ObjectList<E>) f86808b;
        kotlin.jvm.internal.G.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    @NotNull
    public static final <E> G0<E> g() {
        return new G0<>(0, 1, null);
    }

    @NotNull
    public static final <E> G0<E> h(E e10) {
        G0<E> g02 = new G0<>(1);
        g02.Z(e10);
        return g02;
    }

    @NotNull
    public static final <E> G0<E> i(E e10, E e11) {
        G0<E> g02 = new G0<>(2);
        g02.Z(e10);
        g02.Z(e11);
        return g02;
    }

    @NotNull
    public static final <E> G0<E> j(E e10, E e11, E e12) {
        G0<E> g02 = new G0<>(3);
        g02.Z(e10);
        g02.Z(e11);
        g02.Z(e12);
        return g02;
    }

    @NotNull
    public static final <E> G0<E> k(@NotNull E... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        G0<E> g02 = new G0<>(elements.length);
        g02.A0(elements);
        return g02;
    }

    @NotNull
    public static final <E> ObjectList<E> l() {
        ObjectList<E> objectList = (ObjectList<E>) f86808b;
        kotlin.jvm.internal.G.n(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    @NotNull
    public static final <E> ObjectList<E> m(E e10) {
        return h(e10);
    }

    @NotNull
    public static final <E> ObjectList<E> n(E e10, E e11) {
        return i(e10, e11);
    }

    @NotNull
    public static final <E> ObjectList<E> o(E e10, E e11, E e12) {
        return j(e10, e11, e12);
    }

    @NotNull
    public static final <E> ObjectList<E> p(@NotNull E... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        G0 g02 = new G0(elements.length);
        g02.A0(elements);
        return g02;
    }
}
