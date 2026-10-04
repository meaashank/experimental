package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.C4967t;

/* JADX INFO: loaded from: classes5.dex */
public abstract class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f152422a;

    static {
        b();
    }

    public static final void a(ed.l tmp0, Object obj) {
        kotlin.jvm.internal.G.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static void b() {
        Context contextD = C3657nb.d();
        if (contextD != null && a()) {
            AppSetIdClient client = AppSet.getClient(contextD);
            kotlin.jvm.internal.G.o(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            kotlin.jvm.internal.G.o(appSetIdInfo, "getAppSetIdInfo(...)");
            final R0 r02 = R0.f152405a;
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: F5.y0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    com.inmobi.media.S0.a(r02, obj);
                }
            });
        }
    }

    public static boolean a() {
        try {
            ((C4967t) kotlin.jvm.internal.O.d(AppSetIdInfo.class)).Q();
            ((C4967t) kotlin.jvm.internal.O.f217893a.d(Task.class)).Q();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }
}
