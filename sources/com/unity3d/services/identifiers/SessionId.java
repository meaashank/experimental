package com.unity3d.services.identifiers;

import java.util.UUID;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final class SessionId {
    public static final SessionId INSTANCE = new SessionId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f194506a;

    static {
        String string = UUID.randomUUID().toString();
        G.o(string, "UUID.randomUUID().toString()");
        f194506a = string;
    }

    public final String getId() {
        return f194506a;
    }
}
