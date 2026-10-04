package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface i extends d {

    @r(parameters = 1)
    public static final class a implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90154b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f90155a;

        public a(@NotNull b bVar) {
            this.f90155a = bVar;
        }

        @NotNull
        public final b a() {
            return this.f90155a;
        }
    }

    @r(parameters = 1)
    public static final class b implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90156b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f90157a;

        public /* synthetic */ b(long j10, C4969v c4969v) {
            this(j10);
        }

        public final long a() {
            return this.f90157a;
        }

        public b(long j10) {
            this.f90157a = j10;
        }
    }

    @r(parameters = 1)
    public static final class c implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f90158b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f90159a;

        public c(@NotNull b bVar) {
            this.f90159a = bVar;
        }

        @NotNull
        public final b a() {
            return this.f90159a;
        }
    }
}
