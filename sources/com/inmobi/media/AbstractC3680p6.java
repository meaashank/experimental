package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3680p6 {
    public static void a(C3530ea c3530ea) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = AbstractC3694q6.f153295a;
        Objects.toString(c3530ea);
        if (c3530ea == null) {
            return;
        }
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null || kotlin.jvm.internal.G.g(weakReference.get(), c3530ea)) {
                    AbstractC3694q6.f153295a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
