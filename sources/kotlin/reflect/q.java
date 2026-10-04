package kotlin.reflect;

import kotlin.InterfaceC4887e0;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface q<D, E, V> extends n<V>, ed.p<D, E, V> {

    public interface a<D, E, V> extends n.c<V>, ed.p<D, E, V> {
    }

    V get(D d10, E e10);

    @Override // kotlin.reflect.n
    @NotNull
    a<D, E, V> getGetter();

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    Object r(D d10, E e10);
}
