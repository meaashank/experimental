package Wb;

import Nb.c;
import Nb.d;
import Nb.e;
import Nb.f;
import Nb.g;
import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes7.dex */
public class b extends e implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g<QueryInfo> f76681c;

    public b(g<QueryInfo> gVar) {
        this.f76681c = gVar;
    }

    @Override // Nb.c
    public void c(Context context, String str, boolean z10, com.unity3d.scar.adapter.common.b bVar, f fVar) {
        QueryInfo.generate(context, z10 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED, new AdRequest.Builder().build(), new a(str, new d(bVar, this.f76681c, fVar)));
    }

    @Override // Nb.c
    public void d(Context context, boolean z10, com.unity3d.scar.adapter.common.b bVar, f fVar) {
        e("GMA v2000 - SCAR signal retrieval without a placementId not relevant", bVar, fVar);
    }
}
