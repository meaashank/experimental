package com.prism.commons.utils;

/* JADX INFO: loaded from: classes5.dex */
public class K<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E f162038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K<E> f162039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K<E> f162040c;

    public K(E e10) {
        this.f162038a = e10;
    }

    public void a(K<E> k10) {
        K<E> k11 = k10.f162039b;
        this.f162039b = k11;
        this.f162040c = k10;
        k11.f162040c = this;
        this.f162040c.f162039b = this;
    }

    public void b(K<E> k10) {
        this.f162039b = k10;
        this.f162040c = k10.f162040c;
        k10.f162040c = this;
        this.f162040c.f162039b = this;
    }

    public void c() {
        this.f162039b = this;
        this.f162040c = this;
    }

    public void d() {
        K<E> k10 = this.f162040c;
        k10.f162039b = this.f162039b;
        this.f162039b.f162040c = k10;
    }

    public K(K<E> k10, E e10, K<E> k11) {
        this.f162038a = e10;
        this.f162039b = k11;
        this.f162040c = k10;
    }
}
