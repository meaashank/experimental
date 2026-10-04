package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface c extends d {

    @r(parameters = 1)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f90150a = 0;
    }

    @r(parameters = 1)
    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90151b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f90152a;

        public b(@NotNull a aVar) {
            this.f90152a = aVar;
        }

        @NotNull
        public final a a() {
            return this.f90152a;
        }
    }
}
