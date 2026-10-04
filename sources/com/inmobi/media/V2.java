package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;

/* JADX INFO: loaded from: classes5.dex */
public final class V2 extends v.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X2 f152509a;

    public V2(X2 x22) {
        this.f152509a = x22;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        kotlin.jvm.internal.G.p(name, "name");
        this.f152509a.f152581a = null;
    }

    @Override // v.f
    public final void onCustomTabsServiceConnected(ComponentName name, androidx.browser.customtabs.a client) {
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(client, "client");
        X2 x22 = this.f152509a;
        x22.f152581a = client;
        U2 u22 = x22.f152583c;
        if (u22 != null) {
            U1 u12 = (U1) u22;
            Uri uri = Uri.parse(u12.f152472a);
            kotlin.jvm.internal.G.o(uri, "parse(...)");
            X2 x23 = u12.f152477f;
            androidx.browser.customtabs.a aVar = x23.f152581a;
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(aVar != null ? aVar.k(new W2(x23)) : null);
            builder.enableUrlBarHiding();
            Context context = u12.f152478g;
            CustomTabsIntent customTabsIntentBuild = builder.build();
            kotlin.jvm.internal.G.o(customTabsIntentBuild, "build(...)");
            T2.a(context, customTabsIntentBuild, uri, u12.f152473b, u12.f152475d, u12.f152474c, u12.f152476e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        X2 x22 = this.f152509a;
        x22.f152581a = null;
        U2 u22 = x22.f152583c;
        if (u22 != null) {
            U1 u12 = (U1) u22;
            Z5 z52 = u12.f152475d;
            if (z52 != null) {
                z52.f152653g = "IN_NATIVE";
            }
            Q1 q12 = u12.f152473b;
            if (q12 != null) {
                q12.a(N5.f152290g, z52, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.G.p(name, "name");
        this.f152509a.f152581a = null;
    }
}
