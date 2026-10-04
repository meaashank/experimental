package Ma;

import android.app.Activity;
import android.util.Log;
import com.prism.commons.utils.l0;
import g6.C4455a;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class g extends d6.d<List<h>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f58911g = l0.b(g.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<h> f58912f;

    public g(h hVar) {
        LinkedList linkedList = new LinkedList();
        this.f58912f = linkedList;
        linkedList.add(hVar);
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void e(Activity activity) {
        u(activity);
    }

    public List<h> t() {
        h();
        List<h> listV = v();
        g();
        k(listV);
        return listV;
    }

    public void u(Activity activity) {
        C4455a.b().a().execute(new Runnable() { // from class: Ma.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f58909a.x();
            }
        });
    }

    public final List<h> v() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f58912f) {
            try {
                hVar.e();
                linkedList.add(hVar);
            } catch (IOException | RuntimeException e10) {
                Log.e(f58911g, "import target(" + hVar.g().getName() + "->" + hVar.f().getUserPath() + ") failed: " + e10.getMessage(), e10);
                hVar.d();
            }
        }
        return linkedList;
    }

    public final /* synthetic */ void w() {
        g();
        k(this.f58912f);
    }

    public final /* synthetic */ void x() {
        v();
        C4455a.b().b().execute(new Runnable() { // from class: Ma.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f58910a.w();
            }
        });
    }

    public g(List<h> list) {
        this.f58912f = list;
    }
}
