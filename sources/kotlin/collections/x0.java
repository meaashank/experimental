package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.collections.builders.SetBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class x0 {
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <E> Set<E> a(@NotNull Set<E> builder) {
        kotlin.jvm.internal.G.p(builder, "builder");
        return ((SetBuilder) builder).g();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @Xc.f
    public static final <E> Set<E> b(int i10, ed.l<? super Set<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        SetBuilder setBuilder = new SetBuilder(i10);
        builderAction.invoke(setBuilder);
        return setBuilder.g();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @Xc.f
    public static final <E> Set<E> c(ed.l<? super Set<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        SetBuilder setBuilder = new SetBuilder();
        builderAction.invoke(setBuilder);
        return setBuilder.g();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <E> Set<E> d() {
        return new SetBuilder();
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static <E> Set<E> e(int i10) {
        return new SetBuilder(i10);
    }

    @NotNull
    public static <T> Set<T> f(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        kotlin.jvm.internal.G.o(setSingleton, "singleton(...)");
        return setSingleton;
    }

    @NotNull
    public static final <T> TreeSet<T> g(@NotNull Comparator<? super T> comparator, @NotNull T... elements) {
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(elements, "elements");
        TreeSet<T> treeSet = new TreeSet<>(comparator);
        B.Iy(elements, treeSet);
        return treeSet;
    }

    @NotNull
    public static <T> TreeSet<T> h(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        TreeSet<T> treeSet = new TreeSet<>();
        B.Iy(elements, treeSet);
        return treeSet;
    }
}
