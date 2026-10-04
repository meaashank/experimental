package com.cookiegames.smartcookie.di;

import B0.C0920d;
import C0.Q;
import C0.c0;
import android.app.Application;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import b4.C2780a;
import bc.InterfaceC2857g;
import bc.InterfaceC2858h;
import com.cookiegames.smartcookie.device.BuildType;
import e.T;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kc.C4839a;
import kotlin.jvm.internal.V;
import net.i2p.android.ui.I2PAndroidHelper;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.p;
import org.jetbrains.annotations.NotNull;
import p4.C5388a;
import p4.C5391d;
import p4.InterfaceC5390c;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nAppModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppModule.kt\ncom/cookiegames/smartcookie/di/AppModule\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,229:1\n31#2:230\n31#2:231\n31#2:232\n31#2:233\n31#2:234\n31#2:235\n31#2:236\n*S KotlinDebug\n*F\n+ 1 AppModule.kt\ncom/cookiegames/smartcookie/di/AppModule\n*L\n77#1:230\n80#1:231\n83#1:232\n86#1:233\n89#1:234\n92#1:235\n96#1:236\n*E\n"})
@InterfaceC2857g
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C3121g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f141148a = 0;

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.di.g$a */
    public static final class a implements z4.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CacheControl f141149a;

        public a(CacheControl cacheControl) {
            this.f141149a = cacheControl;
        }

        @Override // z4.k
        public Request a(HttpUrl httpUrl, String encoding) {
            kotlin.jvm.internal.G.p(httpUrl, "httpUrl");
            kotlin.jvm.internal.G.p(encoding, "encoding");
            return new Request.Builder().url(httpUrl).addHeader("Accept-Charset", encoding).cacheControl(this.f141149a).build();
        }
    }

    public static final OkHttpClient C(Application application) {
        final long seconds = TimeUnit.DAYS.toSeconds(1L);
        return new OkHttpClient.Builder().cache(new okhttp3.c(new File(application.getCacheDir(), "suggestion_responses"), C4.e.f(1L))).addNetworkInterceptor(new okhttp3.p() { // from class: com.cookiegames.smartcookie.di.c
            @Override // okhttp3.p
            public final Response a(p.a aVar) {
                return C3121g.D(seconds, aVar);
            }
        }).build();
    }

    public static final Response D(long j10, p.a chain) {
        kotlin.jvm.internal.G.p(chain, "chain");
        Response.Builder builder = new Response.Builder(chain.c(chain.request()));
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("max-age=", j10, ", max-stale=");
        sbA.append(j10);
        return builder.header("cache-control", sbA.toString()).build();
    }

    public static final OkHttpClient s(Application application) {
        final long seconds = TimeUnit.DAYS.toSeconds(365L);
        return new OkHttpClient.Builder().cache(new okhttp3.c(new File(application.getCacheDir(), "hosts_cache"), C4.e.f(5L))).addNetworkInterceptor(new okhttp3.p() { // from class: com.cookiegames.smartcookie.di.e
            @Override // okhttp3.p
            public final Response a(p.a aVar) {
                return C3121g.t(seconds, aVar);
            }
        }).build();
    }

    public static final Response t(long j10, p.a chain) {
        kotlin.jvm.internal.G.p(chain, "chain");
        Response.Builder builder = new Response.Builder(chain.c(chain.request()));
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("max-age=", j10, ", max-stale=");
        sbA.append(j10);
        return builder.header("cache-control", sbA.toString()).build();
    }

    @InterfaceC2858h
    @NotNull
    public final CacheControl A() {
        return new CacheControl.Builder().maxStale(1, TimeUnit.DAYS).build();
    }

    @InterfaceC2858h
    @NotNull
    public final hc.I<OkHttpClient> B(@NotNull final Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        hc.I<OkHttpClient> iJ = hc.I.f0(new Callable() { // from class: com.cookiegames.smartcookie.di.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3121g.C(application);
            }
        }).j();
        kotlin.jvm.internal.G.o(iJ, "cache(...)");
        return iJ;
    }

    @InterfaceC2858h
    @NotNull
    public final z4.k E(@NotNull CacheControl cacheControl) {
        kotlin.jvm.internal.G.p(cacheControl, "cacheControl");
        return new a(cacheControl);
    }

    @InterfaceC2858h
    @NotNull
    public final WindowManager F(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, WindowManager.class);
        kotlin.jvm.internal.G.m(systemService);
        return (WindowManager) systemService;
    }

    @InterfaceC2858h
    @NotNull
    public final SharedPreferences e(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("ad_block_settings", 0);
        kotlin.jvm.internal.G.o(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @InterfaceC2858h
    @NotNull
    public final Context f(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.G.o(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @InterfaceC2858h
    @NotNull
    public final SharedPreferences g(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("developer_settings", 0);
        kotlin.jvm.internal.G.o(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @InterfaceC2858h
    @NotNull
    public final I2PAndroidHelper h(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        return new I2PAndroidHelper(application);
    }

    @InterfaceC2858h
    @NotNull
    public final InterfaceC5390c i(@NotNull C2780a buildInfo) {
        kotlin.jvm.internal.G.p(buildInfo, "buildInfo");
        return buildInfo.f120794a == BuildType.DEBUG ? new C5388a() : new C5391d();
    }

    @InterfaceC2858h
    @NotNull
    public final Handler j() {
        return new Handler(Looper.getMainLooper());
    }

    @InterfaceC2858h
    @NotNull
    public final Resources k(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Resources resources = application.getResources();
        kotlin.jvm.internal.G.o(resources, "getResources(...)");
        return resources;
    }

    @InterfaceC2858h
    @NotNull
    public final SharedPreferences l(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("settings", 0);
        kotlin.jvm.internal.G.o(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @InterfaceC2858h
    @NotNull
    public final AssetManager m(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        AssetManager assets = application.getAssets();
        kotlin.jvm.internal.G.o(assets, "getAssets(...)");
        return assets;
    }

    @InterfaceC2858h
    @NotNull
    public final ClipboardManager n(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, ClipboardManager.class);
        kotlin.jvm.internal.G.m(systemService);
        return (ClipboardManager) systemService;
    }

    @InterfaceC2858h
    @NotNull
    public final ConnectivityManager o(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, ConnectivityManager.class);
        kotlin.jvm.internal.G.m(systemService);
        return (ConnectivityManager) systemService;
    }

    @InterfaceC2858h
    @NotNull
    public final hc.H p() {
        return Kc.b.b(Executors.newSingleThreadExecutor());
    }

    @InterfaceC2858h
    @NotNull
    public final DownloadManager q(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, DownloadManager.class);
        kotlin.jvm.internal.G.m(systemService);
        return (DownloadManager) systemService;
    }

    @InterfaceC2858h
    @NotNull
    public final hc.I<OkHttpClient> r(@NotNull final Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        hc.I<OkHttpClient> iJ = hc.I.f0(new Callable() { // from class: com.cookiegames.smartcookie.di.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3121g.s(application);
            }
        }).j();
        kotlin.jvm.internal.G.o(iJ, "cache(...)");
        return iJ;
    }

    @InterfaceC2858h
    @NotNull
    public final InputMethodManager u(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, InputMethodManager.class);
        kotlin.jvm.internal.G.m(systemService);
        return (InputMethodManager) systemService;
    }

    @InterfaceC2858h
    @NotNull
    public final hc.H v() {
        return Kc.b.b(Executors.newSingleThreadExecutor());
    }

    @InterfaceC2858h
    @NotNull
    public final hc.H w() {
        hc.H hB = C4839a.b();
        kotlin.jvm.internal.G.o(hB, "mainThread(...)");
        return hB;
    }

    @InterfaceC2858h
    @NotNull
    public final hc.H x() {
        return Kc.b.b(new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque()));
    }

    @InterfaceC2858h
    @NotNull
    public final NotificationManager y(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, NotificationManager.class);
        kotlin.jvm.internal.G.m(systemService);
        return (NotificationManager) systemService;
    }

    @T(25)
    @InterfaceC2858h
    @NotNull
    public final ShortcutManager z(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        Object systemService = C0920d.getSystemService(application, Q.a());
        kotlin.jvm.internal.G.m(systemService);
        return c0.a(systemService);
    }
}
