package okio;

import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5364n implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5362l f226069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Cipher f226070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f226071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C5360j f226072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f226073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f226074f;

    public C5364n(@NotNull InterfaceC5362l source, @NotNull Cipher cipher) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(cipher, "cipher");
        this.f226069a = source;
        this.f226070b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f226071c = blockSize;
        this.f226072d = new C5360j();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // okio.e0
    public long L3(@NotNull C5360j sink, long j10) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        kotlin.jvm.internal.G.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j10).toString());
        }
        if (this.f226074f) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        l();
        return this.f226072d.L3(sink, j10);
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f226074f = true;
        this.f226069a.close();
    }

    public final void d() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int outputSize = this.f226070b.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        a0 a0VarQ3 = this.f226072d.q3(outputSize);
        int iDoFinal = this.f226070b.doFinal(a0VarQ3.f225914a, a0VarQ3.f225915b);
        int i10 = a0VarQ3.f225916c + iDoFinal;
        a0VarQ3.f225916c = i10;
        C5360j c5360j = this.f226072d;
        c5360j.f226051b += (long) iDoFinal;
        if (a0VarQ3.f225915b == i10) {
            c5360j.f226050a = a0VarQ3.b();
            b0.d(a0VarQ3);
        }
    }

    @NotNull
    public final Cipher k() {
        return this.f226070b;
    }

    public final void l() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        while (this.f226072d.f226051b == 0 && !this.f226073e) {
            if (this.f226069a.r3()) {
                this.f226073e = true;
                d();
                return;
            }
            m();
        }
    }

    public final void m() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        a0 a0Var = this.f226069a.getBuffer().f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225916c - a0Var.f225915b;
        int outputSize = this.f226070b.getOutputSize(i10);
        int i11 = i10;
        while (outputSize > 8192) {
            int i12 = this.f226071c;
            if (i11 <= i12) {
                this.f226073e = true;
                C5360j c5360j = this.f226072d;
                byte[] bArrDoFinal = this.f226070b.doFinal(this.f226069a.w1());
                kotlin.jvm.internal.G.o(bArrDoFinal, "cipher.doFinal(source.readByteArray())");
                c5360j.U3(bArrDoFinal);
                return;
            }
            i11 -= i12;
            outputSize = this.f226070b.getOutputSize(i11);
        }
        a0 a0VarQ3 = this.f226072d.q3(outputSize);
        int iUpdate = this.f226070b.update(a0Var.f225914a, a0Var.f225915b, i11, a0VarQ3.f225914a, a0VarQ3.f225915b);
        this.f226069a.skip(i11);
        int i13 = a0VarQ3.f225916c + iUpdate;
        a0VarQ3.f225916c = i13;
        C5360j c5360j2 = this.f226072d;
        c5360j2.f226051b += (long) iUpdate;
        if (a0VarQ3.f225915b == i13) {
            c5360j2.f226050a = a0VarQ3.b();
            b0.d(a0VarQ3);
        }
    }

    @Override // okio.e0
    @NotNull
    public g0 timeout() {
        return this.f226069a.timeout();
    }
}
