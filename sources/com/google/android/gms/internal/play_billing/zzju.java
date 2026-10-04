package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzju extends zzgp implements zzhs {
    private static final zzju zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzju zzjuVar = new zzju();
        zzb = zzjuVar;
        zzgp.zzB(zzju.class, zzjuVar);
    }

    private zzju() {
    }

    public static /* synthetic */ void zzG(zzju zzjuVar, int i10) {
        zzjuVar.zzd |= 1;
        zzjuVar.zze = i10;
    }

    public static zzjq zza() {
        return (zzjq) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzju zzjuVar, String str) {
        zzjuVar.zzd |= 8;
        zzjuVar.zzh = str;
    }

    public static /* synthetic */ void zze(zzju zzjuVar, String str) {
        str.getClass();
        zzjuVar.zzd |= 2;
        zzjuVar.zzf = str;
    }

    public static /* synthetic */ void zzf(zzju zzjuVar, int i10) {
        zzjuVar.zzd |= 32;
        zzjuVar.zzj = i10;
    }

    public static /* synthetic */ void zzg(zzju zzjuVar, int i10) {
        zzjuVar.zzd |= 16;
        zzjuVar.zzi = i10;
    }

    public static /* synthetic */ void zzh(zzju zzjuVar, zzjs zzjsVar) {
        zzjuVar.zzg = zzjsVar.zza();
        zzjuVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", zzjr.zza, "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzju();
        }
        zzjt zzjtVar = null;
        if (i11 == 4) {
            return new zzjq(zzjtVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
