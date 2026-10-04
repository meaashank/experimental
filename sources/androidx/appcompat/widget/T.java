package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class T extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f86223c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<WeakReference<T>> f86224d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f86225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f86226b;

    public T(@NonNull Context context) {
        super(context);
        g0.d();
        this.f86225a = new V(this, context.getResources());
        this.f86226b = null;
    }

    public static boolean a(@NonNull Context context) {
        if (!(context instanceof T) && !(context.getResources() instanceof V) && !(context.getResources() instanceof g0)) {
            g0.d();
        }
        return false;
    }

    public static Context b(@NonNull Context context) {
        a(context);
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f86225a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f86225a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f86226b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f86226b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
