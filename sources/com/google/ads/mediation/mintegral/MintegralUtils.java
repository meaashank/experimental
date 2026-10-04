package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.common.AgeRestrictedTreatmentUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MintegralUtils {
    public static final String TAG = "MintegralUtils";

    public static void configureMintegralPrivacy(Context context, MBridgeSDK mBridgeSDK) {
        int tagForChildDirectedTreatment = MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment();
        int tagForUnderAgeOfConsent = MobileAds.getRequestConfiguration().getTagForUnderAgeOfConsent();
        boolean z10 = AgeRestrictedTreatmentUtils.runtimeGmaSdkSupportsChildAgeRestrictedTreatment() && MobileAds.getRequestConfiguration().getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (tagForChildDirectedTreatment == 1 || tagForUnderAgeOfConsent == 1 || z10) {
            mBridgeSDK.setCoppaStatus(context, true);
        } else if (tagForChildDirectedTreatment == 0 || tagForUnderAgeOfConsent == 0) {
            mBridgeSDK.setCoppaStatus(context, false);
        }
    }

    public static int convertDipToPixel(@NonNull Context context, float f10) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f10 + 0.5f, resources.getDisplayMetrics());
    }

    public static String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    public static List<MintegralSlotIdentifier> getMintegralSlotIdentifiers(RtbSignalData rtbSignalData) {
        ArrayList arrayList = new ArrayList();
        for (MediationConfiguration mediationConfiguration : rtbSignalData.getConfigurations()) {
            String string = mediationConfiguration.getServerParameters().getString(MintegralConstants.AD_UNIT_ID);
            String string2 = mediationConfiguration.getServerParameters().getString(MintegralConstants.PLACEMENT_ID);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                arrayList.add(new MintegralSlotIdentifier(string, string2));
            }
        }
        return arrayList;
    }

    public static String getSdkVersion() {
        return MBConfiguration.SDK_VERSION;
    }

    public static boolean shouldMuteAudio(@NonNull Bundle bundle) {
        return bundle.getBoolean("mute_audio");
    }

    @Nullable
    public static AdError validateMintegralAdLoadParams(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(TAG, adErrorCreateAdapterError.toString());
            return adErrorCreateAdapterError;
        }
        if (!TextUtils.isEmpty(str2)) {
            return null;
        }
        AdError adErrorCreateAdapterError2 = MintegralConstants.createAdapterError(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
        Log.e(TAG, adErrorCreateAdapterError2.toString());
        return adErrorCreateAdapterError2;
    }

    @Nullable
    public static AdError validateMintegralAdLoadParams(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        AdError adErrorValidateMintegralAdLoadParams = validateMintegralAdLoadParams(str, str2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            return adErrorValidateMintegralAdLoadParams;
        }
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(103, "Missing or invalid Mintegral bidding signal in this ad request.");
        Log.w(TAG, adErrorCreateAdapterError.toString());
        return adErrorCreateAdapterError;
    }
}
