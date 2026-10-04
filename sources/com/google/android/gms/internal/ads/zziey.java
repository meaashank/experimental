package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zziey extends zziex {
    @Override // com.google.android.gms.internal.ads.zziex
    public final void zza(zziip zziipVar, Map.Entry entry) throws IOException {
        zzifj zzifjVar = (zzifj) entry.getKey();
        if (!zzifjVar.zzc) {
            zziin zziinVar = zziin.zza;
            switch (zzifjVar.zzb.ordinal()) {
                case 0:
                    zziipVar.zzf(zzifjVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zziipVar.zze(zzifjVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zziipVar.zzc(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zziipVar.zzh(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zziipVar.zzi(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zziipVar.zzj(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zziipVar.zzk(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zziipVar.zzl(zzifjVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zziipVar.zzm(zzifjVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zziipVar.zzs(zzifjVar.zza, entry.getValue(), zzihg.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zziipVar.zzr(zzifjVar.zza, entry.getValue(), zzihg.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zziipVar.zzn(zzifjVar.zza, (zziei) entry.getValue());
                    break;
                case 12:
                    zziipVar.zzo(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zziipVar.zzi(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zziipVar.zzb(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zziipVar.zzd(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zziipVar.zzp(zzifjVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zziipVar.zzq(zzifjVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zziin zziinVar2 = zziin.zza;
        switch (zzifjVar.zzb.ordinal()) {
            case 0:
                zzihp.zza(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 1:
                zzihp.zzb(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 2:
                zzihp.zzc(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 3:
                zzihp.zzd(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 4:
                zzihp.zzh(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 5:
                zzihp.zzf(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 6:
                zzihp.zzk(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 7:
                zzihp.zzn(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 8:
                zzihp.zzo(zzifjVar.zza, (List) entry.getValue(), zziipVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzihp.zzr(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzihg.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzihp.zzq(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzihg.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzihp.zzp(zzifjVar.zza, (List) entry.getValue(), zziipVar);
                break;
            case 12:
                zzihp.zzi(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 13:
                zzihp.zzh(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 14:
                zzihp.zzl(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 15:
                zzihp.zzg(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 16:
                zzihp.zzj(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
            case 17:
                zzihp.zze(zzifjVar.zza, (List) entry.getValue(), zziipVar, zzifjVar.zzd);
                break;
        }
    }
}
