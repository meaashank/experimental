package androidx.databinding;

import androidx.databinding.v;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient r f112271a = new r();

    @Override // androidx.databinding.v
    public void Y1(v.a aVar) {
        if (this.f112271a == null) {
            this.f112271a = new r();
        }
        this.f112271a.a(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t10) {
        super.add(t10);
        b(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            b(size, size() - size);
        }
        return zAddAll;
    }

    public final void b(int i10, int i11) {
        r rVar = this.f112271a;
        if (rVar != null) {
            rVar.v(this, i10, i11);
        }
    }

    public final void c(int i10, int i11) {
        r rVar = this.f112271a;
        if (rVar != null) {
            rVar.x(this, i10, i11);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            c(0, size);
        }
    }

    @Override // androidx.databinding.v
    public void n2(v.a aVar) {
        r rVar = this.f112271a;
        if (rVar != null) {
            rVar.n(aVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i10) {
        T t10 = (T) super.remove(i10);
        c(i10, 1);
        return t10;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i10, int i11) {
        super.removeRange(i10, i11);
        c(i10, i11 - i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        T t11 = (T) super.set(i10, t10);
        r rVar = this.f112271a;
        if (rVar != null) {
            rVar.u(this, i10, 1);
        }
        return t11;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        super.add(i10, t10);
        b(i10, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(i10, collection);
        if (zAddAll) {
            b(i10, collection.size());
        }
        return zAddAll;
    }
}
