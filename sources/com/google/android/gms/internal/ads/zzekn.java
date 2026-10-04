package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbil;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekn implements zzfqj {
    private final zzekb zza;
    private final zzekf zzb;

    public zzekn(zzekb zzekbVar, zzekf zzekfVar) {
        this.zza = zzekbVar;
        this.zzb = zzekfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdL(zzfqc zzfqcVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdM(zzfqc zzfqcVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue()) {
            if (zzfqc.RENDERER == zzfqcVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfqc.PRELOADED_LOADER == zzfqcVar || zzfqc.SERVER_TRANSACTION == zzfqcVar) {
                zzekb zzekbVar = this.zza;
                zzekbVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzekf zzekfVar = this.zzb;
                final long jZzb = zzekbVar.zzb();
                zzekfVar.zza.zza(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzeke
                    @Override // com.google.android.gms.internal.ads.zzfpi
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzekfVar.zzf()) {
                            return null;
                        }
                        long j10 = jZzb;
                        zzbil.zzaf.zza.C0490zza c0490zzaZzz = zzbil.zzaf.zza.zzz();
                        c0490zzaZzz.zzad(j10);
                        byte[] bArrZzaN = c0490zzaZzz.zzbu().zzaN();
                        zzekm.zzf(sQLiteDatabase, false, false);
                        zzekm.zze(sQLiteDatabase, j10, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdN(zzfqc zzfqcVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue() && zzfqc.RENDERER == zzfqcVar) {
            zzekb zzekbVar = this.zza;
            if (zzekbVar.zzh() != 0) {
                zzekbVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzekbVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdO(zzfqc zzfqcVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue() && zzfqc.RENDERER == zzfqcVar) {
            zzekb zzekbVar = this.zza;
            if (zzekbVar.zzh() != 0) {
                zzekbVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzekbVar.zzh());
            }
        }
    }
}
