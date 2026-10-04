package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: C1, reason: collision with root package name */
        private static final long f150992C1 = -8663945395140668459L;

        /* JADX INFO: renamed from: C2, reason: collision with root package name */
        private static final long f150993C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private long f150994h1;

        /* JADX INFO: renamed from: h2, reason: collision with root package name */
        private long f150995h2;
        private int length;

        public Murmur3_128Hasher(int i10) {
            super(16);
            long j10 = i10;
            this.f150994h1 = j10;
            this.f150995h2 = j10;
            this.length = 0;
        }

        private void bmix64(long j10, long j11) {
            long jMixK1 = mixK1(j10) ^ this.f150994h1;
            this.f150994h1 = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j12 = this.f150995h2;
            this.f150994h1 = ((jRotateLeft + j12) * 5) + 1390208809;
            long jMixK2 = mixK2(j11) ^ j12;
            this.f150995h2 = jMixK2;
            this.f150995h2 = ((Long.rotateLeft(jMixK2, 31) + this.f150994h1) * 5) + 944331445;
        }

        private static long fmix64(long j10) {
            long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
            long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
            return j12 ^ (j12 >>> 33);
        }

        private static long mixK1(long j10) {
            return Long.rotateLeft(j10 * f150992C1, 31) * f150993C2;
        }

        private static long mixK2(long j10) {
            return Long.rotateLeft(j10 * f150993C2, 33) * f150992C1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j10 = this.f150994h1;
            int i10 = this.length;
            long j11 = this.f150995h2 ^ ((long) i10);
            long j12 = (j10 ^ ((long) i10)) + j11;
            this.f150994h1 = j12;
            this.f150995h2 = j11 + j12;
            this.f150994h1 = fmix64(j12);
            long jFmix64 = fmix64(this.f150995h2);
            long j13 = this.f150994h1 + jFmix64;
            this.f150994h1 = j13;
            this.f150995h2 = jFmix64 + j13;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f150994h1).putLong(this.f150995h2).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            this.length = byteBuffer.remaining() + this.length;
            long j17 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j10 = 0;
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 2:
                    j11 = 0;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 3:
                    j12 = 0;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 4:
                    j13 = 0;
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 5:
                    j14 = 0;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 6:
                    j15 = 0;
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j15;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 7:
                    j15 = ((long) UnsignedBytes.toInt(byteBuffer.get(6))) << 48;
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j15;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 8:
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 9:
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 10:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 11:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 12:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 13:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 14:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                case 15:
                    j17 = ((long) UnsignedBytes.toInt(byteBuffer.get(14))) << 48;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f150994h1 = mixK1(j16) ^ this.f150994h1;
                    this.f150995h2 ^= mixK2(j17);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    public Murmur3_128HashFunction(int i10) {
        this.seed = i10;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        int i10 = this.seed;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Hashing.murmur3_128(");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }
}
