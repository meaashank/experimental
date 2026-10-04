package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgxm.zzi());
    private final zzgxm zzb;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgxm.zzq(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgxm zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        int i11 = 0;
        while (true) {
            zzgxm zzgxmVar = this.zzb;
            if (i11 >= zzgxmVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgxmVar.get(i11);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i10) {
                return true;
            }
            i11++;
        }
    }
}
