package com.prism.lib_google_billing;

import V5.c;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0696a f189044c = new C0696a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @NotNull
    public static final a f189045d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f189046e = "billing_event_start_purchase";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f189047f = "billing_event_launch_billing_page";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f189048g = "billing_event_start_subscription";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f189049h = "billing_event_start_in_app";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f189050i = "billing_event_purchase_old_billing_version";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public c.a f189051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f189052b;

    /* JADX INFO: renamed from: com.prism.lib_google_billing.a$a, reason: collision with other inner class name */
    public static final class C0696a {
        public C0696a() {
        }

        @NotNull
        public final a a() {
            return a.f189045d;
        }

        public C0696a(C4969v c4969v) {
        }
    }

    public final void b() {
        c.a aVar = this.f189051a;
        if (aVar != null) {
            Context context = this.f189052b;
            if (context != null) {
                aVar.a(context, f189047f).b();
            } else {
                G.S("context");
                throw null;
            }
        }
    }

    public final void c() {
        c.a aVar = this.f189051a;
        if (aVar != null) {
            Context context = this.f189052b;
            if (context != null) {
                aVar.a(context, f189050i).b();
            } else {
                G.S("context");
                throw null;
            }
        }
    }

    public final void d() {
        c.a aVar = this.f189051a;
        if (aVar != null) {
            Context context = this.f189052b;
            if (context != null) {
                aVar.a(context, f189049h).b();
            } else {
                G.S("context");
                throw null;
            }
        }
    }

    public final void e(int i10, @NotNull String message) {
        V5.c cVarC;
        G.p(message, "message");
        c.a aVar = this.f189051a;
        if (aVar != null) {
            Context context = this.f189052b;
            if (context == null) {
                G.S("context");
                throw null;
            }
            V5.c cVarE = aVar.a(context, f189046e).e("billing_result", i10);
            if (cVarE == null || (cVarC = cVarE.c("billing_resp_message", message)) == null) {
                return;
            }
            cVarC.b();
        }
    }

    public final void f() {
        c.a aVar = this.f189051a;
        if (aVar != null) {
            Context context = this.f189052b;
            if (context != null) {
                aVar.a(context, f189048g).b();
            } else {
                G.S("context");
                throw null;
            }
        }
    }

    public final void g(@NotNull c.a factory, @NotNull Context context) {
        G.p(factory, "factory");
        G.p(context, "context");
        this.f189051a = factory;
        this.f189052b = context;
    }
}
