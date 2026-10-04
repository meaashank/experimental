package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.a.h;
import com.bykv.vk.openvk.preload.a.q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes2.dex */
final class l<T> extends q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.d f140163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<T> f140164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f140165c;

    public l(com.bykv.vk.openvk.preload.a.d dVar, q<T> qVar, Type type) {
        this.f140163a = dVar;
        this.f140164b = qVar;
        this.f140165c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        return this.f140164b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.q
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
        q<T> qVarA = this.f140164b;
        Type type = this.f140165c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f140165c) {
            qVarA = this.f140163a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (qVarA instanceof h.a) {
                q<T> qVar = this.f140164b;
                if (!(qVar instanceof h.a)) {
                    qVarA = qVar;
                }
            }
        }
        qVarA.a(cVar, t10);
    }
}
