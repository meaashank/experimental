package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzev extends zzgp implements zzhs {
    private static final zzev zzb;
    private int zzd;
    private String zze = "";

    static {
        zzev zzevVar = new zzev();
        zzb = zzevVar;
        zzgp.zzB(zzev.class, zzevVar);
    }

    private zzev() {
    }

    public static zzeu zza() {
        return (zzeu) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzev zzevVar, String str) {
        zzevVar.zzd |= 1;
        zzevVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzev();
        }
        zzew zzewVar = null;
        if (i11 == 4) {
            return new zzeu(zzewVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
