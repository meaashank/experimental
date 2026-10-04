package Ma;

import android.app.Activity;
import android.util.Log;
import com.prism.commons.utils.l0;
import g6.C4455a;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class c extends d6.d<List<d>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f58903g = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<d> f58904f;

    public c(d dVar) {
        LinkedList linkedList = new LinkedList();
        this.f58904f = linkedList;
        linkedList.add(dVar);
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void e(Activity activity) {
        u(activity);
    }

    public List<d> t() {
        h();
        List<d> listV = v();
        g();
        k(listV);
        return listV;
    }

    public void u(Activity activity) {
        h();
        C4455a.b().a().execute(new Runnable() { // from class: Ma.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f58901a.x();
            }
        });
    }

    public final List<d> v() {
        LinkedList linkedList = new LinkedList();
        for (d dVar : this.f58904f) {
            try {
                dVar.c();
                linkedList.add(dVar);
            } catch (IOException | RuntimeException e10) {
                Log.e(f58903g, "export target(" + dVar.d().getName() + "->" + dVar.e().getName() + ") failed: " + e10.getMessage(), e10);
                dVar.b();
            }
        }
        return linkedList;
    }

    public final /* synthetic */ void w() {
        g();
        k(this.f58904f);
    }

    public final /* synthetic */ void x() {
        v();
        C4455a.b().b().execute(new Runnable() { // from class: Ma.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f58902a.w();
            }
        });
    }

    public c(List<d> list) {
        this.f58904f = list;
    }
}
