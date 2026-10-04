package Pb;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements Mb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f65687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mb.c f65688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QueryInfo f65689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.d f65690d;

    public a(Context context, Mb.c cVar, QueryInfo queryInfo, com.unity3d.scar.adapter.common.d dVar) {
        this.f65687a = context;
        this.f65688b = cVar;
        this.f65689c = queryInfo;
        this.f65690d = dVar;
    }

    @Override // Mb.a
    public void a(Mb.b bVar) {
        if (this.f65689c == null) {
            this.f65690d.handleError(com.unity3d.scar.adapter.common.c.g(this.f65688b));
        } else {
            b(bVar, new AdRequest.Builder().setAdInfo(new AdInfo(this.f65689c, this.f65688b.a())).build());
        }
    }

    public abstract void b(Mb.b bVar, AdRequest adRequest);
}
