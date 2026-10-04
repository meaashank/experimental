package com.inmobi.media;

import androidx.activity.C1477d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3603k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f153062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f153063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f153064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f153065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f153066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f153067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f153068h;

    public C3603k(String batchId, Set rawAssets, InterfaceC3549g1 listener, String str, int i10) {
        str = (i10 & 16) != 0 ? null : str;
        kotlin.jvm.internal.G.p(batchId, "batchId");
        kotlin.jvm.internal.G.p(rawAssets, "rawAssets");
        kotlin.jvm.internal.G.p(listener, "listener");
        this.f153064d = new WeakReference(listener);
        this.f153067g = new ArrayList();
        this.f153065e = new HashSet();
        this.f153068h = rawAssets;
        this.f153066f = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdAssetBatch{rawAssets=");
        sb2.append(this.f153068h);
        sb2.append(", batchDownloadSuccessCount=");
        sb2.append(this.f153061a);
        sb2.append(", batchDownloadFailureCount=");
        return C1477d.a(sb2, this.f153062b, '}');
    }
}
