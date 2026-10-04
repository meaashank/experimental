package kotlin.reflect;

import kotlin.L0;
import kotlin.reflect.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface l<T, V> extends p<T, V>, j<V> {

    public interface a<T, V> extends j.a<V>, ed.p<T, V, L0> {
    }

    void D(T t10, V v10);

    @Override // kotlin.reflect.j
    @NotNull
    a<T, V> d();
}
