package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105425c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Throwable f105426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f105427b = new Object();

    public final void a(@NotNull Throwable th) {
        synchronized (this.f105427b) {
            this.f105426a = th;
        }
    }

    public final void b() {
        synchronized (this.f105427b) {
            Throwable th = this.f105426a;
            if (th != null) {
                this.f105426a = null;
                throw th;
            }
        }
    }
}
