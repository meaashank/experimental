package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import xa.C5800b;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f154442d = "UserAgentProvider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile e f154443e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f154444a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f154445b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f154446c = new AtomicBoolean(false);

    private e() {
    }

    private String c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Mozilla/5.0 (Linux; Android ", str, "; ", str2, " Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return android.support.v4.media.e.a(sbA, str3, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
    }

    public static e d() {
        if (f154443e == null) {
            synchronized (e.class) {
                try {
                    if (f154443e == null) {
                        f154443e = new e();
                    }
                } finally {
                }
            }
        }
        return f154443e;
    }

    private String f() {
        try {
            return WebSettings.getDefaultUserAgent(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th) {
            q0.b(f154442d, th.getMessage(), th);
            return "";
        }
    }

    public String e() {
        return (TextUtils.isEmpty(this.f154444a) && TextUtils.isEmpty(this.f154445b)) ? c() : TextUtils.isEmpty(this.f154444a) ? TextUtils.isEmpty(this.f154445b) ? "" : this.f154445b : this.f154444a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f154444a = f();
        b();
        if (!TextUtils.isEmpty(this.f154444a)) {
            a(this.f154444a);
        }
        if (TextUtils.isEmpty(this.f154444a)) {
            this.f154444a = c();
            a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (aVar != null) {
            HashMap map = new HashMap();
            map.put(C5800b.g.f240572c, this.f154444a);
            aVar.a(map);
        }
        this.f154446c.set(true);
    }

    public void a(final com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154450a.b(aVar);
                }
            });
        } catch (Throwable th) {
            q0.b(f154442d, th.getMessage(), th);
        }
    }

    public String a() {
        try {
            String strF = f();
            this.f154444a = strF;
            if (!TextUtils.isEmpty(strF)) {
                a(this.f154444a);
            } else {
                b();
            }
            if (TextUtils.isEmpty(this.f154444a)) {
                this.f154444a = c();
            }
            this.f154446c.set(true);
        } catch (Throwable th) {
            q0.b(f154442d, th.getMessage(), th);
        }
        return c();
    }

    private void a(final Context context) {
        if (TextUtils.isEmpty(this.f154444a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154452a.b(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f154444a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            q0.b(f154442d, th.getMessage(), th);
        }
        if (TextUtils.isEmpty(this.f154444a)) {
            this.f154444a = c();
        } else {
            a(this.f154444a);
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b(C5800b.g.f240572c, str);
    }

    private void b() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.f154445b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a(C5800b.g.f240572c, c());
    }
}
