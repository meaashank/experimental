package X0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: X0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1347c {

    /* JADX INFO: renamed from: X0.c$a */
    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z10);
    }

    /* JADX INFO: renamed from: X0.c$b */
    @Deprecated
    public static abstract class b implements a {
    }

    /* JADX INFO: renamed from: X0.c$c, reason: collision with other inner class name */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC0137c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f76743a;

        public AccessibilityManagerAccessibilityStateChangeListenerC0137c(@NonNull a aVar) {
            this.f76743a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0137c) {
                return this.f76743a.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0137c) obj).f76743a);
            }
            return false;
        }

        public int hashCode() {
            return this.f76743a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            this.f76743a.onAccessibilityStateChanged(z10);
        }
    }

    /* JADX INFO: renamed from: X0.c$d */
    @e.T(34)
    public static class d {
        public static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: renamed from: X0.c$e */
    public interface e {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* JADX INFO: renamed from: X0.c$f */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f76744a;

        public f(@NonNull e eVar) {
            this.f76744a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f76744a.equals(((f) obj).f76744a);
            }
            return false;
        }

        public int hashCode() {
            return this.f76744a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f76744a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0137c(aVar));
    }

    @e.S(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean b(@NonNull AccessibilityManager accessibilityManager, @NonNull e eVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @e.S(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i10) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i10);
    }

    @e.S(expression = "manager.getInstalledAccessibilityServiceList()")
    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean e(@NonNull AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(accessibilityManager);
        }
        return true;
    }

    @e.S(expression = "manager.isTouchExplorationEnabled()")
    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean g(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0137c(aVar));
    }

    @e.S(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean h(@NonNull AccessibilityManager accessibilityManager, @NonNull e eVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
