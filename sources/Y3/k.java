package y3;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class k extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f241076b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f241077c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f241078a;

    public k(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f241078a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i10 = this.f241078a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final long f(long j10) {
        int i10 = this.f241078a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    public final void g(long j10) {
        int i10 = this.f241078a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f241078a = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f241078a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (f(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        g(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f241078a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jF = f(j10);
        if (jF == -1) {
            return 0L;
        }
        long jSkip = super.skip(jF);
        g(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int iF = (int) f(i11);
        if (iF == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iF);
        g(i12);
        return i12;
    }
}
