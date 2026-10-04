package androidx.compose.material;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.material.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1866l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98642c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BottomSheetState f98643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SnackbarHostState f98644b;

    public C1866l(@NotNull BottomSheetState bottomSheetState, @NotNull SnackbarHostState snackbarHostState) {
        this.f98643a = bottomSheetState;
        this.f98644b = snackbarHostState;
    }

    @NotNull
    public final BottomSheetState a() {
        return this.f98643a;
    }

    @NotNull
    public final SnackbarHostState b() {
        return this.f98644b;
    }
}
