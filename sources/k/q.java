package K;

import java.util.Iterator;
import kotlin.collections.AbstractC4855b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class q<K, V> extends AbstractC4855b<V> implements H.a<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58330b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c<K, V> f58331a;

    public q(@NotNull c<K, V> cVar) {
        this.f58331a = cVar;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f58331a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f58331a.getSize();
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<V> iterator() {
        return new r(this.f58331a);
    }
}
