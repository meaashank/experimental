package g6;

import g6.C4455a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class n extends j {
    public n() {
        super(new ThreadPoolExecutor(C4455a.C0737a.f202249a, Integer.MAX_VALUE, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new s(10)));
    }
}
