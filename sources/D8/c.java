package D8;

import androidx.collection.C1545m0;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<byte[]> f22983a = new AtomicReference<>();

    public static void a(int i10, int i11, int i12) {
        if ((i11 | i12) < 0 || i11 > i10 || i10 - i11 < i12) {
            StringBuilder sbA = C1545m0.a("length=", i10, "; regionStart=", i11, "; regionLength=");
            sbA.append(i12);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
    }

    public static int b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return i10;
            }
            i10 += i11;
            outputStream.write(bArr, 0, i11);
        }
    }

    public static String c(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder(80);
        while (true) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                throw new EOFException();
            }
            if (i10 == 10) {
                int length = sb2.length();
                if (length > 0) {
                    int i11 = length - 1;
                    if (sb2.charAt(i11) == '\r') {
                        sb2.setLength(i11);
                    }
                }
                return sb2.toString();
            }
            sb2.append((char) i10);
        }
    }

    public static String d(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 == -1) {
                    String string = stringWriter.toString();
                    reader.close();
                    return string;
                }
                stringWriter.write(cArr, 0, i10);
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    public static void e(InputStream inputStream, byte[] bArr) throws IOException {
        f(inputStream, bArr, 0, bArr.length);
    }

    public static void f(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return;
        }
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        }
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        }
        a(bArr.length, i10, i11);
        while (i11 > 0) {
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 < 0) {
                throw new EOFException();
            }
            i10 += i12;
            i11 -= i12;
        }
    }

    public static byte[] g(InputStream inputStream) throws IOException {
        try {
            return h(inputStream);
        } finally {
            inputStream.close();
        }
    }

    public static byte[] h(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static int i(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1];
        if (inputStream.read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    public static void j(InputStream inputStream) throws IOException {
        do {
            inputStream.skip(Long.MAX_VALUE);
        } while (inputStream.read() != -1);
    }

    public static long k(InputStream inputStream, long j10) throws IOException {
        int iMin;
        int i10;
        byte[] andSet = f22983a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        long j11 = 0;
        while (j11 < j10 && (i10 = inputStream.read(andSet, 0, (iMin = (int) Math.min(j10 - j11, andSet.length)))) != -1) {
            j11 += (long) i10;
            if (i10 < iMin) {
                break;
            }
        }
        f22983a.set(andSet);
        return j11;
    }

    public static void l(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(new byte[]{(byte) (i10 & 255)});
    }
}
