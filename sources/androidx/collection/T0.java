package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1097:1\n1#2:1098\n*E\n"})
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableScatterSet<Object> f86893a = new MutableScatterSet<>(0);

    @NotNull
    public static final <E> ScatterSet<E> a() {
        MutableScatterSet<Object> mutableScatterSet = f86893a;
        kotlin.jvm.internal.G.n(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> b() {
        return new MutableScatterSet<>(0, 1, null);
    }

    @NotNull
    public static final <E> MutableScatterSet<E> c(E e10) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.a0(e10);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> d(E e10, E e11) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.a0(e10);
        mutableScatterSet.a0(e11);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> e(E e10, E e11, E e12) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.a0(e10);
        mutableScatterSet.a0(e11);
        mutableScatterSet.a0(e12);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> f(@NotNull E... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.c0(elements);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> ScatterSet<E> g() {
        MutableScatterSet<Object> mutableScatterSet = f86893a;
        kotlin.jvm.internal.G.n(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> ScatterSet<E> h(E e10) {
        return c(e10);
    }

    @NotNull
    public static final <E> ScatterSet<E> i(E e10, E e11) {
        return d(e10, e11);
    }

    @NotNull
    public static final <E> ScatterSet<E> j(E e10, E e11, E e12) {
        return e(e10, e11, e12);
    }

    @NotNull
    public static final <E> ScatterSet<E> k(@NotNull E... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.c0(elements);
        return mutableScatterSet;
    }
}
