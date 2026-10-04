package Nb;

/* JADX INFO: loaded from: classes7.dex */
public class d<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.b f64928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g<T> f64929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f64930c;

    public d(com.unity3d.scar.adapter.common.b bVar, f fVar) {
        this(bVar, null, fVar);
    }

    @Override // Nb.a
    public void a(String str) {
        this.f64930c.d(str);
        this.f64928a.b();
    }

    @Override // Nb.a
    public void b(String str, String str2, T t10) {
        this.f64930c.a(str, str2);
        g<T> gVar = this.f64929b;
        if (gVar != null) {
            gVar.b(str, t10);
        }
        this.f64928a.b();
    }

    public d(com.unity3d.scar.adapter.common.b bVar, g<T> gVar, f fVar) {
        this.f64928a = bVar;
        this.f64929b = gVar;
        this.f64930c = fVar;
    }
}
