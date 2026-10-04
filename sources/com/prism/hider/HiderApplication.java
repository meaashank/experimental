package com.prism.hider;

import J6.f;
import O9.g;
import U6.n;
import U6.p;
import U9.C1298h;
import U9.D;
import Z6.g;
import aa.C1463a;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.genum.ProcessType;
import com.prism.hider.utils.j;
import d7.b;
import f6.AbstractC4390b;
import ja.C4798a;
import ma.C5212b;
import ma.C5217g;
import pb.C5404d;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class HiderApplication extends androidx.multidex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167746a = l0.b("HiderApplication");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AbstractC4390b f167747b;

    public class a extends d {
    }

    public class b extends d {
    }

    public static class c extends A6.c {
        public c() {
        }

        @Override // A6.c, A6.h
        public boolean b(Context context) {
            return j.b(context);
        }

        @Override // A6.c, A6.h
        public boolean c(Context context) {
            U6.c.c0();
            return super.c(context);
        }

        @Override // A6.c, A6.h
        public void d(String str) {
            C5705o.c().d(str);
        }

        public c(g gVar) {
        }
    }

    public static class d extends AbstractC4390b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f167748b;

        public class a implements Z6.j {
            public a() {
            }

            @Override // Z6.j
            public void a(String str, Exception exc) {
            }
        }

        public class b implements b.c {
            public b() {
            }

            @Override // d7.b.c
            public void a(Application application) {
                C1298h.h(application);
            }
        }

        public class c extends g.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Application f167751a;

            public class a implements C5404d.c {
                public a() {
                }

                @Override // pb.C5404d.c
                public void onComplete() {
                    f.t(c.this.f167751a);
                    f.f53216p = com.prism.hider.variant.a.b().a();
                }
            }

            public c(Application application) {
                this.f167751a = application;
            }

            @Override // Z6.g.e
            public void b() {
                I.b(HiderApplication.f167746a, "app.getPackageName=%s", this.f167751a.getPackageName());
                if ("com.app.hider.master.promax".equals(this.f167751a.getPackageName())) {
                    C4798a.c().e(this.f167751a);
                    D.g().i(new ea.e());
                    Log.d(HiderApplication.f167746a, "register DataLoader finished");
                    C5217g.a(this.f167751a);
                    new Thread(new O9.f(), "microg-preimport").start();
                    P9.b.f().i(this.f167751a);
                    C5404d.f().e(this.f167751a, new a());
                }
            }
        }

        @Override // f6.InterfaceC4389a
        public void a(Context context) {
            p pVar = new p("attachBaseContext", false);
            pVar.f();
            I.b(HiderApplication.f167746a, pVar.e("begin"), new Object[0]);
            this.f167748b = context;
            if (!U6.c.e()) {
                C1463a.a(context);
            }
            if (g()) {
                try {
                    HiderApplication.nativeAttachBaseContextImpl(context);
                } catch (Throwable unused) {
                    String str = HiderApplication.f167746a;
                }
            }
            String str2 = HiderApplication.f167746a;
            pVar.b();
        }

        @Override // f6.InterfaceC4389a
        public void b(Application application) {
            C1298h.g(application);
            C4798a.c().b();
        }

        @Override // f6.InterfaceC4389a
        /* JADX INFO: renamed from: c */
        public void i(Application application) {
            p pVar = new p("onCreate", false);
            pVar.f();
            I.a(HiderApplication.f167746a, pVar.e("begin"));
            U6.c.L(this.f167748b);
            try {
                C1298h.i(application);
                String str = HiderApplication.f167746a;
                pVar.h("AppActivityLifecycle.fillHostApp()");
                Z6.g gVarB = Z6.g.B();
                Z5.a aVarA = Y5.a.a(application);
                gVarB.L(new a());
                d7.b bVar = new d7.b();
                bVar.f194884b = new b();
                gVarB.I(application, aVarA, bVar, new c(application));
                pVar.h("GaiaApi.onCreate()");
            } catch (Throwable th) {
                try {
                    Bundle bundle = new Bundle();
                    ProcessType processTypeK = GaiaContext.f164212y.K();
                    bundle.putString("PROCESS_TYPE", processTypeK == null ? "PRE_INIT" : processTypeK.name());
                    bundle.putString("FIRST_CAUSE_CLASS", th.getClass().getName());
                    bundle.putString("FIRST_CAUSE_MESSAGE", String.valueOf(th.getMessage()));
                    C5705o.c().a(th, "APPLICATION_ONCREATE_EXCEPTION", bundle);
                } catch (Throwable unused) {
                }
            }
            String str2 = HiderApplication.f167746a;
            pVar.b();
        }

        @Override // f6.AbstractC4390b
        public boolean e(Context context) {
            return true;
        }

        public final boolean g() {
            try {
                System.loadLibrary("helper");
                I.a(HiderApplication.f167746a, "native protector library loaded");
                return true;
            } catch (UnsatisfiedLinkError e10) {
                I.h(HiderApplication.f167746a, "native protector library unavailable, skip native attach.", e10);
                return false;
            } catch (Throwable th) {
                I.h(HiderApplication.f167746a, "native protector library load error.", th);
                return false;
            }
        }
    }

    public static class e implements n {
        public e() {
            A6.d.g().e(new c());
        }

        @Override // U6.n
        public A6.a a() {
            return A6.d.g();
        }

        @Override // U6.n
        public A6.f b() {
            return A6.d.g().a();
        }
    }

    public static AbstractC4390b b() {
        return f167747b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void c(Context context) {
        AbstractC4390b bVar;
        U6.c.K(context, new e());
        if (C5212b.class == 0) {
            f167747b = new a();
            return;
        }
        try {
            bVar = (AbstractC4390b) C5212b.class.newInstance();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f167747b = bVar;
    }

    public static native void nativeAttachBaseContextImpl(Context context);

    @Override // androidx.multidex.c, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (f167747b == null) {
            c(context);
        }
        f167747b.a(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f167747b.i(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        f167747b.b(this);
    }
}
