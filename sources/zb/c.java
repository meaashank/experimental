package Zb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class c extends a<InterstitialAd> {
    public c(Context context, Yb.a aVar, Mb.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, aVar, dVar);
        this.f84453e = new d(gVar, this);
    }

    @Override // Zb.a
    public void b(AdRequest adRequest, Mb.b bVar) {
        InterstitialAd.load(this.f84450b, this.f84451c.b(), adRequest, ((d) this.f84453e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Mb.a
    public void show(Activity activity) {
        T t10 = this.f84449a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f84454f.handleError(com.unity3d.scar.adapter.common.c.a(this.f84451c));
        }
    }
}
