package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeq;
import com.google.android.gms.internal.play_billing.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class W1 {
    public static BillingResult a(Bundle bundle, String str, int i10, O1 o12, int i11) {
        if (!bundle.containsKey("BILLING_RESULT")) {
            zzc.zzn(str, "delegateToBackendAsync does not contain a billing result in the response");
            zzjs zzjsVar = zzjs.MISSING_BILLING_RESULT_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult = S1.f136537h;
            U1.a(zzjsVar, billingResult, o12, i10, i11);
            return billingResult;
        }
        try {
            byte[] byteArray = bundle.getByteArray("BILLING_RESULT");
            if (byteArray == null) {
                throw new Exception("Billing result is null");
            }
            zzeq zzeqVarZzc = zzeq.zzc(byteArray);
            BillingResult.Builder builderD = BillingResult.d();
            builderD.setResponseCode(zzeqVarZzc.zza());
            builderD.setDebugMessage(zzeqVarZzc.zze());
            BillingResult billingResultBuild = builderD.build();
            if (billingResultBuild.f136358a != 0) {
                U1.a(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, billingResultBuild, o12, i10, i11);
                return billingResultBuild;
            }
            if (bundle.containsKey("RESPONSE_DATA")) {
                return billingResultBuild;
            }
            zzc.zzn(str, "delegateToBackendAsync returned a bundle with neither an error nor response data");
            zzjs zzjsVar2 = zzjs.MISSING_RESPONSE_DATA_IN_DELEGATE_TO_BACKEND_RESPONSE;
            BillingResult billingResult2 = S1.f136537h;
            U1.a(zzjsVar2, billingResult2, o12, i10, i11);
            return billingResult2;
        } catch (Exception e10) {
            zzc.zzo(str, "Failed parsing BillingResult.", e10);
            zzjs zzjsVar3 = zzjs.ERROR_DECODING_DELEGATE_TO_BACKEND_BILLING_RESULT;
            BillingResult billingResult3 = S1.f136537h;
            U1.b(zzjsVar3, billingResult3, o12, i10, i11, N1.a(e10));
            return billingResult3;
        }
    }
}
