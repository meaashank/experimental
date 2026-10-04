package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.B;
import androidx.appcompat.app.C1484a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.collection.C1528e;
import androidx.core.os.C2403b;
import androidx.core.os.C2417p;
import e.InterfaceC4330d;
import e.InterfaceC4335i;
import e.InterfaceC4345t;
import e.N;
import e.T;
import e.a0;
import e.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Objects;
import l.AbstractC5126b;

/* JADX INFO: renamed from: androidx.appcompat.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f85461a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f85462b = "AppCompatDelegate";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85464d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f85465e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f85466f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85467g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85468h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85469i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f85470j = -100;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f85479s = 108;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f85480t = 109;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f85481u = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static B.a f85463c = new B.a(new B.b());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f85471k = -100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C2417p f85472l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static C2417p f85473m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f85474n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f85475o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1528e<WeakReference<AbstractC1490g>> f85476p = new C1528e<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f85477q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f85478r = new Object();

    /* JADX INFO: renamed from: androidx.appcompat.app.g$a */
    @T(24)
    public static class a {
        @InterfaceC4345t
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.g$b */
    @T(33)
    public static class b {
        @InterfaceC4345t
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @InterfaceC4345t
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.g$c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static boolean E(Context context) {
        if (f85474n == null) {
            try {
                Bundle bundle = z.a(context).metaData;
                if (bundle != null) {
                    f85474n = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d(f85462b, "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f85474n = Boolean.FALSE;
            }
        }
        return f85474n.booleanValue();
    }

    public static boolean F() {
        return g0.b();
    }

    public static void P(@NonNull AbstractC1490g abstractC1490g) {
        synchronized (f85477q) {
            Q(abstractC1490g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(@NonNull AbstractC1490g abstractC1490g) {
        synchronized (f85477q) {
            try {
                C1528e<WeakReference<AbstractC1490g>> c1528e = f85476p;
                c1528e.getClass();
                C1528e.a aVar = new C1528e.a();
                while (aVar.hasNext()) {
                    AbstractC1490g abstractC1490g2 = (AbstractC1490g) ((WeakReference) aVar.next()).get();
                    if (abstractC1490g2 == abstractC1490g || abstractC1490g2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f0
    public static void S() {
        f85472l = null;
        f85473m = null;
    }

    @N(markerClass = {C2403b.InterfaceC0282b.class})
    public static void T(@NonNull C2417p c2417p) {
        Objects.requireNonNull(c2417p);
        if (C2403b.k()) {
            Object objW = w();
            if (objW != null) {
                b.b(objW, a.a(c2417p.f111302a.a()));
                return;
            }
            return;
        }
        if (c2417p.equals(f85472l)) {
            return;
        }
        synchronized (f85477q) {
            f85472l = c2417p;
            h();
        }
    }

    public static void U(boolean z10) {
        g0.c(z10);
    }

    public static void Y(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d(f85462b, "setDefaultNightMode() called with an unknown mode");
        } else if (f85471k != i10) {
            f85471k = i10;
            g();
        }
    }

    public static /* synthetic */ void a(Context context) {
        B.c(context);
        f85475o = true;
    }

    @f0
    public static void a0(boolean z10) {
        f85474n = Boolean.valueOf(z10);
    }

    public static void c(@NonNull AbstractC1490g abstractC1490g) {
        synchronized (f85477q) {
            Q(abstractC1490g);
            f85476p.add(new WeakReference<>(abstractC1490g));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g() {
        synchronized (f85477q) {
            try {
                C1528e<WeakReference<AbstractC1490g>> c1528e = f85476p;
                c1528e.getClass();
                C1528e.a aVar = new C1528e.a();
                while (aVar.hasNext()) {
                    AbstractC1490g abstractC1490g = (AbstractC1490g) ((WeakReference) aVar.next()).get();
                    if (abstractC1490g != null) {
                        abstractC1490g.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h() {
        C1528e<WeakReference<AbstractC1490g>> c1528e = f85476p;
        c1528e.getClass();
        C1528e.a aVar = new C1528e.a();
        while (aVar.hasNext()) {
            AbstractC1490g abstractC1490g = (AbstractC1490g) ((WeakReference) aVar.next()).get();
            if (abstractC1490g != null) {
                abstractC1490g.e();
            }
        }
    }

    @N(markerClass = {C2403b.InterfaceC0282b.class})
    public static void h0(final Context context) {
        if (E(context)) {
            if (C2403b.k()) {
                if (f85475o) {
                    return;
                }
                f85463c.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1490g.a(context);
                    }
                });
                return;
            }
            synchronized (f85478r) {
                try {
                    C2417p c2417p = f85472l;
                    if (c2417p == null) {
                        if (f85473m == null) {
                            f85473m = C2417p.c(B.b(context));
                        }
                        if (f85473m.f111302a.isEmpty()) {
                        } else {
                            f85472l = f85473m;
                        }
                    } else if (!c2417p.equals(f85473m)) {
                        C2417p c2417p2 = f85472l;
                        f85473m = c2417p2;
                        B.a(context, c2417p2.f111302a.a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @NonNull
    public static AbstractC1490g l(@NonNull Activity activity, @Nullable InterfaceC1487d interfaceC1487d) {
        return new AppCompatDelegateImpl(activity, null, interfaceC1487d, activity);
    }

    @NonNull
    public static AbstractC1490g m(@NonNull Dialog dialog, @Nullable InterfaceC1487d interfaceC1487d) {
        return new AppCompatDelegateImpl(dialog, interfaceC1487d);
    }

    @NonNull
    public static AbstractC1490g n(@NonNull Context context, @NonNull Activity activity, @Nullable InterfaceC1487d interfaceC1487d) {
        return new AppCompatDelegateImpl(context, null, interfaceC1487d, activity);
    }

    @NonNull
    public static AbstractC1490g o(@NonNull Context context, @NonNull Window window, @Nullable InterfaceC1487d interfaceC1487d) {
        return new AppCompatDelegateImpl(context, window, interfaceC1487d, context);
    }

    @NonNull
    @InterfaceC4330d
    @N(markerClass = {C2403b.InterfaceC0282b.class})
    public static C2417p r() {
        if (C2403b.k()) {
            Object objW = w();
            if (objW != null) {
                return C2417p.o(b.a(objW));
            }
        } else {
            C2417p c2417p = f85472l;
            if (c2417p != null) {
                return c2417p;
            }
        }
        return C2417p.g();
    }

    public static int t() {
        return f85471k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @T(33)
    public static Object w() {
        Context contextS;
        C1528e<WeakReference<AbstractC1490g>> c1528e = f85476p;
        c1528e.getClass();
        C1528e.a aVar = new C1528e.a();
        while (aVar.hasNext()) {
            AbstractC1490g abstractC1490g = (AbstractC1490g) ((WeakReference) aVar.next()).get();
            if (abstractC1490g != null && (contextS = abstractC1490g.s()) != null) {
                return contextS.getSystemService(N7.a.f64751e);
            }
        }
        return null;
    }

    @Nullable
    public static C2417p y() {
        return f85472l;
    }

    @Nullable
    public static C2417p z() {
        return f85473m;
    }

    @Nullable
    public abstract ActionBar A();

    public abstract boolean B(int i10);

    public abstract void C();

    public abstract void D();

    public abstract boolean G();

    public abstract void H(Configuration configuration);

    public abstract void I(Bundle bundle);

    public abstract void J();

    public abstract void K(Bundle bundle);

    public abstract void L();

    public abstract void M(Bundle bundle);

    public abstract void N();

    public abstract void O();

    public abstract boolean R(int i10);

    public abstract void V(@e.G int i10);

    public abstract void W(View view);

    public abstract void X(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void Z(boolean z10);

    @T(17)
    public abstract void b0(int i10);

    @T(33)
    @InterfaceC4335i
    public void c0(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d0(@Nullable Toolbar toolbar);

    public boolean e() {
        return false;
    }

    public void e0(@a0 int i10) {
    }

    public abstract boolean f();

    public abstract void f0(@Nullable CharSequence charSequence);

    @Nullable
    public abstract AbstractC5126b g0(@NonNull AbstractC5126b.a aVar);

    public void i(final Context context) {
        f85463c.execute(new Runnable() { // from class: androidx.appcompat.app.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1490g.h0(context);
            }
        });
    }

    @Deprecated
    public void j(Context context) {
    }

    @NonNull
    @InterfaceC4335i
    public Context k(@NonNull Context context) {
        return context;
    }

    public abstract View p(@Nullable View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet);

    @Nullable
    public abstract <T extends View> T q(@e.C int i10);

    @Nullable
    public Context s() {
        return null;
    }

    @Nullable
    public abstract C1484a.b u();

    public int v() {
        return -100;
    }

    public abstract MenuInflater x();
}
