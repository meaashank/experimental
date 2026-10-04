package kotlinx.coroutines.flow;

import kotlin.time.C5041h;
import kotlinx.coroutines.flow.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s {
    @NotNull
    public static final r a(@NotNull r.a aVar, long j10, long j11) {
        return new StartedWhileSubscribed(C5041h.z(j10), C5041h.z(j11));
    }

    public static r b(r.a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            C5041h.f218418b.getClass();
            j10 = C5041h.f218419c;
        }
        if ((i10 & 2) != 0) {
            C5041h.f218418b.getClass();
            j11 = C5041h.f218420d;
        }
        return a(aVar, j10, j11);
    }
}
