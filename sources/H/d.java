package H;

import fd.InterfaceC4418a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface d<K, V> extends Map<K, V>, InterfaceC4418a {
    @NotNull
    e<K> getKeys();

    @NotNull
    a<V> k();

    @NotNull
    e<Map.Entry<K, V>> s();
}
