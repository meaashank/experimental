package kotlin.collections;

import java.util.Iterator;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class L extends K {
    public static final <T> void i0(@NotNull Iterator<? extends T> it, @NotNull ed.l<? super T, L0> operation) {
        kotlin.jvm.internal.G.p(it, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final <T> Iterator<T> j0(Iterator<? extends T> it) {
        kotlin.jvm.internal.G.p(it, "<this>");
        return it;
    }

    @NotNull
    public static final <T> Iterator<C4858c0<T>> k0(@NotNull Iterator<? extends T> it) {
        kotlin.jvm.internal.G.p(it, "<this>");
        return new C4862e0(it);
    }
}
