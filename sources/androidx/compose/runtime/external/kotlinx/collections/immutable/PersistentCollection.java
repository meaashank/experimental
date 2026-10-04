package androidx.compose.runtime.external.kotlinx.collections.immutable;

import ed.l;
import fd.InterfaceC4419b;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface PersistentCollection<E> extends H.a<E> {

    public interface Builder<E> extends Collection<E>, InterfaceC4419b {
        @NotNull
        PersistentCollection<E> build();
    }

    @NotNull
    PersistentCollection<E> a(@NotNull l<? super E, Boolean> lVar);

    @NotNull
    PersistentCollection<E> add(E e10);

    @NotNull
    PersistentCollection<E> addAll(@NotNull Collection<? extends E> collection);

    @NotNull
    Builder<E> builder();

    @NotNull
    PersistentCollection<E> clear();

    @NotNull
    PersistentCollection<E> remove(E e10);

    @NotNull
    PersistentCollection<E> removeAll(@NotNull Collection<? extends E> collection);

    @NotNull
    PersistentCollection<E> retainAll(@NotNull Collection<? extends E> collection);
}
