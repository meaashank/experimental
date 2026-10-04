package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3805y6 implements InterfaceC3791x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3791x6 f153557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f153558b;

    public C3805y6(InterfaceC3791x6 mediaChangeReceiver) {
        kotlin.jvm.internal.G.p(mediaChangeReceiver, "mediaChangeReceiver");
        this.f153557a = mediaChangeReceiver;
        this.f153558b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3791x6
    public final void a() {
        if (this.f153558b.getAndSet(false)) {
            this.f153557a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3791x6
    public final void b() {
        if (this.f153558b.getAndSet(true)) {
            return;
        }
        this.f153557a.b();
    }
}
