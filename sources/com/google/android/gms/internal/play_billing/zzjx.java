package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjx extends zzgp implements zzhs {
    private static final zzjx zzb;

    static {
        zzjx zzjxVar = new zzjx();
        zzb = zzjxVar;
        zzgp.zzB(zzjx.class, zzjxVar);
    }

    private zzjx() {
    }

    public static zzjx zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzjw zzjwVar = null;
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzjx();
        }
        if (i11 == 4) {
            return new zzjv(zzjwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
