package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3639m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3653n7 f153147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f153148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f153149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f153150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f153151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f153152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f153153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f153154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f153155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f153156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f153157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f153158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f153159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f153160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C3639m7 f153161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f153162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f153163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f153164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f153165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3639m7 f153166w;

    public C3639m7(String assetId, String assetName, String assetType, C3653n7 assetStyle, List trackers) {
        kotlin.jvm.internal.G.p(assetId, "assetId");
        kotlin.jvm.internal.G.p(assetName, "assetName");
        kotlin.jvm.internal.G.p(assetType, "assetType");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        kotlin.jvm.internal.G.p(trackers, "trackers");
        this.f153144a = assetId;
        this.f153145b = assetName;
        this.f153146c = assetType;
        this.f153147d = assetStyle;
        this.f153150g = "NO_ACTION";
        this.f153151h = "";
        this.f153156m = (byte) 2;
        this.f153157n = -1;
        this.f153159p = "";
        this.f153160q = "";
        ArrayList arrayList = new ArrayList();
        this.f153162s = arrayList;
        this.f153163t = new HashMap();
        arrayList.addAll(trackers);
    }

    public static void a(C3542f8 tracker, HashMap map, U6 u62, N4 n42) {
        kotlin.jvm.internal.G.p(tracker, "tracker");
        String str = tracker.f152925e;
        boolean z10 = C3473a9.f152704a;
        C3564h2.f152957a.a(C3473a9.a(str, map), tracker.f152924d, true, u62, F9.f151932b, n42);
    }

    public static void d(String str) {
        kotlin.jvm.internal.G.p(str, "<set-?>");
    }

    public final void b(byte b10) {
        this.f153156m = b10;
    }

    public final void c(String str) {
        kotlin.jvm.internal.G.p(str, "<set-?>");
    }

    public final void b(String str) {
        String string;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.G.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            string = str.subSequence(i10, length + 1).toString();
        } else {
            string = null;
        }
        this.f153159p = string;
    }

    public final void a(byte b10) {
        this.f153153j = b10;
    }

    public final void a(C3708r7 c3708r7) {
        this.f153161r = c3708r7;
    }

    public final void a(String eventType, HashMap map, U6 u62, N4 n42) {
        kotlin.jvm.internal.G.p(eventType, "eventType");
        ArrayList arrayList = this.f153162s;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C3542f8 c3542f8 = (C3542f8) obj;
            if (eventType.equals(c3542f8.f152923c)) {
                a(c3542f8, map, u62, n42);
            }
        }
    }

    public final void a(String value) {
        kotlin.jvm.internal.G.p(value, "value");
        int length = value.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.G.t(value.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        this.f153160q = value.subSequence(i10, length + 1).toString();
    }

    public /* synthetic */ C3639m7(String str, String str2, String str3, C3653n7 c3653n7, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "root" : str2, (i10 & 4) != 0 ? "CONTAINER" : str3, (i10 & 8) != 0 ? new C3653n7() : c3653n7, new LinkedList());
    }
}
