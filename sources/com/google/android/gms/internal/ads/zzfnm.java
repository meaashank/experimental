package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.google.android.gms.internal.ads.zzbil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzfnm implements zzfnl {
    private final ConcurrentHashMap zza;
    private final zzfns zzb;
    private final zzfno zzc = new zzfno();

    public zzfnm(zzfns zzfnsVar) {
        this.zza = new ConcurrentHashMap(zzfnsVar.zzd);
        this.zzb = zzfnsVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfns> creator = zzfns.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzht)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zzfns zzfnsVar = this.zzb;
            sb2.append(zzfnsVar.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzg());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfnv) entry.getKey()).hashCode());
                sb2.append(TextProcessor.f150538k0);
                for (int i11 = 0; i11 < ((zzfnk) entry.getValue()).zzc(); i11++) {
                    sb2.append("[O]");
                }
                for (int iZzc = ((zzfnk) entry.getValue()).zzc(); iZzc < zzfnsVar.zzd; iZzc++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfnk) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < zzfnsVar.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    @Nullable
    public final synchronized zzfnu zza(zzfnv zzfnvVar) {
        zzfnu zzfnuVarZzb;
        try {
            zzfnk zzfnkVar = (zzfnk) this.zza.get(zzfnvVar);
            if (zzfnkVar != null) {
                zzfnuVarZzb = zzfnkVar.zzb();
                if (zzfnuVarZzb == null) {
                    this.zzc.zzb();
                }
                zzfoi zzfoiVarZzh = zzfnkVar.zzh();
                if (zzfnuVarZzb != null) {
                    zzbil.zzb.zzc zzcVarZzs = zzbil.zzb.zzs();
                    zzbil.zzb.zza.C0491zza c0491zzaZzs = zzbil.zzb.zza.zzs();
                    c0491zzaZzs.zzc(zzbil.zzb.zzd.IN_MEMORY);
                    zzbil.zzb.zze.zza zzaVarZzq = zzbil.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzfoiVarZzh.zza);
                    zzaVarZzq.zzg(zzfoiVarZzh.zzb);
                    c0491zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c0491zzaZzs);
                    zzfnuVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfnuVarZzb = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfnuVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized boolean zzb(zzfnv zzfnvVar, zzfnu zzfnuVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfnk zzfnkVar = (zzfnk) concurrentHashMap.get(zzfnvVar);
            zzfnuVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzfnkVar == null) {
                zzfns zzfnsVar = this.zzb;
                zzfnk zzfnkVar2 = new zzfnk(zzfnsVar.zzd, zzfnsVar.zze * 1000);
                if (concurrentHashMap.size() == zzfnsVar.zzc) {
                    int i10 = zzfnsVar.zzg;
                    int i11 = i10 - 1;
                    zzfnv zzfnvVar2 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfnk) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfnk) entry.getValue()).zzd();
                                zzfnvVar2 = (zzfnv) entry.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfnk) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfnk) entry2.getValue()).zze();
                                zzfnvVar2 = (zzfnv) entry2.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    } else if (i11 == 2) {
                        int iZzf = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfnk) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfnk) entry3.getValue()).zzf();
                                zzfnvVar2 = (zzfnv) entry3.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfnvVar, zzfnkVar2);
                this.zzc.zzc();
                zzfnkVar = zzfnkVar2;
            }
            zZza = zzfnkVar.zza(zzfnuVar);
            zzfno zzfnoVar = this.zzc;
            zzfnoVar.zze();
            zzfnn zzfnnVarZzf = zzfnoVar.zzf();
            zzfoi zzfoiVarZzh = zzfnkVar.zzh();
            zzbil.zzb.zzc zzcVarZzs = zzbil.zzb.zzs();
            zzbil.zzb.zza.C0491zza c0491zzaZzs = zzbil.zzb.zza.zzs();
            c0491zzaZzs.zzc(zzbil.zzb.zzd.IN_MEMORY);
            zzbil.zzb.zzg.zza zzaVarZzs = zzbil.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfnnVarZzf.zza);
            zzaVarZzs.zzg(zzfnnVarZzf.zzb);
            zzaVarZzs.zzk(zzfoiVarZzh.zzb);
            c0491zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0491zzaZzs);
            zzfnuVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final synchronized boolean zzc(zzfnv zzfnvVar) {
        zzfnk zzfnkVar = (zzfnk) this.zza.get(zzfnvVar);
        if (zzfnkVar == null) {
            return true;
        }
        return zzfnkVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    @Deprecated
    public final zzfnv zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfns zzfnsVar = this.zzb;
        return new zzfnw(zzmVar, str, new zzcby(zzfnsVar.zza).zza().zzj, zzfnsVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final zzfns zze() {
        return this.zzb;
    }
}
