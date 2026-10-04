package androidx.compose.runtime.snapshots;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SnapshotApplyConflictException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100079b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC1960k f100080a;

    public SnapshotApplyConflictException(@NotNull AbstractC1960k abstractC1960k) {
        this.f100080a = abstractC1960k;
    }

    @NotNull
    public final AbstractC1960k d() {
        return this.f100080a;
    }
}
