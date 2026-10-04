package A;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<K, V> f14a;

    public d() {
        this(0, 0.0f, 3, null);
    }

    @Nullable
    public final V a(@NotNull K key) {
        G.p(key, "key");
        return this.f14a.get(key);
    }

    @NotNull
    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> setEntrySet = this.f14a.entrySet();
        G.o(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f14a.isEmpty();
    }

    @Nullable
    public final V d(@NotNull K key, @NotNull V value) {
        G.p(key, "key");
        G.p(value, "value");
        return this.f14a.put(key, value);
    }

    @Nullable
    public final V e(@NotNull K key) {
        G.p(key, "key");
        return this.f14a.remove(key);
    }

    public d(int i10, float f10) {
        this.f14a = new LinkedHashMap<>(i10, f10, true);
    }

    public /* synthetic */ d(int i10, float f10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull d<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        G.p(original, "original");
        for (Map.Entry<? extends K, V> entry : original.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }
}
