package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzed extends zzgp implements zzhs {
    private static final zzed zzb;
    private int zzd;
    private String zze = "";

    static {
        zzed zzedVar = new zzed();
        zzb = zzedVar;
        zzgp.zzB(zzed.class, zzedVar);
    }

    private zzed() {
    }

    public static zzed zzb(byte[] bArr) throws zzhb {
        return (zzed) zzgp.zzt(zzb, bArr);
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
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzed();
        }
        zzec zzecVar = null;
        if (i11 == 4) {
            return new zzeb(zzecVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
