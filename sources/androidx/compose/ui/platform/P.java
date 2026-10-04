package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(34)
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final P f103613a = new P();

    @InterfaceC4345t
    public final float a(@NotNull ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    @InterfaceC4345t
    public final float b(@NotNull ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }
}
