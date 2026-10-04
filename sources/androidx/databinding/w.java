package androidx.databinding;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface w<K, V> extends Map<K, V> {

    public static abstract class a<T extends w<K, V>, K, V> {
        public abstract void a(T sender, K key);
    }

    void d3(a<? extends w<K, V>, K, V> callback);

    void g(a<? extends w<K, V>, K, V> callback);
}
