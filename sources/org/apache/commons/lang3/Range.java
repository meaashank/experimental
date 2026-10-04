package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class Range<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Comparator<T> comparator;
    private transient int hashCode;
    private final T maximum;
    private final T minimum;
    private transient String toString;

    public enum ComparableComparator implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    private Range(T t10, T t11, Comparator<T> comparator) {
        if (t10 == null || t11 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + t10 + ", element2=" + t11);
        }
        comparator = comparator == null ? ComparableComparator.INSTANCE : comparator;
        if (comparator.compare(t10, t11) < 1) {
            this.minimum = t10;
            this.maximum = t11;
        } else {
            this.minimum = t11;
            this.maximum = t10;
        }
        this.comparator = comparator;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static Range between(Comparable comparable, Comparable comparable2) {
        return between(comparable, comparable2, null);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static Range is(Comparable comparable) {
        return between(comparable, comparable, null);
    }

    public boolean contains(T t10) {
        return t10 != null && this.comparator.compare(t10, this.minimum) > -1 && this.comparator.compare(t10, this.maximum) < 1;
    }

    public boolean containsRange(Range<T> range) {
        return range != null && contains(range.minimum) && contains(range.maximum);
    }

    public int elementCompareTo(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Element is null");
        }
        if (isAfter(t10)) {
            return -1;
        }
        return isBefore(t10) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == Range.class) {
            Range range = (Range) obj;
            if (this.minimum.equals(range.minimum) && this.maximum.equals(range.maximum)) {
                return true;
            }
        }
        return false;
    }

    public Comparator<T> getComparator() {
        return this.comparator;
    }

    public T getMaximum() {
        return this.maximum;
    }

    public T getMinimum() {
        return this.minimum;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.maximum.hashCode() + ((this.minimum.hashCode() + ((Range.class.hashCode() + 629) * 37)) * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isAfter(T t10) {
        return t10 != null && this.comparator.compare(t10, this.minimum) < 0;
    }

    public boolean isAfterRange(Range<T> range) {
        if (range == null) {
            return false;
        }
        return isAfter(range.maximum);
    }

    public boolean isBefore(T t10) {
        return t10 != null && this.comparator.compare(t10, this.maximum) > 0;
    }

    public boolean isBeforeRange(Range<T> range) {
        if (range == null) {
            return false;
        }
        return isBefore(range.minimum);
    }

    public boolean isEndedBy(T t10) {
        return t10 != null && this.comparator.compare(t10, this.maximum) == 0;
    }

    public boolean isNaturalOrdering() {
        return this.comparator == ComparableComparator.INSTANCE;
    }

    public boolean isOverlappedBy(Range<T> range) {
        if (range == null) {
            return false;
        }
        return range.contains(this.minimum) || range.contains(this.maximum) || contains(range.minimum);
    }

    public boolean isStartedBy(T t10) {
        return t10 != null && this.comparator.compare(t10, this.minimum) == 0;
    }

    public String toString() {
        String str = this.toString;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(this.minimum);
        sb2.append("..");
        sb2.append(this.maximum);
        sb2.append(']');
        String string = sb2.toString();
        this.toString = string;
        return string;
    }

    public static <T> Range<T> between(T t10, T t11, Comparator<T> comparator) {
        return new Range<>(t10, t11, comparator);
    }

    public static <T> Range<T> is(T t10, Comparator<T> comparator) {
        return between(t10, t10, comparator);
    }

    public String toString(String str) {
        return String.format(str, this.minimum, this.maximum, this.comparator);
    }
}
