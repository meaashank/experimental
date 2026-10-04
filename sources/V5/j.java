package V5;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<d> f74632a;

    public j(Set<d> set) {
        this.f74632a = set;
    }

    @Override // V5.d
    public void a(Context context, Bundle bundle) {
        Iterator<d> it = this.f74632a.iterator();
        while (it.hasNext()) {
            it.next().a(context, bundle);
        }
    }
}
