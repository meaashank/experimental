package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgca extends zzifm implements zzigx {
    private static final zzgca zzb;
    private static volatile zzihe zzc;
    private zzigq zza = zzigq.zza();

    static {
        zzgca zzgcaVar = new zzgca();
        zzb = zzgcaVar;
        zzifm.zzbu(zzgca.class, zzgcaVar);
    }

    private zzgca() {
    }

    public static zzgca zzc(InputStream inputStream) throws IOException {
        return (zzgca) zzifm.zzbW(zzb, inputStream);
    }

    public static zzgca zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzgbz.zza});
        }
        if (iOrdinal == 3) {
            return new zzgca();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgby(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzgca.class) {
            try {
                zzifhVar = zzc;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzb);
                    zzc = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
