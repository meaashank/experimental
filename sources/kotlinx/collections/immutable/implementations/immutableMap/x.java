package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class x<K, V> extends t<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g<K, V> f218595d;

    public x(@NotNull g<K, V> parentIterator) {
        G.p(parentIterator, "parentIterator");
        this.f218595d = parentIterator;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        int i10 = this.f218589c;
        this.f218589c = i10 + 2;
        g<K, V> gVar = this.f218595d;
        Object[] objArr = this.f218587a;
        return new c(gVar, objArr[i10], objArr[i10 + 1]);
    }
}
