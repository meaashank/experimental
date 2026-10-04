package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.C4968u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public class H {
    @Xc.f
    public static final <T> ArrayList<T> a(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return new ArrayList<>(I.u(tArr, true));
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <E> List<E> b(@NotNull List<E> builder) {
        kotlin.jvm.internal.G.p(builder, "builder");
        return ((ListBuilder) builder).A();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @Xc.f
    public static final <E> List<E> c(int i10, ed.l<? super List<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        ListBuilder listBuilder = new ListBuilder(i10);
        builderAction.invoke(listBuilder);
        return listBuilder.A();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @Xc.f
    public static final <E> List<E> d(ed.l<? super List<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        List listJ = j();
        builderAction.invoke(listJ);
        return b(listJ);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @Xc.f
    @InterfaceC4850b0
    public static final int e(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        I.a0();
        throw null;
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @Xc.f
    @InterfaceC4850b0
    public static final int f(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        I.b0();
        throw null;
    }

    @Xc.f
    public static final Object[] g(Collection<?> collection) {
        kotlin.jvm.internal.G.p(collection, "collection");
        return C4968u.a(collection);
    }

    @Xc.f
    public static final <T> T[] h(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.G.p(collection, "collection");
        kotlin.jvm.internal.G.p(array, "array");
        return (T[]) C4968u.b(collection, array);
    }

    @NotNull
    public static final <T> Object[] i(@NotNull T[] tArr, boolean z10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (z10 && tArr.getClass().equals(Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.G.o(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <E> List<E> j() {
        return new ListBuilder(0, 1, null);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <E> List<E> k(int i10) {
        return new ListBuilder(i10);
    }

    @NotNull
    public static <T> List<T> l(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.G.o(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> List<T> m(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        List<T> listC6 = U.c6(iterable);
        Collections.shuffle(listC6);
        return listC6;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> List<T> n(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        List<T> listC6 = U.c6(iterable);
        Collections.shuffle(listC6, random);
        return listC6;
    }

    @NotNull
    public static <T> T[] o(int i10, @NotNull T[] array) {
        kotlin.jvm.internal.G.p(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Xc.f
    public static final <T> List<T> p(Enumeration<T> enumeration) {
        kotlin.jvm.internal.G.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.G.o(list, "list(...)");
        return list;
    }
}
