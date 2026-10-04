package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.InterfaceC4849b;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.collections.builders.SetBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class y0 extends x0 {
    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final <E> Set<E> i(int i10, @InterfaceC4849b ed.l<? super Set<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        SetBuilder setBuilder = new SetBuilder(i10);
        builderAction.invoke(setBuilder);
        return setBuilder.g();
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final <E> Set<E> j(@InterfaceC4849b ed.l<? super Set<E>, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        SetBuilder setBuilder = new SetBuilder();
        builderAction.invoke(setBuilder);
        return setBuilder.g();
    }

    @NotNull
    public static <T> Set<T> k() {
        return EmptySet.f217512a;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @NotNull
    public static final <T> HashSet<T> m(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        HashSet<T> hashSet = new HashSet<>(m0.j(elements.length));
        B.Iy(elements, hashSet);
        return hashSet;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @NotNull
    public static final <T> LinkedHashSet<T> o(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(m0.j(elements.length));
        B.Iy(elements, linkedHashSet);
        return linkedHashSet;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @NotNull
    public static <T> Set<T> q(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(elements.length));
        B.Iy(elements, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> r(@NotNull Set<? extends T> set) {
        kotlin.jvm.internal.G.p(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : x0.f(set.iterator().next()) : EmptySet.f217512a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <T> Set<T> s(Set<? extends T> set) {
        return set == 0 ? EmptySet.f217512a : set;
    }

    @Xc.f
    public static final <T> Set<T> t() {
        return EmptySet.f217512a;
    }

    @NotNull
    public static <T> Set<T> u(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return B.Fz(elements);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T> Set<T> v(@Nullable T t10) {
        return t10 != null ? x0.f(t10) : EmptySet.f217512a;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T> Set<T> w(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        B.mb(elements, linkedHashSet);
        return linkedHashSet;
    }
}
