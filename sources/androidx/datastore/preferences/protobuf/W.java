package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class W extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator<ByteBuffer> f112738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f112739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112740c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f112742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f112743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f112744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f112745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f112746i;

    public W(Iterable<ByteBuffer> iterable) {
        this.f112738a = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f112740c++;
        }
        this.f112741d = -1;
        if (d()) {
            return;
        }
        this.f112739b = V.f112723e;
        this.f112741d = 0;
        this.f112742e = 0;
        this.f112746i = 0L;
    }

    public final boolean d() {
        this.f112741d++;
        if (!this.f112738a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f112738a.next();
        this.f112739b = next;
        this.f112742e = next.position();
        if (this.f112739b.hasArray()) {
            this.f112743f = true;
            this.f112744g = this.f112739b.array();
            this.f112745h = this.f112739b.arrayOffset();
        } else {
            this.f112743f = false;
            this.f112746i = a1.i(this.f112739b);
            this.f112744g = null;
        }
        return true;
    }

    public final void e(int i10) {
        int i11 = this.f112742e + i10;
        this.f112742e = i11;
        if (i11 == this.f112739b.limit()) {
            d();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f112741d == this.f112740c) {
            return -1;
        }
        if (this.f112743f) {
            int i10 = this.f112744g[this.f112742e + this.f112745h] & 255;
            e(1);
            return i10;
        }
        int iY = a1.y(((long) this.f112742e) + this.f112746i) & 255;
        e(1);
        return iY;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f112741d == this.f112740c) {
            return -1;
        }
        int iLimit = this.f112739b.limit();
        int i12 = this.f112742e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f112743f) {
            System.arraycopy(this.f112744g, i12 + this.f112745h, bArr, i10, i11);
            e(i11);
            return i11;
        }
        int iPosition = this.f112739b.position();
        this.f112739b.position(this.f112742e);
        this.f112739b.get(bArr, i10, i11);
        this.f112739b.position(iPosition);
        e(i11);
        return i11;
    }
}
