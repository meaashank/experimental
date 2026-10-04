package com.unity3d.services.core.device.reader;

import Z3.f;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceInfoReaderPrivacyBuilder extends DeviceInfoReaderBuilder {
    public DeviceInfoReaderPrivacyBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    private JsonFlattenerRules getPrivacyRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList("privacy", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "unity", "pipl"), Collections.singletonList("value"), Arrays.asList(CampaignEx.JSON_KEY_ST_TS, f.f79418o, "mode"));
    }

    @Override // com.unity3d.services.core.device.reader.DeviceInfoReaderBuilder
    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        return new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithStorageInfo(buildWithRequestType(InitRequestType.PRIVACY), getPrivacyRequestStorageRules(), storage, StorageManager.getStorage(StorageManager.StorageType.PUBLIC)), new DeviceInfoReaderFilterProvider(storage).getFilterList());
    }
}
