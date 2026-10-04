package com.inmobi.media;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3640m8 extends C3639m7 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f153167A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f153168B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f153169C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f153170D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f153171E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public HashMap f153172F;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f153173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f153174y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f153175z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640m8(String assetId, String assetName, C3626l8 assetStyle, Pc pc2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ArrayList arrayList, boolean z15) {
        super(assetId, assetName, "VIDEO", assetStyle, 16);
        kotlin.jvm.internal.G.p(assetId, "assetId");
        kotlin.jvm.internal.G.p(assetName, "assetName");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        this.f153173x = z15;
        this.f153148e = pc2;
        this.f153150g = "EXTERNAL";
        this.f153175z = z10;
        this.f153167A = z11;
        this.f153168B = z12;
        this.f153169C = z13;
        this.f153174y = new ArrayList();
        Map map = null;
        this.f153159p = pc2 != null ? ((Oc) pc2).f152358h : null;
        ArrayList arrayList2 = pc2 != null ? ((Oc) pc2).f152355e : null;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C3542f8 c3542f8 = (C3542f8) obj;
                if ("OMID_VIEWABILITY".equals(c3542f8.f152923c)) {
                    map = c3542f8.f152924d;
                    if (!TextUtils.isEmpty(c3542f8.f152925e) && kotlin.jvm.internal.Y.F(arrayList2)) {
                        arrayList2.add(c3542f8);
                    }
                } else if (kotlin.jvm.internal.Y.F(arrayList2)) {
                    arrayList2.add(c3542f8);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                C3542f8 c3542f82 = (C3542f8) obj2;
                if ("OMID_VIEWABILITY".equals(c3542f82.f152923c)) {
                    c3542f82.f152924d = map;
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            this.f153162s.addAll(arrayList2);
        }
        HashMap map2 = this.f153163t;
        map2.put("placementType", (byte) 0);
        map2.put("lastVisibleTimestamp", Integer.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        map2.put("visible", bool);
        map2.put("seekPosition", 0);
        map2.put("didStartPlaying", bool);
        map2.put("didPause", bool);
        map2.put("didCompleteQ1", bool);
        map2.put("didCompleteQ2", bool);
        map2.put("didCompleteQ3", bool);
        map2.put("didCompleteQ4", bool);
        map2.put("didRequestFullScreen", bool);
        map2.put("isFullScreen", bool);
        map2.put("didImpressionFire", bool);
        map2.put("mapViewabilityParams", new HashMap());
        map2.put("didSignalVideoCompleted", bool);
        map2.put("shouldAutoPlay", Boolean.valueOf(z14));
        map2.put("lastMediaVolume", 0);
        map2.put("currentMediaVolume", 0);
        map2.put("didQ4Fire", bool);
    }

    public final boolean a() {
        return this.f153173x ? this.f153175z && !C3657nb.o() : this.f153175z;
    }

    public final void b(int i10) {
        this.f153171E = i10;
    }

    public final Pc b() {
        Object obj = this.f153148e;
        if (obj instanceof Pc) {
            return (Pc) obj;
        }
        return null;
    }

    public final void a(int i10) {
        this.f153170D = i10;
    }

    public final void a(HashMap map) {
        this.f153172F = new HashMap(map);
    }

    public final void a(C3640m8 source) {
        HashMap map;
        kotlin.jvm.internal.G.p(source, "source");
        this.f153163t.putAll(source.f153163t);
        HashMap map2 = source.f153172F;
        if (map2 != null && (map = this.f153172F) != null) {
            map.putAll(map2);
        }
        ArrayList trackers = source.f153162s;
        kotlin.jvm.internal.G.p(trackers, "trackers");
        this.f153162s.addAll(trackers);
    }
}
