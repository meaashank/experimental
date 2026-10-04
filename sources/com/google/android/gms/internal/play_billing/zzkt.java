package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkt extends zzgp implements zzhs {
    private static final zzkt zzb;
    private int zzd;
    private zzgu zze = zzgp.zzv();
    private String zzf = "";
    private boolean zzg;

    static {
        zzkt zzktVar = new zzkt();
        zzb = zzktVar;
        zzgp.zzB(zzkt.class, zzktVar);
    }

    private zzkt() {
    }

    public static zzkt zzb() {
        return zzb;
    }

    public static /* synthetic */ void zzc(zzkt zzktVar, boolean z10) {
        zzktVar.zzd |= 2;
        zzktVar.zzg = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzkr.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzkt();
        }
        zzks zzksVar = null;
        if (i11 == 4) {
            return new zzko(zzksVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
