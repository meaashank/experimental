package com.mbridge.msdk.foundation.error;

import android.support.v4.media.e;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f156230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f156231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f156232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f156233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f156234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f156235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f156236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f156237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f156238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f156239j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f156240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f156241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f156242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f156243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f156244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f156245p;

    public b(int i10) {
        this.f156230a = i10;
        this.f156231b = a.b(i10);
    }

    public void a(Throwable th) {
        this.f156233d = th;
    }

    public void b(String str) {
        this.f156237h = str;
    }

    public void c(String str) {
        this.f156232c = str;
    }

    public CampaignEx d() {
        return this.f156234e;
    }

    public int g() {
        return this.f156230a;
    }

    public int h() {
        return this.f156231b;
    }

    public String i() {
        return this.f156245p;
    }

    public MBridgeIds j() {
        if (this.f156235f == null) {
            this.f156235f = new MBridgeIds();
        }
        return this.f156235f;
    }

    public String k() {
        return this.f156237h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f156232c) ? this.f156232c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f156230a) != -1) {
            strA = a.a(i10);
        }
        Throwable th = this.f156233d;
        if (th == null) {
            return strA;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? androidx.concurrent.futures.a.a(strA, " # ", message) : strA;
    }

    public String m() {
        return this.f156240k;
    }

    public int n() {
        return this.f156239j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MBFailureReason{errorCode=");
        sb2.append(this.f156230a);
        sb2.append(", errorSubType=");
        sb2.append(this.f156231b);
        sb2.append(", message='");
        sb2.append(this.f156232c);
        sb2.append("', cause=");
        sb2.append(this.f156233d);
        sb2.append(", campaign=");
        sb2.append(this.f156234e);
        sb2.append(", ids=");
        sb2.append(this.f156235f);
        sb2.append(", requestId='");
        sb2.append(this.f156236g);
        sb2.append("', localRequestId='");
        sb2.append(this.f156237h);
        sb2.append("', isHeaderBidding=");
        sb2.append(this.f156238i);
        sb2.append(", typeD=");
        sb2.append(this.f156239j);
        sb2.append(", reasonD='");
        sb2.append(this.f156240k);
        sb2.append("', extraMap=");
        sb2.append(this.f156241l);
        sb2.append(", serverErrorCode=");
        sb2.append(this.f156242m);
        sb2.append(", errorUrl='");
        sb2.append(this.f156243n);
        sb2.append("', serverErrorResponse='");
        return e.a(sb2, this.f156244o, "'}");
    }

    public void a(CampaignEx campaignEx) {
        this.f156234e = campaignEx;
    }

    public void d(String str) {
        this.f156240k = str;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f156235f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f156238i = z10;
    }

    public b(int i10, String str) {
        this.f156230a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f156232c = str;
        this.f156231b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.f156241l == null) {
            this.f156241l = new HashMap<>();
        }
        this.f156241l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f156241l;
        if (map != null && map.containsKey(obj)) {
            return this.f156241l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f156239j = i10;
    }

    public void a(String str) {
        this.f156245p = str;
    }
}
