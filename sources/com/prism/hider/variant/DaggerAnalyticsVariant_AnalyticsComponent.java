package com.prism.hider.variant;

import V5.c;
import V5.d;
import V5.e;
import V5.f;
import com.prism.hider.variant.a;
import dagger.internal.SetFactory;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DaggerAnalyticsVariant_AnalyticsComponent implements a.InterfaceC0685a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider<d> f168401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Provider<Set<d>> f168402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Provider<e> f168403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Provider<Set<e>> f168404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Provider<c.a> f168405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Provider<Set<c.a>> f168406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Provider<f> f168407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Provider<Set<f>> f168408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Provider<V5.a> f168409i;

    public static final class Builder {
        public a.InterfaceC0685a build() {
            return new DaggerAnalyticsVariant_AnalyticsComponent(this);
        }

        @Deprecated
        public Builder firebaseAnalyticsApi(X5.b bVar) {
            bVar.getClass();
            return this;
        }

        private Builder() {
        }
    }

    public static Builder a() {
        return new Builder();
    }

    public static a.InterfaceC0685a b() {
        return new Builder().build();
    }

    public final void c(Builder builder) {
        this.f168401a = dagger.internal.d.b(X5.c.f76792a);
        this.f168402b = SetFactory.a(1, 0).addProvider(this.f168401a).build();
        this.f168403c = dagger.internal.d.b(X5.d.f76793a);
        this.f168404d = SetFactory.a(1, 0).addProvider(this.f168403c).build();
        this.f168405e = dagger.internal.d.b(X5.e.f76794a);
        this.f168406f = SetFactory.a(1, 0).addProvider(this.f168405e).build();
        this.f168407g = dagger.internal.d.b(X5.f.f76795a);
        SetFactory setFactoryBuild = SetFactory.a(1, 0).addProvider(this.f168407g).build();
        this.f168408h = setFactoryBuild;
        this.f168409i = dagger.internal.d.b(new V5.b(this.f168402b, this.f168404d, this.f168406f, setFactoryBuild));
    }

    @Override // com.prism.hider.variant.a.InterfaceC0685a
    public V5.a get() {
        return this.f168409i.get();
    }

    public DaggerAnalyticsVariant_AnalyticsComponent(Builder builder) {
        c(builder);
    }
}
