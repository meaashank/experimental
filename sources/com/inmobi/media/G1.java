package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public abstract class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f151967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f151968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f151970d;

    public G1(String eventType, String str) {
        kotlin.jvm.internal.G.p(eventType, "eventType");
        this.f151967a = eventType;
        this.f151970d = str;
        this.f151968b = System.currentTimeMillis();
    }

    public final String a() {
        String str = this.f151970d;
        return str == null ? "" : str;
    }
}
