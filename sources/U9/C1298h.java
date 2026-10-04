package U9;

import U6.b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActivityC1486c;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.hider.utils.HiderPreferenceUtils;
import e6.C4367c;
import n6.C5256a;
import s6.C5577b;
import s6.i;

/* JADX INFO: renamed from: U9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1298h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f74068a = com.prism.commons.utils.l0.b(C1298h.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InitOnce<C1298h> f74069b = new InitOnce<>(new C1296g());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f74070c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f74071d = false;

    /* JADX INFO: renamed from: U9.h$a */
    public class a extends C5256a {
        @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            com.prism.hider.variant.a.b().c().b(activity);
        }

        @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            com.prism.hider.variant.a.b().c().a(activity);
        }
    }

    /* JADX INFO: renamed from: U9.h$c */
    public class c extends V6.a {

        /* JADX INFO: renamed from: U9.h$c$a */
        public class a extends i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActivityC1486c f74072a;

            public a(ActivityC1486c activityC1486c) {
                this.f74072a = activityC1486c;
            }

            @Override // s6.i.b
            public void a(s6.i iVar) {
                U6.c.r().b().b(this.f74072a);
            }
        }

        @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            com.prism.hider.variant.b.b().getLifecycle().onActivityPaused(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NonNull Activity activity) {
            super.onActivityPostResumed(activity);
            com.prism.commons.utils.d0.a(activity, HiderPreferenceUtils.b(activity));
        }

        @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            String stringExtra;
            com.prism.commons.utils.d0.a(activity, HiderPreferenceUtils.b(activity));
            boolean zB = p6.i.b(activity);
            boolean z10 = activity instanceof com.prism.hider.vault.commons.u;
            if (activity.getIntent() != null && (stringExtra = activity.getIntent().getStringExtra(b.c.f68610L)) != null) {
                C1303j0.B(activity, stringExtra, 0);
                return;
            }
            boolean zOnActivityResumed = com.prism.hider.variant.b.b().getLifecycle().onActivityResumed(activity);
            com.prism.commons.utils.I.a(C1298h.f74068a, "silentPass: " + zOnActivityResumed);
            if (GaiaContext.j().h0()) {
                com.prism.commons.utils.G.j(activity);
            }
            if (zB && zOnActivityResumed && !z10) {
                if (!C1298h.f74070c) {
                    com.prism.gaia.server.pm.r.a(activity);
                    C1298h.f74070c = true;
                }
                if (!C1298h.f74071d && (activity instanceof ActivityC1486c)) {
                    U6.c.c0();
                    ActivityC1486c activityC1486c = (ActivityC1486c) activity;
                    C4367c.o().y(activityC1486c, (C5577b[]) U6.c.f68714k0.toArray(new C5577b[0]), new a(activityC1486c));
                    C1298h.f74071d = true;
                }
                if (!com.prism.hider.variant.b.b().e(activity)) {
                    String str = C1298h.f74068a;
                } else {
                    String str2 = C1298h.f74068a;
                    C1284a.a().showSpalshAd(activity);
                }
            }
        }

        @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            com.prism.hider.variant.b.b().getLifecycle().getClass();
        }

        @Override // n6.C5256a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            com.prism.hider.variant.b.b().getLifecycle().onActivityStopped(activity);
        }
    }

    public static C1298h a() {
        return new C1298h();
    }

    public static void g(Application application) {
        com.prism.hider.variant.b.b().f(application);
    }

    public static void h(Application application) {
        C4367c.o().A(application);
        C4367c.f200255q.s(application);
    }

    public static void i(Application application) {
        if (Y9.a.f79347a.h()) {
            C5577b.g(true);
        }
        l(application);
        m(application);
        C4367c c4367c = C4367c.f200255q;
        c4367c.A(application);
        c4367c.s(application);
    }

    public static C1298h j() {
        return f74069b.get();
    }

    public static void l(Context context) {
        if (p6.i.b(context)) {
            com.prism.hider.variant.a.a(context);
            C4367c.o().B(new a());
        }
    }

    public static void m(Application application) {
        com.prism.hider.vault.commons.p pVar = new com.prism.hider.vault.commons.p(GaiaContext.j().z(), p6.i.b(application));
        pVar.f173573d = true;
        pVar.f173574e = true;
        pVar.f173575f = true;
        pVar.f173572c = new b();
        com.prism.hider.variant.b.b().j(pVar);
        C4367c.o().B(new c());
    }

    public Activity k() {
        return C4367c.o().F();
    }

    /* JADX INFO: renamed from: U9.h$b */
    public class b implements com.prism.hider.vault.commons.y {
        @Override // com.prism.hider.vault.commons.y
        public void c(Context context) {
            com.prism.hider.variant.b.b().b(context);
        }

        @Override // com.prism.hider.vault.commons.y
        public void a(Context context) {
        }

        @Override // com.prism.hider.vault.commons.y
        public void b(Context context) {
        }
    }
}
