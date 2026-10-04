package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzn extends com.google.android.play.core.hsdp.protocol.zzd {
    public /* synthetic */ zzn(zzo zzoVar) {
    }

    @Override // com.google.android.play.core.hsdp.protocol.zze
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 9270);
        if (i10 == 9281) {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
            return;
        }
        if (i10 == 9282) {
            zzd();
            return;
        }
        switch (i10) {
            case 9271:
                zzi();
                break;
            case 9272:
                zzh();
                break;
            case 9273:
                zzj();
                break;
            case 9274:
                zzc();
                break;
            case 9275:
                zzk();
                break;
            case 9276:
                zze();
                break;
            case 9277:
                zzg();
                break;
            default:
                zzf(i10);
                break;
        }
    }

    public abstract void zzc();

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf(int i10);

    public abstract void zzg();

    public abstract void zzh();

    public abstract void zzi();

    public abstract void zzj();

    public abstract void zzk();
}
