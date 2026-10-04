package org.apache.commons.io.input;

import androidx.collection.Q;
import androidx.viewpager.widget.a;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class CharSequenceReader extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence charSequence;
    private int idx;
    private int mark;

    public CharSequenceReader(String str) {
        this.charSequence = str == null ? "" : str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.idx = 0;
        this.mark = 0;
    }

    @Override // java.io.Reader
    public void mark(int i10) {
        this.mark = this.idx;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.idx >= this.charSequence.length()) {
            return -1;
        }
        CharSequence charSequence = this.charSequence;
        int i10 = this.idx;
        this.idx = i10 + 1;
        return charSequence.charAt(i10);
    }

    @Override // java.io.Reader
    public void reset() {
        this.idx = this.mark;
    }

    @Override // java.io.Reader
    public long skip(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Q.a("Number of characters to skip is less than zero: ", j10));
        }
        if (this.idx >= this.charSequence.length()) {
            return -1L;
        }
        int iMin = (int) Math.min(this.charSequence.length(), ((long) this.idx) + j10);
        int i10 = iMin - this.idx;
        this.idx = iMin;
        return i10;
    }

    public String toString() {
        return this.charSequence.toString();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        if (this.idx >= this.charSequence.length()) {
            return -1;
        }
        if (cArr != null) {
            if (i11 < 0 || i10 < 0 || i10 + i11 > cArr.length) {
                StringBuilder sb2 = new StringBuilder("Array Size=");
                a.a(sb2, cArr.length, ", offset=", i10, ", length=");
                sb2.append(i11);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = read();
                if (i14 == -1) {
                    break;
                }
                cArr[i10 + i13] = (char) i14;
                i12++;
            }
            return i12;
        }
        throw new NullPointerException("Character array is missing");
    }
}
