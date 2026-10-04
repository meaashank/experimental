package com.cookiegames.smartcookie.download;

import android.app.DownloadManager;
import hc.H;
import javax.inject.Provider;
import p4.InterfaceC5390c;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dagger.internal.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<X3.k> f141222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<DownloadManager> f141223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<H> f141224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<H> f141225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<H> f141226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC5390c> f141227f;

    public d(Provider<X3.k> provider, Provider<DownloadManager> provider2, Provider<H> provider3, Provider<H> provider4, Provider<H> provider5, Provider<InterfaceC5390c> provider6) {
        this.f141222a = provider;
        this.f141223b = provider2;
        this.f141224c = provider3;
        this.f141225d = provider4;
        this.f141226e = provider5;
        this.f141227f = provider6;
    }

    public static d a(Provider<X3.k> provider, Provider<DownloadManager> provider2, Provider<H> provider3, Provider<H> provider4, Provider<H> provider5, Provider<InterfaceC5390c> provider6) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static c c(X3.k kVar, DownloadManager downloadManager, H h10, H h11, H h12, InterfaceC5390c interfaceC5390c) {
        return new c(kVar, downloadManager, h10, h11, h12, interfaceC5390c);
    }

    public static c d(Provider<X3.k> provider, Provider<DownloadManager> provider2, Provider<H> provider3, Provider<H> provider4, Provider<H> provider5, Provider<InterfaceC5390c> provider6) {
        return new c(provider.get(), provider2.get(), provider3.get(), provider4.get(), provider5.get(), provider6.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return d(this.f141222a, this.f141223b, this.f141224c, this.f141225d, this.f141226e, this.f141227f);
    }
}
