package rd;

import fd.InterfaceC4418a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5551b<K, V> extends Map<K, V>, InterfaceC4418a {
    @NotNull
    InterfaceC5552c<K> getKeys();

    @NotNull
    InterfaceC5550a<V> k();

    @NotNull
    InterfaceC5552c<Map.Entry<K, V>> s();
}
