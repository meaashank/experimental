package Sb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterstitialAd f68156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f68157f;

    public b(Context context, QueryInfo queryInfo, Mb.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, queryInfo, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f68152a);
        this.f68156e = interstitialAd;
        interstitialAd.setAdUnitId(this.f68153b.b());
        this.f68157f = new c(this.f68156e, gVar);
    }

    @Override // Sb.a
    public void b(Mb.b bVar, AdRequest adRequest) {
        this.f68156e.setAdListener(this.f68157f.c());
        this.f68157f.d(bVar);
        this.f68156e.loadAd(adRequest);
    }

    @Override // Mb.a
    public void show(Activity activity) {
        if (this.f68156e.isLoaded()) {
            this.f68156e.show();
        } else {
            this.f68155d.handleError(com.unity3d.scar.adapter.common.c.a(this.f68153b));
        }
    }
}
