package com.android.launcher3.util;

import android.util.LongSparseArray;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class LongArrayMap<E> extends LongSparseArray<E> implements Iterable<E> {

    public class ValueIterator implements Iterator<E> {
        private int mNextIndex = 0;

        public ValueIterator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mNextIndex < LongArrayMap.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            LongArrayMap longArrayMap = LongArrayMap.this;
            int i10 = this.mNextIndex;
            this.mNextIndex = i10 + 1;
            return longArrayMap.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public boolean containsKey(long j10) {
        return indexOfKey(j10) >= 0;
    }

    public boolean isEmpty() {
        return size() <= 0;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new ValueIterator();
    }

    @Override // android.util.LongSparseArray
    public LongArrayMap<E> clone() {
        return (LongArrayMap) super.clone();
    }
}
