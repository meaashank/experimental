package com.prism.commons.utils;

/* JADX INFO: renamed from: com.prism.commons.utils.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3861z<T, P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f162171a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f162172b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<T, P> f162173c;

    /* JADX INFO: renamed from: com.prism.commons.utils.z$a */
    public interface a<T, P> {
        T a(P p10);
    }

    public C3861z(a<T, P> aVar) {
        this.f162173c = aVar;
    }

    public T a(P p10) {
        if (!this.f162172b) {
            this.f162171a = this.f162173c.a(p10);
            this.f162172b = true;
        }
        return this.f162171a;
    }
}
