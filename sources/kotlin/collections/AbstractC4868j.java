package kotlin.collections;

import fd.InterfaceC4425h;
import java.util.AbstractSet;
import java.util.Set;
import kotlin.InterfaceC4887e0;

/* JADX INFO: renamed from: kotlin.collections.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public abstract class AbstractC4868j<E> extends AbstractSet<E> implements Set<E>, InterfaceC4425h {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @kotlin.C
    public abstract boolean add(E e10);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
