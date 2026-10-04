package com.unity3d.services.identifiers;

import com.unity3d.services.identifiers.installationid.b;

/* JADX INFO: loaded from: classes7.dex */
public final class InstallationId {
    public static final InstallationId INSTANCE = new InstallationId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f194505a;

    static {
        String str;
        b bVar;
        a aVar = a.f194507b;
        if (aVar == null || (bVar = aVar.f194508a) == null || (str = bVar.f194509a) == null) {
            str = "";
        }
        f194505a = str;
    }

    public final String getId() {
        return f194505a;
    }
}
