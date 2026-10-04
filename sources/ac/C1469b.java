package ac;

import Nb.c;
import Nb.d;
import Nb.e;
import Nb.f;
import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: renamed from: ac.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C1469b extends e implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Yb.a f84823c;

    public C1469b(Yb.a aVar) {
        this.f84823c = aVar;
    }

    @Override // Nb.c
    public void c(Context context, String str, boolean z10, com.unity3d.scar.adapter.common.b bVar, f fVar) {
        QueryInfo.generate(context, z10 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED, this.f84823c.a(), new C1468a(str, new d(bVar, null, fVar)));
    }

    @Override // Nb.c
    public void d(Context context, boolean z10, com.unity3d.scar.adapter.common.b bVar, f fVar) {
        c(context, z10 ? e.f64932b : e.f64931a, z10, bVar, fVar);
    }
}
