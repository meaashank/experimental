package K;

import androidx.activity.D;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4869k;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentOrderedMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class l<K, V> extends AbstractC4869k<Map.Entry<? extends K, ? extends V>> implements H.e<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58318c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c<K, V> f58319b;

    public l(@NotNull c<K, V> cVar) {
        this.f58319b = cVar;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return h((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f58319b.getSize();
    }

    public boolean h(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        if (!D.a(entry)) {
            return false;
        }
        V v10 = this.f58319b.get(entry.getKey());
        if (v10 != null) {
            return v10.equals(entry.getValue());
        }
        if (entry.getValue() == null) {
            c<K, V> cVar = this.f58319b;
            if (cVar.f58293f.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new m(this.f58319b);
    }
}
