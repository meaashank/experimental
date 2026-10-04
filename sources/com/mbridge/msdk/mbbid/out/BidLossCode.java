package com.mbridge.msdk.mbbid.out;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: loaded from: classes5.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f157268a;

    private BidLossCode(int i10) {
        f157268a = i10;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN);
    }

    public int getCurrentCode() {
        return f157268a;
    }
}
