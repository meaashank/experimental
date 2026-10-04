package Z5;

import android.content.Context;
import com.prism.bugreport.commons.Bug;
import com.prism.commons.utils.n0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile a f84343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Bug> f84344b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f84345c = new LinkedList();

    public synchronized void a() {
        if (this.f84343a != null) {
            this.f84343a.getClass();
        }
    }

    public synchronized void b(Context context, Bug bug) {
        try {
            if (this.f84343a != null) {
                try {
                    n0.a(true);
                    this.f84343a.a(context, bug);
                    n0.a(false);
                } catch (Throwable th) {
                    n0.a(false);
                    throw th;
                }
            } else {
                this.f84344b.add(bug);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(Context context, String str) {
        try {
            if (this.f84343a != null) {
                try {
                    n0.a(true);
                    this.f84343a.c(context, str);
                    n0.a(false);
                } catch (Throwable th) {
                    n0.a(false);
                    throw th;
                }
            } else {
                this.f84345c.add(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(Context context, a aVar) {
        try {
            if (this.f84343a == null) {
                try {
                    n0.a(true);
                    this.f84343a = aVar;
                    this.f84343a.b(context);
                    Iterator<String> it = this.f84345c.iterator();
                    while (it.hasNext()) {
                        this.f84343a.c(context, it.next());
                    }
                    this.f84345c.clear();
                    Iterator<Bug> it2 = this.f84344b.iterator();
                    while (it2.hasNext()) {
                        this.f84343a.a(context, it2.next());
                    }
                    this.f84344b.clear();
                    n0.a(false);
                } catch (Throwable th) {
                    n0.a(false);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
