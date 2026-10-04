package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgux extends zzgtr {
    final CharSequence zzb;
    final zzgty zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzgux(zzguz zzguzVar, CharSequence charSequence) {
        this.zzc = zzguzVar.zzi();
        this.zzd = zzguzVar.zzj();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgtr
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int iZzd;
        int i10 = this.zze;
        while (true) {
            int i11 = this.zze;
            if (i11 == -1) {
                zzb();
                return null;
            }
            iZzc = zzc(i11);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i10) {
                int i12 = iZzd + 1;
                this.zze = i12;
                if (i12 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                while (i10 < iZzc && this.zzc.zzb(this.zzb.charAt(i10))) {
                    i10++;
                }
                while (iZzc > i10) {
                    int i13 = iZzc - 1;
                    if (!this.zzc.zzb(this.zzb.charAt(i13))) {
                        break;
                    }
                    iZzc = i13;
                }
                if (!this.zzd || i10 != iZzc) {
                    break;
                }
                i10 = this.zze;
            }
        }
        int i14 = this.zzf;
        if (i14 == 1) {
            CharSequence charSequence = this.zzb;
            int length = charSequence.length();
            this.zze = -1;
            while (length > i10) {
                int i15 = length - 1;
                if (!this.zzc.zzb(charSequence.charAt(i15))) {
                    break;
                }
                length = i15;
            }
            iZzc = length;
        } else {
            this.zzf = i14 - 1;
        }
        return this.zzb.subSequence(i10, iZzc).toString();
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
