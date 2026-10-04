package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.n;
import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class k<T> extends q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<T> f140155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.g<T> f140156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.d f140157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.c.a<T> f140158d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q<T> f140161g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k<T>.a f140160f = new a(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f140159e = null;

    public final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar, byte b10) {
            this();
        }
    }

    public k(n<T> nVar, com.bykv.vk.openvk.preload.a.g<T> gVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.f140155a = nVar;
        this.f140156b = gVar;
        this.f140157c = dVar;
        this.f140158d = aVar;
    }

    private q<T> b() {
        q<T> qVar = this.f140161g;
        if (qVar != null) {
            return qVar;
        }
        q<T> qVarA = this.f140157c.a((r) null, this.f140158d);
        this.f140161g = qVarA;
        return qVarA;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.f140156b == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.falconx.a.a.a(aVar) instanceof com.bykv.vk.openvk.preload.a.j) {
            return null;
        }
        return this.f140156b.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
        n<T> nVar = this.f140155a;
        if (nVar == null) {
            b().a(cVar, t10);
        } else if (t10 == null) {
            cVar.h();
        } else {
            com.bykv.vk.openvk.preload.falconx.a.a.a(nVar.a(), cVar);
        }
    }
}
