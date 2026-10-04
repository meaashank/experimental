package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends h implements Iterable<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h> f140390a = new ArrayList();

    public final void a(h hVar) {
        if (hVar == null) {
            hVar = j.f140391a;
        }
        this.f140390a.add(hVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final String b() {
        if (this.f140390a.size() == 1) {
            return this.f140390a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final double c() {
        if (this.f140390a.size() == 1) {
            return this.f140390a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final long d() {
        if (this.f140390a.size() == 1) {
            return this.f140390a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final int e() {
        if (this.f140390a.size() == 1) {
            return this.f140390a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof f) && ((f) obj).f140390a.equals(this.f140390a);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final boolean f() {
        if (this.f140390a.size() == 1) {
            return this.f140390a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f140390a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<h> iterator() {
        return this.f140390a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final Number a() {
        if (this.f140390a.size() == 1) {
            return this.f140390a.get(0).a();
        }
        throw new IllegalStateException();
    }
}
