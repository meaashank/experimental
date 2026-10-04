package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlg extends zzgp implements zzhs {
    private static final zzlg zzb;
    private int zzd;
    private zzju zze;
    private long zzf;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzgp.zzB(zzlg.class, zzlgVar);
    }

    private zzlg() {
    }

    public static zzle zza() {
        return (zzle) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzlg zzlgVar, zzju zzjuVar) {
        zzjuVar.getClass();
        zzlgVar.zze = zzjuVar;
        zzlgVar.zzd |= 1;
    }

    public static /* synthetic */ void zze(zzlg zzlgVar, long j10) {
        zzlgVar.zzd |= 2;
        zzlgVar.zzf = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzlg();
        }
        zzlf zzlfVar = null;
        if (i11 == 4) {
            return new zzle(zzlfVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
