package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzas;
import com.google.android.gms.internal.play_billing.zzc;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.android.billingclient.api.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3051t1 extends zzas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f136827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f136828b;

    public /* synthetic */ BinderC3051t1(WeakReference weakReference, ResultReceiver resultReceiver, C3063w1 c3063w1) {
        this.f136827a = weakReference;
        this.f136828b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzat
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f136828b;
        if (resultReceiver == null) {
            zzc.zzn("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f136827a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            zzc.zzn("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra(ProxyBillingActivity.f136471i, resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            this.f136828b.send(0, null);
            zzc.zzo("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}
