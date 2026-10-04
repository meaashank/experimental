package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdu extends zzgp implements zzhs {
    private static final zzdu zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzdu zzduVar = new zzdu();
        zzb = zzduVar;
        zzgp.zzB(zzdu.class, zzduVar);
    }

    private zzdu() {
    }

    public static zzdu zzb() {
        return zzb;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzdu();
        }
        zzdt zzdtVar = null;
        if (i11 == 4) {
            return new zzds(zzdtVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int zze() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
