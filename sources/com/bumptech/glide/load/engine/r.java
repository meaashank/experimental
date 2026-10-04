package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.s;
import z3.AbstractC5855c;
import z3.C5853a;

/* JADX INFO: loaded from: classes2.dex */
public final class r<Z> implements s<Z>, C5853a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s.a<r<?>> f139766e = C5853a.e(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5855c f139767a = new AbstractC5855c.C0914c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s<Z> f139768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f139769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f139770d;

    public class a implements C5853a.d<r<?>> {
        @Override // z3.C5853a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r<?> create() {
            return new r<>();
        }
    }

    @NonNull
    public static <Z> r<Z> d(s<Z> sVar) {
        r<Z> rVar = (r) f139766e.a();
        y3.m.f(rVar, "Argument must not be null");
        rVar.c(sVar);
        return rVar;
    }

    private void f() {
        this.f139768b = null;
        f139766e.b(this);
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void a() {
        this.f139767a.c();
        this.f139770d = true;
        if (!this.f139769c) {
            this.f139768b.a();
            f();
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<Z> b() {
        return this.f139768b.b();
    }

    public final void c(s<Z> sVar) {
        this.f139770d = false;
        this.f139769c = true;
        this.f139768b = sVar;
    }

    @Override // z3.C5853a.f
    @NonNull
    public AbstractC5855c e() {
        return this.f139767a;
    }

    public synchronized void g() {
        this.f139767a.c();
        if (!this.f139769c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f139769c = false;
        if (this.f139770d) {
            a();
        }
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Z get() {
        return this.f139768b.get();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f139768b.getSize();
    }
}
