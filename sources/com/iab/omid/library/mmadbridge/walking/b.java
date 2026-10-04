package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.async.b;
import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import e.f0;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b implements b.InterfaceC0536b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f151655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f151656b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f151656b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0536b
    @f0
    public JSONObject a() {
        return this.f151655a;
    }

    public void b() {
        this.f151656b.b(new d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0536b
    @f0
    public void a(JSONObject jSONObject) {
        this.f151655a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f151656b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f151656b.b(new e(this, hashSet, jSONObject, j10));
    }
}
