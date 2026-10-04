package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import e.f0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f139912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f139913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f139915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f139916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f139917f;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(inputStream, bVar, 65536);
    }

    public static IOException k() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f139915d;
        if (i10 != -1) {
            int i11 = this.f139916e - i10;
            int i12 = this.f139914c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f139913b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f139917f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f139912a = bArr2;
                    this.f139917f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f139916e - this.f139915d;
                this.f139916e = i13;
                this.f139915d = 0;
                this.f139913b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f139916e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f139913b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f139915d = -1;
            this.f139916e = 0;
            this.f139913b = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f139912a == null || inputStream == null) {
            k();
            throw null;
        }
        return (this.f139913b - this.f139916e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f139912a != null) {
            this.f139917f.put(this.f139912a);
            this.f139912a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        this.f139914c = this.f139912a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f139914c = Math.max(this.f139914c, i10);
        this.f139915d = this.f139916e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f139912a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            k();
            throw null;
        }
        if (this.f139916e >= this.f139913b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f139912a && (bArr = this.f139912a) == null) {
            k();
            throw null;
        }
        int i10 = this.f139913b;
        int i11 = this.f139916e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f139916e = i11 + 1;
        return bArr[i11] & 255;
    }

    public synchronized void release() {
        if (this.f139912a != null) {
            this.f139917f.put(this.f139912a);
            this.f139912a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f139912a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f139915d;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f139916e + " markLimit: " + this.f139914c);
        }
        this.f139916e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f139912a;
        if (bArr == null) {
            k();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            k();
            throw null;
        }
        int i10 = this.f139913b;
        int i11 = this.f139916e;
        if (i10 - i11 >= j10) {
            this.f139916e = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f139916e = i10;
        if (this.f139915d == -1 || j10 > this.f139914c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f139915d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f139913b;
        int i13 = this.f139916e;
        if (i12 - i13 >= j10 - j11) {
            this.f139916e = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f139916e = i12;
        return j12;
    }

    @f0
    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        super(inputStream);
        this.f139915d = -1;
        this.f139917f = bVar;
        this.f139912a = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f139912a;
        if (bArr2 == null) {
            k();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f139916e;
            int i15 = this.f139913b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f139916e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f139915d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f139912a && (bArr2 = this.f139912a) == null) {
                        k();
                        throw null;
                    }
                    int i17 = this.f139913b;
                    int i18 = this.f139916e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f139916e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            k();
            throw null;
        }
    }
}
