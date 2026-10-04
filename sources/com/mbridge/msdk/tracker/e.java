package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f159879a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f159882d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f159887i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f159880b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f159881c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f159885g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f159886h = com.prism.gaia.client.stub.n.f164456n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f159888j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f159889k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f159884f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f159883e = UUID.randomUUID().toString();

    public e(String str) {
        this.f159879a = str;
    }

    public void a(int i10) {
        this.f159881c = i10;
    }

    public void b(int i10) {
        this.f159880b = i10;
    }

    public void c(long j10) {
        this.f159884f = j10;
    }

    public long d() {
        return this.f159885g;
    }

    public String g() {
        return this.f159879a;
    }

    public int h() {
        return this.f159881c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f159882d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f159882d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f159887i;
    }

    public long k() {
        return this.f159886h;
    }

    public long l() {
        return this.f159884f;
    }

    public int m() {
        return this.f159880b;
    }

    public String n() {
        return this.f159883e;
    }

    public boolean o() {
        return this.f159889k;
    }

    public boolean p() {
        return this.f159888j;
    }

    public void a(JSONObject jSONObject) {
        this.f159882d = jSONObject;
    }

    public void b(long j10) {
        this.f159886h = j10;
    }

    public void a(String str) {
        this.f159883e = str;
    }

    public void a(long j10) {
        this.f159885g = j10;
    }

    public void a(h hVar) {
        this.f159887i = hVar;
    }

    public void a(boolean z10) {
        this.f159889k = z10;
    }
}
