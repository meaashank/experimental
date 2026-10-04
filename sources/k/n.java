package K;

import java.util.Iterator;
import kotlin.collections.AbstractC4869k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class n<K, V> extends AbstractC4869k<K> implements H.e<K> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58322c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c<K, V> f58323b;

    public n(@NotNull c<K, V> cVar) {
        this.f58323b = cVar;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f58323b.f58293f.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f58323b.getSize();
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<K> iterator() {
        return new o(this.f58323b);
    }
}
