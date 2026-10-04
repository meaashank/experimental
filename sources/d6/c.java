package d6;

import d6.InterfaceC4300a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c<Actor, Result> implements InterfaceC4300a<Actor, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4300a.e<Result> f194862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4300a.d f194863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4300a.c f194864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC4300a.b f194865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC4300a.InterfaceC0717a f194866e;

    public void g() {
        InterfaceC4300a.InterfaceC0717a interfaceC0717a = this.f194866e;
        if (interfaceC0717a != null) {
            interfaceC0717a.a();
        }
    }

    public void h() {
        InterfaceC4300a.b bVar = this.f194865d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void i() {
        InterfaceC4300a.c cVar = this.f194864c;
        if (cVar != null) {
            cVar.onCancel();
        }
    }

    public void j(Throwable th, String str) {
        InterfaceC4300a.d dVar = this.f194863b;
        if (dVar != null) {
            dVar.a(th, str);
        }
    }

    public void k(Result result) {
        InterfaceC4300a.e<Result> eVar = this.f194862a;
        if (eVar != null) {
            eVar.onSuccess(result);
        }
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c<Actor, Result> b(InterfaceC4300a.InterfaceC0717a interfaceC0717a) {
        this.f194866e = interfaceC0717a;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c<Actor, Result> d(InterfaceC4300a.b bVar) {
        this.f194865d = bVar;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c<Actor, Result> f(InterfaceC4300a.c cVar) {
        this.f194864c = cVar;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public c<Actor, Result> c(InterfaceC4300a.d dVar) {
        this.f194863b = dVar;
        return this;
    }

    @Override // d6.InterfaceC4300a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c<Actor, Result> a(InterfaceC4300a.e<Result> eVar) {
        this.f194862a = eVar;
        return this;
    }
}
