package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzaga implements zzagb {
    static final /* synthetic */ zzaga zza = new zzaga();

    private /* synthetic */ zzaga() {
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final /* synthetic */ Constructor zza() {
        int i10 = zzagd.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzagh.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
