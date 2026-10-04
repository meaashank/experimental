package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;

        public EntryForKey(int i10) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i10]);
            this.index = i10;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            int i10 = this.index;
            return i10 == -1 ? (V) NullnessCasts.unsafeNull() : (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i10]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v10) {
            updateIndex();
            int i10 = this.index;
            if (i10 == -1) {
                HashBiMap.this.put(this.key, v10);
                return (V) NullnessCasts.unsafeNull();
            }
            V v11 = (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i10]);
            if (Objects.equal(v11, v10)) {
                return v10;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v10, false);
            return v11;
        }

        public void updateIndex() {
            int i10 = this.index;
            if (i10 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i10 <= hashBiMap.size && Objects.equal(hashBiMap.keys[i10], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i10) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i10]);
            this.index = i10;
        }

        private void updateIndex() {
            int i10 = this.index;
            if (i10 != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i10 <= hashBiMap.size && Objects.equal(this.value, hashBiMap.values[i10])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            int i10 = this.index;
            return i10 == -1 ? (K) NullnessCasts.unsafeNull() : (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i10]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k10) {
            updateIndex();
            int i10 = this.index;
            if (i10 == -1) {
                this.biMap.putInverse(this.value, k10, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k11 = (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i10]);
            if (Objects.equal(k11, k10)) {
                return k10;
            }
            this.biMap.replaceKeyInEntry(this.index, k10, false);
            return k11;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (iFindEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int i10) {
            return new EntryForKey(i10);
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K forcePut(@ParametricNullness V v10, @ParametricNullness K k10) {
            return this.forward.putInverse(v10, k10, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K put(@ParametricNullness V v10, @ParametricNullness K k10) {
            return this.forward.putInverse(v10, k10, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @CheckForNull
        public K remove(@CheckForNull Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByValue = this.biMap.findEntryByValue(key);
                if (iFindEntryByValue != -1 && Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int i10) {
            return new EntryForValue(this.biMap, i10);
        }
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public K forEntry(int i10) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iSmearedHash);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public V forEntry(int i10) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iSmearedHash);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        public View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        @ParametricNullness
        public abstract T forEntry(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                private void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t10 = (T) View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t10;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    int i10 = this.index;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    if (i10 == hashBiMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = hashBiMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }
    }

    private HashBiMap(int i10) {
        init(i10);
    }

    private int bucket(int i10) {
        return i10 & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iBucket = bucket(i11);
        int[] iArr = this.hashTableKToV;
        int i12 = iArr[iBucket];
        if (i12 == i10) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.nextInBucketKToV[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                String strValueOf = String.valueOf(this.keys[i10]);
                throw new AssertionError(com.google.android.gms.auth.c.a(strValueOf.length() + 32, "Expected to find entry with key ", strValueOf));
            }
            if (i12 == i10) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.nextInBucketKToV[i12];
        }
    }

    private void deleteFromTableVToK(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iBucket = bucket(i11);
        int[] iArr = this.hashTableVToK;
        int i12 = iArr[iBucket];
        if (i12 == i10) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.nextInBucketVToK[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                String strValueOf = String.valueOf(this.values[i10]);
                throw new AssertionError(com.google.android.gms.auth.c.a(strValueOf.length() + 34, "Expected to find entry with value ", strValueOf));
            }
            if (i12 == i10) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.nextInBucketVToK[i12];
        }
    }

    private void ensureCapacity(int i10) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i10) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i10);
            this.keys = (K[]) Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i10) {
            int iClosedTableSize = Hashing.closedTableSize(i10, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i11 = 0; i11 < this.size; i11++) {
                int iBucket = bucket(Hashing.smearedHash(this.keys[i11]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i11] = iArr3[iBucket];
                iArr3[iBucket] = i11;
                int iBucket2 = bucket(Hashing.smearedHash(this.values[i11]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i11] = iArr5[iBucket2];
                iArr5[iBucket2] = i11;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(iArrCopyOf, length, i10, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iBucket = bucket(i11);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i10] = iArr2[iBucket];
        iArr2[iBucket] = i10;
    }

    private void insertIntoTableVToK(int i10, int i11) {
        Preconditions.checkArgument(i10 != -1);
        int iBucket = bucket(i11);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i10] = iArr2[iBucket];
        iArr2[iBucket] = i10;
    }

    private void moveEntryToIndex(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.prevInInsertionOrder[i10];
        int i15 = this.nextInInsertionOrder[i10];
        setSucceeds(i14, i11);
        setSucceeds(i11, i15);
        K[] kArr = this.keys;
        K k10 = kArr[i10];
        V[] vArr = this.values;
        V v10 = vArr[i10];
        kArr[i11] = k10;
        vArr[i11] = v10;
        int iBucket = bucket(Hashing.smearedHash(k10));
        int[] iArr = this.hashTableKToV;
        int i16 = iArr[iBucket];
        if (i16 == i10) {
            iArr[iBucket] = i11;
        } else {
            int i17 = this.nextInBucketKToV[i16];
            while (true) {
                i12 = i16;
                i16 = i17;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.nextInBucketKToV[i16];
                }
            }
            this.nextInBucketKToV[i12] = i11;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int iBucket2 = bucket(Hashing.smearedHash(v10));
        int[] iArr3 = this.hashTableVToK;
        int i18 = iArr3[iBucket2];
        if (i18 == i10) {
            iArr3[iBucket2] = i11;
        } else {
            int i19 = this.nextInBucketVToK[i18];
            while (true) {
                i13 = i18;
                i18 = i19;
                if (i18 == i10) {
                    break;
                } else {
                    i19 = this.nextInBucketVToK[i18];
                }
            }
            this.nextInBucketVToK[i13] = i11;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        init(16);
        Serialization.populateMap(this, objectInputStream, count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i10, @ParametricNullness K k10, boolean z10) {
        int i11;
        Preconditions.checkArgument(i10 != -1);
        int iSmearedHash = Hashing.smearedHash(k10);
        int iFindEntryByKey = findEntryByKey(k10, iSmearedHash);
        int i12 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i11 = -2;
        } else {
            if (!z10) {
                String strValueOf = String.valueOf(k10);
                throw new IllegalArgumentException(com.google.android.gms.auth.c.a(strValueOf.length() + 28, "Key already present in map: ", strValueOf));
            }
            i12 = this.prevInInsertionOrder[iFindEntryByKey];
            i11 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (i10 == this.size) {
                i10 = iFindEntryByKey;
            }
        }
        if (i12 == i10) {
            i12 = this.prevInInsertionOrder[i10];
        } else if (i12 == this.size) {
            i12 = iFindEntryByKey;
        }
        if (i11 == i10) {
            iFindEntryByKey = this.nextInInsertionOrder[i10];
        } else if (i11 != this.size) {
            iFindEntryByKey = i11;
        }
        setSucceeds(this.prevInInsertionOrder[i10], this.nextInInsertionOrder[i10]);
        deleteFromTableKToV(i10, Hashing.smearedHash(this.keys[i10]));
        this.keys[i10] = k10;
        insertIntoTableKToV(i10, Hashing.smearedHash(k10));
        setSucceeds(i12, i10);
        setSucceeds(i10, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i10, @ParametricNullness V v10, boolean z10) {
        Preconditions.checkArgument(i10 != -1);
        int iSmearedHash = Hashing.smearedHash(v10);
        int iFindEntryByValue = findEntryByValue(v10, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (!z10) {
                String strValueOf = String.valueOf(v10);
                throw new IllegalArgumentException(com.google.android.gms.auth.c.a(strValueOf.length() + 30, "Value already present in map: ", strValueOf));
            }
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            if (i10 == this.size) {
                i10 = iFindEntryByValue;
            }
        }
        deleteFromTableVToK(i10, Hashing.smearedHash(this.values[i10]));
        this.values[i10] = v10;
        insertIntoTableVToK(i10, iSmearedHash);
    }

    private void setSucceeds(int i10, int i11) {
        if (i10 == -2) {
            this.firstInInsertionOrder = i11;
        } else {
            this.nextInInsertionOrder[i10] = i11;
        }
        if (i11 == -2) {
            this.lastInInsertionOrder = i10;
        } else {
            this.prevInInsertionOrder[i11] = i10;
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMap(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public int findEntry(@CheckForNull Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[bucket(i10)];
        while (i11 != -1) {
            if (Objects.equal(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    public int findEntryByKey(@CheckForNull Object obj) {
        return findEntryByKey(obj, Hashing.smearedHash(obj));
    }

    public int findEntryByValue(@CheckForNull Object obj) {
        return findEntryByValue(obj, Hashing.smearedHash(obj));
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V forcePut(@ParametricNullness K k10, @ParametricNullness V v10) {
        return put(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    @CheckForNull
    public K getInverse(@CheckForNull Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    public void init(int i10) {
        CollectPreconditions.checkNonnegative(i10, "expectedSize");
        int iClosedTableSize = Hashing.closedTableSize(i10, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i10];
        this.values = (V[]) new Object[i10];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i10);
        this.nextInBucketVToK = createFilledWithAbsent(i10);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i10);
        this.nextInInsertionOrder = createFilledWithAbsent(i10);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return put(k10, v10, false);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public K putInverse(@ParametricNullness V v10, @ParametricNullness K k10, boolean z10) {
        int iSmearedHash = Hashing.smearedHash(v10);
        int iFindEntryByValue = findEntryByValue(v10, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k11 = this.keys[iFindEntryByValue];
            if (Objects.equal(k11, k10)) {
                return k10;
            }
            replaceKeyInEntry(iFindEntryByValue, k10, z10);
            return k11;
        }
        int i10 = this.lastInInsertionOrder;
        int iSmearedHash2 = Hashing.smearedHash(k10);
        int iFindEntryByKey = findEntryByKey(k10, iSmearedHash2);
        if (!z10) {
            Preconditions.checkArgument(iFindEntryByKey == -1, "Key already present: %s", k10);
        } else if (iFindEntryByKey != -1) {
            i10 = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i11 = this.size;
        kArr[i11] = k10;
        this.values[i11] = v10;
        insertIntoTableKToV(i11, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        int i12 = i10 == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i10];
        setSucceeds(i10, this.size);
        setSucceeds(this.size, i12);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByKey = findEntryByKey(obj, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v10 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v10;
    }

    public void removeEntry(int i10) {
        removeEntryKeyHashKnown(i10, Hashing.smearedHash(this.keys[i10]));
    }

    public void removeEntryKeyHashKnown(int i10, int i11) {
        removeEntry(i10, i11, Hashing.smearedHash(this.values[i10]));
    }

    public void removeEntryValueHashKnown(int i10, int i11) {
        removeEntry(i10, Hashing.smearedHash(this.keys[i10]), i11);
    }

    @CheckForNull
    public K removeInverse(@CheckForNull Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByValue = findEntryByValue(obj, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k10 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i10) {
        return new HashBiMap<>(i10);
    }

    private void removeEntry(int i10, int i11, int i12) {
        Preconditions.checkArgument(i10 != -1);
        deleteFromTableKToV(i10, i11);
        deleteFromTableVToK(i10, i12);
        setSucceeds(this.prevInInsertionOrder[i10], this.nextInInsertionOrder[i10]);
        moveEntryToIndex(this.size - 1, i10);
        K[] kArr = this.keys;
        int i13 = this.size;
        kArr[i13 - 1] = null;
        this.values[i13 - 1] = null;
        this.size = i13 - 1;
        this.modCount++;
    }

    public int findEntryByKey(@CheckForNull Object obj, int i10) {
        return findEntry(obj, i10, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(@CheckForNull Object obj, int i10) {
        return findEntry(obj, i10, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @CheckForNull
    public V put(@ParametricNullness K k10, @ParametricNullness V v10, boolean z10) {
        int iSmearedHash = Hashing.smearedHash(k10);
        int iFindEntryByKey = findEntryByKey(k10, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v11 = this.values[iFindEntryByKey];
            if (Objects.equal(v11, v10)) {
                return v10;
            }
            replaceValueInEntry(iFindEntryByKey, v10, z10);
            return v11;
        }
        int iSmearedHash2 = Hashing.smearedHash(v10);
        int iFindEntryByValue = findEntryByValue(v10, iSmearedHash2);
        if (!z10) {
            Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", v10);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i10 = this.size;
        kArr[i10] = k10;
        this.values[i10] = v10;
        insertIntoTableKToV(i10, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }
}
