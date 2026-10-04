package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenu extends h {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        k kVar = (k) addInternal(i10, i11, i12, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, kVar);
        kVar.A(navigationSubMenu);
        return navigationSubMenu;
    }
}
