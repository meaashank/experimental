package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface b extends d {

    @r(parameters = 1)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f90147a = 0;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.b$b, reason: collision with other inner class name */
    @r(parameters = 1)
    public static final class C0197b implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90148b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f90149a;

        public C0197b(@NotNull a aVar) {
            this.f90149a = aVar;
        }

        @NotNull
        public final a a() {
            return this.f90149a;
        }
    }
}
