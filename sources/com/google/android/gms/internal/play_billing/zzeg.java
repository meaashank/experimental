package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeg extends zzgp implements zzhs {
    private static final zzeg zzb;
    private int zzd;
    private String zze = "";

    static {
        zzeg zzegVar = new zzeg();
        zzb = zzegVar;
        zzgp.zzB(zzeg.class, zzegVar);
    }

    private zzeg() {
    }

    public static zzeg zzb() {
        return zzb;
    }

    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzeg();
        }
        zzef zzefVar = null;
        if (i11 == 4) {
            return new zzee(zzefVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
