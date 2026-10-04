package kotlin.reflect;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface p<T, V> extends n<V>, ed.l<T, V> {

    public interface a<T, V> extends n.c<V>, ed.l<T, V> {
    }

    V get(T t10);

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    Object getDelegate(T t10);

    @Override // kotlin.reflect.n
    @NotNull
    a<T, V> getGetter();
}
