package xd;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.W;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final String f240628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public static final long f240629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public static final int f240630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public static final int f240631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    public static final long f240632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dd.g
    @NotNull
    public static h f240633f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f240634g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f240635h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final j f240636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final j f240637j;

    static {
        String strB = V.b("kotlinx.coroutines.scheduler.default.name");
        if (strB == null) {
            strB = "DefaultDispatcher";
        }
        f240628a = strB;
        f240629b = W.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        int iA = V.a();
        f240630c = W.e("kotlinx.coroutines.scheduler.core.pool.size", iA < 2 ? 2 : iA, 1, 0, 8, null);
        f240631d = W.e("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.f220656v, 0, CoroutineScheduler.f220656v, 4, null);
        f240632e = TimeUnit.SECONDS.toNanos(W.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f240633f = f.f240618a;
        f240636i = new k(0);
        f240637j = new k(1);
    }

    public static final boolean a(@NotNull i iVar) {
        return iVar.f240625b.h2() == 1;
    }
}
