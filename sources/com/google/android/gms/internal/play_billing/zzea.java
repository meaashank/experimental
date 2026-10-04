package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzea extends zzgp implements zzhs {
    private static final zzea zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzea zzeaVar = new zzea();
        zzb = zzeaVar;
        zzgp.zzB(zzea.class, zzeaVar);
    }

    private zzea() {
    }

    public static zzea zzb(byte[] bArr) throws zzhb {
        return (zzea) zzgp.zzt(zzb, bArr);
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
            return zzgp.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzea();
        }
        zzdz zzdzVar = null;
        if (i11 == 4) {
            return new zzdy(zzdzVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String zze() {
        return this.zzf;
    }
}
