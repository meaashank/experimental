package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f151511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f151512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f151513e;

    public a(b.InterfaceC0532b interfaceC0532b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0532b);
        this.f151511c = new HashSet<>(hashSet);
        this.f151512d = jSONObject;
        this.f151513e = j10;
    }
}
