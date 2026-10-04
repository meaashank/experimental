package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2544q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f112936a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f112937b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f112938c = 0.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<SoftReference<byte[]>> f112939d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?> f112940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f112941f;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f112940e = cls;
        f112941f = c(cls);
    }

    public static void a() {
        f112939d.set(null);
    }

    public static byte[] b() {
        SoftReference<byte[]> softReference = f112939d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public static long c(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (!a1.S()) {
                return -1L;
            }
            return a1.f112800f.p(cls.getDeclaredField("channel"));
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static byte[] d(int i10) {
        int iMax = Math.max(i10, 1024);
        byte[] bArrB = b();
        if (bArrB != null && !e(iMax, bArrB.length)) {
            return bArrB;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            g(bArr);
        }
        return bArr;
    }

    public static boolean e(int i10, int i11) {
        return i11 < i10 && ((float) i11) < ((float) i10) * 0.5f;
    }

    public static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void g(byte[] bArr) {
        f112939d.set(new SoftReference<>(bArr));
    }

    public static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!i(byteBuffer, outputStream)) {
                byte[] bArrD = d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrD.length);
                    byteBuffer.get(bArrD, 0, iMin);
                    outputStream.write(bArrD, 0, iMin);
                }
            }
            byteBuffer.position(iPosition);
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            throw th;
        }
    }

    public static boolean i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j10 = f112941f;
        if (j10 < 0 || !f112940e.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) a1.O(outputStream, j10);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
