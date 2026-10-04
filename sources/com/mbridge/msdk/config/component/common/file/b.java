package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;
import androidx.compose.animation.C1636p;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f154305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f154306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f154307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f154308f;

    public String a() {
        return this.f154305c + this.f154303a;
    }

    public void b(String str) {
        this.f154303a = str;
    }

    public void c(String str) {
        this.f154304b = str;
    }

    public String d() {
        return this.f154307e;
    }

    public void e(String str) {
        this.f154307e = str;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FileDescription{fileName='");
        sb2.append(this.f154303a);
        sb2.append("', fileType='");
        sb2.append(this.f154304b);
        sb2.append("', dirPath='");
        sb2.append(this.f154305c);
        sb2.append("', unZipDirPath='");
        sb2.append(this.f154306d);
        sb2.append("', unZipFilePath='");
        sb2.append(this.f154307e);
        sb2.append("', fileExists=");
        return C1636p.a(sb2, this.f154308f, '}');
    }

    public void a(String str) {
        this.f154305c = str;
    }

    public String b() {
        return this.f154304b;
    }

    public String c() {
        return this.f154306d;
    }

    public void d(String str) {
        this.f154306d = str;
    }

    public boolean e() {
        return this.f154308f;
    }

    public void a(boolean z10) {
        this.f154308f = z10;
    }
}
