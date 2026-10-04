package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes6.dex */
public class MutableLong extends Number implements Comparable<MutableLong>, Mutable<Number> {
    private static final long serialVersionUID = 62986528375L;
    private long value;

    public MutableLong() {
    }

    public void add(long j10) {
        this.value += j10;
    }

    public void decrement() {
        this.value--;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableLong) && this.value == ((MutableLong) obj).longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int hashCode() {
        long j10 = this.value;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public void increment() {
        this.value++;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public void subtract(long j10) {
        this.value -= j10;
    }

    public Long toLong() {
        return Long.valueOf(longValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableLong(long j10) {
        this.value = j10;
    }

    public void add(Number number) {
        this.value = number.longValue() + this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableLong mutableLong) {
        long j10 = mutableLong.value;
        long j11 = this.value;
        if (j11 < j10) {
            return -1;
        }
        return j11 == j10 ? 0 : 1;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue */
    public Number getValue2() {
        return new Long(this.value);
    }

    public void setValue(long j10) {
        this.value = j10;
    }

    public void subtract(Number number) {
        this.value -= number.longValue();
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.longValue();
    }

    public MutableLong(Number number) {
        this.value = number.longValue();
    }

    public MutableLong(String str) throws NumberFormatException {
        this.value = Long.parseLong(str);
    }
}
