package y3;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: y3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5814c extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f241054c = "ContentLengthStream";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f241055d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f241056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f241057b;

    public C5814c(@NonNull InputStream inputStream, long j10) {
        super(inputStream);
        this.f241056a = j10;
    }

    @NonNull
    public static InputStream b(@NonNull InputStream inputStream, long j10) {
        return new C5814c(inputStream, j10);
    }

    @NonNull
    public static InputStream c(@NonNull InputStream inputStream, @Nullable String str) {
        return new C5814c(inputStream, d(str));
    }

    public static int d(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            if (!Log.isLoggable(f241054c, 3)) {
                return -1;
            }
            Log.d(f241054c, "failed to parse content length header: " + str, e10);
            return -1;
        }
    }

    public final int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f241057b += i10;
            return i10;
        }
        if (this.f241056a - ((long) this.f241057b) <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f241056a + ", but read: " + this.f241057b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f241056a - ((long) this.f241057b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        i12 = super.read(bArr, i10, i11);
        a(i12);
        return i12;
    }
}
