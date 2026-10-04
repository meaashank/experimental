package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ja f152246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f152247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f152248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ka f152250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f152251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final La f152252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f152253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f152254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f152255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V8 f152256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f152257m;

    public Ma(Ia ia2) {
        this.f152245a = ia2.f152056a;
        this.f152246b = ia2.f152057b;
        this.f152247c = ia2.f152058c;
        this.f152248d = ia2.f152059d;
        String str = ia2.f152060e;
        this.f152249e = str == null ? "" : str;
        this.f152250f = Ka.f152175a;
        Boolean bool = ia2.f152061f;
        this.f152251g = bool != null ? bool.booleanValue() : true;
        this.f152252h = ia2.f152062g;
        Integer num = ia2.f152063h;
        this.f152253i = num != null ? num.intValue() : 60000;
        Integer num2 = ia2.f152064i;
        this.f152254j = num2 != null ? num2.intValue() : 60000;
        Boolean bool2 = ia2.f152065j;
        this.f152255k = bool2 != null ? bool2.booleanValue() : false;
    }

    public final String toString() {
        return "URL:" + U8.a(this.f152245a, this.f152248d) + " | TAG:null | METHOD:" + this.f152246b + " | PAYLOAD:" + this.f152249e + " | HEADERS:" + this.f152247c + " | RETRY_POLICY:" + this.f152252h;
    }
}
