package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzwh implements zzwk {
    static final /* synthetic */ zzwh zza = new zzwh();

    private /* synthetic */ zzwh() {
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final /* synthetic */ int zza(Object obj) {
        int i10 = zzwl.zza;
        String str = ((zzvs) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
