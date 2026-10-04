package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzah;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.billingclient.api.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3032o1 extends zzah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f136787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f136788b;

    public /* synthetic */ BinderC3032o1(WeakReference weakReference, ResultReceiver resultReceiver, C3063w1 c3063w1) {
        this.f136787a = weakReference;
        this.f136788b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f136788b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zzc.zzn("BillingClient", "Response bundle doesn't contain a response code");
            this.f136788b.send(6, bundle);
            return;
        }
        int iZzb = zzc.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            zzc.zzn("BillingClient", C3023m0.a(iZzb, "Unable to launch intent for external offer dialog"));
            this.f136788b.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            zzc.zzn("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.f136788b.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f136787a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.f136788b);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            zzc.zzo("BillingClient", "Runtime error while launching intent for the external offer dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.RUNTIME_EXCEPTION_ON_LAUNCHING_EXTERNAL_PAYMENT_DIALOG_INTENT.zza());
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), zzbo.zzc(e10.getMessage())));
            this.f136788b.send(6, bundle3);
        }
    }
}
