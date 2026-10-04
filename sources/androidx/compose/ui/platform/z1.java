package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.T(23)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z1 f103964a = new z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103965b = 0;

    @e.T(23)
    @InterfaceC4345t
    public final void a(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @e.T(23)
    @InterfaceC4345t
    @Nullable
    public final ActionMode b(@NotNull View view, @NotNull ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
