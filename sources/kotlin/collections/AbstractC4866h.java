package kotlin.collections;

import fd.InterfaceC4422e;
import java.util.AbstractList;
import java.util.List;
import kotlin.InterfaceC4887e0;

/* JADX INFO: renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public abstract class AbstractC4866h<E> extends AbstractList<E> implements List<E>, InterfaceC4422e {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i10, E e10);

    @kotlin.C
    public abstract E b(int i10);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return b(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    @kotlin.C
    public abstract E set(int i10, E e10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
