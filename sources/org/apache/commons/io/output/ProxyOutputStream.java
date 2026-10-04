package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ProxyOutputStream extends FilterOutputStream {
    public ProxyOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public void afterWrite(int i10) throws IOException {
    }

    public void beforeWrite(int i10) throws IOException {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            beforeWrite(1);
            ((FilterOutputStream) this).out.write(i10);
            afterWrite(1);
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        int length;
        if (bArr != null) {
            try {
                length = bArr.length;
            } catch (IOException e10) {
                handleIOException(e10);
                return;
            }
        } else {
            length = 0;
        }
        beforeWrite(length);
        ((FilterOutputStream) this).out.write(bArr);
        afterWrite(length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            beforeWrite(i11);
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
            afterWrite(i11);
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }
}
