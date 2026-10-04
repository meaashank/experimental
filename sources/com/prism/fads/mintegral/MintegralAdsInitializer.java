package com.prism.fads.mintegral;

import E6.c;
import S6.a;
import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.prism.fusionadsdkbase.f;
import com.prism.fusionadsdkbase.h;

/* JADX INFO: loaded from: classes.dex */
@a(interstitials = {InterstitialAd.class}, name = "mintegral")
public class MintegralAdsInitializer implements f {
    private static final String TAG = "765-MintegralAdsInitializer";
    private static volatile boolean initialized;
    private static final Object INIT_LOCK = new Object();
    private static volatile c sdkConfig = c.f28387e;

    public static boolean ensureInitialized(Context context, c cVar) {
        if (context == null) {
            return false;
        }
        c cVarH = c.h(cVar, sdkConfig);
        if (!cVarH.f()) {
            return isSdkCompleted();
        }
        synchronized (INIT_LOCK) {
            try {
                sdkConfig = c.h(cVarH, sdkConfig);
                if (initialized || isSdkCompleted()) {
                    initialized = true;
                    return true;
                }
                try {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
                    mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(sdkConfig.f28388a, sdkConfig.f28389b), context);
                    initialized = true;
                    return true;
                } catch (Throwable th) {
                    th.getMessage();
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static c getSdkConfig() {
        return sdkConfig;
    }

    private static boolean isSdkCompleted() {
        try {
            return MBridgeSDKFactory.getMBridgeSDK().getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void setCcpaMetaData(Context context) {
        MBridgeSDKFactory.getMBridgeSDK().setDoNotTrackStatus(false);
    }

    private void setGdprMetaData(Context context) {
        MBridgeSDKFactory.getMBridgeSDK().setConsentStatus(context, 1);
    }

    @Override // com.prism.fusionadsdkbase.f
    public void gatherConsent(Activity activity, h hVar) {
    }

    @Override // com.prism.fusionadsdkbase.f
    public void init(Context context, String str) {
        setGdprMetaData(context);
        setCcpaMetaData(context);
        c cVarO = c.o(str);
        if (cVarO.f()) {
            ensureInitialized(context, cVarO);
        }
    }

    @Override // com.prism.fusionadsdkbase.f
    public void requestPermissionIfNecessary(Activity activity) {
    }
}
