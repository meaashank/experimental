package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class I<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a<T>> f116309b = new SparseArray<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<T> f116310c;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f116311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<T> f116314d;

        public a(Class<T> cls, int i10) {
            this.f116311a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        }

        public boolean a(int i10) {
            int i11 = this.f116312b;
            return i11 <= i10 && i10 < i11 + this.f116313c;
        }

        public T b(int i10) {
            return this.f116311a[i10 - this.f116312b];
        }
    }

    public I(int i10) {
        this.f116308a = i10;
    }

    public a<T> a(a<T> aVar) {
        int iIndexOfKey = this.f116309b.indexOfKey(aVar.f116312b);
        if (iIndexOfKey < 0) {
            this.f116309b.put(aVar.f116312b, aVar);
            return null;
        }
        a<T> aVarValueAt = this.f116309b.valueAt(iIndexOfKey);
        this.f116309b.setValueAt(iIndexOfKey, aVar);
        if (this.f116310c == aVarValueAt) {
            this.f116310c = aVar;
        }
        return aVarValueAt;
    }

    public void b() {
        this.f116309b.clear();
    }

    public a<T> c(int i10) {
        if (i10 < 0 || i10 >= this.f116309b.size()) {
            return null;
        }
        return this.f116309b.valueAt(i10);
    }

    public T d(int i10) {
        a<T> aVar = this.f116310c;
        if (aVar == null || !aVar.a(i10)) {
            int iIndexOfKey = this.f116309b.indexOfKey(i10 - (i10 % this.f116308a));
            if (iIndexOfKey < 0) {
                return null;
            }
            this.f116310c = this.f116309b.valueAt(iIndexOfKey);
        }
        return this.f116310c.b(i10);
    }

    public a<T> e(int i10) {
        a<T> aVar = this.f116309b.get(i10);
        if (this.f116310c == aVar) {
            this.f116310c = null;
        }
        this.f116309b.delete(i10);
        return aVar;
    }

    public int f() {
        return this.f116309b.size();
    }
}
