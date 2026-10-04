package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ProxyInputStream extends FilterInputStream {
    public ProxyInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public void afterRead(int i10) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        try {
            return super.available();
        } catch (IOException e10) {
            handleIOException(e10);
            return 0;
        }
    }

    public void beforeRead(int i10) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = 1;
        try {
            beforeRead(1);
            int i11 = ((FilterInputStream) this).in.read();
            if (i11 == -1) {
                i10 = -1;
            }
            afterRead(i10);
            return i11;
        } catch (IOException e10) {
            handleIOException(e10);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j10);
        } catch (IOException e10) {
            handleIOException(e10);
            return 0L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length;
        if (bArr != null) {
            try {
                length = bArr.length;
            } catch (IOException e10) {
                handleIOException(e10);
                return -1;
            }
        } else {
            length = 0;
        }
        beforeRead(length);
        int i10 = ((FilterInputStream) this).in.read(bArr);
        afterRead(i10);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            beforeRead(i11);
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            afterRead(i12);
            return i12;
        } catch (IOException e10) {
            handleIOException(e10);
            return -1;
        }
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }
}
