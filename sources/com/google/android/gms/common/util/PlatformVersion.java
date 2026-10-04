package com.google.android.gms.common.util;

import android.os.Build;
import androidx.core.os.C2403b;
import com.google.android.gms.common.annotation.KeepForSdk;
import e.InterfaceC4336j;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @InterfaceC4336j(api = 11)
    @Deprecated
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 12)
    @Deprecated
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 14)
    @Deprecated
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 15)
    @Deprecated
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 16)
    @Deprecated
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 17)
    @Deprecated
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 18)
    @Deprecated
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 19)
    @Deprecated
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 20)
    @Deprecated
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 21)
    @Deprecated
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 22)
    @Deprecated
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 23)
    @Deprecated
    public static boolean isAtLeastM() {
        return true;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 24)
    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 26)
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 28)
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 29)
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 30)
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 31)
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 32)
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 33)
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 34)
    public static boolean isAtLeastU() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @KeepForSdk
    @InterfaceC4336j(api = 35)
    public static boolean isAtLeastV() {
        return C2403b.m();
    }
}
