package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcce extends zzccg {
    private final String zza;
    private final int zzb;

    public zzcce(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcce)) {
            return false;
        }
        zzcce zzcceVar = (zzcce) obj;
        if (Objects.equal(this.zza, zzcceVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcceVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final int zzb() {
        return this.zzb;
    }
}
