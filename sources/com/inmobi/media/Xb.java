package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class Xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0 f152603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f152607e;

    public Xb(G0 g02, String str, String str2, String markupType) {
        kotlin.jvm.internal.G.p(markupType, "markupType");
        this.f152603a = g02;
        this.f152604b = str;
        this.f152605c = str2;
        this.f152606d = markupType;
    }

    public final LinkedHashMap a() {
        String strM;
        String strQ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        G0 g02 = this.f152603a;
        if (g02 != null && (strQ = g02.f151957a.q()) != null) {
            linkedHashMap.put("adType", strQ);
        }
        G0 g03 = this.f152603a;
        if (g03 != null) {
            linkedHashMap.put("plId", Long.valueOf(g03.f151957a.I().l()));
        }
        G0 g04 = this.f152603a;
        if (g04 != null && (strM = g04.f151957a.I().m()) != null) {
            linkedHashMap.put("plType", strM);
        }
        G0 g05 = this.f152603a;
        if (g05 != null) {
            C3604k0 c3604k0Y = g05.f151957a.y();
            Boolean boolO = c3604k0Y != null ? c3604k0Y.o() : null;
            if (boolO != null) {
                linkedHashMap.put("isRewarded", boolO);
            }
        }
        String str = this.f152605c;
        if (str != null) {
            linkedHashMap.put("creativeId", str);
        }
        String str2 = this.f152604b;
        if (str2 != null) {
            linkedHashMap.put("creativeType", str2);
        }
        linkedHashMap.put("markupType", this.f152606d);
        String str3 = this.f152607e;
        if (str3 == null) {
            kotlin.jvm.internal.G.S("triggerSource");
            throw null;
        }
        linkedHashMap.put("trigger", str3);
        G0 g06 = this.f152603a;
        if (g06 != null && g06.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f152603a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        Yb yb2;
        AtomicBoolean atomicBoolean;
        G0 g02 = this.f152603a;
        if (g02 == null || (yb2 = g02.f151958b) == null || (atomicBoolean = yb2.f152633a) == null || !atomicBoolean.getAndSet(true)) {
            a().put("networkType", C3635m3.q());
            a().put("errorCode", (short) 2180);
            LinkedHashMap linkedHashMapA = a();
            Lb lb2 = Lb.f152196a;
            Lb.b("AdImpressionSuccessful", linkedHashMapA, Qb.f152402a);
        }
    }

    public final void c() {
        Yb yb2;
        AtomicBoolean atomicBoolean;
        G0 g02 = this.f152603a;
        if (g02 == null || (yb2 = g02.f151958b) == null || (atomicBoolean = yb2.f152633a) == null || !atomicBoolean.getAndSet(true)) {
            a().put("networkType", C3635m3.q());
            a().put("errorCode", (short) 2177);
            LinkedHashMap linkedHashMapA = a();
            Lb lb2 = Lb.f152196a;
            Lb.b("AdImpressionSuccessful", linkedHashMapA, Qb.f152402a);
        }
    }

    public final void d() {
        Yb yb2;
        AtomicBoolean atomicBoolean;
        G0 g02 = this.f152603a;
        if (g02 == null || (yb2 = g02.f151958b) == null || (atomicBoolean = yb2.f152633a) == null || !atomicBoolean.getAndSet(true)) {
            a().put("networkType", C3635m3.q());
            a().put("errorCode", (short) 0);
            LinkedHashMap linkedHashMapA = a();
            Lb lb2 = Lb.f152196a;
            Lb.b("AdImpressionSuccessful", linkedHashMapA, Qb.f152402a);
        }
    }
}
