package kotlin.collections;

import fd.InterfaceC4419b;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.InterfaceC4887e0;

/* JADX INFO: renamed from: kotlin.collections.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public abstract class AbstractC4865g<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC4419b {
    @Override // java.util.AbstractCollection, java.util.Collection
    @kotlin.C
    public abstract boolean add(E e10);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
