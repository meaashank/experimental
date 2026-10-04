package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC2440b;
import e.T;
import java.lang.reflect.Method;
import l.InterfaceC5127c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class l extends androidx.appcompat.view.menu.c implements MenuItem {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f85666q = "MenuItemWrapper";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final L0.c f85667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Method f85668p;

    public class a extends AbstractC2440b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ActionProvider f85669e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f85669e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC2440b
        public boolean b() {
            return this.f85669e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC2440b
        public View d() {
            return this.f85669e.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC2440b
        public boolean f() {
            return this.f85669e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC2440b
        public void g(SubMenu subMenu) {
            this.f85669e.onPrepareSubMenu(l.this.f(subMenu));
        }
    }

    @T(16)
    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public AbstractC2440b.InterfaceC0287b f85671g;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC2440b
        public boolean c() {
            return this.f85669e.isVisible();
        }

        @Override // androidx.core.view.AbstractC2440b
        public View e(MenuItem menuItem) {
            return this.f85669e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC2440b
        public boolean h() {
            return this.f85669e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC2440b
        public void i() {
            this.f85669e.refreshVisibility();
        }

        @Override // androidx.core.view.AbstractC2440b
        public void l(AbstractC2440b.InterfaceC0287b interfaceC0287b) {
            this.f85671g = interfaceC0287b;
            this.f85669e.setVisibilityListener(interfaceC0287b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC2440b.InterfaceC0287b interfaceC0287b = this.f85671g;
            if (interfaceC0287b != null) {
                interfaceC0287b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public static class c extends FrameLayout implements InterfaceC5127c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f85673a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f85673a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f85673a;
        }

        @Override // l.InterfaceC5127c
        public void onActionViewCollapsed() {
            this.f85673a.onActionViewCollapsed();
        }

        @Override // l.InterfaceC5127c
        public void onActionViewExpanded() {
            this.f85673a.onActionViewExpanded();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f85674a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f85674a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f85674a.onMenuItemActionCollapse(l.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f85674a.onMenuItemActionExpand(l.this.e(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f85676a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f85676a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f85676a.onMenuItemClick(l.this.e(menuItem));
        }
    }

    public l(Context context, L0.c cVar) {
        super(context);
        if (cVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f85667o = cVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f85667o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f85667o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2440b abstractC2440bA = this.f85667o.a();
        if (abstractC2440bA instanceof a) {
            return ((a) abstractC2440bA).f85669e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f85667o.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f85667o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f85667o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f85667o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f85667o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f85667o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f85667o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f85667o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f85667o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f85667o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f85667o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f85667o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f85667o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f85667o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f85667o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f85667o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f85667o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f85667o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f85667o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f85667o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f85667o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f85667o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f85667o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f85667o.isVisible();
    }

    public void j(boolean z10) {
        try {
            if (this.f85668p == null) {
                this.f85668p = this.f85667o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f85668p.invoke(this.f85667o, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w(f85666q, "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f85558l, actionProvider);
        L0.c cVar = this.f85667o;
        if (actionProvider == null) {
            bVar = null;
        }
        cVar.c(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f85667o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f85667o.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f85667o.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f85667o.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f85667o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f85667o.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f85667o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f85667o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f85667o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f85667o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f85667o.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f85667o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f85667o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f85667o.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f85667o.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f85667o.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f85667o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f85667o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f85667o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f85667o.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f85667o.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f85667o.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f85667o.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f85667o.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f85667o.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f85667o.setActionView(i10);
        View actionView = this.f85667o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f85667o.setActionView(new c(actionView));
        }
        return this;
    }
}
