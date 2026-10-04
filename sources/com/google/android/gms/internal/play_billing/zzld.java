package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzld extends zzgp implements zzhs {
    private static final zzld zzb;
    private int zzd;
    private int zze;

    static {
        zzld zzldVar = new zzld();
        zzb = zzldVar;
        zzgp.zzB(zzld.class, zzldVar);
    }

    private zzld() {
    }

    public static zzla zza() {
        return (zzla) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzld zzldVar, int i10) {
        zzldVar.zze = i10 - 1;
        zzldVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzlb.zza});
        }
        if (i11 == 3) {
            return new zzld();
        }
        zzlc zzlcVar = null;
        if (i11 == 4) {
            return new zzla(zzlcVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
