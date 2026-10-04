package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwy implements zzzi {
    private final zzgxm zza;
    private long zzb;

    public zzwy(List list, List list2) {
        int i10 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        zzguk.zza(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgxjVar.zzf(new zzwx((zzzi) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzgxjVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                break;
            }
            zzwx zzwxVar = (zzwx) zzgxmVar.get(i10);
            long jZzb = zzwxVar.zzb();
            if ((zzwxVar.zza().contains(1) || zzwxVar.zza().contains(2) || zzwxVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.zzb;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                break;
            }
            long jZzc = ((zzwx) zzgxmVar.get(i10)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        boolean zZzd;
        boolean z10 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zZzd = false;
            while (true) {
                zzgxm zzgxmVar = this.zza;
                if (i10 >= zzgxmVar.size()) {
                    break;
                }
                long jZzc2 = ((zzwx) zzgxmVar.get(i10)).zzc();
                boolean z11 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzmeVar.zza;
                if (jZzc2 == jZzc || z11) {
                    zZzd |= ((zzwx) zzgxmVar.get(i10)).zzd(zzmeVar);
                }
                i10++;
            }
            z10 |= zZzd;
        } while (zZzd);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        int i10 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                return false;
            }
            if (((zzwx) zzgxmVar.get(i10)).zze()) {
                return true;
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j10) {
        int i10 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zza;
            if (i10 >= zzgxmVar.size()) {
                return;
            }
            ((zzwx) zzgxmVar.get(i10)).zzf(j10);
            i10++;
        }
    }
}
