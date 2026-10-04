package com.tencent.cos.xml.crypto;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import yb.c;

/* JADX INFO: loaded from: classes7.dex */
public class SdkFilterInputStream extends FilterInputStream implements Releasable {
    private volatile boolean aborted;

    public SdkFilterInputStream(InputStream inputStream) {
        super(inputStream);
        this.aborted = false;
    }

    public void abort() {
        if (this.aborted) {
            return;
        }
        this.aborted = true;
        if (((FilterInputStream) this).in instanceof SdkFilterInputStream) {
            ((SdkFilterInputStream) ((FilterInputStream) this).in).abort();
        }
    }

    public final void abortIfNeeded() {
        if (Thread.interrupted()) {
            abort();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        abortIfNeeded();
    }

    public boolean isAborted() {
        return this.aborted;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        abortIfNeeded();
        ((FilterInputStream) this).in.mark(i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        return ((FilterInputStream) this).in.read();
    }

    public void release() {
        c.a(this);
        if (((FilterInputStream) this).in instanceof Releasable) {
            ((Releasable) ((FilterInputStream) this).in).release();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        abortIfNeeded();
        return ((FilterInputStream) this).in.skip(j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        abortIfNeeded();
        return ((FilterInputStream) this).in.read(bArr, i10, i11);
    }
}
