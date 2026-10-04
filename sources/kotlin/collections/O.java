package kotlin.collections;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class O extends N {
    public static final int a1(List list, int i10) {
        return I.L(list) - i10;
    }

    @NotNull
    public static <T> List<T> c1(@NotNull List<? extends T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return new u0(list);
    }

    @dd.j(name = "asReversedMutable")
    @NotNull
    public static final <T> List<T> d1(@NotNull List<T> list) {
        kotlin.jvm.internal.G.p(list, "<this>");
        return new t0(list);
    }

    public static final int e1(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= I.L(list)) {
            return I.L(list) - i10;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Element index ", i10, " must be in range [");
        sbA.append(new md.l(0, I.L(list), 1));
        sbA.append("].");
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public static final int f1(List<?> list, int i10) {
        return I.L(list) - i10;
    }

    public static final int g1(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Position index ", i10, " must be in range [");
        sbA.append(new md.l(0, list.size(), 1));
        sbA.append("].");
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
