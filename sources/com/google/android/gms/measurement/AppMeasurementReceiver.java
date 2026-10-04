package com.google.android.gms.measurement;

import D1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzhj;
import e.I;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementReceiver extends a implements zzhj.zza {
    private zzhj zza;

    @NonNull
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj.zza
    @I
    public final void doStartService(@NonNull Context context, @NonNull Intent intent) {
        a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    @I
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzhj(this);
        }
        this.zza.zza(context, intent);
    }
}
