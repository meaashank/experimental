package ta;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ta.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5626a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f239220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f239221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f239222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f239223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f239224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f239225f;

    public boolean a() {
        if (this.f239223d != null) {
            try {
                return com.prism.lib.downloader.a.o().parse(this.f239223d).exists();
            } catch (IOException unused) {
            }
        }
        return new File(this.f239222c).exists();
    }

    public long b() {
        return this.f239225f;
    }

    public String c() {
        return this.f239222c;
    }

    public long d() {
        return this.f239220a;
    }

    public String e() {
        return this.f239223d;
    }

    public long f() {
        return this.f239224e;
    }

    public String g() {
        return this.f239221b;
    }

    public void h(long j10) {
        this.f239225f = j10;
    }

    public void i(String str) {
        this.f239222c = str;
    }

    public void j(long j10) {
        this.f239220a = j10;
    }

    public void k(String str) {
        this.f239223d = str;
    }

    public void l(long j10) {
        this.f239224e = j10;
    }

    public void m(String str) {
        this.f239221b = str;
    }
}
