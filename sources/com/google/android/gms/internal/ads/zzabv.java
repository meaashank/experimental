package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabv implements zzabp {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabn[] zzd = new zzabn[100];

    public zzabv(boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized zzabn zza() {
        zzabn zzabnVar;
        try {
            this.zzb++;
            int i10 = this.zzc;
            if (i10 > 0) {
                zzabn[] zzabnVarArr = this.zzd;
                int i11 = i10 - 1;
                this.zzc = i11;
                zzabnVar = zzabnVarArr[i11];
                if (zzabnVar == null) {
                    throw null;
                }
                zzabnVarArr[i11] = null;
            } else {
                zzabnVar = new zzabn(new byte[65536], 0);
                int i12 = this.zzb;
                zzabn[] zzabnVarArr2 = this.zzd;
                int length = zzabnVarArr2.length;
                if (i12 > length) {
                    this.zzd = (zzabn[]) Arrays.copyOf(zzabnVarArr2, length + length);
                    return zzabnVar;
                }
            }
            return zzabnVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzb(zzabn zzabnVar) {
        zzabn[] zzabnVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzabnVarArr[i10] = zzabnVar;
        this.zzb--;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzc(@Nullable zzabo zzaboVar) {
        while (zzaboVar != null) {
            zzabn[] zzabnVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzabnVarArr[i10] = zzaboVar.zzd();
            this.zzb--;
            zzaboVar = zzaboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzd() {
        int i10 = this.zza;
        String str = zzfm.zza;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }

    public final synchronized int zzh() {
        return this.zzc * 65536;
    }
}
