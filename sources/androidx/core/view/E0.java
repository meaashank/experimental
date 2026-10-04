package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f111496a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111497b = 1;

    @e.T(21)
    public static class a {
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        public static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    @e.S(expression = "group.getLayoutMode()")
    @Deprecated
    public static int a(@NonNull ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int b(@NonNull ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean c(@NonNull ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @e.S(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @e.S(expression = "group.setLayoutMode(mode)")
    @Deprecated
    public static void e(@NonNull ViewGroup viewGroup, int i10) {
        viewGroup.setLayoutMode(i10);
    }

    @e.S(expression = "group.setMotionEventSplittingEnabled(split)")
    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z10) {
        viewGroup.setMotionEventSplittingEnabled(z10);
    }

    public static void g(@NonNull ViewGroup viewGroup, boolean z10) {
        viewGroup.setTransitionGroup(z10);
    }
}
