package f6;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: f6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4390b implements InterfaceC4389a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<Runnable> f200615a = new LinkedList<>();

    public void d(Runnable runnable) {
        this.f200615a.add(runnable);
    }

    public abstract boolean e(Context context);

    public boolean f(Context context) {
        boolean zE = e(context);
        if (zE) {
            Iterator<Runnable> it = this.f200615a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f200615a.clear();
        }
        return zE;
    }
}
