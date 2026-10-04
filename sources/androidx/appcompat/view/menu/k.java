package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.p;
import androidx.core.view.AbstractC2440b;
import g.C4426a;
import h.C4472a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class k implements L0.c {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f85625Q = "MenuItemImpl";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f85626R = 3;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f85627S = 1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f85628T = 2;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f85629U = 4;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f85630V = 8;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f85631W = 16;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f85632X = 32;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f85633Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Runnable f85634A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f85635B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f85636C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CharSequence f85637D;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f85644K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View f85645L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public AbstractC2440b f85646M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f85647N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f85649P;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f85650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f85651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f85652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f85653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f85654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f85655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Intent f85656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public char f85657s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public char f85659u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f85661w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f85663y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public t f85664z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f85658t = 4096;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f85660v = 4096;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f85662x = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f85638E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public PorterDuff.Mode f85639F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f85640G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f85641H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f85642I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f85643J = 16;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f85648O = false;

    public class a implements AbstractC2440b.InterfaceC0287b {
        public a() {
        }

        @Override // androidx.core.view.AbstractC2440b.InterfaceC0287b
        public void onActionProviderVisibilityChanged(boolean z10) {
            k kVar = k.this;
            kVar.f85663y.onItemVisibleChanged(kVar);
        }
    }

    public k(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f85663y = hVar;
        this.f85650l = i11;
        this.f85651m = i10;
        this.f85652n = i12;
        this.f85653o = i13;
        this.f85654p = charSequence;
        this.f85644K = i14;
    }

    public static void f(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public void A(t tVar) {
        this.f85664z = tVar;
        tVar.setHeaderTitle(this.f85654p);
    }

    public boolean B(boolean z10) {
        int i10 = this.f85643J;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f85643J = i11;
        return i10 != i11;
    }

    public boolean C() {
        return this.f85663y.getOptionalIconsVisible();
    }

    public boolean D() {
        return this.f85663y.isShortcutsVisible() && j() != 0;
    }

    public boolean E() {
        return (this.f85644K & 4) == 4;
    }

    @Override // L0.c
    public AbstractC2440b a() {
        return this.f85646M;
    }

    @Override // L0.c
    public boolean b() {
        return (this.f85644K & 2) == 2;
    }

    @Override // L0.c
    @NonNull
    public L0.c c(AbstractC2440b abstractC2440b) {
        AbstractC2440b abstractC2440b2 = this.f85646M;
        if (abstractC2440b2 != null) {
            abstractC2440b2.j();
        }
        this.f85645L = null;
        this.f85646M = abstractC2440b;
        this.f85663y.onItemsChanged(true);
        AbstractC2440b abstractC2440b3 = this.f85646M;
        if (abstractC2440b3 != null) {
            abstractC2440b3.l(new a());
        }
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f85644K & 8) == 0) {
            return false;
        }
        if (this.f85645L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f85647N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f85663y.collapseItemActionView(this);
        }
        return false;
    }

    @Override // L0.c
    public boolean d() {
        return (b() || q()) ? false : true;
    }

    public void e() {
        this.f85663y.onItemActionRequestChanged(this);
    }

    @Override // L0.c, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f85647N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f85663y.expandItemActionView(this);
        }
        return false;
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.f85642I && (this.f85640G || this.f85641H)) {
            drawable = drawable.mutate();
            if (this.f85640G) {
                drawable.setTintList(this.f85638E);
            }
            if (this.f85641H) {
                drawable.setTintMode(this.f85639F);
            }
            this.f85642I = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // L0.c, android.view.MenuItem
    public View getActionView() {
        View view = this.f85645L;
        if (view != null) {
            return view;
        }
        AbstractC2440b abstractC2440b = this.f85646M;
        if (abstractC2440b == null) {
            return null;
        }
        View viewE = abstractC2440b.e(this);
        this.f85645L = viewE;
        return viewE;
    }

    @Override // L0.c, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f85660v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f85659u;
    }

    @Override // L0.c, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f85636C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f85651m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f85661w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f85662x == 0) {
            return null;
        }
        Drawable drawableB = C4472a.b(this.f85663y.getContext(), this.f85662x);
        this.f85662x = 0;
        this.f85661w = drawableB;
        return g(drawableB);
    }

    @Override // L0.c, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f85638E;
    }

    @Override // L0.c, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f85639F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f85656r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f85650l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f85649P;
    }

    @Override // L0.c, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f85658t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f85657s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f85652n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f85664z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f85654p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f85655q;
        return charSequence != null ? charSequence : this.f85654p;
    }

    @Override // L0.c, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f85637D;
    }

    public Runnable h() {
        return this.f85634A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f85664z != null;
    }

    public int i() {
        return this.f85653o;
    }

    @Override // L0.c, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f85648O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f85643J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f85643J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f85643J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2440b abstractC2440b = this.f85646M;
        return (abstractC2440b == null || !abstractC2440b.h()) ? (this.f85643J & 8) == 0 : (this.f85643J & 8) == 0 && this.f85646M.c();
    }

    public char j() {
        return this.f85663y.isQwertyMode() ? this.f85659u : this.f85657s;
    }

    public String k() {
        char cJ = j();
        if (cJ == 0) {
            return "";
        }
        Resources resources = this.f85663y.getContext().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f85663y.getContext()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C4426a.k.f201390r));
        }
        int i10 = this.f85663y.isQwertyMode() ? this.f85660v : this.f85658t;
        f(sb2, i10, 65536, resources.getString(C4426a.k.f201386n));
        f(sb2, i10, 4096, resources.getString(C4426a.k.f201382j));
        f(sb2, i10, 2, resources.getString(C4426a.k.f201381i));
        f(sb2, i10, 1, resources.getString(C4426a.k.f201387o));
        f(sb2, i10, 4, resources.getString(C4426a.k.f201389q));
        f(sb2, i10, 8, resources.getString(C4426a.k.f201385m));
        if (cJ == '\b') {
            sb2.append(resources.getString(C4426a.k.f201383k));
        } else if (cJ == '\n') {
            sb2.append(resources.getString(C4426a.k.f201384l));
        } else if (cJ != ' ') {
            sb2.append(cJ);
        } else {
            sb2.append(resources.getString(C4426a.k.f201388p));
        }
        return sb2.toString();
    }

    public CharSequence l(p.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? this.f85654p : getTitleCondensed();
    }

    public boolean m() {
        AbstractC2440b abstractC2440b;
        if ((this.f85644K & 8) != 0) {
            if (this.f85645L == null && (abstractC2440b = this.f85646M) != null) {
                this.f85645L = abstractC2440b.e(this);
            }
            if (this.f85645L != null) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f85635B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        h hVar = this.f85663y;
        if (hVar.dispatchMenuItemSelected(hVar, this)) {
            return true;
        }
        Runnable runnable = this.f85634A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f85656r != null) {
            try {
                this.f85663y.getContext().startActivity(this.f85656r);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e(f85625Q, "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC2440b abstractC2440b = this.f85646M;
        return abstractC2440b != null && abstractC2440b.f();
    }

    public boolean o() {
        return (this.f85643J & 32) == 32;
    }

    public boolean p() {
        return (this.f85643J & 4) != 0;
    }

    public boolean q() {
        return (this.f85644K & 1) == 1;
    }

    @NonNull
    public L0.c r(int i10) {
        Context context = this.f85663y.getContext();
        s(LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @NonNull
    public L0.c s(View view) {
        int i10;
        this.f85645L = view;
        this.f85646M = null;
        if (view != null && view.getId() == -1 && (i10 = this.f85650l) > 0) {
            view.setId(i10);
        }
        this.f85663y.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i10) {
        r(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f85659u == c10) {
            return this;
        }
        this.f85659u = Character.toLowerCase(c10);
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f85643J;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f85643J = i11;
        if (i10 != i11) {
            this.f85663y.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f85643J & 4) != 0) {
            this.f85663y.setExclusiveItemChecked(this);
            return this;
        }
        v(z10);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f85643J |= 16;
        } else {
            this.f85643J &= -17;
        }
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f85662x = 0;
        this.f85661w = drawable;
        this.f85642I = true;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f85638E = colorStateList;
        this.f85640G = true;
        this.f85642I = true;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f85639F = mode;
        this.f85641H = true;
        this.f85642I = true;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f85656r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f85657s == c10) {
            return this;
        }
        this.f85657s = c10;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f85647N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f85635B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f85657s = c10;
        this.f85659u = Character.toLowerCase(c11);
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f85644K = i10;
        this.f85663y.onItemActionRequestChanged(this);
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f85654p = charSequence;
        this.f85663y.onItemsChanged(false);
        t tVar = this.f85664z;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f85655q = charSequence;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (B(z10)) {
            this.f85663y.onItemVisibleChanged(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f85648O = z10;
        this.f85663y.onItemsChanged(false);
    }

    public String toString() {
        CharSequence charSequence = this.f85654p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.f85634A = runnable;
        return this;
    }

    public void v(boolean z10) {
        int i10 = this.f85643J;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f85643J = i11;
        if (i10 != i11) {
            this.f85663y.onItemsChanged(false);
        }
    }

    public void w(boolean z10) {
        this.f85643J = (z10 ? 4 : 0) | (this.f85643J & (-5));
    }

    public void x(boolean z10) {
        if (z10) {
            this.f85643J |= 32;
        } else {
            this.f85643J &= -33;
        }
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f85649P = contextMenuInfo;
    }

    @NonNull
    public L0.c z(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        s(view);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public L0.c setContentDescription(CharSequence charSequence) {
        this.f85636C = charSequence;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public L0.c setTooltipText(CharSequence charSequence) {
        this.f85637D = charSequence;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f85659u == c10 && this.f85660v == i10) {
            return this;
        }
        this.f85659u = Character.toLowerCase(c10);
        this.f85660v = KeyEvent.normalizeMetaState(i10);
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f85657s == c10 && this.f85658t == i10) {
            return this;
        }
        this.f85657s = c10;
        this.f85658t = KeyEvent.normalizeMetaState(i10);
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f85657s = c10;
        this.f85658t = KeyEvent.normalizeMetaState(i10);
        this.f85659u = Character.toLowerCase(c11);
        this.f85660v = KeyEvent.normalizeMetaState(i11);
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f85661w = null;
        this.f85662x = i10;
        this.f85642I = true;
        this.f85663y.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        setTitle(this.f85663y.getContext().getString(i10));
        return this;
    }
}
