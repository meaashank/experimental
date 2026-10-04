package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f140419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f140420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f140421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f140422d;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f140421c = list;
        this.f140420b = i10;
        this.f140419a = eVar;
        this.f140422d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f140422d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f140401a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f140422d;
        if (dVar != null) {
            dVar.f140403c = obj;
            dVar.e();
        }
        if (this.f140420b >= this.f140421c.size()) {
            return obj;
        }
        h hVar = this.f140421c.get(this.f140420b);
        Class<? extends d> cls = hVar.f140413a;
        d dVar2 = (d) this.f140419a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.b.b.a aVarA = hVar.a();
        i iVar = new i(this.f140421c, this.f140420b + 1, this.f140419a, dVar2);
        dVar2.a(iVar, this.f140422d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f140403c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f140402b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
