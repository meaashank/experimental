package com.prism.hider.modules;

import android.content.Context;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes6.dex */
public class EnhanceHideModule extends PersonCentralModule {
    public EnhanceHideModule(Context context) {
        super(context);
    }

    @Override // com.prism.hider.modules.PersonCentralModule, com.prism.hider.module.commons.ResLauncherModule
    public int getIconResId() {
        return R.drawable.hide_ic_enhance_hide_active;
    }

    @Override // com.prism.hider.modules.PersonCentralModule, com.prism.hider.module.commons.ResLauncherModule
    public int getNameResId() {
        return R.string.module_name_enhance_hide;
    }
}
