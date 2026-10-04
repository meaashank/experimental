package com.prism.fusionadsdk;

import J6.f;
import android.content.Context;
import com.prism.fusionadsdk.internal.config.AdConfigManager;
import com.prism.fusionadsdk.internal.config.AdPlaceConfig;
import com.prism.fusionadsdk.internal.config.AdPlaceItems;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class LjAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdPlaceConfig f162251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f162252b;

    public static class Builder {
        private AdPlaceConfig adSiteConfig = new AdPlaceConfig();
        private Context context;
        private boolean inlineNativeOnly;

        public Builder(Context context) {
            this.context = context;
        }

        public LjAdRequest build() {
            String str;
            LjAdRequest ljAdRequest = new LjAdRequest();
            AdPlaceConfig adPlaceConfig = this.adSiteConfig;
            ljAdRequest.f162251a = adPlaceConfig;
            boolean z10 = this.inlineNativeOnly;
            ljAdRequest.f162252b = z10;
            if (z10 && adPlaceConfig != null) {
                AdPlaceConfig adPlaceConfig2 = new AdPlaceConfig();
                AdPlaceConfig adPlaceConfig3 = this.adSiteConfig;
                adPlaceConfig2.sitesName = adPlaceConfig3.sitesName;
                adPlaceConfig2.strategy = adPlaceConfig3.strategy;
                adPlaceConfig2.fillControl = adPlaceConfig3.fillControl;
                ArrayList arrayList = new ArrayList();
                AdPlaceItems[] adPlaceItemsArr = this.adSiteConfig.adid;
                if (adPlaceItemsArr != null) {
                    for (AdPlaceItems adPlaceItems : adPlaceItemsArr) {
                        if (adPlaceItems != null && "advance_native".equalsIgnoreCase(adPlaceItems.type) && (str = adPlaceItems.f162308id) != null && !str.trim().isEmpty()) {
                            arrayList.add(adPlaceItems);
                        }
                    }
                }
                adPlaceConfig2.adid = (AdPlaceItems[]) arrayList.toArray(new AdPlaceItems[0]);
                ljAdRequest.f162251a = adPlaceConfig2;
            }
            return ljAdRequest;
        }

        public Builder inlineNativeOnly() {
            this.inlineNativeOnly = true;
            return this;
        }

        public Builder setAdPlaceName(String str) {
            if (!f.u()) {
                f.t(this.context);
            }
            this.adSiteConfig = AdConfigManager.instance().getAdPlaceConfig(str);
            return this;
        }
    }

    public String toString() {
        if (this.f162251a == null) {
            return "null";
        }
        return "{adSiteConfig:{adid:" + this.f162251a.sitesName + ",freq:" + this.f162251a.strategy + "},}";
    }
}
