package kotlin.collections;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC4850b0;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class J extends I {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class a<T> implements Iterable<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<Iterator<T>> f217515a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4376a<? extends Iterator<? extends T>> interfaceC4376a) {
            this.f217515a = interfaceC4376a;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f217515a.invoke();
        }
    }

    @Xc.f
    public static final <T> Iterable<T> c0(InterfaceC4376a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.G.p(iterator, "iterator");
        return new a(iterator);
    }

    @InterfaceC4850b0
    public static <T> int d0(@NotNull Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    @InterfaceC4850b0
    @Nullable
    public static final <T> Integer e0(@NotNull Iterable<? extends T> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @NotNull
    public static <T> List<T> f0(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            N.s0(arrayList, it.next());
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> g0(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        int iD0 = d0(iterable, 10);
        ArrayList arrayList = new ArrayList(iD0);
        ArrayList arrayList2 = new ArrayList(iD0);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.f217467a);
            arrayList2.add(pair.f217468b);
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
