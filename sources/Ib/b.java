package Ib;

import Ab.k;
import Jb.f;
import Jb.q;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Downloader;
import dd.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@j(name = "FetchDefaults")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52996a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f52997b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f52998c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f52999d = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f53000e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f53001f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f53002g = "{}";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f53003h = 500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f53004i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f53005j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f53006k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f53007l = "LibGlobalFetchLib";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f53008m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f53009n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f53010o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f53011p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f53012q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f53013r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f53014s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f53015t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f53016u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f53017v = 31104000000L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f53018w = 10000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final NetworkType f53019x = NetworkType.ALL;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final NetworkType f53020y = NetworkType.GLOBAL_OFF;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final Priority f53021z = Priority.NORMAL;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public static final Error f52989A = Error.NONE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public static final Status f52990B = Status.NONE;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public static final PrioritySort f52991C = PrioritySort.ASC;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public static final EnqueueAction f52992D = EnqueueAction.UPDATE_ACCORDINGLY;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public static final Downloader<?, ?> f52993E = new k(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public static final com.tonyodev.fetch2core.c f52994F = new Ab.e(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public static final q f52995G = new f(false, Jb.c.f58154a);

    @NotNull
    public static final Downloader<?, ?> a() {
        return f52993E;
    }

    @NotNull
    public static final EnqueueAction b() {
        return f52992D;
    }

    @NotNull
    public static final com.tonyodev.fetch2core.c c() {
        return f52994F;
    }

    @NotNull
    public static final NetworkType d() {
        return f53020y;
    }

    @NotNull
    public static final q e() {
        return f52995G;
    }

    @NotNull
    public static final NetworkType f() {
        return f53019x;
    }

    @NotNull
    public static final Error g() {
        return f52989A;
    }

    @NotNull
    public static final Priority h() {
        return f53021z;
    }

    @NotNull
    public static final PrioritySort i() {
        return f52991C;
    }

    @NotNull
    public static final Status j() {
        return f52990B;
    }
}
