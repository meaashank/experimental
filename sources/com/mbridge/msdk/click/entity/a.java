package com.mbridge.msdk.click.entity;

import android.support.v4.media.e;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f154005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f154006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f154007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f154008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f154009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f154010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f154011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f154012h;

    public String a() {
        return "statusCode=" + this.f154010f + ", location=" + this.f154005a + ", contentType=" + this.f154006b + ", contentLength=" + this.f154009e + ", contentEncoding=" + this.f154007c + ", referer=" + this.f154008d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickResponseHeader{location='");
        sb2.append(this.f154005a);
        sb2.append("', contentType='");
        sb2.append(this.f154006b);
        sb2.append("', contentEncoding='");
        sb2.append(this.f154007c);
        sb2.append("', referer='");
        sb2.append(this.f154008d);
        sb2.append("', contentLength=");
        sb2.append(this.f154009e);
        sb2.append(", statusCode=");
        sb2.append(this.f154010f);
        sb2.append(", url='");
        sb2.append(this.f154011g);
        sb2.append("', exception='");
        return e.a(sb2, this.f154012h, "'}");
    }
}
