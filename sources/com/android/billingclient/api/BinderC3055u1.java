package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzad;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.billingclient.api.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3055u1 extends zzad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f136835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f136836b;

    public /* synthetic */ BinderC3055u1(WeakReference weakReference, ResultReceiver resultReceiver, C3063w1 c3063w1) {
        this.f136835a = weakReference;
        this.f136836b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f136836b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zzc.zzn("BillingClient", "Response bundle doesn't contain a response code");
            this.f136836b.send(6, bundle);
            return;
        }
        int iZzb = zzc.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            zzc.zzn("BillingClient", C3023m0.a(iZzb, "Unable to launch intent for billing program information dialog"));
            this.f136836b.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            zzc.zzm("BillingClient", "User has acknowledged the billing program information dialog before.");
            this.f136836b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f136835a.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
                intent.putExtra("billing_program_information_dialog_result_receiver", this.f136836b);
                intent.putExtra("billing_program_information_dialog_pending_intent", pendingIntent);
                activity.startActivity(intent);
                return;
            }
            zzc.zzn("BillingClient", "Activity is null or unavailable, unable to launch intent for billing program information dialog.");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 5);
            bundle2.putString("DEBUG_MESSAGE", "Activity is null or unavailable.");
            this.f136836b.send(5, bundle2);
        } catch (RuntimeException e10) {
            zzc.zzo("BillingClient", "Runtime error while launching intent for billing program information dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.RUNTIME_EXCEPTION_WHEN_LAUNCHING_INTENT.zza());
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), zzbo.zzc(e10.getMessage())));
            this.f136836b.send(6, bundle3);
        }
    }
}
