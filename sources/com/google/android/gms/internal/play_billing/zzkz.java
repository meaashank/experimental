package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkz extends zzgp implements zzhs {
    private static final zzkz zzb;
    private int zzd;
    private int zzf;
    private zzgu zze = zzgp.zzv();
    private String zzg = "";

    static {
        zzkz zzkzVar = new zzkz();
        zzb = zzkzVar;
        zzgp.zzB(zzkz.class, zzkzVar);
    }

    private zzkz() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzkz();
        }
        zzky zzkyVar = null;
        if (i11 == 4) {
            return new zzkx(zzkyVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
