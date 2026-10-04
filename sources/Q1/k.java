package q1;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.D;
import e.InterfaceC4330d;
import e.T;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.H0;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
@InterfaceC4330d
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f226713a = 1164798569;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f226714b = 1701669481;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f226715c = 1835365473;

    public static class a implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f226716c;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f226716c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // q1.k.d
        public int a() throws IOException {
            return this.f226716c.getInt();
        }

        @Override // q1.k.d
        public long b() throws IOException {
            return ((long) this.f226716c.getInt()) & ZipKt.f225990j;
        }

        @Override // q1.k.d
        public long getPosition() {
            return this.f226716c.position();
        }

        @Override // q1.k.d
        public int readUnsignedShort() throws IOException {
            return this.f226716c.getShort() & H0.f217455d;
        }

        @Override // q1.k.d
        public void skip(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f226716c;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final byte[] f226717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f226718d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public final InputStream f226719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f226720f = 0;

        public b(@NonNull InputStream inputStream) {
            this.f226719e = inputStream;
            byte[] bArr = new byte[4];
            this.f226717c = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f226718d = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // q1.k.d
        public int a() throws IOException {
            this.f226718d.position(0);
            c(4);
            return this.f226718d.getInt();
        }

        @Override // q1.k.d
        public long b() throws IOException {
            this.f226718d.position(0);
            c(4);
            return ((long) this.f226718d.getInt()) & ZipKt.f225990j;
        }

        public final void c(@D(from = 0, to = 4) int i10) throws IOException {
            if (this.f226719e.read(this.f226717c, 0, i10) != i10) {
                throw new IOException("read failed");
            }
            this.f226720f += (long) i10;
        }

        @Override // q1.k.d
        public long getPosition() {
            return this.f226720f;
        }

        @Override // q1.k.d
        public int readUnsignedShort() throws IOException {
            this.f226718d.position(0);
            c(2);
            return this.f226718d.getShort() & H0.f217455d;
        }

        @Override // q1.k.d
        public void skip(int i10) throws IOException {
            while (i10 > 0) {
                int iSkip = (int) this.f226719e.skip(i10);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i10 -= iSkip;
                this.f226720f += (long) iSkip;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f226721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f226722b;

        public c(long j10, long j11) {
            this.f226721a = j10;
            this.f226722b = j11;
        }

        public long a() {
            return this.f226722b;
        }

        public long b() {
            return this.f226721a;
        }
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f226723a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f226724b = 4;

        int a() throws IOException;

        long b() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;

        void skip(int i10) throws IOException;
    }

    public static c a(d dVar) throws IOException {
        long jB;
        dVar.skip(4);
        int unsignedShort = dVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        dVar.skip(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jB = -1;
                break;
            }
            int iA = dVar.a();
            dVar.skip(4);
            jB = dVar.b();
            dVar.skip(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jB != -1) {
            dVar.skip((int) (jB - dVar.getPosition()));
            dVar.skip(12);
            long jB2 = dVar.b();
            for (int i11 = 0; i11 < jB2; i11++) {
                int iA2 = dVar.a();
                long jB3 = dVar.b();
                long jB4 = dVar.b();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new c(jB3 + jB, jB4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static androidx.emoji2.text.flatbuffer.o b(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.o oVarC = c(inputStreamOpen);
            inputStreamOpen.close();
            return oVarC;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static androidx.emoji2.text.flatbuffer.o c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c cVarA = a(bVar);
        bVar.skip((int) (cVarA.f226721a - bVar.f226720f));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) cVarA.f226722b);
        int i10 = inputStream.read(byteBufferAllocate.array());
        if (i10 == cVarA.f226722b) {
            return androidx.emoji2.text.flatbuffer.o.G(byteBufferAllocate);
        }
        throw new IOException("Needed " + cVarA.f226722b + " bytes, got " + i10);
    }

    public static androidx.emoji2.text.flatbuffer.o d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).f226721a);
        return androidx.emoji2.text.flatbuffer.o.G(byteBufferDuplicate);
    }

    public static long e(int i10) {
        return ((long) i10) & ZipKt.f225990j;
    }

    public static int f(short s10) {
        return s10 & H0.f217455d;
    }
}
