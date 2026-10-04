package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import androidx.core.view.C2462i0;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f154336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f154337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f154338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f154339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f154340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f154341f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f154336a = aVar;
        this.f154337b = aVar2;
        this.f154338c = aVar3;
        this.f154341f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(C2462i0.f111921j, C2462i0.f111921j, "URL cannot be empty");
        }
        b bVar = new b(this.f154336a, this.f154337b, this.f154338c);
        this.f154340e = bVar;
        bVar.c(str);
        this.f154340e.a(this.f154339d);
        c.a().a(this.f154340e, this.f154341f);
        return this.f154337b;
    }

    public void a() {
        b bVar = this.f154340e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f154339d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f154337b.a(str);
        this.f154337b.c(i10);
        this.f154337b.a(i11);
        this.f154337b.b(0);
        return this.f154337b;
    }
}
