package P6;

import R6.c;
import R6.d;
import R6.e;
import com.google.gson.Gson;
import com.prism.commons.utils.C3857v;
import com.prism.fusionadsdk.internal.config.AdPlaceConfig;
import com.prism.fusionadsdk.internal.config.StrategyConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@Q6.a({@Q6.b(name = "base", target = c.class), @Q6.b(name = "default", target = d.class), @Q6.b(name = "high_all", target = e.class)})
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65572b = com.prism.fusionadsdkbase.a.f162373j.concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f65573c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, Class<?>> f65574a = null;

    public static b c() {
        if (f65573c == null) {
            synchronized (b.class) {
                try {
                    if (f65573c == null) {
                        f65573c = new b();
                    }
                } finally {
                }
            }
        }
        return f65573c;
    }

    public final void b() {
        if (this.f65574a != null) {
            return;
        }
        this.f65574a = new HashMap<>();
        Q6.a aVar = (Q6.a) getClass().getAnnotation(Q6.a.class);
        if (aVar != null) {
            for (Q6.b bVar : aVar.value()) {
                this.f65574a.put(bVar.name(), bVar.target());
                StringBuilder sb2 = new StringBuilder("put(");
                sb2.append(bVar.name());
                sb2.append(",");
                sb2.append(bVar.target().toString());
            }
        }
    }

    public Q6.c d(final AdPlaceConfig adPlaceConfig) {
        new Gson();
        C3857v.a(new C3857v.b() { // from class: P6.a
            @Override // com.prism.commons.utils.C3857v.b
            public final Object a() {
                return new Gson().toJson(adPlaceConfig);
            }
        });
        b();
        return e(adPlaceConfig.sitesName, adPlaceConfig.strategy);
    }

    public final Q6.c e(String str, StrategyConfig strategyConfig) {
        if (strategyConfig == null) {
            return new d();
        }
        Class<?> cls = this.f65574a.get(strategyConfig.name);
        if (cls == null) {
            return new d();
        }
        try {
            return cls == c.class ? new c(str, strategyConfig) : cls == e.class ? new e(str, strategyConfig) : new d();
        } catch (Exception e10) {
            e10.getMessage();
            return new d();
        }
    }
}
