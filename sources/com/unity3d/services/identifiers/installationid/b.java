package com.unity3d.services.identifiers.installationid;

import java.util.UUID;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f194510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f194511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f194512d;

    public b(a installationIdProvider, a analyticsIdProvider, a unityAdsIdProvider) {
        G.p(installationIdProvider, "installationIdProvider");
        G.p(analyticsIdProvider, "analyticsIdProvider");
        G.p(unityAdsIdProvider, "unityAdsIdProvider");
        this.f194510b = installationIdProvider;
        this.f194511c = analyticsIdProvider;
        this.f194512d = unityAdsIdProvider;
        this.f194509a = "";
        a();
        b();
    }

    public final void a() {
        String string;
        a aVar;
        if (this.f194510b.a().length() > 0) {
            aVar = this.f194510b;
        } else if (this.f194511c.a().length() > 0) {
            aVar = this.f194511c;
        } else {
            if (this.f194512d.a().length() <= 0) {
                string = UUID.randomUUID().toString();
                G.o(string, "UUID.randomUUID().toString()");
                this.f194509a = string;
            }
            aVar = this.f194512d;
        }
        string = aVar.a();
        this.f194509a = string;
    }

    public final void b() {
        this.f194510b.a(this.f194509a);
        this.f194511c.a(this.f194509a);
        this.f194512d.a(this.f194509a);
    }
}
