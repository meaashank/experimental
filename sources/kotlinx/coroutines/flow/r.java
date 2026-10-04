package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f220240a = a.f220241a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f220241a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final r f220242b = new t();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final r f220243c = new StartedLazily();

        public static r b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            aVar.getClass();
            return new StartedWhileSubscribed(j10, j11);
        }

        @NotNull
        public final r a(long j10, long j11) {
            return new StartedWhileSubscribed(j10, j11);
        }

        @NotNull
        public final r c() {
            return f220242b;
        }

        @NotNull
        public final r d() {
            return f220243c;
        }
    }

    @NotNull
    e<SharingCommand> a(@NotNull u<Integer> uVar);
}
