package com.android.launcher3.compat;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibilityManagerCompat {
    private static AccessibilityManager getManager(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static boolean isAccessibilityEnabled(Context context) {
        return getManager(context).isEnabled();
    }

    public static boolean isObservedEventType(Context context, int i10) {
        return isAccessibilityEnabled(context);
    }

    public static void sendCustomAccessibilityEvent(View view, int i10, String str) {
        if (isObservedEventType(view.getContext(), i10)) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            accessibilityEventObtain.getText().add(str);
            getManager(view.getContext()).sendAccessibilityEvent(accessibilityEventObtain);
        }
    }
}
