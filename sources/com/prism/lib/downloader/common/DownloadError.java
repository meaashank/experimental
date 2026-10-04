package com.prism.lib.downloader.common;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorType f178672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f178674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, List<String>> f178676e;

    public enum ErrorType {
        SERVER,
        CONNECTION,
        LOCAL_PERMISSION,
        SUSPICIOUS
    }

    public DownloadError(ErrorType errorType, String str) {
        this(errorType, str, null);
    }

    public Throwable a() {
        return this.f178674c;
    }

    public String b() {
        String str = this.f178673b;
        return str == null ? "" : str;
    }

    public ErrorType c() {
        return this.f178672a;
    }

    public Map<String, List<String>> d() {
        return this.f178676e;
    }

    public int e() {
        return this.f178675d;
    }

    public void f(int i10, Map<String, List<String>> map) {
        this.f178675d = i10;
        this.f178676e = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        sb2.append("responseCode: " + this.f178675d);
        sb2.append(", errorType: " + this.f178672a);
        sb2.append(", errorMesg: " + this.f178673b);
        StringBuilder sb3 = new StringBuilder(", errorException: ");
        Throwable th = this.f178674c;
        sb3.append(th == null ? "(null)" : th.toString());
        sb2.append(sb3.toString());
        sb2.append("}");
        return sb2.toString();
    }

    public DownloadError(ErrorType errorType, Throwable th) {
        this(errorType, th.getMessage(), th);
    }

    public DownloadError(ErrorType errorType, String str, Throwable th) {
        this.f178675d = -1;
        this.f178672a = errorType;
        this.f178673b = str;
        this.f178674c = th;
    }
}
