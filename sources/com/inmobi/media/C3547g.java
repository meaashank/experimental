package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3547g extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3561h f152934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3547g(C3561h c3561h) {
        super(0);
        this.f152934a = c3561h;
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        return new AdMetaInfo(this.f152934a.o(), this.f152934a.E());
    }
}
