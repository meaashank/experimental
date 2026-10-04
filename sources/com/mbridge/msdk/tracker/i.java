package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String f159894i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static String f159895j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f159896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f159897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f159898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f159899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f159900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f159901f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f159902g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f159903h;

    public i(e eVar) {
        this.f159896a = eVar;
        this.f159899d = eVar.n();
    }

    public void a(boolean z10) {
        this.f159902g = z10;
    }

    public void b(boolean z10) {
        this.f159901f = z10;
    }

    public e d() {
        return this.f159896a;
    }

    public long g() {
        return this.f159900e;
    }

    public int h() {
        return this.f159897b;
    }

    public String i() {
        return this.f159903h;
    }

    public int j() {
        return this.f159898c;
    }

    public String k() {
        return this.f159899d;
    }

    public boolean l() {
        return this.f159902g;
    }

    public boolean m() {
        return this.f159901f;
    }

    public void a(int i10) {
        this.f159897b = i10;
    }

    public void b(int i10) {
        this.f159898c = i10;
    }

    public void a(long j10) {
        this.f159900e = j10;
    }

    public void a(String str) {
        this.f159903h = str;
    }
}
