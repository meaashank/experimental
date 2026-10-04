package ba;

import android.content.Context;
import com.prism.commons.utils.T;
import com.prism.commons.utils.V;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.t0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f126008c = "pref_imported_record";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f126009d = l0.b(s.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static s f126010e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V f126011a = new V(f126008c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, t0<Boolean, Context>> f126012b = new ConcurrentHashMap();

    public static s c() {
        if (f126010e == null) {
            synchronized (s.class) {
                try {
                    if (f126010e == null) {
                        f126010e = new s();
                    }
                } finally {
                }
            }
        }
        return f126010e;
    }

    public boolean a(Context context, String str) {
        return b(context, str).a(context).booleanValue();
    }

    public final t0<Boolean, Context> b(Context context, String str) {
        t0<Boolean, Context> t0Var = this.f126012b.get(str);
        if (t0Var != null) {
            return t0Var;
        }
        T tC = T.c(this.f126011a, str, Boolean.FALSE, Boolean.class);
        t0<Boolean, Context> t0Var2 = new t0<>(tC, tC);
        this.f126012b.put(str, t0Var2);
        return t0Var2;
    }

    public void d(Context context, String str) {
        t0<Boolean, Context> t0VarB = b(context, str);
        if (t0VarB.a(context).booleanValue()) {
            return;
        }
        t0VarB.b(context, Boolean.TRUE);
    }
}
