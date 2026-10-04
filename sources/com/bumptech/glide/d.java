package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.module.AppGlideModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s3.p;
import t3.InterfaceC5599b;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.engine.i f137595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.e f137596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.b f137597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.load.engine.cache.j f137598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GlideExecutor f137599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GlideExecutor f137600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.InterfaceC0367a f137601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MemorySizeCalculator f137602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s3.c f137603k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public p.b f137606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GlideExecutor f137607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f137608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<com.bumptech.glide.request.g<Object>> f137609q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, l<?, ?>> f137593a = new C1520a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlideExperiments.Builder f137594b = new GlideExperiments.Builder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f137604l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.a f137605m = new a();

    public class a implements c.a {
        public a() {
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public com.bumptech.glide.request.h build() {
            return new com.bumptech.glide.request.h();
        }
    }

    public class b implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.request.h f137611a;

        public b(com.bumptech.glide.request.h hVar) {
            this.f137611a = hVar;
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public com.bumptech.glide.request.h build() {
            com.bumptech.glide.request.h hVar = this.f137611a;
            return hVar != null ? hVar : new com.bumptech.glide.request.h();
        }
    }

    public static final class c implements GlideExperiments.a {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.d$d, reason: collision with other inner class name */
    public static final class C0362d implements GlideExperiments.a {
    }

    public static final class e implements GlideExperiments.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f137613a;

        public e(int i10) {
            this.f137613a = i10;
        }
    }

    @NonNull
    public d a(@NonNull com.bumptech.glide.request.g<Object> gVar) {
        if (this.f137609q == null) {
            this.f137609q = new ArrayList();
        }
        this.f137609q.add(gVar);
        return this;
    }

    @NonNull
    public com.bumptech.glide.c b(@NonNull Context context, List<InterfaceC5599b> list, AppGlideModule appGlideModule) {
        if (this.f137599g == null) {
            this.f137599g = GlideExecutor.u();
        }
        if (this.f137600h == null) {
            this.f137600h = GlideExecutor.p();
        }
        if (this.f137607o == null) {
            this.f137607o = GlideExecutor.m();
        }
        if (this.f137602j == null) {
            this.f137602j = new MemorySizeCalculator.Builder(context).build();
        }
        if (this.f137603k == null) {
            this.f137603k = new s3.e();
        }
        if (this.f137596d == null) {
            int i10 = this.f137602j.f139579a;
            if (i10 > 0) {
                this.f137596d = new com.bumptech.glide.load.engine.bitmap_recycle.k(i10);
            } else {
                this.f137596d = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.f137597e == null) {
            this.f137597e = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.f137602j.f139582d);
        }
        if (this.f137598f == null) {
            this.f137598f = new com.bumptech.glide.load.engine.cache.i(this.f137602j.f139580b);
        }
        if (this.f137601i == null) {
            this.f137601i = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.f137595c == null) {
            this.f137595c = new com.bumptech.glide.load.engine.i(this.f137598f, this.f137601i, this.f137600h, this.f137599g, GlideExecutor.U(), this.f137607o, this.f137608p);
        }
        List<com.bumptech.glide.request.g<Object>> list2 = this.f137609q;
        if (list2 == null) {
            this.f137609q = Collections.EMPTY_LIST;
        } else {
            this.f137609q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f137595c, this.f137598f, this.f137596d, this.f137597e, new p(this.f137606n), this.f137603k, this.f137604l, this.f137605m, this.f137593a, this.f137609q, list, appGlideModule, this.f137594b.build());
    }

    @NonNull
    public d c(@Nullable GlideExecutor glideExecutor) {
        this.f137607o = glideExecutor;
        return this;
    }

    @NonNull
    public d d(@Nullable com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f137597e = bVar;
        return this;
    }

    @NonNull
    public d e(@Nullable com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f137596d = eVar;
        return this;
    }

    @NonNull
    public d f(@Nullable s3.c cVar) {
        this.f137603k = cVar;
        return this;
    }

    @NonNull
    public d g(@NonNull c.a aVar) {
        m.f(aVar, "Argument must not be null");
        this.f137605m = aVar;
        return this;
    }

    @NonNull
    public d h(@Nullable com.bumptech.glide.request.h hVar) {
        this.f137605m = new b(hVar);
        return this;
    }

    @NonNull
    public <T> d i(@NonNull Class<T> cls, @Nullable l<?, T> lVar) {
        this.f137593a.put(cls, lVar);
        return this;
    }

    @Deprecated
    public d j(boolean z10) {
        return this;
    }

    @NonNull
    public d k(@Nullable a.InterfaceC0367a interfaceC0367a) {
        this.f137601i = interfaceC0367a;
        return this;
    }

    @NonNull
    public d l(@Nullable GlideExecutor glideExecutor) {
        this.f137600h = glideExecutor;
        return this;
    }

    public d m(com.bumptech.glide.load.engine.i iVar) {
        this.f137595c = iVar;
        return this;
    }

    public d n(boolean z10) {
        this.f137594b.update(new c(), z10 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @NonNull
    public d o(boolean z10) {
        this.f137608p = z10;
        return this;
    }

    @NonNull
    public d p(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f137604l = i10;
        return this;
    }

    public d q(boolean z10) {
        this.f137594b.update(new C0362d(), z10);
        return this;
    }

    @NonNull
    public d r(@Nullable com.bumptech.glide.load.engine.cache.j jVar) {
        this.f137598f = jVar;
        return this;
    }

    @NonNull
    public d s(@NonNull MemorySizeCalculator.Builder builder) {
        this.f137602j = builder.build();
        return this;
    }

    @NonNull
    public d t(@Nullable MemorySizeCalculator memorySizeCalculator) {
        this.f137602j = memorySizeCalculator;
        return this;
    }

    public void u(@Nullable p.b bVar) {
        this.f137606n = bVar;
    }

    @Deprecated
    public d v(@Nullable GlideExecutor glideExecutor) {
        this.f137599g = glideExecutor;
        return this;
    }

    @NonNull
    public d w(@Nullable GlideExecutor glideExecutor) {
        this.f137599g = glideExecutor;
        return this;
    }
}
