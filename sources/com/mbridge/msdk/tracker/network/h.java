package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h<T> extends t<T> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected static final String f159956B = "h";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f159957A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f159958w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f159959x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f159960y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f159961z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.f159957A = false;
        if (j10 > 0) {
            this.f159958w = j10;
        } else {
            this.f159958w = 60000L;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f159959x == null) {
            this.f159959x = new HashMap();
        }
        try {
            this.f159959x.putAll(map);
        } catch (Exception e10) {
            com.mbridge.msdk.config.component.common.express.node.m.a(e10, new StringBuilder("addParams error: "), f159956B);
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f159960y == null) {
            this.f159960y = new HashMap();
        }
        try {
            this.f159960y.put(str, str2);
        } catch (Exception e10) {
            com.mbridge.msdk.config.component.common.express.node.m.a(e10, new StringBuilder("addHeader error: "), f159956B);
        }
    }

    public void d(boolean z10) {
        this.f159957A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f159960y == null) {
            this.f159960y = new HashMap();
        }
        this.f159960y.put("Charset", "UTF-8");
        return this.f159960y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f159959x == null) {
            this.f159959x = new HashMap();
        }
        return this.f159959x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f159961z == null) {
            this.f159961z = new e(30000, this.f159958w, 3);
        }
        return this.f159961z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.f159957A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
