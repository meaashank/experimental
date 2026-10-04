package com.cookiegames.smartcookie;

import C4.h;
import W3.s;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.webkit.WebView;
import androidx.appcompat.app.AbstractC1490g;
import androidx.compose.runtime.internal.r;
import b4.C2780a;
import com.cookiegames.smartcookie.device.BuildType;
import com.cookiegames.smartcookie.di.AppComponent;
import com.cookiegames.smartcookie.di.DaggerAppComponent;
import com.cookiegames.smartcookie.di.K;
import com.google.android.material.color.DynamicColors;
import com.prism.lib.downloader.DownloaderConfig;
import com.prism.lib.pfs.PrivateFileSystem;
import hc.H;
import hc.I;
import hc.InterfaceC4527g;
import hc.q;
import java.lang.Thread;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import p4.InterfaceC5390c;
import u4.C5645a;
import uc.C5666a;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f141336j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f141337k = "BrowserAppDelegate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Inject
    public C5645a f141339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    public s f141340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public H f141341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC5390c f141342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public C2780a f141343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppComponent f141344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Application f141345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V5.a f141346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f141335i = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final i f141338l = new i();

    public static final class a {
        public a() {
        }

        @NotNull
        public final i a() {
            return i.f141338l;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b extends h.a {
        public b() {
        }

        @Override // C4.h.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            G.p(activity, "activity");
            i.this.r().log(i.f141337k, "Cleaning up after the Android framework");
            Application application = i.this.f141345g;
            if (application != null) {
                C4.h.a(activity, application);
            } else {
                G.S("app");
                throw null;
            }
        }
    }

    static {
        AbstractC1490g.U(false);
    }

    public static final InterfaceC4527g A(i iVar, Long it) throws Throwable {
        G.p(it, "it");
        Application application = iVar.f141345g;
        if (application != null) {
            return iVar.n().r(W3.r.d(application));
        }
        G.S("app");
        throw null;
    }

    public static final InterfaceC4527g B(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return (InterfaceC4527g) lVar.invoke(p02);
    }

    public static void b(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static L0 f(Throwable th) {
        return L0.f217464a;
    }

    public static final void v(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.exit(2);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public static final L0 w(Throwable th) {
        return L0.f217464a;
    }

    public static final void x(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final boolean y(Long it) {
        G.p(it, "it");
        return it.longValue() == 0;
    }

    public static final boolean z(ed.l lVar, Object p02) {
        G.p(p02, "p0");
        return ((Boolean) lVar.invoke(p02)).booleanValue();
    }

    public final void C(@NotNull AppComponent appComponent) {
        G.p(appComponent, "<set-?>");
        this.f141344f = appComponent;
    }

    public final void D(@NotNull s sVar) {
        G.p(sVar, "<set-?>");
        this.f141340b = sVar;
    }

    public final void E(@NotNull C2780a c2780a) {
        G.p(c2780a, "<set-?>");
        this.f141343e = c2780a;
    }

    public final void F(@NotNull H h10) {
        G.p(h10, "<set-?>");
        this.f141341c = h10;
    }

    public final void G(@NotNull C5645a c5645a) {
        G.p(c5645a, "<set-?>");
        this.f141339a = c5645a;
    }

    public final void H(@NotNull InterfaceC5390c interfaceC5390c) {
        G.p(interfaceC5390c, "<set-?>");
        this.f141342d = interfaceC5390c;
    }

    public final C2780a j() {
        return new C2780a(BuildType.RELEASE);
    }

    @NotNull
    public final V5.a k() {
        V5.a aVar = this.f141346h;
        if (aVar != null) {
            return aVar;
        }
        G.S("analytics");
        throw null;
    }

    @NotNull
    public final String l() {
        Application application = this.f141345g;
        if (application != null) {
            return application.getClass().getName();
        }
        G.S("app");
        throw null;
    }

    @NotNull
    public final AppComponent m() {
        AppComponent appComponent = this.f141344f;
        if (appComponent != null) {
            return appComponent;
        }
        G.S("applicationComponent");
        throw null;
    }

    @NotNull
    public final s n() {
        s sVar = this.f141340b;
        if (sVar != null) {
            return sVar;
        }
        G.S("bookmarkModel");
        throw null;
    }

    @NotNull
    public final C2780a o() {
        C2780a c2780a = this.f141343e;
        if (c2780a != null) {
            return c2780a;
        }
        G.S("buildInfo");
        throw null;
    }

    @NotNull
    public final H p() {
        H h10 = this.f141341c;
        if (h10 != null) {
            return h10;
        }
        G.S("databaseScheduler");
        throw null;
    }

    @NotNull
    public final C5645a q() {
        C5645a c5645a = this.f141339a;
        if (c5645a != null) {
            return c5645a;
        }
        G.S("developerPreferences");
        throw null;
    }

    @NotNull
    public final InterfaceC5390c r() {
        InterfaceC5390c interfaceC5390c = this.f141342d;
        if (interfaceC5390c != null) {
            return interfaceC5390c;
        }
        G.S("logger");
        throw null;
    }

    public final void s(@NotNull Application app, @NotNull PrivateFileSystem pfs, @NotNull V5.a analytics) {
        G.p(app, "app");
        G.p(pfs, "pfs");
        G.p(analytics, "analytics");
        this.f141345g = app;
        this.f141346h = analytics;
        u();
        com.prism.lib.downloader.a.t(app, new DownloaderConfig.Builder().setPfs(pfs).build());
    }

    public final boolean t() {
        return this.f141344f != null;
    }

    public final void u() {
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            Application application = this.f141345g;
            if (application == null) {
                G.S("app");
                throw null;
            }
            if (G.g(processName, application.getPackageName() + ":incognito")) {
                WebView.setDataDirectorySuffix("incognito");
            }
        }
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.cookiegames.smartcookie.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                i.v(defaultUncaughtExceptionHandler, thread, th);
            }
        });
        final com.cookiegames.smartcookie.b bVar = new com.cookiegames.smartcookie.b();
        C5666a.k0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.c
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                i.b(bVar, obj);
            }
        });
        AppComponent.Builder builderG = DaggerAppComponent.G();
        Application application2 = this.f141345g;
        if (application2 == null) {
            G.S("app");
            throw null;
        }
        C(builderG.application(application2).buildInfo(j()).build());
        Application application3 = this.f141345g;
        if (application3 == null) {
            G.S("app");
            throw null;
        }
        K.b(application3).z(this);
        final s sVarN = n();
        I iF0 = I.f0(new Callable() { // from class: com.cookiegames.smartcookie.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(sVarN.count());
            }
        });
        final e eVar = new e();
        q qVarX = iF0.X(new nc.r() { // from class: com.cookiegames.smartcookie.f
            @Override // nc.r
            public final boolean test(Object obj) {
                return i.z(eVar, obj);
            }
        });
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.g
            @Override // ed.l
            public final Object invoke(Object obj) {
                return i.A(this.f141271a, (Long) obj);
            }
        };
        qVarX.c0(new nc.o() { // from class: com.cookiegames.smartcookie.h
            @Override // nc.o
            public final Object apply(Object obj) {
                return i.B(lVar, obj);
            }
        }).G0(p()).C0();
        if (o().f120794a == BuildType.DEBUG) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        Application application4 = this.f141345g;
        if (application4 == null) {
            G.S("app");
            throw null;
        }
        application4.registerActivityLifecycleCallbacks(new b());
        Application application5 = this.f141345g;
        if (application5 != null) {
            DynamicColors.applyToActivitiesIfAvailable(application5);
        } else {
            G.S("app");
            throw null;
        }
    }
}
