package androidx.compose.runtime.snapshots;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100055c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100056a = SnapshotKt.I().g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public L f100057b;

    public abstract void c(@NotNull L l10);

    @NotNull
    public abstract L d();

    @Nullable
    public final L e() {
        return this.f100057b;
    }

    public final int f() {
        return this.f100056a;
    }

    public final void g(@Nullable L l10) {
        this.f100057b = l10;
    }

    public final void h(int i10) {
        this.f100056a = i10;
    }
}
