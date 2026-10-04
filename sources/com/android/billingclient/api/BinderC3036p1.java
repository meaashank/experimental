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
import java.util.Objects;

/* JADX INFO: renamed from: com.android.billingclient.api.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3036p1 extends zzah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f136793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f136794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3014k f136795c;

    public /* synthetic */ BinderC3036p1(C3014k c3014k, WeakReference weakReference, X x10, C3063w1 c3063w1) {
        Objects.requireNonNull(c3014k);
        this.f136795c = c3014k;
        this.f136793a = weakReference;
        this.f136794b = new zzbw(c3014k, c3014k.f136742e, x10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzc.zzn("BillingClient", "Response bundle is null.");
            this.f136795c.g1(zzjs.NULL_BUNDLE_RETURNED_BY_PHONESKY, 37, S1.f136537h);
            this.f136794b.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zzc.zzn("BillingClient", "Response bundle doesn't contain a response code.");
            this.f136795c.g1(zzjs.MISSING_RESPONSE_CODE_IN_PHONESKY_BUNDLE, 37, S1.f136537h);
            this.f136794b.send(6, bundle);
            return;
        }
        int iZzb = zzc.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            zzc.zzn("BillingClient", C3023m0.a(iZzb, "Unable to launch intent for launch external link dialog. Response code: "));
            this.f136794b.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            zzc.zzn("BillingClient", "Pending intent not found in response bundle.");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.f136794b.send(6, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f136793a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("launch_external_link_result_receiver", this.f136794b);
            intent.putExtra("launch_external_link_flow_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            zzc.zzo("BillingClient", "Runtime error while launching intent for launch external link dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.RUNTIME_EXCEPTION_ON_LAUNCH_EXTERNAL_LINK_INTENT.zza());
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), zzbo.zzc(e10.getMessage())));
            this.f136794b.send(6, bundle3);
        }
    }
}
