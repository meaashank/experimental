package Vb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class c extends a<InterstitialAd> {
    public c(Context context, QueryInfo queryInfo, Mb.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, queryInfo, dVar);
        this.f76416e = new d(gVar, this);
    }

    @Override // Vb.a
    public void b(AdRequest adRequest, Mb.b bVar) {
        InterstitialAd.load(this.f76413b, this.f76414c.b(), adRequest, ((d) this.f76416e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Mb.a
    public void show(Activity activity) {
        T t10 = this.f76412a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f76417f.handleError(com.unity3d.scar.adapter.common.c.a(this.f76414c));
        }
    }
}
