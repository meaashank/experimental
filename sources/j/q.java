package J;

import java.util.Iterator;
import kotlin.collections.AbstractC4869k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class q<K, V> extends AbstractC4869k<K> implements H.e<K> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53087c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<K, V> f53088b;

    public q(@NotNull d<K, V> dVar) {
        this.f53088b = dVar;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f53088b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f53088b.getSize();
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new r(this.f53088b.f53062d);
    }
}
