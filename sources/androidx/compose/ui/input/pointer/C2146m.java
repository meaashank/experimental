package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(29)
public final class C2146m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2146m f102304a = new C2146m();

    @InterfaceC4345t
    public final long a(@NotNull MotionEvent motionEvent, int i10) {
        return P.h.a(motionEvent.getRawX(i10), motionEvent.getRawY(i10));
    }
}
