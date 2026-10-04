package kotlinx.coroutines.debug.internal;

import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f219272a = -1640531527;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f219273b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Q f219274c = new Q("REHASH");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final h f219275d = new h(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h f219276e = new h(Boolean.TRUE);

    public static final /* synthetic */ Void c() {
        e();
        throw null;
    }

    public static final h d(Object obj) {
        return obj == null ? f219275d : obj.equals(Boolean.TRUE) ? f219276e : new h(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
