package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationSubMenu extends t {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, k kVar) {
        super(context, navigationMenu, kVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public void onItemsChanged(boolean z10) {
        super.onItemsChanged(z10);
        ((h) getParentMenu()).onItemsChanged(z10);
    }
}
