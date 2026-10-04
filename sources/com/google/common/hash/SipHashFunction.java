package com.google.common.hash;

import U6.j;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f150999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f151000d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final long f151001k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final long f151002k1;

    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f151003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f151004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f151005d;
        private long finalM;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private long f151006v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private long f151007v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        private long f151008v2;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        private long f151009v3;

        public SipHasher(int i10, int i11, long j10, long j11) {
            super(8);
            this.f151003b = 0L;
            this.finalM = 0L;
            this.f151004c = i10;
            this.f151005d = i11;
            this.f151006v0 = 8317987319222330741L ^ j10;
            this.f151007v1 = 7237128888997146477L ^ j11;
            this.f151008v2 = 7816392313619706465L ^ j10;
            this.f151009v3 = 8387220255154660723L ^ j11;
        }

        private void processM(long j10) {
            this.f151009v3 ^= j10;
            sipRound(this.f151004c);
            this.f151006v0 = j10 ^ this.f151006v0;
        }

        private void sipRound(int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                long j10 = this.f151006v0;
                long j11 = this.f151007v1;
                this.f151006v0 = j10 + j11;
                this.f151008v2 += this.f151009v3;
                this.f151007v1 = Long.rotateLeft(j11, 13);
                long jRotateLeft = Long.rotateLeft(this.f151009v3, 16);
                long j12 = this.f151007v1;
                long j13 = this.f151006v0;
                this.f151007v1 = j12 ^ j13;
                this.f151009v3 = jRotateLeft ^ this.f151008v2;
                long jRotateLeft2 = Long.rotateLeft(j13, 32);
                long j14 = this.f151008v2;
                long j15 = this.f151007v1;
                this.f151008v2 = j14 + j15;
                this.f151006v0 = jRotateLeft2 + this.f151009v3;
                this.f151007v1 = Long.rotateLeft(j15, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f151009v3, 21);
                long j16 = this.f151007v1;
                long j17 = this.f151008v2;
                this.f151007v1 = j16 ^ j17;
                this.f151009v3 = jRotateLeft3 ^ this.f151006v0;
                this.f151008v2 = Long.rotateLeft(j17, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j10 = this.finalM ^ (this.f151003b << 56);
            this.finalM = j10;
            processM(j10);
            this.f151008v2 ^= 255;
            sipRound(this.f151005d);
            return HashCode.fromLong(((this.f151006v0 ^ this.f151007v1) ^ this.f151008v2) ^ this.f151009v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f151003b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f151003b += (long) byteBuffer.remaining();
            int i10 = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i10;
                i10 += 8;
            }
        }
    }

    public SipHashFunction(int i10, int i11, long j10, long j11) {
        Preconditions.checkArgument(i10 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i10);
        Preconditions.checkArgument(i11 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i11);
        this.f150999c = i10;
        this.f151000d = i11;
        this.f151001k0 = j10;
        this.f151002k1 = j11;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f150999c == sipHashFunction.f150999c && this.f151000d == sipHashFunction.f151000d && this.f151001k0 == sipHashFunction.f151001k0 && this.f151002k1 == sipHashFunction.f151002k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f150999c) ^ this.f151000d)) ^ this.f151001k0) ^ this.f151002k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f150999c, this.f151000d, this.f151001k0, this.f151002k1);
    }

    public String toString() {
        int i10 = this.f150999c;
        int i11 = this.f151000d;
        long j10 = this.f151001k0;
        long j11 = this.f151002k1;
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("Hashing.sipHash");
        sb2.append(i10);
        sb2.append(i11);
        sb2.append("(");
        sb2.append(j10);
        sb2.append(j.f68738d);
        sb2.append(j11);
        sb2.append(")");
        return sb2.toString();
    }
}
