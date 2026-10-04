package com.prism.fusionadsdk.internal.config;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.prism.commons.utils.C3857v;
import java.io.InputStream;
import pb.C5404d;

/* JADX INFO: loaded from: classes6.dex */
public class AdConfigManager {
    private static final String AD_DEFAULT_CONFIG_NAME = "ad_configs";
    private static final String AD_REMOTE_CONFIG_NAME_V2 = "new_ad_configs_v2";
    private static final Gson GSON = new Gson();
    private static AdConfigManager SELF = null;
    private static final String TAG = "765-AdConfigManager";
    private static AdConfigs configs;

    private AdConfigManager() {
    }

    public static AdConfigManager instance() {
        if (SELF == null) {
            synchronized (AdConfigManager.class) {
                try {
                    if (SELF == null) {
                        SELF = new AdConfigManager();
                    }
                } finally {
                }
            }
        }
        return SELF;
    }

    private static AdConfigs parseConfig(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return (AdConfigs) GSON.fromJson(str, new TypeToken<AdConfigs>() { // from class: com.prism.fusionadsdk.internal.config.AdConfigManager.1
                    }.getType());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static AdConfigs readAdDefaultConfig(Context context) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getApplicationContext().getAssets().open(AD_DEFAULT_CONFIG_NAME);
        } catch (Exception unused) {
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpen = null;
        }
        try {
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            AdConfigs config = parseConfig(new String(bArr, "utf8"));
            try {
                inputStreamOpen.close();
            } catch (Throwable unused2) {
            }
            return config;
        } catch (Exception unused3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable unused5) {
                }
            }
            throw th;
        }
    }

    public void applyConfigs(AdConfigs adConfigs) {
        if (adConfigs != null) {
            configs = adConfigs;
        }
    }

    public AdPlaceConfig getAdPlaceConfig(String str) {
        AdPlaceConfig[] adPlaceConfigArr;
        AdConfigs adConfigs = configs;
        if (adConfigs != null && (adPlaceConfigArr = adConfigs.sites) != null) {
            for (AdPlaceConfig adPlaceConfig : adPlaceConfigArr) {
                if (adPlaceConfig.sitesName.equalsIgnoreCase(str)) {
                    return adPlaceConfig;
                }
            }
        }
        return null;
    }

    public AdNetworkInitializerConfig[] getAdnetworkInitializer() {
        if (configs == null) {
            return null;
        }
        C3857v.a(new a());
        return configs.initializer;
    }

    public AdCustomFillSceneConfig getCustomFillScene(String str) {
        AdCustomFillSceneConfig[] adCustomFillSceneConfigArr;
        AdConfigs adConfigs = configs;
        if (adConfigs != null && (adCustomFillSceneConfigArr = adConfigs.customFillConfigs) != null && str != null) {
            for (AdCustomFillSceneConfig adCustomFillSceneConfig : adCustomFillSceneConfigArr) {
                if (adCustomFillSceneConfig != null && str.equalsIgnoreCase(adCustomFillSceneConfig.sceneId)) {
                    return adCustomFillSceneConfig;
                }
            }
        }
        return null;
    }

    public AdCustomFillSceneConfig[] getCustomFillScenes() {
        AdConfigs adConfigs = configs;
        if (adConfigs == null) {
            return null;
        }
        return adConfigs.customFillConfigs;
    }

    public void init(Context context) {
        AdConfigs adConfigsLoadResolvedConfigs = loadResolvedConfigs(context);
        if (adConfigsLoadResolvedConfigs != null) {
            applyConfigs(adConfigsLoadResolvedConfigs);
        }
    }

    public AdConfigs loadResolvedConfigs(Context context) {
        String string;
        try {
            if (C5404d.f().g() && (string = C5404d.f().c().getString(AD_REMOTE_CONFIG_NAME_V2, null)) != null && !string.isEmpty()) {
                AdConfigs config = parseConfig(string);
                if (config != null) {
                    return config;
                }
            }
        } catch (Throwable unused) {
        }
        return readAdDefaultConfig(context);
    }
}
