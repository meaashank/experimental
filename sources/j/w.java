package J;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 4)
public final class w<K, V> extends v<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53107e = 0;

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        int i10 = this.f53106c;
        this.f53106c = i10 + 2;
        Object[] objArr = this.f53104a;
        return new b(objArr[i10], objArr[i10 + 1]);
    }
}
