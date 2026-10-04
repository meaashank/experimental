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

/* JADX INFO: renamed from: com.android.billingclient.api.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3024m1 extends zzad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f136778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f136779b;

    public /* synthetic */ BinderC3024m1(WeakReference weakReference, ResultReceiver resultReceiver, C3063w1 c3063w1) {
        this.f136778a = weakReference;
        this.f136779b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f136779b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zzc.zzn("BillingClient", "Response bundle doesn't contain a response code");
            this.f136779b.send(6, bundle);
            return;
        }
        int iZzb = zzc.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            zzc.zzn("BillingClient", C3023m0.a(iZzb, "Unable to launch intent for alternative billing only dialog"));
            this.f136779b.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            zzc.zzm("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f136779b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f136778a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f136779b);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            zzc.zzo("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e10);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.RUNTIME_EXCEPTION_ON_LAUNCHING_ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT.zza());
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), zzbo.zzc(e10.getMessage())));
            this.f136779b.send(6, bundle2);
        }
    }
}
