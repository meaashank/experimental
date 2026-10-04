package J;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 4)
public final class m<K, V> extends g<K, V, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f53082j = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(@NotNull f<K, V> fVar) {
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new A();
        }
        super(fVar, vVarArr);
    }
}
