package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.Mc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class Mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Mc f152258a = new Mc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlin.G f152259b = kotlin.I.a(Lc.f152205a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlin.G f152260c = kotlin.I.a(Kc.f152178a);

    public static void a(final C3561h ad2, final AdConfig adConfig, final Nc nc2, final N4 n42) {
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(adConfig, "adConfig");
        ((ExecutorService) f152259b.getValue()).execute(new Runnable() { // from class: F5.b0
            @Override // java.lang.Runnable
            public final void run() {
                Mc.b(ad2, adConfig, nc2, n42);
            }
        });
    }

    public static final void b(C3561h ad2, AdConfig adConfig, Nc nc2, N4 n42) {
        kotlin.jvm.internal.G.p(ad2, "$ad");
        kotlin.jvm.internal.G.p(adConfig, "$adConfig");
        Mc mc2 = f152258a;
        try {
            if (mc2.a(ad2.s(), nc2)) {
                C3561h c3561hA = AbstractC3756v.a(ad2, adConfig, n42);
                if (c3561hA == null) {
                    mc2.a(ad2, false, (short) 75);
                } else {
                    mc2.a(c3561hA, true, (short) 0);
                }
            }
        } catch (VastException e10) {
            mc2.a(ad2, false, e10.getTelemetryErrorCode());
        } catch (JSONException unused) {
            mc2.a(ad2, false, (short) 58);
        }
    }

    public final synchronized boolean a(String str, Nc nc2) {
        kotlin.G g10 = f152260c;
        List list = (List) ((HashMap) g10.getValue()).get(str);
        if (list != null) {
            list.add(new WeakReference(nc2));
            return false;
        }
        ((HashMap) g10.getValue()).put(str, kotlin.collections.I.U(new WeakReference(nc2)));
        return true;
    }

    public final synchronized void a(final C3561h c3561h, final boolean z10, final short s10) {
        List list = (List) ((HashMap) f152260c.getValue()).remove(c3561h.s());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final Nc nc2 = (Nc) ((WeakReference) it.next()).get();
                if (nc2 != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: F5.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Mc.a(nc2, c3561h, z10, s10);
                        }
                    });
                }
            }
        }
    }

    public static final void a(Nc nc2, C3561h ad2, boolean z10, short s10) {
        kotlin.jvm.internal.G.p(ad2, "$ad");
        nc2.a(ad2, z10, s10);
    }
}
