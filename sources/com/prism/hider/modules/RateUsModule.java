package com.prism.hider.modules;

import android.app.Activity;
import android.content.Context;
import com.app.hider.master.promax.R;
import com.prism.hider.module.commons.ResLauncherModule;
import com.prism.hider.ui.C4211g0;

/* JADX INFO: loaded from: classes6.dex */
public class RateUsModule extends ResLauncherModule {
    public RateUsModule(Context context) {
        super(context);
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getIconResId() {
        return R.drawable.hider_ic_module_rateus;
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getNameResId() {
        return R.string.module_name_rateus;
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        C4211g0.d(activity);
    }
}
