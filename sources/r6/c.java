package R6;

import J6.f;
import Q6.d;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.prism.commons.utils.C3857v;
import com.prism.fusionadsdk.internal.config.StrategyConfig;

/* JADX INFO: loaded from: classes6.dex */
public class c implements Q6.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f67740c = com.prism.fusionadsdkbase.a.f162373j.concat(c.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StrategyConfig f67742b;

    public c(String str, StrategyConfig strategyConfig) {
        this.f67741a = str;
        this.f67742b = strategyConfig;
    }

    public static /* synthetic */ String b(c cVar) {
        cVar.getClass();
        return new Gson().toJson(cVar.f67742b);
    }

    public static /* synthetic */ String c(c cVar) {
        cVar.getClass();
        return new Gson().toJson(cVar.f67741a);
    }

    @Override // Q6.c
    public boolean a(Context context, long j10) {
        try {
            com.prism.fusionadsdk.internal.history.b bVarD = com.prism.fusionadsdk.internal.history.c.d(context, this.f67741a);
            if (bVarD.moveToNext()) {
                C3857v.a(new C3857v.b() { // from class: R6.a
                    @Override // com.prism.commons.utils.C3857v.b
                    public final Object a() {
                        return c.c(this.f67738a);
                    }
                });
                C3857v.b(new C3857v.b() { // from class: R6.b
                    @Override // com.prism.commons.utils.C3857v.b
                    public final Object a() {
                        return c.b(this.f67739a);
                    }
                }, null);
                bVarD.toString();
                StrategyConfig strategyConfig = this.f67742b;
                d.a aVar = new d.a(strategyConfig.intervalScale, strategyConfig.interval);
                int i10 = aVar.f67643a;
                if (i10 == 0) {
                    return d(bVarD, aVar);
                }
                if (i10 == 1) {
                    return e(bVarD, aVar);
                }
                if (i10 == 2) {
                    return g(bVarD, aVar);
                }
                if (i10 == 3) {
                    return f(bVarD, aVar, j10);
                }
            }
        } catch (Throwable th) {
            if (f.n() != null) {
                f.f53216p.a(context, "ad_policy_failed").c(NotificationCompat.CATEGORY_ERROR, th.getMessage()).b();
            }
        }
        return true;
    }

    public boolean d(com.prism.fusionadsdk.internal.history.b bVar, d.a aVar) {
        return !DateUtils.isToday(bVar.f162328c) || bVar.f162330e < ((long) aVar.f67644b);
    }

    public boolean e(com.prism.fusionadsdk.internal.history.b bVar, d.a aVar) {
        return (System.currentTimeMillis() - bVar.f162328c) / 311040000 > ((long) aVar.f67644b);
    }

    public boolean f(com.prism.fusionadsdk.internal.history.b bVar, d.a aVar, long j10) {
        return j10 < ((long) aVar.f67644b);
    }

    public boolean g(com.prism.fusionadsdk.internal.history.b bVar, d.a aVar) {
        return bVar.f162329d % ((long) aVar.f67644b) == 0;
    }
}
