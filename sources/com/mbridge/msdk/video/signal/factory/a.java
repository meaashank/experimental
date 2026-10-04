package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* JADX INFO: loaded from: classes5.dex */
public class a implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f161396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f161397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected j f161398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected g f161399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected f f161400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected i f161401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected c f161402g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f161396a == null) {
            this.f161396a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f161396a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f161401f == null) {
            this.f161401f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f161401f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f161402g == null) {
            this.f161402g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f161402g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f161397b == null) {
            this.f161397b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f161397b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f161400e == null) {
            this.f161400e = new e();
        }
        return this.f161400e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f161399d == null) {
            this.f161399d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f161399d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f161398c == null) {
            this.f161398c = new h();
        }
        return this.f161398c;
    }
}
