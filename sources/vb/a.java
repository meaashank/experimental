package Vb;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements Mb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f76412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f76413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.c f76414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public QueryInfo f76415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f76416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.d f76417f;

    public a(Context context, Mb.c cVar, QueryInfo queryInfo, com.unity3d.scar.adapter.common.d dVar) {
        this.f76413b = context;
        this.f76414c = cVar;
        this.f76415d = queryInfo;
        this.f76417f = dVar;
    }

    @Override // Mb.a
    public void a(Mb.b bVar) {
        if (this.f76415d == null) {
            this.f76417f.handleError(com.unity3d.scar.adapter.common.c.g(this.f76414c));
            return;
        }
        AdRequest adRequestBuild = new AdRequest.Builder().setAdInfo(new AdInfo(this.f76415d, this.f76414c.a())).build();
        this.f76416e.a(bVar);
        b(adRequestBuild, bVar);
    }

    public abstract void b(AdRequest adRequest, Mb.b bVar);

    public void c(T t10) {
        this.f76412a = t10;
    }
}
