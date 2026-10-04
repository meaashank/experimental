package V5;

import V5.c;
import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class i implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<c.a> f74631a;

    public i(Set<c.a> set) {
        this.f74631a = set;
    }

    @Override // V5.c.a
    public c a(Context context, String str) {
        HashSet hashSet = new HashSet();
        Iterator<c.a> it = this.f74631a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a(context, str));
        }
        return new h(hashSet);
    }
}
