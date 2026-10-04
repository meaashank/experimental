package J;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.AbstractC4868j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: J.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 8)
public abstract class AbstractC1212a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC4868j<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53053a = 0;

    public final boolean b(@NotNull E e10) {
        if ((e10 != null ? e10 : null) != null) {
            return g(e10);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean g(@NotNull Map.Entry<? extends K, ? extends V> entry);

    public final boolean h(@NotNull E e10) {
        if ((e10 != null ? e10 : null) != null) {
            return i(e10);
        }
        return false;
    }

    public abstract boolean i(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return h((Map.Entry) obj);
        }
        return false;
    }
}
