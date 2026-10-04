package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggt extends zzifm implements zzigx {
    private static final zzggt zzf;
    private static volatile zzihe zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zzifu zze = zzifm.zzbC();

    static {
        zzggt zzggtVar = new zzggt();
        zzf = zzggtVar;
        zzifm.zzbu(zzggt.class, zzggtVar);
    }

    private zzggt() {
    }

    public static zzggt zze(zziei zzieiVar) throws zzige {
        return (zzggt) zzifm.zzbS(zzf, zzieiVar);
    }

    public static zzggs zzg() {
        return (zzggs) zzf.zzbn();
    }

    public static zzggt zzh() {
        return zzf;
    }

    public final zzber zza() {
        return this.zzb == 1 ? (zzber) this.zzc : zzber.zzj();
    }

    public final zzbep zzb() {
        return this.zzb == 2 ? (zzbep) this.zzc : zzbep.zzd();
    }

    public final zzbei zzc() {
        zzbei zzbeiVarZzb = zzbei.zzb(this.zzd);
        return zzbeiVarZzb == null ? zzbei.UNSUPPORTED : zzbeiVarZzb;
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzber.class, zzbep.class, "zzd", zzbei.zzc(), "zze"});
        }
        if (iOrdinal == 3) {
            return new zzggt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzggs(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzggt.class) {
            try {
                zzifhVar = zzg;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzf);
                    zzg = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zzi(zzber zzberVar) {
        zzberVar.getClass();
        this.zzc = zzberVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void zzj(zzbep zzbepVar) {
        zzbepVar.getClass();
        this.zzc = zzbepVar;
        this.zzb = 2;
    }

    public final /* synthetic */ void zzk(zzbei zzbeiVar) {
        this.zzd = zzbeiVar.zza();
        this.zza |= 1;
    }

    public final /* synthetic */ void zzl(Iterable iterable) {
        zzifu zzifuVar = this.zze;
        if (!zzifuVar.zza()) {
            this.zze = zzifm.zzbD(zzifuVar);
        }
        zzidr.zzaW(iterable, this.zze);
    }
}
