package Qa;

import com.prism.commons.utils.l0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f67667a = l0.b(c.class.getSimpleName());

    public static a a(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[32];
        int i11 = inputStream.read(bArr, 0, 32);
        if (i11 < 32) {
            if (i11 <= 0) {
                return c(inputStream, null, -1);
            }
            System.arraycopy(bArr, 0, bArr, 0, i11);
            return c(inputStream, new byte[i11], -1);
        }
        int i12 = 8;
        for (byte b10 : Oa.a.f65243l) {
            if (b10 != bArr[i12]) {
                return c(inputStream, bArr, i10);
            }
            i12++;
        }
        byte b11 = bArr[16];
        if (b11 <= 0 || b11 > 1) {
            return c(inputStream, bArr, i10);
        }
        if (j(bArr, 0, 8, b11) != bArr[17]) {
            return c(inputStream, bArr, i10);
        }
        byte b12 = bArr[20];
        byte b13 = bArr[21];
        return (b12 << 8) + b13 != 32 ? c(inputStream, bArr, i10) : j(bArr, 0, 8, b12, b13) != bArr[22] ? c(inputStream, bArr, i10) : j(bArr, 0, 23, 0) != bArr[23] ? c(inputStream, bArr, i10) : b(inputStream, bArr, b11);
    }

    public static a b(InputStream inputStream, byte[] bArr, int i10) {
        a aVar = new a();
        aVar.f67660a = i10;
        aVar.f67661b = bArr;
        if (i10 == 0 || i10 == 1) {
            aVar.f67662c = inputStream;
            aVar.f67663d = null;
            return aVar;
        }
        aVar.f67662c = inputStream;
        aVar.f67663d = bArr;
        return aVar;
    }

    public static a c(InputStream inputStream, byte[] bArr, int i10) {
        if (i10 != -1) {
            i10 = 0;
        }
        return b(inputStream, bArr, i10);
    }

    public static b d(InputStream inputStream, int i10) {
        return i10 != 0 ? i10 != 1 ? e(inputStream) : f(inputStream) : g(inputStream);
    }

    public static b e(InputStream inputStream) {
        b bVar = new b();
        bVar.f67664a = -1;
        bVar.f67665b = null;
        bVar.f67666c = inputStream;
        return bVar;
    }

    public static b f(InputStream inputStream) {
        byte[] bArr = new byte[32];
        i(bArr, 0, 8);
        System.arraycopy(Oa.a.f65243l, 0, bArr, 8, 8);
        bArr[16] = 1;
        bArr[17] = j(bArr, 0, 8, 1);
        bArr[19] = 0;
        bArr[18] = 0;
        bArr[20] = 0;
        bArr[21] = 32;
        bArr[22] = j(bArr, 0, 8, 0, 32);
        bArr[23] = j(bArr, 0, 23, 0);
        i(bArr, 24, 8);
        b bVar = new b();
        bVar.f67664a = 1;
        bVar.f67665b = bArr;
        bVar.f67666c = inputStream;
        return bVar;
    }

    public static b g(InputStream inputStream) {
        byte[] bArr = new byte[32];
        i(bArr, 0, 32);
        b bVar = new b();
        bVar.f67664a = 0;
        bVar.f67665b = bArr;
        bVar.f67666c = inputStream;
        return bVar;
    }

    public static long h(int i10) {
        return (i10 == 0 || i10 == 1) ? 32L : 0L;
    }

    public static void i(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        new Random(System.currentTimeMillis()).nextBytes(bArr2);
        System.arraycopy(bArr2, 0, bArr, i10, i11);
    }

    public static byte j(byte[] bArr, int i10, int i11, byte... bArr2) {
        byte b10 = 0;
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            b10 = (byte) (b10 ^ bArr[i12]);
        }
        for (byte b11 : bArr2) {
            b10 = (byte) (b11 ^ b10);
        }
        return b10;
    }
}
