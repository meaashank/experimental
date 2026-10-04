package kotlinx.collections.immutable;

import ed.l;
import fd.InterfaceC4419b;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5550a;

/* JADX INFO: loaded from: classes5.dex */
public interface PersistentCollection<E> extends InterfaceC5550a<E> {

    public interface Builder<E> extends Collection<E>, InterfaceC4419b {
        @NotNull
        PersistentCollection<E> build();
    }

    @NotNull
    PersistentCollection<E> a(@NotNull l<? super E, Boolean> lVar);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> add(E e10);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> addAll(@NotNull Collection<? extends E> collection);

    @NotNull
    Builder<E> builder();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> remove(E e10);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> retainAll(@NotNull Collection<? extends E> collection);
}
