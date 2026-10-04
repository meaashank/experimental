package kotlin.reflect;

import kotlin.L0;
import kotlin.reflect.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface m<D, E, V> extends q<D, E, V>, j<V> {

    public interface a<D, E, V> extends j.a<V>, ed.q<D, E, V, L0> {
    }

    @Override // kotlin.reflect.j
    @NotNull
    a<D, E, V> d();

    void f(D d10, E e10, V v10);
}
