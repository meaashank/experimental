package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlk extends zzgp implements zzhs {
    private static final zzlk zzb;
    private int zzd;
    private int zze;

    static {
        zzlk zzlkVar = new zzlk();
        zzb = zzlkVar;
        zzgp.zzB(zzlk.class, zzlkVar);
    }

    private zzlk() {
    }

    public static zzlk zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzli.zza});
        }
        if (i11 == 3) {
            return new zzlk();
        }
        zzlj zzljVar = null;
        if (i11 == 4) {
            return new zzlh(zzljVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
