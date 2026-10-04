package com.unity3d.services.identifiers;

import android.content.Context;
import com.unity3d.services.identifiers.installationid.b;
import com.unity3d.services.identifiers.installationid.c;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f194507b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f194508a;

    public a(Context context) {
        G.p(context, "context");
        String str = context.getPackageName() + ".v2.playerprefs";
        this.f194508a = new b(new c(context, str, "UnityInstallationId"), new c(context, str, "unity.cloud_userid"), new c(context, "unityads-installinfo", "unityads-idfi"));
    }
}
