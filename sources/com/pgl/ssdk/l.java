package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f161875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f161876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f161877c;

    public l(FileChannel fileChannel, long j10, long j11) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j11)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        this.f161875a = fileChannel;
        this.f161876b = j10;
        this.f161877c = j11;
    }

    @Override // com.pgl.ssdk.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l a(long j10, long j11) {
        long jA = a();
        a(j10, j11, jA);
        return (j10 == 0 && j11 == jA) ? this : new l(this.f161875a, this.f161876b + j10, j11);
    }

    @Override // com.pgl.ssdk.o
    public long a() {
        long j10 = this.f161877c;
        if (j10 != -1) {
            return j10;
        }
        try {
            return this.f161875a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j10, int i10, ByteBuffer byteBuffer) throws IOException {
        int i11;
        a(j10, i10, a());
        if (i10 == 0) {
            return;
        }
        if (i10 <= byteBuffer.remaining()) {
            long j11 = this.f161876b + j10;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i10);
                while (i10 > 0) {
                    synchronized (this.f161875a) {
                        this.f161875a.position(j11);
                        i11 = this.f161875a.read(byteBuffer);
                    }
                    j11 += (long) i11;
                    i10 -= i11;
                }
                return;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.o
    public ByteBuffer a(long j10, int i10) throws IOException {
        if (i10 >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            a(j10, i10, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i10)));
    }

    private static void a(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        if (j10 > j12) {
            throw new IndexOutOfBoundsException(android.support.v4.media.session.f.a(androidx.compose.runtime.snapshots.z.a("offset (", j10, ") > source size ("), j12, ")"));
        }
        long j13 = j10 + j11;
        if (j13 < j10) {
            throw new IndexOutOfBoundsException(android.support.v4.media.session.f.a(androidx.compose.runtime.snapshots.z.a("offset (", j10, ") + size ("), j11, ") overflow"));
        }
        if (j13 <= j12) {
            return;
        }
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("offset (", j10, ") + size (");
        sbA.append(j11);
        sbA.append(") > source size (");
        sbA.append(j12);
        sbA.append(")");
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
