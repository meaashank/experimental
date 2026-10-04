package ud;

import ed.p;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static final void a(int i10, @NotNull p<? super Integer, ? super Integer, L0> body) {
        G.p(body, "body");
        int i11 = 0;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            body.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i11));
            i11++;
            i10 ^= iLowestOneBit;
        }
    }
}
