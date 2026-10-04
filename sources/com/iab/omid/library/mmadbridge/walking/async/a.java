package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f151646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f151647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f151648e;

    public a(b.InterfaceC0536b interfaceC0536b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0536b);
        this.f151646c = new HashSet<>(hashSet);
        this.f151647d = jSONObject;
        this.f151648e = j10;
    }
}
