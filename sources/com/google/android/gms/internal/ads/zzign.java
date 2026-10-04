package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzign {
    private static final zzigu zzb = new zzigl();
    private final zzigu zza;

    public zzign() {
        zziff zziffVarZza = zziff.zza();
        int i10 = zzidv.zza;
        this.zza = new zzigm(zziffVarZza, zzb);
    }

    public final zziho zza(Class cls) {
        int i10 = zzihp.zza;
        if (!zzifm.class.isAssignableFrom(cls)) {
            int i11 = zzidv.zza;
        }
        int i12 = zzidv.zza;
        zzigt zzigtVarZzc = this.zza.zzc(cls);
        if (zzigtVarZzc.zza()) {
            return zziha.zzh(zzihp.zzE(), zziez.zza(), zzigtVarZzc.zzb());
        }
        return zzigz.zzm(cls, zzigtVarZzc, zzihd.zza(), zzigj.zza(), zzihp.zzE(), zzigtVarZzc.zzc() + (-1) != 1 ? zziez.zza() : null, zzigs.zza());
    }
}
