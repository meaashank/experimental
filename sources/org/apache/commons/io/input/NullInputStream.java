package org.apache.commons.io.input;

import androidx.collection.LruCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class NullInputStream extends InputStream {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullInputStream(long j10) {
        this(j10, true, false);
    }

    private int doEndOfFile() throws EOFException {
        this.eof = true;
        if (this.throwEofException) {
            throw new EOFException();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        long j10 = this.size - this.position;
        if (j10 <= 0) {
            return 0;
        }
        if (j10 > LruCacheKt.f86729a) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.eof = false;
        this.position = 0L;
        this.mark = -1L;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        if (!this.markSupported) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.mark = this.position;
        this.readlimit = i10;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.markSupported;
    }

    public int processByte() {
        return 0;
    }

    public void processBytes(byte[] bArr, int i10, int i11) {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.eof) {
            throw new IOException("Read after end of file");
        }
        long j10 = this.position;
        if (j10 == this.size) {
            return doEndOfFile();
        }
        this.position = j10 + 1;
        return processByte();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!this.markSupported) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        long j10 = this.mark;
        if (j10 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.position > this.readlimit + j10) {
            throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readlimit + "]");
        }
        this.position = j10;
        this.eof = false;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        if (this.eof) {
            throw new IOException("Skip after end of file");
        }
        long j11 = this.position;
        long j12 = this.size;
        if (j11 == j12) {
            return doEndOfFile();
        }
        long j13 = j11 + j10;
        this.position = j13;
        if (j13 <= j12) {
            return j10;
        }
        long j14 = j10 - (j13 - j12);
        this.position = j12;
        return j14;
    }

    public NullInputStream(long j10, boolean z10, boolean z11) {
        this.mark = -1L;
        this.size = j10;
        this.markSupported = z10;
        this.throwEofException = z11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.eof) {
            long j10 = this.position;
            long j11 = this.size;
            if (j10 == j11) {
                return doEndOfFile();
            }
            long j12 = j10 + ((long) i11);
            this.position = j12;
            if (j12 > j11) {
                i11 -= (int) (j12 - j11);
                this.position = j11;
            }
            processBytes(bArr, i10, i11);
            return i11;
        }
        throw new IOException("Read after end of file");
    }
}
