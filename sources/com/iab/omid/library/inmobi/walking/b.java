package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.async.b;
import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import e.f0;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b implements b.InterfaceC0532b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f151520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f151521b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f151521b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0532b
    @f0
    public JSONObject a() {
        return this.f151520a;
    }

    public void b() {
        this.f151521b.b(new d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0532b
    @f0
    public void a(JSONObject jSONObject) {
        this.f151520a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f151521b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f151521b.b(new e(this, hashSet, jSONObject, j10));
    }
}
