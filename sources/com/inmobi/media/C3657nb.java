package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3657nb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f153208b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f153209c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f153210d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f153213g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f153215i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3657nb f153207a = new C3657nb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f153211e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kotlin.G f153212f = kotlin.I.a(C3643mb.f153177a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ExecutorService f153214h = Executors.newSingleThreadExecutor(new V4("nb"));

    @Nullable
    public static final String b() {
        return f153210d;
    }

    @dd.o
    public static /* synthetic */ void c() {
    }

    @Nullable
    public static final Context d() {
        return f153208b;
    }

    @dd.o
    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final Q6 f() {
        return (Q6) f153212f.getValue();
    }

    @dd.o
    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void j() {
    }

    @NotNull
    public static final String k() {
        Context applicationContext;
        String property;
        String str = "";
        if (f153209c.length() == 0) {
            Context context = f153208b;
            if (context != null) {
                try {
                    applicationContext = context.getApplicationContext();
                } catch (Exception e10) {
                    try {
                        throw new C3825zc(e10.getMessage());
                    } catch (C3825zc e11) {
                        C3511d5 c3511d5 = C3511d5.f152815a;
                        C3511d5.f152817c.a(new R1(e11));
                        try {
                            property = System.getProperty("http.agent");
                            if (property != null) {
                            }
                        } catch (Exception e12) {
                            C3511d5 c3511d52 = C3511d5.f152815a;
                            C3511d5.f152817c.a(K4.a(e12, NotificationCompat.CATEGORY_EVENT));
                        }
                    } catch (Exception unused) {
                    }
                }
            } else {
                applicationContext = null;
            }
            property = WebSettings.getDefaultUserAgent(applicationContext);
            kotlin.jvm.internal.G.m(property);
            str = property;
            f153209c = str;
        }
        return f153209c;
    }

    @dd.o
    public static /* synthetic */ void l() {
    }

    public static final boolean m() {
        return f153211e.get();
    }

    @dd.o
    public static /* synthetic */ void n() {
    }

    public static final boolean o() {
        return f153213g;
    }

    @dd.o
    public static /* synthetic */ void p() {
    }

    public static final boolean q() {
        return f153215i == 2;
    }

    @dd.o
    public static /* synthetic */ void r() {
    }

    @dd.o
    public static final void u() {
        f153208b = null;
        f153210d = null;
        f153215i = 0;
    }

    @e.f0(otherwise = 2)
    public final void a(int i10) {
        f153215i = i10;
    }

    @e.g0
    @Nullable
    public final String h() {
        Context context = f153208b;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        return J5.a(context, "coppa_store").f152165a.getString("im_accid", null);
    }

    public final int i() {
        return f153215i;
    }

    public final void s() {
        f153210d = null;
        f153208b = null;
        f153215i = 3;
    }

    public final void t() {
        f153215i = 2;
    }

    @dd.o
    public static final void a(@NotNull Runnable runnable) {
        kotlin.jvm.internal.G.p(runnable, "runnable");
        f153214h.submit(runnable);
    }

    public static final void b(boolean z10) {
        f153213g = z10;
    }

    @e.f0(otherwise = 2)
    public static final void c(@Nullable Context context) {
        f153208b = context;
    }

    public static final void a(boolean z10) {
        f153211e.set(z10);
    }

    @dd.o
    @e.e0
    public static final boolean b(@NotNull Context context, @NotNull String accountId) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(accountId, "accountId");
        f153215i = 1;
        f153208b = context.getApplicationContext();
        f153211e.set(true);
        f153210d = accountId;
        return true;
    }

    @e.f0(otherwise = 2)
    public static final void c(@Nullable String str) {
        f153210d = str;
    }

    @e.g0
    public final void a(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        try {
            Y3.a(b(context));
        } catch (Exception unused) {
        }
    }

    @e.g0
    public final void a() {
        Context context = f153208b;
        if (context != null) {
            File fileB = b(context);
            if (fileB.mkdir()) {
                return;
            }
            fileB.isDirectory();
        }
    }

    @NotNull
    public final File b(@Nullable Context context) {
        return new File(context != null ? context.getFilesDir() : null, "im_cached_content");
    }

    @e.g0
    public final void b(@NotNull String primaryAccountId) {
        kotlin.jvm.internal.G.p(primaryAccountId, "primaryAccountId");
        Context context = f153208b;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = K5.f152164b;
            J5.a(context, "coppa_store").a("im_accid", primaryAccountId);
        }
    }

    public final boolean a(@Nullable Context context, @Nullable String str) {
        if (context != null && str != null) {
            context.getPackageManager();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (kotlin.jvm.internal.G.g(str2, str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @dd.o
    public static final void a(@Nullable Context context, @NotNull Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        kotlin.jvm.internal.G.p(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public final void a(@NotNull Context context, @NotNull Intent intent) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @NotNull
    public final File a(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        a();
        File fileB = b(f153208b);
        int length = key.length() / 2;
        String strSubstring = key.substring(0, length);
        kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(String.valueOf(strSubstring.hashCode() & Integer.MAX_VALUE));
        String strSubstring2 = key.substring(length);
        kotlin.jvm.internal.G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sbA.append(strSubstring2.hashCode() & Integer.MAX_VALUE);
        return new File(fileB, sbA.toString());
    }
}
