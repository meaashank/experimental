package V5;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<e> f74633a;

    public k(Set<e> set) {
        this.f74633a = set;
    }

    @Override // V5.e
    public void a(Context context) {
        Iterator<e> it = this.f74633a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @Override // V5.e
    public void b(Context context) {
        Iterator<e> it = this.f74633a.iterator();
        while (it.hasNext()) {
            it.next().b(context);
        }
    }
}
