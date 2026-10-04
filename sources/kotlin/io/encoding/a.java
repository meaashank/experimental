package kotlin.io.encoding;

import ad.InterfaceC1473d;
import androidx.collection.C1545m0;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1473d
public final class a extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OutputStream f217731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Base64 f217732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f217733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f217734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final byte[] f217735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final byte[] f217736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f217737g;

    public a(@NotNull OutputStream output, @NotNull Base64 base64) {
        G.p(output, "output");
        G.p(base64, "base64");
        this.f217731a = output;
        this.f217732b = base64;
        this.f217734d = base64.f217727b ? base64.f217728c : -1;
        this.f217735e = new byte[1024];
        this.f217736f = new byte[3];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f217733c) {
            return;
        }
        this.f217733c = true;
        if (this.f217737g != 0) {
            k();
        }
        this.f217731a.close();
    }

    public final void d() throws IOException {
        if (this.f217733c) {
            throw new IOException("The output stream is closed.");
        }
    }

    public final int e(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(3 - this.f217737g, i11 - i10);
        C4875q.v0(bArr, this.f217736f, this.f217737g, i10, i10 + iMin);
        int i12 = this.f217737g + iMin;
        this.f217737g = i12;
        if (i12 == 3) {
            k();
        }
        return iMin;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        d();
        this.f217731a.flush();
    }

    public final void k() {
        if (l(this.f217736f, 0, this.f217737g) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.f217737g = 0;
    }

    public final int l(byte[] bArr, int i10, int i11) throws IOException {
        int iV = this.f217732b.v(bArr, this.f217735e, 0, i10, i11);
        if (this.f217734d == 0) {
            OutputStream outputStream = this.f217731a;
            Base64.f217714f.getClass();
            outputStream.write(Base64.f217722n);
            int i12 = this.f217732b.f217728c;
            this.f217734d = i12;
            if (iV > i12) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f217731a.write(this.f217735e, 0, iV);
        this.f217734d -= iV;
        return iV;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        d();
        byte[] bArr = this.f217736f;
        int i11 = this.f217737g;
        int i12 = i11 + 1;
        this.f217737g = i12;
        bArr[i11] = (byte) i10;
        if (i12 == 3) {
            k();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] source, int i10, int i11) throws IOException {
        int i12;
        G.p(source, "source");
        d();
        if (i10 < 0 || i11 < 0 || (i12 = i10 + i11) > source.length) {
            StringBuilder sbA = C1545m0.a("offset: ", i10, ", length: ", i11, ", source size: ");
            sbA.append(source.length);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.f217737g;
        if (i13 < 3) {
            if (i13 != 0) {
                i10 += e(source, i10, i12);
                if (this.f217737g != 0) {
                    return;
                }
            }
            while (i10 + 3 <= i12) {
                int iMin = Math.min((this.f217732b.f217727b ? this.f217734d : this.f217735e.length) / 4, (i12 - i10) / 3);
                int i14 = (iMin * 3) + i10;
                if (l(source, i10, i14) != iMin * 4) {
                    throw new IllegalStateException("Check failed.");
                }
                i10 = i14;
            }
            C4875q.v0(source, this.f217736f, 0, i10, i12);
            this.f217737g = i12 - i10;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
