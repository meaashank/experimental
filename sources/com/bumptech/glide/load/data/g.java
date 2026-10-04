package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f139406c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f139407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f139408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f139409f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f139410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f139411b;

    static {
        byte[] bArr = {-1, t1.b.f238684C7, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};
        f139407d = bArr;
        int length = bArr.length;
        f139408e = length;
        f139409f = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Cannot add invalid orientation: ", i10));
        }
        this.f139410a = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11 = this.f139411b;
        int i12 = (i11 < 2 || i11 > (i10 = f139409f)) ? super.read() : i11 == i10 ? this.f139410a : f139407d[i11 - 2] & 255;
        if (i12 != -1) {
            this.f139411b++;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f139411b = (int) (((long) this.f139411b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f139411b;
        int i14 = f139409f;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f139410a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f139407d, this.f139411b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f139411b += i12;
        }
        return i12;
    }
}
