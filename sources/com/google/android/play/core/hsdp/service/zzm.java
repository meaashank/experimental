package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzm extends com.google.android.play.core.hsdp.protocol.zzd {
    public /* synthetic */ zzm(zzo zzoVar) {
    }

    @Override // com.google.android.play.core.hsdp.protocol.zze
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 9270);
        if (i10 == 9272) {
            zzd();
        } else if (i10 != 9281) {
            zzc(i10);
        } else {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
        }
    }

    public abstract void zzc(int i10);

    public abstract void zzd();
}
