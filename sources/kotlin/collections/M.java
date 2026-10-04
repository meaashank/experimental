package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class M extends L {
    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final <T> void l0(List<T> list, T t10) {
        kotlin.jvm.internal.G.p(list, "<this>");
        Collections.fill(list, t10);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final <T> void m0(List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        Collections.shuffle(list);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final <T> void n0(List<T> list, Random random) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void o0(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @InterfaceC4852c0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @Xc.f
    public static final <T> void p0(List<T> list, ed.p<? super T, ? super T, Integer> comparison) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @InterfaceC4852c0(expression = "this.sortWith(comparator)", imports = {}))
    @Xc.f
    public static final <T> void q0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    public static <T> void r0(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(list, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
