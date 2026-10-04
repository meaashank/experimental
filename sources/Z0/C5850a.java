package z0;

import U6.j;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.lib_google_billing.q;
import e.S;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5850a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f241189a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f241190b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f241191c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f241192d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f241193e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f241194f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f241195g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f241196h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f241197i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f241198j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f241199k = 32;

    @NonNull
    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? q.f194113a : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @NonNull
    public static String b(int i10) {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("[");
        while (i10 > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i10);
            i10 &= ~iNumberOfTrailingZeros;
            if (sbA.length() > 1) {
                sbA.append(j.f68738d);
            }
            if (iNumberOfTrailingZeros == 1) {
                sbA.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sbA.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sbA.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sbA.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sbA.append("FEEDBACK_GENERIC");
            }
        }
        sbA.append("]");
        return sbA.toString();
    }

    @Nullable
    public static String c(int i10) {
        if (i10 == 1) {
            return "DEFAULT";
        }
        if (i10 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i10 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i10 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i10 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i10 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    @S(expression = "info.getCapabilities()")
    @Deprecated
    public static int d(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @Nullable
    @S(expression = "info.loadDescription(packageManager)")
    @Deprecated
    public static String e(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
