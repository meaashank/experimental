package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zziff implements zzigu {
    private static final zziff zza = new zziff();

    private zziff() {
    }

    public static zziff zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final boolean zzb(Class cls) {
        return zzifm.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final zzigt zzc(Class cls) {
        if (!zzifm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzigt) zzifm.zzbt(cls.asSubclass(zzifm.class)).zzbs();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
