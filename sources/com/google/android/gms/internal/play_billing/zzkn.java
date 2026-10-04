package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkn extends zzgp implements zzhs {
    private static final zzkn zzb;
    private int zzd;
    private int zze;

    static {
        zzkn zzknVar = new zzkn();
        zzb = zzknVar;
        zzgp.zzB(zzkn.class, zzknVar);
    }

    private zzkn() {
    }

    public static zzkk zza() {
        return (zzkk) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzkn zzknVar, int i10) {
        zzknVar.zze = i10 - 1;
        zzknVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkl.zza});
        }
        if (i11 == 3) {
            return new zzkn();
        }
        zzkm zzkmVar = null;
        if (i11 == 4) {
            return new zzkk(zzkmVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
