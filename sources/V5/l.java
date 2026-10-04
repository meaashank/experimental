package V5;

import android.app.Activity;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<f> f74634a;

    public l(Set<f> set) {
        this.f74634a = set;
    }

    @Override // V5.f
    public void a(Activity activity, String str) {
        Iterator<f> it = this.f74634a.iterator();
        while (it.hasNext()) {
            it.next().a(activity, str);
        }
    }

    @Override // V5.f
    public void b(Activity activity, String str) {
        Iterator<f> it = this.f74634a.iterator();
        while (it.hasNext()) {
            it.next().b(activity, str);
        }
    }
}
