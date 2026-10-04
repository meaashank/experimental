package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class t extends h implements SubMenu {
    private k mItem;
    private h mParentMenu;

    public t(Context context, h hVar, k kVar) {
        super(context);
        this.mParentMenu = hVar;
        this.mItem = kVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean collapseItemActionView(k kVar) {
        return this.mParentMenu.collapseItemActionView(kVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean dispatchMenuItemSelected(@NonNull h hVar, @NonNull MenuItem menuItem) {
        return super.dispatchMenuItemSelected(hVar, menuItem) || this.mParentMenu.dispatchMenuItemSelected(hVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean expandItemActionView(k kVar) {
        return this.mParentMenu.expandItemActionView(kVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public String getActionViewStatesKey() {
        k kVar = this.mItem;
        int i10 = kVar != null ? kVar.f85650l : 0;
        if (i10 == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + com.prism.gaia.server.accounts.b.f166434b0 + i10;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.h
    public h getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.h
    public void setCallback(h.a aVar) {
        this.mParentMenu.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.h, L0.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.mParentMenu.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.mParentMenu.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void setShortcutsVisible(boolean z10) {
        this.mParentMenu.setShortcutsVisible(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.setHeaderIconInt(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.setHeaderTitleInt(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.mItem.setIcon(i10);
        return this;
    }
}
