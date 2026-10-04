package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f155676a;

    private c() {
    }

    public static c a() {
        if (f155676a == null) {
            synchronized (c.class) {
                try {
                    if (f155676a == null) {
                        f155676a = new c();
                    }
                } finally {
                }
            }
        }
        return f155676a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T aVar = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.c();
            } else if (str.equals("download")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.b();
            } else if (!str.equals("deeplink") && str.equals("activity")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.a();
            }
            if (str.equals("feedback")) {
                aVar = new d();
            }
            if (str.equals("notice")) {
                aVar = new e();
            }
            if (str.equals("permissionInfo")) {
                aVar = new f();
            }
            if (str.equals("privateAddress")) {
                return new g();
            }
        }
        return aVar;
    }
}
