package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100460b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DragEvent f100461a;

    public b(@NotNull DragEvent dragEvent) {
        this.f100461a = dragEvent;
    }

    @NotNull
    public final DragEvent a() {
        return this.f100461a;
    }
}
