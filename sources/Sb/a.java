package Sb;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements Mb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f68152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mb.c f68153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QueryInfo f68154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.d f68155d;

    public a(Context context, Mb.c cVar, QueryInfo queryInfo, com.unity3d.scar.adapter.common.d dVar) {
        this.f68152a = context;
        this.f68153b = cVar;
        this.f68154c = queryInfo;
        this.f68155d = dVar;
    }

    @Override // Mb.a
    public void a(Mb.b bVar) {
        if (this.f68154c == null) {
            this.f68155d.handleError(com.unity3d.scar.adapter.common.c.g(this.f68153b));
        } else {
            b(bVar, new AdRequest.Builder().setAdInfo(new AdInfo(this.f68154c, this.f68153b.a())).build());
        }
    }

    public abstract void b(Mb.b bVar, AdRequest adRequest);
}
