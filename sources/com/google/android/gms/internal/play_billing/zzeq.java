package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeq extends zzgp implements zzhs {
    private static final zzeq zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzeq zzeqVar = new zzeq();
        zzb = zzeqVar;
        zzgp.zzB(zzeq.class, zzeqVar);
    }

    private zzeq() {
    }

    public static zzeq zzc(byte[] bArr) throws zzhb {
        return (zzeq) zzgp.zzt(zzb, bArr);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzeq();
        }
        zzet zzetVar = null;
        if (i11 == 4) {
            return new zzep(zzetVar);
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
