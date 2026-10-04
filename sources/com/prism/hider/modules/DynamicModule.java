package com.prism.hider.modules;

import android.graphics.drawable.Drawable;
import ca.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DynamicModule extends f {
    private Drawable icon;
    private String name;
    private String url;

    public DynamicModule(String str, Drawable drawable, String str2) {
        this.name = str;
        this.icon = drawable;
        this.url = str2;
    }

    @Override // ca.c
    public Drawable getIcon() {
        return this.icon;
    }

    @Override // ca.c
    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }
}
