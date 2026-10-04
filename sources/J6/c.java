package J6;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.prism.fusionadsdk.LjAdLoader;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.prism.fusionadsdkbase.e f53198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LjAdLoader f53199b;

    public void a() {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.K(null);
        }
        com.prism.fusionadsdkbase.e eVar = this.f53198a;
        if (eVar != null) {
            eVar.destroy();
            this.f53198a = null;
        }
        this.f53199b = null;
    }

    public abstract void c(Context context, ViewGroup viewGroup);

    public void d(Context context, ViewGroup viewGroup, String str) {
        if (!(this instanceof K6.c)) {
            throw new IllegalStateException("Only inline native ads may enter a page slot");
        }
        com.prism.fusionadsdkbase.e eVar = this.f53198a;
        if (eVar != null) {
            eVar.show(viewGroup, str);
        }
    }

    public void e(T6.a aVar) {
        this.f53199b.K(aVar);
    }

    public void b(Activity activity, T6.b bVar) {
    }
}
