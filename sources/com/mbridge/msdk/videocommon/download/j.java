package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f161544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f161545b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f161546a = new j();
    }

    public static j a() {
        return b.f161546a;
    }

    public boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f161544a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f161544a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e10) {
            this.f161544a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                m.a(e10, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.f161544a.get();
    }

    private j() {
    }

    public boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f161545b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f161545b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e10) {
            this.f161545b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                m.a(e10, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.f161545b.get();
    }
}
