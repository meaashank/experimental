package com.gaia.ngallery.modules;

import N4.d;
import N4.l;
import android.app.Activity;
import android.content.Context;
import com.prism.hider.module.commons.ResLauncherModule;

/* JADX INFO: loaded from: classes3.dex */
public class GalleryModule extends ResLauncherModule {
    public GalleryModule(Context context) {
        super(context);
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getIconResId() {
        return l.g.f61547F2;
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getNameResId() {
        return l.p.f63063j4;
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        d.D(activity);
    }
}
