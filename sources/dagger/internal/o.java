package dagger.internal;

import dc.InterfaceC4322c;
import dc.InterfaceC4323d;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes7.dex */
@f
public final class o<M extends Annotation> implements InterfaceC4323d<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4322c f194943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f194944b;

    public o(InterfaceC4322c delegate, M metadata) {
        delegate.getClass();
        this.f194943a = delegate;
        metadata.getClass();
        this.f194944b = metadata;
    }

    @Override // dc.InterfaceC4322c
    public void a() {
        this.f194943a.a();
    }

    @Override // dc.InterfaceC4323d
    public M b() {
        return this.f194944b;
    }

    @Override // dc.InterfaceC4322c
    public Class<? extends Annotation> c() {
        return this.f194943a.c();
    }

    @Override // dc.InterfaceC4322c
    public void d() {
        this.f194943a.d();
    }
}
