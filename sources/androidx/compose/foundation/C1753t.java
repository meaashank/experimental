package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.C2205i;
import androidx.compose.ui.node.InterfaceC2203g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1753t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f92652a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f92652a;
    }

    public static final boolean b(@NotNull KeyEvent keyEvent) {
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        return iB == androidx.compose.ui.input.key.d.f102103d && d(keyEvent);
    }

    public static final boolean c(@NotNull InterfaceC2203g interfaceC2203g) {
        return e(C2205i.a(interfaceC2203g));
    }

    public static final boolean d(KeyEvent keyEvent) {
        int iA = (int) (androidx.compose.ui.input.key.e.a(keyEvent) >> 32);
        return iA == 23 || iA == 66 || iA == 160;
    }

    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(@NotNull KeyEvent keyEvent) {
        int iB = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f102101b.getClass();
        return iB == androidx.compose.ui.input.key.d.f102104e && d(keyEvent);
    }
}
