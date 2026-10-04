package Oc;

import java.util.Comparator;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class i extends h {
    @InterfaceC4887e0(version = "1.4")
    public static final <T> T A0(T t10, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        G.p(other, "other");
        G.p(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.1")
    public static final <T> T B0(T t10, T t11, T t12, @NotNull Comparator<? super T> comparator) {
        G.p(comparator, "comparator");
        return (T) C0(t10, C0(t11, t12, comparator), comparator);
    }

    @InterfaceC4887e0(version = "1.1")
    public static final <T> T C0(T t10, T t11, @NotNull Comparator<? super T> comparator) {
        G.p(comparator, "comparator");
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final <T> T D0(T t10, @NotNull T[] other, @NotNull Comparator<? super T> comparator) {
        G.p(other, "other");
        G.p(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.1")
    public static final <T> T y0(T t10, T t11, T t12, @NotNull Comparator<? super T> comparator) {
        G.p(comparator, "comparator");
        return (T) z0(t10, z0(t11, t12, comparator), comparator);
    }

    @InterfaceC4887e0(version = "1.1")
    public static final <T> T z0(T t10, T t11, @NotNull Comparator<? super T> comparator) {
        G.p(comparator, "comparator");
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }
}
