package com.prism.gaia.naked.metadata.android.net.wifi;

import W6.b;
import W6.c;
import W6.i;
import W6.k;
import W6.m;
import W6.n;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class WifiInfoCAGI {

    @i(WifiInfo.class)
    @m
    public interface C extends ClassAccessor {
        @k
        NakedConstructor<WifiInfo> ctor();

        @n("mBSSID")
        NakedObject<String> mBSSID();

        @n("mFrequency")
        NakedInt mFrequency();

        @n("mIpAddress")
        NakedObject<InetAddress> mIpAddress();

        @n("mLinkSpeed")
        NakedInt mLinkSpeed();

        @n("mMacAddress")
        NakedObject<String> mMacAddress();

        @n("mNetworkId")
        NakedInt mNetworkId();

        @n("mRssi")
        NakedInt mRssi();

        @n("mSSID")
        NakedObject<String> mSSID();

        @n("mSupplicantState")
        NakedObject<SupplicantState> mSupplicantState();

        @n("mWifiSsid")
        NakedObject<Object> mWifiSsid();
    }
}
