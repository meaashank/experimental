package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class ImmutableList<T> extends AbstractList<T> implements RandomAccess {
    private final T[] views;

    public ImmutableList(T[] tArr) {
        this.views = tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        for (T t10 : this.views) {
            if (t10 == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.views[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.views.length;
    }
}
