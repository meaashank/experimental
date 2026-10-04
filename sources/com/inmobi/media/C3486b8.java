package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3486b8 extends C3639m7 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C3472a8 f152727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f152728y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486b8(String assetId, String assetName, C3653n7 assetStyle, C3472a8 timer) {
        super(assetId, assetName, "TIMER", assetStyle, 16);
        kotlin.jvm.internal.G.p(assetId, "assetId");
        kotlin.jvm.internal.G.p(assetName, "assetName");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        kotlin.jvm.internal.G.p(timer, "timer");
        this.f152727x = timer;
    }

    public final void a(boolean z10) {
        this.f152728y = z10;
    }
}
