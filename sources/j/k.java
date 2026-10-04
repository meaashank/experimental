package J;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 4)
public final class k<K, V> extends g<K, V, K> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f53079j = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(@NotNull f<K, V> fVar) {
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new x();
        }
        super(fVar, vVarArr);
    }
}
