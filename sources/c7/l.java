package c7;

import android.text.TextUtils;
import com.prism.gaia.genum.AutoLogSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f131263c = "asdf-".concat(l.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, m> f131264a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AutoLogSetting f131265b;

    public l() {
        InterfaceC2951c interfaceC2951c = (InterfaceC2951c) getClass().getAnnotation(InterfaceC2951c.class);
        if (interfaceC2951c != null) {
            this.f131265b = interfaceC2951c.value();
        }
    }

    public m a(m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.A()) || this.f131264a.containsKey(mVar.A())) {
            return mVar;
        }
        this.f131264a.put(mVar.A(), mVar);
        if (this.f131265b != null && mVar.z() == null) {
            mVar.t0(this.f131265b);
        }
        return mVar;
    }

    public void b(l lVar) {
        c(lVar.e());
    }

    public void c(Map<String, m> map) {
        this.f131264a.putAll(map);
    }

    public final void d() {
        Iterator<m> it = this.f131264a.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public Map<String, m> e() {
        return this.f131264a;
    }

    public <H extends m> H f(String str) {
        return (H) this.f131264a.get(str);
    }

    public void g(AutoLogSetting autoLogSetting) {
        this.f131265b = autoLogSetting;
    }
}
