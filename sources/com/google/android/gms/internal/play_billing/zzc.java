package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.fragment.app.G;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.C2983c0;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzn(str, "Unexpected null bundle received!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzn(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(Bundle bundle, String str, @Nullable String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", X2.a.f76746b);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle zzd(BillingResult billingResult, zzjs zzjsVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", billingResult.f136358a);
        bundle.putString("DEBUG_MESSAGE", billingResult.f136360c);
        bundle.putInt("LOG_REASON", zzjsVar.zza());
        return bundle;
    }

    public static Bundle zze(BillingResult billingResult, zzjs zzjsVar, @Nullable String str) {
        Bundle bundleZzd = zzd(billingResult, zzjsVar);
        if (str != null) {
            bundleZzd.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleZzd;
    }

    public static Bundle zzf(BillingFlowParams billingFlowParams, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, @Nullable String str2, long j10, String str3, long j11) {
        int i10;
        Bundle bundle = new Bundle();
        zzc(bundle, X2.a.f76746b, str2, j10);
        bundle.putLong("billingClientTransactionId", j11);
        int i11 = billingFlowParams.f136325d.f136344c;
        if (i11 != 0) {
            bundle.putInt("prorationMode", i11);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f136323b)) {
            bundle.putString("accountId", billingFlowParams.f136323b);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f136324c)) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.f136324c);
        }
        if (billingFlowParams.f136328g) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(billingFlowParams.f136325d.f136342a)) {
            bundle.putString("oldSkuPurchaseToken", billingFlowParams.f136325d.f136342a);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(billingFlowParams.f136325d.f136343b)) {
            bundle.putString("originalExternalTransactionId", billingFlowParams.f136325d.f136343b);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z14 || billingFlowParams.a() != null) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        if (billingFlowParams.a() != null) {
            if (billingFlowParams.a().f136374a != null) {
                bundle.putString("developerBillingLinkUri", billingFlowParams.a().f136374a.toString());
            }
            if (billingFlowParams.a().f136375b != 0) {
                bundle.putInt("developerBillingLaunchMode", billingFlowParams.a().f136375b);
            }
            bundle.putInt("developerBillingProgram", billingFlowParams.a().f136376c);
            if (billingFlowParams.a().f136377d != null) {
                bundle.putString("externalTransactionToken", billingFlowParams.a().f136377d);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (BillingFlowParams.ProductDetailsParams productDetailsParams : billingFlowParams.f136326e) {
            BillingFlowParams.ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams = productDetailsParams.f136330a;
            if (subscriptionProductReplacementParams != null) {
                String str4 = productDetailsParams.f136331b.f136586c;
                zzek zzekVarZza = zzel.zza();
                zzeu zzeuVarZza = zzev.zza();
                zzeuVarZza.zza(zzq(str4, BillingClient.f.f136321x0, str3));
                zzekVarZza.zza(zzeuVarZza);
                zzeu zzeuVarZza2 = zzev.zza();
                zzeuVarZza2.zza(zzq(subscriptionProductReplacementParams.d(), BillingClient.f.f136321x0, str3));
                zzekVarZza.zzb(zzeuVarZza2);
                switch (subscriptionProductReplacementParams.e()) {
                    case 1:
                        i10 = 2;
                        break;
                    case 2:
                        i10 = 3;
                        break;
                    case 3:
                        i10 = 4;
                        break;
                    case 4:
                        i10 = 6;
                        break;
                    case 5:
                        i10 = 7;
                        break;
                    case 6:
                        i10 = 8;
                        break;
                    case 7:
                        i10 = 9;
                        break;
                    default:
                        i10 = 1;
                        break;
                }
                zzekVarZza.zzc(i10);
                arrayList.add((zzel) zzekVarZza.zzi());
            }
        }
        if (!arrayList.isEmpty()) {
            zzem zzemVarZza = zzen.zza();
            zzemVarZza.zza(arrayList);
            bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzen) zzemVarZza.zzi()).zzQ());
        }
        return bundle;
    }

    public static Bundle zzg(String str, @Nullable String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, zza zzaVar, long j10) {
        Bundle bundle = new Bundle();
        zzc(bundle, X2.a.f76746b, str2, j10);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(zzca.zzm(BillingClient.f.f136321x0, BillingClient.f.f136320w0)));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(zzca.zzl(BillingClient.f.f136320w0)));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(zzca.zzl(BillingClient.f.f136320w0)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (zzaVar.zza) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(product.a());
            z11 |= !TextUtils.isEmpty(product.a());
            if (product.f136508c.equals("first_party")) {
                zzbl.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static Bundle zzh(String str, @Nullable String str2, long j10) {
        Bundle bundle = new Bundle();
        zzc(bundle, X2.a.f76746b, str2, j10);
        return bundle;
    }

    public static BillingResult zzi(Intent intent, String str) {
        if (intent != null) {
            BillingResult.Builder builderD = BillingResult.d();
            builderD.setResponseCode(zzb(intent.getExtras(), str));
            builderD.setDebugMessage(zzj(intent.getExtras(), str));
            return builderD.build();
        }
        zzn("BillingHelper", "Got null intent!");
        BillingResult.Builder builderD2 = BillingResult.d();
        builderD2.setResponseCode(6);
        builderD2.setDebugMessage("An internal error occurred.");
        return builderD2.build();
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzn(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzk(int i10) {
        return zzb.zza(i10).toString();
    }

    @Nullable
    public static List zzl(Bundle bundle, Set set) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            C2983c0 c2983c0Zzp = zzp(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"), set);
            if (c2983c0Zzp == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(c2983c0Zzp);
            return arrayList;
        }
        zzm("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            C2983c0 c2983c0Zzp2 = zzp(stringArrayList.get(i10), stringArrayList2.get(i10), set);
            if (c2983c0Zzp2 != null) {
                arrayList.add(c2983c0Zzp2);
            }
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzo(String str, String str2, @Nullable Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Nullable
    private static C2983c0 zzp(String str, String str2, Set set) {
        C2983c0 c2983c0;
        C2983c0 c2983c02 = null;
        if (str == null || str2 == null) {
            zzm("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            c2983c0 = new C2983c0(str, str2);
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            set.isEmpty();
            return c2983c0;
        } catch (JSONException e11) {
            e = e11;
            c2983c02 = c2983c0;
            zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return c2983c02;
        }
    }

    private static String zzq(String str, String str2, String str3) {
        return G.a("subs:", str3, com.prism.gaia.server.accounts.b.f166434b0, str);
    }
}
