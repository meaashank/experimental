package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.inmobi.media.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3518dc extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3532ec f152822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f152823b;

    public C3518dc(C3532ec c3532ec, byte b10) {
        this.f152822a = c3532ec;
        this.f152823b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f152822a.a(this.f152823b);
    }
}
