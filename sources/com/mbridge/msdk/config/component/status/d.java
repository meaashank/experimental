package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f154797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f154798b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f154799c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SharedPreferences.OnSharedPreferenceChangeListener f154800d = new a();

    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f154797a == null || !d.this.f154797a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f154797a.getAll().get(str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c("value"), obj);
            } catch (Exception unused) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.c("value"), d.this.f154797a.getString(str, ""));
            }
            if (d.this.f154798b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f154798b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f154797a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f154800d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f154799c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f154799c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f154798b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f154799c.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("PreferencePublisher", th.getMessage());
        }
    }
}
