package com.inmobi.media;

import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3708r7 extends C3639m7 implements Iterable, InterfaceC4418a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f153310A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f153311B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f153312C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f153313D;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f153314x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f153315y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte f153316z;

    public /* synthetic */ C3708r7(String str, String str2, C3653n7 c3653n7, String str3, JSONObject jSONObject, byte b10) {
        this(str, str2, c3653n7, new ArrayList(), str3, jSONObject, b10);
    }

    public final void a(C3639m7 child) {
        kotlin.jvm.internal.G.p(child, "child");
        int i10 = this.f153311B;
        if (i10 < this.f153314x) {
            this.f153311B = i10 + 1;
            this.f153310A.add(child);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3695q7(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3708r7(String assetId, String assetName, C3653n7 assetStyle, List trackers, String interactionMode, JSONObject rawAssetJson, byte b10) {
        super(assetId, assetName, "CONTAINER", assetStyle, trackers);
        kotlin.jvm.internal.G.p(assetId, "assetId");
        kotlin.jvm.internal.G.p(assetName, "assetName");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        kotlin.jvm.internal.G.p(trackers, "trackers");
        kotlin.jvm.internal.G.p(interactionMode, "interactionMode");
        kotlin.jvm.internal.G.p(rawAssetJson, "rawAssetJson");
        this.f153314x = 16;
        this.f153316z = b10;
        this.f153310A = new ArrayList();
        this.f153150g = interactionMode;
        this.f153312C = "root".equalsIgnoreCase(assetName);
        this.f153313D = "card_scrollable".equalsIgnoreCase(assetName);
    }
}
