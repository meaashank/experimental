package com.inmobi.media;

import F5.RunnableC1047c2;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C4967t;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3672oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3672oc f153249a = new C3672oc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static H0 f153250b;

    public static void e() {
        boolean z10;
        boolean zBooleanValue;
        H0 h02;
        try {
            Context contextD = C3657nb.d();
            if (contextD != null) {
                H0 h03 = new H0();
                ((C4967t) kotlin.jvm.internal.O.d(AdvertisingIdClient.class)).Q();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(contextD);
                kotlin.jvm.internal.G.o(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                h03.a(advertisingIdInfo.getId());
                h03.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                f153250b = h03;
                Boolean bool = M9.f152232b;
                if (bool == null) {
                    Context contextD2 = C3657nb.d();
                    z10 = false;
                    if (contextD2 != null) {
                        ConcurrentHashMap concurrentHashMap = K5.f152164b;
                        M9.f152232b = Boolean.valueOf(J5.a(contextD2, "user_info_store").f152165a.getBoolean("user_age_restricted", false));
                    }
                    Boolean bool2 = M9.f152232b;
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    }
                    if (z10 && (h02 = f153250b) != null) {
                        h02.a((String) null);
                    }
                    return;
                }
                zBooleanValue = bool.booleanValue();
                z10 = zBooleanValue;
                if (z10) {
                    h02.a((String) null);
                }
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
    }

    public static final void f() {
        e();
    }

    @e.g0
    public final void a() {
        try {
            e();
            d();
        } catch (Exception unused) {
        }
    }

    @Nullable
    public final H0 b() {
        return f153250b;
    }

    @Nullable
    public final Boolean c() {
        H0 h02 = f153250b;
        if (h02 != null) {
            return h02.c();
        }
        return null;
    }

    public final void d() {
        String strA;
        try {
            H0 h02 = f153250b;
            if (h02 == null || (strA = h02.a()) == null) {
                return;
            }
            AbstractC3666o6.a((byte) 2, "oc", "Publisher device Id is ".concat(strA));
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        H0 h02 = f153250b;
        if (h02 == null) {
            return;
        }
        if (z10) {
            h02.a((String) null);
        } else if (h02.a() == null) {
            C3657nb.a(new RunnableC1047c2());
        }
    }
}
