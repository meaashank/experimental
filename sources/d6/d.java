package d6;

import d6.InterfaceC4300a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d<Result> implements InterfaceC4301b<Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4300a.e<Result> f194867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4300a.d f194868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4300a.c f194869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC4300a.b f194870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC4300a.InterfaceC0717a f194871e;

    public void g() {
        InterfaceC4300a.InterfaceC0717a interfaceC0717a = this.f194871e;
        if (interfaceC0717a != null) {
            interfaceC0717a.a();
        }
    }

    public void h() {
        InterfaceC4300a.b bVar = this.f194870d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void i() {
        InterfaceC4300a.c cVar = this.f194869c;
        if (cVar != null) {
            cVar.onCancel();
        }
    }

    public void j(Throwable th, String str) {
        InterfaceC4300a.d dVar = this.f194868b;
        if (dVar != null) {
            dVar.a(th, str);
        }
    }

    public void k(Result result) {
        InterfaceC4300a.e<Result> eVar = this.f194867a;
        if (eVar != null) {
            eVar.onSuccess(result);
        }
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public InterfaceC4301b<Result> b(InterfaceC4300a.InterfaceC0717a interfaceC0717a) {
        this.f194871e = interfaceC0717a;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public InterfaceC4301b<Result> d(InterfaceC4300a.b bVar) {
        this.f194870d = bVar;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InterfaceC4301b<Result> f(InterfaceC4300a.c cVar) {
        this.f194869c = cVar;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceC4301b<Result> c(InterfaceC4300a.d dVar) {
        this.f194868b = dVar;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceC4301b<Result> a(InterfaceC4300a.e<Result> eVar) {
        this.f194867a = eVar;
        return this;
    }
}
