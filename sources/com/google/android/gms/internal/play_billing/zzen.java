package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class zzen extends zzgp implements zzhs {
    private static final zzen zzb;
    private zzgu zzd = zzgp.zzv();

    static {
        zzen zzenVar = new zzen();
        zzb = zzenVar;
        zzgp.zzB(zzen.class, zzenVar);
    }

    private zzen() {
    }

    public static zzem zza() {
        return (zzem) zzb.zzp();
    }

    public static /* synthetic */ void zzc(zzen zzenVar, Iterable iterable) {
        zzgu zzguVar = zzenVar.zzd;
        if (!zzguVar.zzc()) {
            int size = zzguVar.size();
            zzenVar.zzd = zzguVar.zzd(size + size);
        }
        zzfa.zzk(iterable, zzenVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzel.class});
        }
        if (i11 == 3) {
            return new zzen();
        }
        zzeo zzeoVar = null;
        if (i11 == 4) {
            return new zzem(zzeoVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
