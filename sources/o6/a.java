package O6;

/* JADX INFO: loaded from: classes6.dex */
public class a extends T6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65187c = com.prism.fusionadsdkbase.a.f162373j.concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f65188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f65189b;

    public a(c cVar, b bVar) {
        this.f65189b = cVar;
        this.f65188a = bVar;
    }

    @Override // T6.a
    public void a() {
        c cVar = this.f65189b;
        if (cVar != null) {
            cVar.c(h());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(" onAdClicked");
    }

    @Override // T6.a
    public void b() {
        c cVar = this.f65189b;
        if (cVar != null) {
            cVar.b(h());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(" closed");
    }

    @Override // T6.a
    public void c(int i10) {
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(h());
        sb2.append(" load failed, errCode:");
        sb2.append(i10);
        b bVar = this.f65188a;
        if (bVar != null) {
            bVar.run();
        }
    }

    @Override // T6.a
    public void d() {
        c cVar = this.f65189b;
        if (cVar != null) {
            cVar.d(h());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(" onAdImpression");
    }

    @Override // T6.a
    public void e() {
        c cVar = this.f65189b;
        if (cVar != null) {
            cVar.f(h());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(" onAdLeftApplication");
    }

    @Override // T6.a
    public void f(Object obj) {
        c cVar = this.f65189b;
        if (cVar != null) {
            cVar.e(h(), obj, this.f65188a.b());
        }
        h();
    }

    @Override // T6.a
    public void g() {
        c cVar = this.f65189b;
        if (cVar != null) {
            cVar.a(h());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(" onAdOpened");
    }

    public final String h() {
        b bVar = this.f65188a;
        if (bVar == null) {
            return null;
        }
        return bVar.c();
    }
}
