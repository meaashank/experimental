package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbw extends ResultReceiver {
    final /* synthetic */ X zza;
    final /* synthetic */ C3014k zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbw(C3014k c3014k, Handler handler, X x10) {
        super(handler);
        this.zza = x10;
        Objects.requireNonNull(c3014k);
        this.zzb = c3014k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, @Nullable Bundle bundle) {
        BillingResult.Builder builderD = BillingResult.d();
        builderD.setResponseCode(i10);
        if (i10 != 0) {
            if (bundle == null) {
                this.zzb.w1(this.zza, S1.f136537h, zzjs.NULL_BUNDLE_IN_LAUNCH_EXTERNAL_LINK_RESULT_RECEIVER, null);
                return;
            }
            builderD.setDebugMessage(zzc.zzj(bundle, "BillingClient"));
            int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            C3014k c3014k = this.zzb;
            zzjs zzjsVarZzb = i11 != 0 ? zzjs.zzb(i11) : zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            BillingResult billingResultBuild = builderD.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i12 = N1.f136462a;
            c3014k.A1(N1.b(zzjsVarZzb, 37, billingResultBuild, string, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        }
        this.zza.a(builderD.build());
    }
}
