package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.C1484a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.core.app.Y;
import androidx.core.os.C2417p;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.d;
import e.InterfaceC4335i;
import e.InterfaceC4340n;
import e.a0;
import l.AbstractC5126b;

/* JADX INFO: renamed from: androidx.appcompat.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC1486c extends androidx.fragment.app.r implements InterfaceC1487d, Y.a, C1484a.c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC1490g mDelegate;
    private Resources mResources;

    /* JADX INFO: renamed from: androidx.appcompat.app.c$a */
    public class a implements d.c {
        public a() {
        }

        @Override // androidx.savedstate.d.c
        @NonNull
        public Bundle a() {
            Bundle bundle = new Bundle();
            ActivityC1486c.this.getDelegate().getClass();
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.c$b */
    public class b implements b.c {
        public b() {
        }

        @Override // b.c
        public void a(@NonNull Context context) {
            AbstractC1490g delegate = ActivityC1486c.this.getDelegate();
            delegate.C();
            delegate.I(ActivityC1486c.this.getSavedStateRegistry().b(ActivityC1486c.DELEGATE_TAG));
        }
    }

    public ActivityC1486c() {
        R0();
    }

    public final void R0() {
        getSavedStateRegistry().j(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    public final void S0() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(getWindow().getDecorView(), this);
    }

    public final boolean T0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.k, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        S0();
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().k(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ActivityC2390m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.K(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@e.C int i10) {
        return (T) getDelegate().q(i10);
    }

    @NonNull
    public AbstractC1490g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC1490g.l(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.C1484a.c
    @Nullable
    public C1484a.b getDrawerToggleDelegate() {
        return getDelegate().u();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().x();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null) {
            g0.d();
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public ActionBar getSupportActionBar() {
        return getDelegate().A();
    }

    @Override // androidx.core.app.Y.a
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.z.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().D();
    }

    @Override // androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().H(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull Y y10) {
        y10.g(this);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().J();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (T0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onLocalesChanged(@NonNull C2417p c2417p) {
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.o() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.k, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().K(bundle);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().L();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull Y y10) {
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().N();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().O();
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        Y y10 = new Y(this);
        onCreateSupportNavigateUpTaskStack(y10);
        onPrepareSupportNavigateUpTaskStack(y10);
        y10.x(null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().f0(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC1487d
    @Nullable
    public AbstractC5126b onWindowStartingSupportActionMode(@NonNull AbstractC5126b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.L()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.k, android.app.Activity
    public void setContentView(@e.G int i10) {
        S0();
        getDelegate().V(i10);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().d0(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@a0 int i10) {
        super.setTheme(i10);
        getDelegate().e0(i10);
    }

    @Nullable
    public AbstractC5126b startSupportActionMode(@NonNull AbstractC5126b.a aVar) {
        return getDelegate().g0(aVar);
    }

    @Override // androidx.fragment.app.r
    public void supportInvalidateOptionsMenu() {
        getDelegate().D();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().R(i10);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @InterfaceC4340n
    public ActivityC1486c(@e.G int i10) {
        super(i10);
        R0();
    }

    @Override // androidx.activity.k, android.app.Activity
    public void setContentView(View view) {
        S0();
        getDelegate().W(view);
    }

    @Override // androidx.activity.k, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        S0();
        getDelegate().X(view, layoutParams);
    }

    @Override // androidx.appcompat.app.InterfaceC1487d
    @InterfaceC4335i
    public void onSupportActionModeFinished(@NonNull AbstractC5126b abstractC5126b) {
    }

    @Override // androidx.appcompat.app.InterfaceC1487d
    @InterfaceC4335i
    public void onSupportActionModeStarted(@NonNull AbstractC5126b abstractC5126b) {
    }
}
