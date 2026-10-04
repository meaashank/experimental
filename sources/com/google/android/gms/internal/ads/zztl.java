package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zztl extends zzcq {

    @Nullable
    private zzhbf zzd;

    @Nullable
    private zzhbf zze;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    @Override // com.google.android.gms.internal.ads.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.nio.ByteBuffer r15) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        zzhbf zzhbfVar = this.zzd;
        if (zzhbfVar == null) {
            return zzcl.zza;
        }
        int i10 = zzclVar.zzd;
        if (!zzfm.zzE(i10)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int iZzh = zzhbfVar.zzh();
        int i11 = zzclVar.zzc;
        boolean z10 = i11 != iZzh;
        int i12 = 0;
        while (i12 < iZzh) {
            int iZzi = zzhbfVar.zzi(i12);
            if (iZzi >= i11) {
                String string = zzhbfVar.toString();
                throw new zzco(androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), zzclVar);
            }
            z10 |= iZzi != i12;
            i12++;
        }
        return z10 ? new zzcl(zzclVar.zzb, iZzh, i10) : zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzo(zzcn zzcnVar) {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(@Nullable zzhbf zzhbfVar) {
        this.zzd = zzhbfVar;
    }
}
