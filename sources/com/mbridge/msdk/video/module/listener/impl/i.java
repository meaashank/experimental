package com.mbridge.msdk.video.module.listener.impl;

/* JADX INFO: loaded from: classes5.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f161046a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f161046a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f161046a;
        if (aVar != null) {
            aVar.a(i10, obj);
        }
    }
}
