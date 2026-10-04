package androidx.appcompat.view.menu;

import B0.C0920d;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC2440b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a implements L0.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f85523F = 1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f85524G = 2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f85525H = 4;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f85526I = 8;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f85527J = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f85533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f85534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f85535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f85536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f85537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Intent f85538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public char f85539r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public char f85541t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f85543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f85544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f85545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f85546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f85547z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f85540s = 4096;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f85542u = 4096;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f85528A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PorterDuff.Mode f85529B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f85530C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f85531D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f85532E = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f85544w = context;
        this.f85533l = i11;
        this.f85534m = i10;
        this.f85535n = i13;
        this.f85536o = charSequence;
    }

    @Override // L0.c
    public AbstractC2440b a() {
        return null;
    }

    @Override // L0.c
    public boolean b() {
        return true;
    }

    @Override // L0.c
    @NonNull
    public L0.c c(AbstractC2440b abstractC2440b) {
        throw new UnsupportedOperationException();
    }

    @Override // L0.c, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // L0.c
    public boolean d() {
        return false;
    }

    public final void e() {
        Drawable drawable = this.f85543v;
        if (drawable != null) {
            if (this.f85530C || this.f85531D) {
                this.f85543v = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f85543v = drawableMutate;
                if (this.f85530C) {
                    drawableMutate.setTintList(this.f85528A);
                }
                if (this.f85531D) {
                    this.f85543v.setTintMode(this.f85529B);
                }
            }
        }
    }

    @Override // L0.c, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f85545x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f85538q;
        if (intent == null) {
            return false;
        }
        this.f85544w.startActivity(intent);
        return true;
    }

    @NonNull
    public L0.c g(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // L0.c, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // L0.c, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f85542u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f85541t;
    }

    @Override // L0.c, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f85546y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f85534m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f85543v;
    }

    @Override // L0.c, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f85528A;
    }

    @Override // L0.c, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f85529B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f85538q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f85533l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // L0.c, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f85540s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f85539r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f85535n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f85536o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f85537p;
        return charSequence != null ? charSequence : this.f85536o;
    }

    @Override // L0.c, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f85547z;
    }

    @NonNull
    public L0.c h(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z10) {
        this.f85532E = (z10 ? 4 : 0) | (this.f85532E & (-5));
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f85532E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f85532E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f85532E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f85532E & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i10) {
        g(i10);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f85541t = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f85532E = (z10 ? 1 : 0) | (this.f85532E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f85532E = (z10 ? 2 : 0) | (this.f85532E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f85532E = (z10 ? 16 : 0) | (this.f85532E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f85543v = drawable;
        e();
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f85528A = colorStateList;
        this.f85530C = true;
        e();
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f85529B = mode;
        this.f85531D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f85538q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f85539r = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f85545x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f85539r = c10;
        this.f85541t = Character.toLowerCase(c11);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f85536o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f85537p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f85532E = (this.f85532E & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        h(view);
        throw null;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f85541t = Character.toLowerCase(c10);
        this.f85542u = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public L0.c setContentDescription(CharSequence charSequence) {
        this.f85546y = charSequence;
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f85539r = c10;
        this.f85540s = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f85536o = this.f85544w.getResources().getString(i10);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public L0.c setTooltipText(CharSequence charSequence) {
        this.f85547z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f85543v = C0920d.getDrawable(this.f85544w, i10);
        e();
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f85539r = c10;
        this.f85540s = KeyEvent.normalizeMetaState(i10);
        this.f85541t = Character.toLowerCase(c11);
        this.f85542u = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // L0.c, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public L0.c setShowAsActionFlags(int i10) {
        return this;
    }
}
