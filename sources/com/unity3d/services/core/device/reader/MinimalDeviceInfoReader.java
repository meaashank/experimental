package com.unity3d.services.core.device.reader;

import com.bytedance.sdk.openadsdk.activity.b;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap mapA = b.a("platform", "android");
        mapA.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, Integer.valueOf(SdkProperties.getVersionCode()));
        mapA.put("sdkVersionName", SdkProperties.getVersionName());
        mapA.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        mapA.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        mapA.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
        mapA.put("gameId", ClientProperties.getGameId());
        return mapA;
    }
}
