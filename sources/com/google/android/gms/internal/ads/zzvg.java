package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class zzvg extends zziy {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzvg() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zziy, com.google.android.gms.internal.ads.zzit
    public final void zza() {
        super.zza();
        this.zzg = 0;
    }

    public final void zzm(@e.D(from = 1) int i10) {
        this.zzh = i10;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final int zzo() {
        return this.zzg;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }

    public final boolean zzq(zziy zziyVar) {
        ByteBuffer byteBuffer;
        zzguk.zza(!zziyVar.zzi(1073741824));
        zzguk.zza(!zziyVar.zzi(268435456));
        zzguk.zza(!zziyVar.zzi(4));
        if (zzp()) {
            if (this.zzg >= this.zzh) {
                return false;
            }
            ByteBuffer byteBuffer2 = zziyVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.zzg;
        this.zzg = i10 + 1;
        if (i10 == 0) {
            this.zzd = zziyVar.zzd;
            if (zziyVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zziyVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzf = zziyVar.zzd;
        return true;
    }
}
