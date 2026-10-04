package Pb;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterstitialAd f65691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f65692f;

    public b(Context context, QueryInfo queryInfo, Mb.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, queryInfo, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f65687a);
        this.f65691e = interstitialAd;
        interstitialAd.setAdUnitId(this.f65688b.b());
        this.f65692f = new c(this.f65691e, gVar);
    }

    @Override // Pb.a
    public void b(Mb.b bVar, AdRequest adRequest) {
        this.f65691e.setAdListener(this.f65692f.c());
        this.f65692f.d(bVar);
        this.f65691e.loadAd(adRequest);
    }

    @Override // Mb.a
    public void show(Activity activity) {
        if (this.f65691e.isLoaded()) {
            this.f65691e.show();
        } else {
            this.f65690d.handleError(com.unity3d.scar.adapter.common.c.a(this.f65688b));
        }
    }
}
