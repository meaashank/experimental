package g6;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class g extends j {
    public g(int i10, int i11) {
        super(new ThreadPoolExecutor(i10, i11, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new s(10)));
    }
}
