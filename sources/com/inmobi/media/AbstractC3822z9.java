package com.inmobi.media;

import android.content.Context;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3822z9 {
    public static final boolean a(Context context, String permission) {
        kotlin.jvm.internal.G.p(permission, "permission");
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(permission) == 0;
    }
}
