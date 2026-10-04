package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzr {
    public static final zzzr zza = new zzzr(new zzbg[0]);
    public final int zzb;
    private final zzgxm zzc;
    private int zzd;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public zzzr(zzbg... zzbgVarArr) {
        this.zzc = zzgxm.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbg) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzeh.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzr.class == obj.getClass()) {
            zzzr zzzrVar = (zzzr) obj;
            if (this.zzb == zzzrVar.zzb && this.zzc.equals(zzzrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i10) {
        return (zzbg) this.zzc.get(i10);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgxm zzc() {
        return zzgxm.zzq(zzgym.zzc(this.zzc, zzzq.zza));
    }
}
