package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqa implements zzgpx {
    private final zzgrh zza;
    private final long zzb;

    public zzgqa(zzgdq zzgdqVar, zzgrh zzgrhVar, long j10) {
        this.zza = zzgrhVar;
        this.zzb = j10;
    }

    private static boolean zzc(zzggt zzggtVar) {
        int iZza = zzggtVar.zzb().zza().zza();
        int iZzb = zzggtVar.zzb().zza().zzb();
        byte[] versionArray = zzavo.zza();
        kotlin.jvm.internal.G.p(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        kotlin.jvm.internal.G.o(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.G.o(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean zza(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzggtVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z10 = zzggtVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z10) {
            this.zza.zzb(20203);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean zzb(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzggtVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
