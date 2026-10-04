package Zb;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements Mb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f84449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f84450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.c f84451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Yb.a f84452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f84453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.d f84454f;

    public a(Context context, Mb.c cVar, Yb.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f84450b = context;
        this.f84451c = cVar;
        this.f84452d = aVar;
        this.f84454f = dVar;
    }

    @Override // Mb.a
    public void a(Mb.b bVar) {
        AdRequest adRequestB = this.f84452d.b(this.f84451c.a());
        this.f84453e.a(bVar);
        b(adRequestB, bVar);
    }

    public abstract void b(AdRequest adRequest, Mb.b bVar);

    public void c(T t10) {
        this.f84449a = t10;
    }
}
