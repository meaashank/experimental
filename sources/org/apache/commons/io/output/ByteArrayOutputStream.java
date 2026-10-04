package org.apache.commons.io.output;

import android.support.v4.media.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.input.ClosedInputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ByteArrayOutputStream extends OutputStream {
    static final int DEFAULT_SIZE = 1024;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final List<byte[]> buffers;
    private int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;
    private boolean reuseBuffers;

    public ByteArrayOutputStream() {
        this(1024);
    }

    private void needNewBuffer(int i10) {
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            int i11 = this.currentBufferIndex + 1;
            this.currentBufferIndex = i11;
            this.currentBuffer = this.buffers.get(i11);
            return;
        }
        byte[] bArr = this.currentBuffer;
        if (bArr == null) {
            this.filledBufferSum = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.filledBufferSum);
            this.filledBufferSum += this.currentBuffer.length;
        }
        this.currentBufferIndex++;
        byte[] bArr2 = new byte[i10];
        this.currentBuffer = bArr2;
        this.buffers.add(bArr2);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        return toBufferedInputStream(inputStream, 1024);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized void reset() {
        try {
            this.count = 0;
            this.filledBufferSum = 0;
            this.currentBufferIndex = 0;
            if (this.reuseBuffers) {
                this.currentBuffer = this.buffers.get(0);
            } else {
                this.currentBuffer = null;
                int length = this.buffers.get(0).length;
                this.buffers.clear();
                needNewBuffer(length);
                this.reuseBuffers = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.count;
    }

    public synchronized byte[] toByteArray() {
        int i10 = this.count;
        if (i10 == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this.buffers) {
            int iMin = Math.min(bArr2.length, i10);
            System.arraycopy(bArr2, 0, bArr, i11, iMin);
            i11 += iMin;
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
        return bArr;
    }

    public synchronized InputStream toInputStream() {
        int i10 = this.count;
        if (i10 == 0) {
            return new ClosedInputStream();
        }
        ArrayList arrayList = new ArrayList(this.buffers.size());
        for (byte[] bArr : this.buffers) {
            int iMin = Math.min(bArr.length, i10);
            arrayList.add(new ByteArrayInputStream(bArr, 0, iMin));
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
        this.reuseBuffers = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        synchronized (this) {
            try {
                int i13 = this.count;
                int i14 = i13 + i11;
                int i15 = i13 - this.filledBufferSum;
                while (i11 > 0) {
                    int iMin = Math.min(i11, this.currentBuffer.length - i15);
                    System.arraycopy(bArr, i12 - i11, this.currentBuffer, i15, iMin);
                    i11 -= iMin;
                    if (i11 > 0) {
                        needNewBuffer(i14);
                        i15 = 0;
                    }
                }
                this.count = i14;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void writeTo(OutputStream outputStream) throws IOException {
        int i10 = this.count;
        for (byte[] bArr : this.buffers) {
            int iMin = Math.min(bArr.length, i10);
            outputStream.write(bArr, 0, iMin);
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
    }

    public ByteArrayOutputStream(int i10) {
        this.buffers = new ArrayList();
        this.reuseBuffers = true;
        if (i10 < 0) {
            throw new IllegalArgumentException(c.a("Negative initial size: ", i10));
        }
        synchronized (this) {
            needNewBuffer(i10);
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        byteArrayOutputStream.write(inputStream);
        return byteArrayOutputStream.toInputStream();
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            int i11 = this.count;
            int i12 = i11 - this.filledBufferSum;
            if (i12 == this.currentBuffer.length) {
                needNewBuffer(i11 + 1);
                i12 = 0;
            }
            this.currentBuffer[i12] = (byte) i10;
            this.count++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int write(InputStream inputStream) throws IOException {
        int i10;
        try {
            int i11 = this.count - this.filledBufferSum;
            byte[] bArr = this.currentBuffer;
            int i12 = inputStream.read(bArr, i11, bArr.length - i11);
            i10 = 0;
            while (i12 != -1) {
                i10 += i12;
                i11 += i12;
                this.count += i12;
                byte[] bArr2 = this.currentBuffer;
                if (i11 == bArr2.length) {
                    needNewBuffer(bArr2.length);
                    i11 = 0;
                }
                byte[] bArr3 = this.currentBuffer;
                i12 = inputStream.read(bArr3, i11, bArr3.length - i11);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i10;
    }
}
