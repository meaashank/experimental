package com.prism.hider.modules;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.app.hider.master.promax.R;
import com.prism.hider.module.commons.ResLauncherModule;
import com.prism.hider.ui.HowToHideActivity;

/* JADX INFO: loaded from: classes6.dex */
public class HowToHideModule extends ResLauncherModule {
    public HowToHideModule(Context context) {
        super(context);
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getIconResId() {
        return R.drawable.hider_ic_module_howtohide;
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getNameResId() {
        return R.string.module_name_howtohide;
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) HowToHideActivity.class));
    }
}
