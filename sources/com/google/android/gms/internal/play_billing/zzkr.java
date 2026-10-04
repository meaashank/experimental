package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkr extends zzgp implements zzhs {
    private static final zzkr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzgp.zzB(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzkq.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzkr();
        }
        zzks zzksVar = null;
        if (i11 == 4) {
            return new zzkp(zzksVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
