package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f159835a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f159836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f159837c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f159836b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f159835a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f159836b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f159837c) {
            return;
        }
        try {
            c cVar = this.f159835a;
            long j10 = cVar.f159810b;
            if (j10 > 0) {
                this.f159836b.a(cVar, j10);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f159836b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f159837c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f159835a.m();
        if (jM > 0) {
            this.f159836b.a(this.f159835a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f159835a;
        long j10 = cVar.f159810b;
        if (j10 > 0) {
            this.f159836b.a(cVar, j10);
        }
        this.f159836b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f159837c;
    }

    public String toString() {
        return "buffer(" + this.f159836b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        this.f159835a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        this.f159835a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        this.f159835a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        this.f159835a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f159837c) {
            throw new IllegalStateException("closed");
        }
        this.f159835a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f159837c) {
            this.f159835a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f159837c) {
            this.f159835a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f159837c) {
            int iWrite = this.f159835a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f159837c) {
            this.f159835a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
