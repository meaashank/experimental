package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzigm implements zzigu {
    private final zzigu[] zza;

    public zzigm(zzigu... zziguVarArr) {
        this.zza = zziguVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final zzigt zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzigu zziguVar = this.zza[i10];
            if (zziguVar.zzb(cls)) {
                return zziguVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
