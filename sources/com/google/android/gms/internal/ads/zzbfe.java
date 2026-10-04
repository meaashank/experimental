package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbfe extends BroadcastReceiver {
    final /* synthetic */ zzbfi zza;

    public zzbfe(zzbfi zzbfiVar) {
        Objects.requireNonNull(zzbfiVar);
        this.zza = zzbfiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg(3);
    }
}
