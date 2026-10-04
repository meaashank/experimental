package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjf extends zzgp implements zzhs {
    private static final zzjf zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzgp.zzB(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static zzjd zza() {
        return (zzjd) zzb.zzp();
    }

    public static zzjf zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzjf zzjfVar, String str) {
        str.getClass();
        zzjfVar.zzd = 3;
        zzjfVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzia(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzim.class, zzhi.class});
        }
        if (i11 == 3) {
            return new zzjf();
        }
        zzje zzjeVar = null;
        if (i11 == 4) {
            return new zzjd(zzjeVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
