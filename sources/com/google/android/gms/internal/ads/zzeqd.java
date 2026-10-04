package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeqd {
    private final zzfmp zza;
    private final zzdxx zzb;
    private final zzeaj zzc;

    public zzeqd(zzfmp zzfmpVar, zzdxx zzdxxVar, zzeaj zzeajVar) {
        this.zza = zzfmpVar;
        this.zzb = zzdxxVar;
        this.zzc = zzeajVar;
    }

    public final void zza(zzflg zzflgVar, zzfld zzfldVar, int i10, @Nullable zzemu zzemuVar, long j10) {
        zzdxw zzdxwVarZzc;
        zzeai zzeaiVarZza = this.zzc.zza();
        zzeaiVarZza.zza(zzflgVar);
        zzeaiVarZza.zzb(zzfldVar);
        zzeaiVarZza.zzc("action", "adapter_status");
        zzeaiVarZza.zzc("adapter_l", String.valueOf(j10));
        zzeaiVarZza.zzc("sc", Integer.toString(i10));
        if (zzemuVar != null) {
            zzeaiVarZza.zzc("arec", Integer.toString(zzemuVar.zzb().zza));
            String strZza = this.zza.zza(zzemuVar.getMessage());
            if (strZza != null) {
                zzeaiVarZza.zzc("areec", strZza);
            }
        }
        zzdxx zzdxxVar = this.zzb;
        Iterator it = zzfldVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdxwVarZzc = null;
                break;
            } else {
                zzdxwVarZzc = zzdxxVar.zzc((String) it.next());
                if (zzdxwVarZzc != null) {
                    break;
                }
            }
        }
        if (zzdxwVarZzc != null) {
            zzeaiVarZza.zzc("ancn", zzdxwVarZzc.zza);
            zzbyi zzbyiVar = zzdxwVarZzc.zzb;
            if (zzbyiVar != null) {
                zzeaiVarZza.zzc("adapter_v", zzbyiVar.toString());
            }
            zzbyi zzbyiVar2 = zzdxwVarZzc.zzc;
            if (zzbyiVar2 != null) {
                zzeaiVarZza.zzc("adapter_sv", zzbyiVar2.toString());
            }
        }
        zzeaiVarZza.zzd();
    }
}
