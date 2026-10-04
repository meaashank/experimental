package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f151382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f151383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f151384e;

    public a(b.InterfaceC0528b interfaceC0528b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0528b);
        this.f151382c = new HashSet<>(hashSet);
        this.f151383d = jSONObject;
        this.f151384e = j10;
    }
}
