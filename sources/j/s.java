package J;

import java.util.Iterator;
import kotlin.collections.AbstractC4855b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class s<K, V> extends AbstractC4855b<V> implements H.a<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53090b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d<K, V> f53091a;

    public s(@NotNull d<K, V> dVar) {
        this.f53091a = dVar;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f53091a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f53091a.getSize();
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<V> iterator() {
        return new t(this.f53091a.f53062d);
    }
}
