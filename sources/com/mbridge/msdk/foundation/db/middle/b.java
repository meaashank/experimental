package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f156055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f156056b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f156057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f156058b;

        public a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f156057a = z10;
            this.f156058b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f156057a || b.this.f156056b == null) {
                return;
            }
            for (String str : this.f156058b.a()) {
                b.this.f156056b.a(str, b.this.f156055a.a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    public static class C0565b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f156060a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f156055a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.f156056b = kVarA;
            a(kVarA.d(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f156055a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f156055a.a());
    }

    public static b a() {
        return C0565b.f156060a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f156055a.a(str);
        if (jSONObjectA != null || (kVar = this.f156056b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f156055a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
