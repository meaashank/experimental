package com.prism.hider.modules;

import android.content.Context;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes6.dex */
public class NoAdsModule extends PersonCentralModule {
    public NoAdsModule(Context context) {
        super(context);
    }

    @Override // com.prism.hider.modules.PersonCentralModule, com.prism.hider.module.commons.ResLauncherModule
    public int getIconResId() {
        return R.drawable.ic_no_ads;
    }

    @Override // com.prism.hider.modules.PersonCentralModule, com.prism.hider.module.commons.ResLauncherModule
    public int getNameResId() {
        return R.string.module_name_no_ads;
    }
}
