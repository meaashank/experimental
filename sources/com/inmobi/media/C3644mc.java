package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3644mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f153178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f153179b = new LinkedHashMap();

    public C3644mc(byte b10) {
        this.f153178a = b10;
    }

    public final Object a(String key, Class classType) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(classType, "classType");
        Object obj = this.f153179b.get(key);
        if (classType.isInstance(obj)) {
            return classType.cast(obj);
        }
        return null;
    }
}
