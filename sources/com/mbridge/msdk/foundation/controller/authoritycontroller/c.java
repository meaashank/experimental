package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* JADX INFO: loaded from: classes5.dex */
public class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile c f155975j;

    private c() {
        h();
    }

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f155975j == null) {
            synchronized (c.class) {
                try {
                    if (f155975j == null) {
                        f155975j = new c();
                    }
                } finally {
                }
            }
        }
        return f155975j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = i.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.z0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.y0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.A0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z10;
        g gVarA = com.mbridge.msdk.advanced.manager.g.a(i.b());
        if (gVarA == null) {
            gVarA = i.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iN0 = gVarA.n0();
        boolean z11 = iN0 != 0 ? iN0 == 1 && a(gVarA, str) == 1 : a(str) == 1 && a(gVarA, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        return (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) ? (gVarA.K0() || z10 || a(str) != 1) ? false : true : z11;
    }
}
