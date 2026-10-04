package kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i<K, V> extends e<K, V, K> {
    /* JADX WARN: Illegal instructions before constructor call */
    public i(@NotNull PersistentHashMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        t[] tVarArr = new t[8];
        for (int i10 = 0; i10 < 8; i10++) {
            tVarArr[i10] = new v();
        }
        super(builder, tVarArr);
    }
}
