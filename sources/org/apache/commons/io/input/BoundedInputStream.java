package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class BoundedInputStream extends InputStream {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f226119in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream, long j10) {
        this.pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j10;
        this.f226119in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j10 = this.max;
        if (j10 < 0 || this.pos < j10) {
            return this.f226119in.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.propagateClose) {
            this.f226119in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.f226119in.mark(i10);
        this.mark = this.pos;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f226119in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j10 = this.max;
        if (j10 >= 0 && this.pos >= j10) {
            return -1;
        }
        int i10 = this.f226119in.read();
        this.pos++;
        return i10;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f226119in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z10) {
        this.propagateClose = z10;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = this.max;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11 - this.pos);
        }
        long jSkip = this.f226119in.skip(j10);
        this.pos += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f226119in.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.max;
        if (j10 >= 0 && this.pos >= j10) {
            return -1;
        }
        int i12 = this.f226119in.read(bArr, i10, (int) (j10 >= 0 ? Math.min(i11, j10 - this.pos) : i11));
        if (i12 == -1) {
            return -1;
        }
        this.pos += (long) i12;
        return i12;
    }

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }
}
