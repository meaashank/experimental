package com.mbridge.msdk.timer;

import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    public static class C0635b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f159873a = new b();
    }

    public static b getInstance() {
        return C0635b.f159873a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(i.b());
        if (gVarA == null) {
            gVarA = i.b().a();
        }
        if (gVarA.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r0 * 1000);
        }
    }

    private b() {
    }
}
