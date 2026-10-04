package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f116174a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f116175b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116176c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116177d = 4;

    public static int a(int i10) {
        return ((i10 + 7) & (-8)) / 8;
    }

    public static byte[] b(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @NonNull
    public static RuntimeException c(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    public static byte[] d(@NonNull InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(android.support.v4.media.c.a("Not enough bytes to read: ", i10));
            }
            i11 += i12;
        }
        return bArr;
    }

    @NonNull
    public static byte[] e(@NonNull InputStream inputStream, int i10, int i11) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = inputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    @NonNull
    public static String f(InputStream inputStream, int i10) throws IOException {
        return new String(d(inputStream, i10), StandardCharsets.UTF_8);
    }

    public static long g(@NonNull InputStream inputStream, int i10) throws IOException {
        byte[] bArrD = d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrD[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static int h(@NonNull InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    public static long i(@NonNull InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    public static int j(@NonNull InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    public static int k(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static void m(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        o(outputStream, bArr.length, 4);
        byte[] bArrB = b(bArr);
        o(outputStream, bArrB.length, 4);
        outputStream.write(bArrB);
    }

    public static void n(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(@NonNull OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(@NonNull OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 2);
    }

    public static void q(@NonNull OutputStream outputStream, long j10) throws IOException {
        o(outputStream, j10, 4);
    }

    public static void r(@NonNull OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 1);
    }
}
