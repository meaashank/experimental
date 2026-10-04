package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import e.f0;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b implements b.InterfaceC0528b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f151391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f151392b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f151392b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0528b
    @f0
    public JSONObject a() {
        return this.f151391a;
    }

    public void b() {
        this.f151392b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0528b
    @f0
    public void a(JSONObject jSONObject) {
        this.f151391a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f151392b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f151392b.b(new e(this, hashSet, jSONObject, j10));
    }
}
