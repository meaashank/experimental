package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import e.InterfaceC4345t;
import e.T;
import e.a0;
import g.C4426a;

/* JADX INFO: renamed from: l.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5128d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f220814f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f220816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f220817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f220818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f220819e;

    /* JADX INFO: renamed from: l.d$a */
    @T(17)
    public static class a {
        @InterfaceC4345t
        public static Context a(C5128d c5128d, Configuration configuration) {
            return c5128d.createConfigurationContext(configuration);
        }
    }

    public C5128d() {
        super(null);
    }

    @T(26)
    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f220814f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f220814f = configuration2;
        }
        return configuration.equals(f220814f);
    }

    public void a(Configuration configuration) {
        if (this.f220819e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f220818d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f220818d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f220819e == null) {
            Configuration configuration = this.f220818d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f220819e = super.getResources();
            } else {
                this.f220819e = a.a(this, this.f220818d).getResources();
            }
        }
        return this.f220819e;
    }

    public int c() {
        return this.f220815a;
    }

    public final void d() {
        boolean z10 = this.f220816b == null;
        if (z10) {
            this.f220816b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f220816b.setTo(theme);
            }
        }
        f(this.f220816b, this.f220815a, z10);
    }

    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f220817c == null) {
            this.f220817c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f220817c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f220816b;
        if (theme != null) {
            return theme;
        }
        if (this.f220815a == 0) {
            this.f220815a = C4426a.l.f201579c4;
        }
        d();
        return this.f220816b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f220815a != i10) {
            this.f220815a = i10;
            d();
        }
    }

    public C5128d(Context context, @a0 int i10) {
        super(context);
        this.f220815a = i10;
    }

    public C5128d(Context context, Resources.Theme theme) {
        super(context);
        this.f220816b = theme;
    }
}
