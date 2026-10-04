package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r<K, V> extends d<K, V, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    public r(@NotNull s<K, V> node) {
        G.p(node, "node");
        t[] tVarArr = new t[8];
        for (int i10 = 0; i10 < 8; i10++) {
            tVarArr[i10] = new y();
        }
        super(node, tVarArr);
    }
}
