package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes3.dex */
public class UnityInitializer {
    private static UnityInitializer unityInitializerInstance;

    public static synchronized UnityInitializer getInstance() {
        try {
            if (unityInitializerInstance == null) {
                unityInitializerInstance = new UnityInitializer();
            }
        } catch (Throwable th) {
            throw th;
        }
        return unityInitializerInstance;
    }

    public void initializeUnityAds(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (UnityAds.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName("AdMob");
        mediationMetaData.setVersion(UnityAds.getVersion());
        mediationMetaData.set("adapter_version", BuildConfig.ADAPTER_VERSION);
        mediationMetaData.commit();
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }
}
