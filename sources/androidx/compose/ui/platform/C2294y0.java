package androidx.compose.ui.platform;

import android.view.MotionEvent;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(29)
public final class C2294y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2294y0 f103947a = new C2294y0();

    @InterfaceC4345t
    public final boolean a(@NotNull MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i10);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
