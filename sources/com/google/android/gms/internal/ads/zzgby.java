package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgby extends zzifg implements zzigx {
    private zzgby() {
        throw null;
    }

    public final zzgby zza(String str) {
        str.getClass();
        zzbg();
        ((zzgca) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzgca) this.zza).zzb());
    }

    public final zzgby zzc(String str, zzgbw zzgbwVar) {
        str.getClass();
        zzgbwVar.getClass();
        zzbg();
        ((zzgca) this.zza).zze().put(str, zzgbwVar);
        return this;
    }

    public /* synthetic */ zzgby(byte[] bArr) {
        super(zzgca.zzb);
    }
}
