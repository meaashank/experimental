package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.e f160140A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f160141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t.a f160142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private v.b<T> f160143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f160144z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public v.b<T> C() {
        return this.f160143y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f160141w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public t.a l() {
        return this.f160142x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.f160140A)) {
            this.f160140A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.f160140A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f160144z = wVar;
    }

    public void a(t.a aVar) {
        this.f160142x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f160141w = map;
    }

    public void a(v.b<T> bVar) {
        this.f160143y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f160144z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        v.b<T> bVarC = C();
        this.f160143y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
