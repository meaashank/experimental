package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f161854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f161855b;

        public a(long j10, o oVar) {
            this.f161854a = j10;
            this.f161855b = oVar;
        }

        public o a() {
            return this.f161855b;
        }

        public long b() {
            return this.f161854a;
        }
    }

    public static r a(o oVar) throws q, IOException {
        m<ByteBuffer, Long> mVarA = n.a(oVar);
        if (mVarA == null) {
            throw new q("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBufferA = mVarA.a();
        long jLongValue = mVarA.b().longValue();
        byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
        long jC = n.c(byteBufferA);
        if (jC > jLongValue) {
            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("ZIP Central Directory start offset out of range: ", jC, ". ZIP End of Central Directory offset: ");
            sbA.append(jLongValue);
            throw new q(sbA.toString());
        }
        long jD = n.d(byteBufferA);
        long j10 = jC + jD;
        if (j10 <= jLongValue) {
            return new r(jC, jD, n.e(byteBufferA), jLongValue, byteBufferA);
        }
        StringBuilder sbA2 = androidx.compose.runtime.snapshots.z.a("ZIP Central Directory overlaps with End of Central Directory. CD end: ", j10, ", EoCD start: ");
        sbA2.append(jLongValue);
        throw new q(sbA2.toString());
    }

    public static a a(o oVar, r rVar) throws C3835b, IOException {
        long jA = rVar.a();
        long jC = rVar.c() + jA;
        long jE = rVar.e();
        if (jC != jE) {
            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", jC, ", EoCD start: ");
            sbA.append(jE);
            throw new C3835b(sbA.toString());
        }
        if (jA >= 32) {
            ByteBuffer byteBufferA = oVar.a(jA - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            if (byteBufferA.getLong(8) == com.prism.gaia.helper.utils.apk.b.f165096p && byteBufferA.getLong(16) == com.prism.gaia.helper.utils.apk.b.f165095o) {
                long j10 = byteBufferA.getLong(0);
                if (j10 < byteBufferA.capacity() || j10 > 2147483639) {
                    throw new C3835b("APK Signing Block size out of range: ".concat(String.valueOf(j10)));
                }
                long j11 = (int) (8 + j10);
                long j12 = jA - j11;
                if (j12 >= 0) {
                    ByteBuffer byteBufferA2 = oVar.a(j12, 8);
                    byteBufferA2.order(byteOrder);
                    long j13 = byteBufferA2.getLong(0);
                    if (j13 == j10) {
                        return new a(j12, oVar.a(j12, j11));
                    }
                    StringBuilder sbA2 = androidx.compose.runtime.snapshots.z.a("APK Signing Block sizes in header and footer do not match: ", j13, " vs ");
                    sbA2.append(j10);
                    throw new C3835b(sbA2.toString());
                }
                throw new C3835b("APK Signing Block offset out of range: ".concat(String.valueOf(j12)));
            }
            throw new C3835b("No APK Signing Block before ZIP Central Directory");
        }
        throw new C3835b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(jA)));
    }
}
