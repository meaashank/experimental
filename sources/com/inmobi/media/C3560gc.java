package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3560gc extends Lambda implements ed.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3560gc f152955a = new C3560gc();

    public C3560gc() {
        super(2);
    }

    @Override // ed.p
    public final Object invoke(Object obj, Object obj2) {
        JSONObject param = (JSONObject) obj;
        int iIntValue = ((Number) obj2).intValue();
        kotlin.jvm.internal.G.p(param, "param");
        Iterator<String> itKeys = param.keys();
        kotlin.jvm.internal.G.o(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (param.getInt(itKeys.next()) < iIntValue) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
