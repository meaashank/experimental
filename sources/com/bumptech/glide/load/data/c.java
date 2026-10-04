package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import e.f0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final OutputStream f139399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f139400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.b f139401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f139402d;

    public c(@NonNull OutputStream outputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f139399a.close();
            release();
        } catch (Throwable th) {
            this.f139399a.close();
            throw th;
        }
    }

    public final void d() throws IOException {
        int i10 = this.f139402d;
        if (i10 > 0) {
            this.f139399a.write(this.f139400b, 0, i10);
            this.f139402d = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        d();
        this.f139399a.flush();
    }

    public final void k() throws IOException {
        if (this.f139402d == this.f139400b.length) {
            d();
        }
    }

    public final void release() {
        byte[] bArr = this.f139400b;
        if (bArr != null) {
            this.f139401c.put(bArr);
            this.f139400b = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f139400b;
        int i11 = this.f139402d;
        this.f139402d = i11 + 1;
        bArr[i11] = (byte) i10;
        k();
    }

    @f0
    public c(@NonNull OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        this.f139399a = outputStream;
        this.f139401c = bVar;
        this.f139400b = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f139402d;
            if (i15 == 0 && i13 >= this.f139400b.length) {
                this.f139399a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f139400b.length - i15);
            System.arraycopy(bArr, i14, this.f139400b, this.f139402d, iMin);
            this.f139402d += iMin;
            i12 += iMin;
            k();
        } while (i12 < i11);
    }
}
