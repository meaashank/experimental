package g6;

import android.os.AsyncTask;
import com.prism.commons.utils.C3853q;
import com.prism.commons.utils.l0;
import t1.C5596a;

/* JADX INFO: renamed from: g6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4455a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202248a = l0.b(C4455a.class.getSimpleName());

    /* JADX INFO: renamed from: g6.a$a, reason: collision with other inner class name */
    public static class C0737a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f202249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f202250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f202251c;

        static {
            int iP = C3853q.p();
            f202249a = iP;
            f202250b = iP <= 4 ? 2 : iP / 2;
            f202251c = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            C5596a.a("cpu cores num: ", iP, C4455a.f202248a);
        }
    }

    /* JADX INFO: renamed from: g6.a$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f202252a = new e();
    }

    public static l b() {
        return b.f202252a;
    }

    public static void c(AsyncTask asyncTask) {
        if (asyncTask == null || asyncTask.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        asyncTask.cancel(true);
    }
}
