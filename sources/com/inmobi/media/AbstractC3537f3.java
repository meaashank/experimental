package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.HashMap;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3537f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f152908a = new HashMap();

    public static Config a(String str, String type) {
        kotlin.jvm.internal.G.p(type, "type");
        String str2 = str + SignatureVisitor.SUPER + type;
        HashMap map = f152908a;
        Object objA = map.get(str2);
        if (objA == null) {
            Config.Companion.getClass();
            objA = C3662o2.a(type, str);
            map.put(str2, objA);
        }
        return (Config) objA;
    }
}
