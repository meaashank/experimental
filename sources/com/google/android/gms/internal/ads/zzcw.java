package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcw extends zzcq {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // com.google.android.gms.internal.ads.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcw.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        int i10 = zzclVar.zzd;
        if (zzfm.zzE(i10)) {
            return i10 != 2 ? new zzcl(zzclVar.zzb, zzclVar.zzc, 2) : zzcl.zza;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
