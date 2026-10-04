package J;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class z<K, V> extends v<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f53114f = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final i<K, V> f53115e;

    public z(@NotNull i<K, V> iVar) {
        this.f53115e = iVar;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        int i10 = this.f53106c;
        this.f53106c = i10 + 2;
        i<K, V> iVar = this.f53115e;
        Object[] objArr = this.f53104a;
        return new c(iVar, objArr[i10], objArr[i10 + 1]);
    }
}
