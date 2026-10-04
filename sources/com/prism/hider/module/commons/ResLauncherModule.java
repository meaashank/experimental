package com.prism.hider.module.commons;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ca.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ResLauncherModule extends f {
    private Drawable icon;
    private String name;

    public ResLauncherModule(Context context) {
        this.name = context.getString(getNameResId());
        this.icon = context.getResources().getDrawable(getIconResId());
    }

    @Override // ca.c
    public Drawable getIcon() {
        return this.icon;
    }

    public abstract int getIconResId();

    @Override // ca.c
    public String getName() {
        return this.name;
    }

    public abstract int getNameResId();
}
