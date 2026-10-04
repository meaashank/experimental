package androidx.compose.material;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98912c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DrawerState f98913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SnackbarHostState f98914b;

    public t0(@NotNull DrawerState drawerState, @NotNull SnackbarHostState snackbarHostState) {
        this.f98913a = drawerState;
        this.f98914b = snackbarHostState;
    }

    @NotNull
    public final DrawerState a() {
        return this.f98913a;
    }

    @NotNull
    public final SnackbarHostState b() {
        return this.f98914b;
    }
}
