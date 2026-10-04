package com.mbridge.msdk.config.component.inner;

import Z3.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class InnerCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f154454h = "InnerCpt";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f154455i = "700001";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    com.mbridge.msdk.config.component.inner.model.a f154456j;

    private void a(Context context, String str, String str2, Map<String, Object> map) {
        String message;
        Intent intent;
        boolean z10 = false;
        try {
            message = "";
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (TextUtils.isEmpty(scheme) || !scheme.equals("android-app")) {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f154456j.b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        context.startActivity(intent);
                    } else {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    }
                    z10 = true;
                }
            }
        } catch (Throwable th) {
            q0.b("InnerCpt", th.getMessage(), th);
            message = th.getMessage();
        }
        a(z10, message);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "901001";
        this.f154456j = new com.mbridge.msdk.config.component.inner.model.a(map);
        if (e() != null) {
            this.f154456j.a(e().getContext());
        } else {
            this.f154456j.a(c.n().d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f154456j.f().equals(com.mbridge.msdk.config.component.common.util.c.c("336"))) {
            String strC = this.f154456j.c();
            if (!TextUtils.isEmpty(strC) && strC.equals(com.mbridge.msdk.config.component.common.util.c.c("339"))) {
                g();
            }
            a("901006", (HashMap<String, Object>) null);
        }
    }

    public void g() {
        com.mbridge.msdk.config.component.inner.model.a aVar = this.f154456j;
        if (aVar != null) {
            a(aVar.a(), this.f154456j.d(), this.f154456j.e(), this.f154456j.b());
        }
    }

    private void a(boolean z10, String str) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c("500"), String.valueOf(z10 ? 1 : 0));
        if (!z10) {
            map.put(com.mbridge.msdk.config.component.common.util.c.c(f.f79422s), "700001");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str);
        }
        a(a("901005", (Map<String, Object>) map));
    }
}
