package J;

import androidx.activity.D;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC4869k;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentHashMapContentViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentViews.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class o<K, V> extends AbstractC4869k<Map.Entry<? extends K, ? extends V>> implements H.e<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53084c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<K, V> f53085b;

    public o(@NotNull d<K, V> dVar) {
        this.f53085b = dVar;
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
        return this.f53085b.getSize();
    }

    public boolean h(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        if (!D.a(entry)) {
            return false;
        }
        V v10 = this.f53085b.get(entry.getKey());
        return v10 != null ? v10.equals(entry.getValue()) : entry.getValue() == null && this.f53085b.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractC4869k, kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new p(this.f53085b.f53062d);
    }
}
