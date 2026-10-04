package Xa;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class c extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f78752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f78753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f78754c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78755d;

    public c(InputStream inputStream, byte[] bArr, int i10) {
        this.f78752a = inputStream;
        this.f78753b = bArr;
        this.f78755d = i10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f78752a.close();
    }

    public int d() {
        return this.f78755d;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f78753b;
        if (bArr == null) {
            return this.f78752a.read();
        }
        long j10 = this.f78754c;
        if (j10 < bArr.length) {
            this.f78754c = j10 + 1;
            return bArr[((int) r1) - 1];
        }
        int i10 = this.f78752a.read();
        if (i10 > -1) {
            this.f78754c++;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        byte[] bArr = this.f78753b;
        if (bArr == null) {
            return this.f78752a.skip(j10);
        }
        long j11 = this.f78754c;
        long length = (j10 + j11) - ((long) bArr.length);
        if (length <= 0) {
            this.f78754c = j11 + j10;
            return j10;
        }
        if (j11 >= bArr.length) {
            long jSkip = this.f78752a.skip(j10);
            this.f78754c += jSkip;
            return jSkip;
        }
        long jSkip2 = this.f78752a.skip(length);
        long j12 = this.f78754c;
        long length2 = jSkip2 + ((long) this.f78753b.length);
        this.f78754c = length2;
        return length2 - j12;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        if (this.f78753b == null) {
            return this.f78752a.read(bArr, i10, i11);
        }
        int i12 = 0;
        if (this.f78754c < r0.length) {
            int i13 = 0;
            while (i12 < i11) {
                int i14 = (int) (this.f78754c + ((long) i12));
                byte[] bArr2 = this.f78753b;
                if (i14 >= bArr2.length) {
                    break;
                }
                i13++;
                bArr[i10 + i12] = bArr2[i14];
                i12++;
            }
            i12 = i13;
        }
        if (i12 < i11) {
            int i15 = this.f78752a.read(bArr, i10 + i12, i11 - i12);
            if (i15 > 0) {
                i12 += i15;
            } else if (i12 == 0) {
                return -1;
            }
        }
        this.f78754c += (long) i12;
        return i12;
    }
}
