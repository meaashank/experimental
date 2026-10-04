package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2440b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f111903d = "ActionProvider(support)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f111905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0287b f111906c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0287b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC2440b(@NonNull Context context) {
        this.f111904a = context;
    }

    @NonNull
    public Context a() {
        return this.f111904a;
    }

    public boolean b() {
        return this instanceof androidx.appcompat.widget.N;
    }

    public boolean c() {
        return true;
    }

    @NonNull
    public abstract View d();

    @NonNull
    public View e(@NonNull MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(@NonNull SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f111906c == null || !h()) {
            return;
        }
        this.f111906c.onActionProviderVisibilityChanged(c());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f111906c = null;
        this.f111905b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k(@Nullable a aVar) {
        this.f111905b = aVar;
    }

    public void l(@Nullable InterfaceC0287b interfaceC0287b) {
        if (this.f111906c != null && interfaceC0287b != null) {
            Log.w(f111903d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f111906c = interfaceC0287b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
        a aVar = this.f111905b;
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
