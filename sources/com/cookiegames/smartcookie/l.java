package com.cookiegames.smartcookie;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141368a;

        static {
            int[] iArr = new int[DeviceCapabilities.values().length];
            try {
                iArr[DeviceCapabilities.FULL_INCOGNITO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceCapabilities.WEB_RTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceCapabilities.THIRD_PARTY_COOKIE_BLOCKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f141368a = iArr;
        }
    }

    public static final boolean a(@NotNull DeviceCapabilities deviceCapabilities) {
        G.p(deviceCapabilities, "<this>");
        int i10 = a.f141368a[deviceCapabilities.ordinal()];
        if (i10 == 1) {
            return Build.VERSION.SDK_INT >= 28;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
