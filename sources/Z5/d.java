package Z5;

import android.content.Context;
import com.prism.bugreport.commons.Bug;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Bug> f84341a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84342b = false;

    @Override // Z5.a
    public void a(Context context, Bug bug) {
        if (this.f84342b) {
            e(context, bug);
        } else {
            this.f84341a.add(bug);
        }
    }

    @Override // Z5.a
    public void b(Context context) {
        if (this.f84342b) {
            return;
        }
        d(context);
        this.f84342b = true;
        Iterator<Bug> it = this.f84341a.iterator();
        while (it.hasNext()) {
            e(context, it.next());
        }
        this.f84341a.clear();
    }

    public abstract void d(Context context);

    public abstract void e(Context context, Bug bug);
}
