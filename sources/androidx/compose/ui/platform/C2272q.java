package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class C2272q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2272q f103918a = new C2272q();

    @e.T(23)
    @InterfaceC4345t
    public final void a(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
