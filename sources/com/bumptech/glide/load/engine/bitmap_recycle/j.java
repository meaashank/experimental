package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.Nullable;
import e.f0;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements com.bumptech.glide.load.engine.bitmap_recycle.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f139530h = 4194304;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f0
    public static final int f139531i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f139532j = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<a, Object> f139533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f139534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f139535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> f139536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f139537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f139538g;

    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f139539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f139541c;

        public a(b bVar) {
            this.f139539a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f139539a.c(this);
        }

        public void b(int i10, Class<?> cls) {
            this.f139540b = i10;
            this.f139541c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f139540b == aVar.f139540b && this.f139541c == aVar.f139541c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f139540b * 31;
            Class<?> cls = this.f139541c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f139540b + "array=" + this.f139541c + '}';
        }
    }

    public static final class b extends d<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        public m a() {
            return new a(this);
        }

        public a d() {
            return new a(this);
        }

        public a e(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.f139540b = i10;
            aVarB.f139541c = cls;
            return aVarB;
        }
    }

    @f0
    public j() {
        this.f139533b = new h<>();
        this.f139534c = new b();
        this.f139535d = new HashMap();
        this.f139536e = new HashMap();
        this.f139537f = 4194304;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f139537f / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized void b() {
        h(0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = n(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return (T) m(q(i10, numCeilingKey) ? this.f139534c.e(numCeilingKey.intValue(), cls) : this.f139534c.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        return (T) m(this.f139534c.e(i10, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    @Deprecated
    public <T> void e(T t10, Class<T> cls) {
        put(t10);
    }

    public final void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapN = n(cls);
        Integer num = navigableMapN.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapN.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapN.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void g() {
        h(this.f139537f);
    }

    public final void h(int i10) {
        while (this.f139538g > i10) {
            Object objF = this.f139533b.f();
            y3.m.e(objF);
            com.bumptech.glide.load.engine.bitmap_recycle.a aVarJ = j(objF.getClass());
            this.f139538g -= aVarJ.b() * aVarJ.a(objF);
            f(aVarJ.a(objF), objF.getClass());
            if (Log.isLoggable(aVarJ.getTag(), 2)) {
                Log.v(aVarJ.getTag(), "evicted: " + aVarJ.a(objF));
            }
        }
    }

    public final <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> i(T t10) {
        return j(t10.getClass());
    }

    public final <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> gVar;
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVar = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.f139536e.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            gVar = new i();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            gVar = new g();
        }
        this.f139536e.put(cls, gVar);
        return gVar;
    }

    @Nullable
    public final <T> T k(a aVar) {
        return (T) this.f139533b.a(aVar);
    }

    public int l() {
        int iB = 0;
        for (Class<?> cls : this.f139535d.keySet()) {
            for (Integer num : this.f139535d.get(cls).keySet()) {
                com.bumptech.glide.load.engine.bitmap_recycle.a aVarJ = j(cls);
                iB += aVarJ.b() * this.f139535d.get(cls).get(num).intValue() * num.intValue();
            }
        }
        return iB;
    }

    public final <T> T m(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarJ = j(cls);
        T t10 = (T) this.f139533b.a(aVar);
        if (t10 != null) {
            this.f139538g -= aVarJ.b() * aVarJ.a(t10);
            f(aVarJ.a(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarJ.getTag(), 2)) {
            Log.v(aVarJ.getTag(), "Allocated " + aVar.f139540b + " bytes");
        }
        return aVarJ.newArray(aVar.f139540b);
    }

    public final NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f139535d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f139535d.put(cls, treeMap);
        return treeMap;
    }

    public final boolean o() {
        int i10 = this.f139538g;
        return i10 == 0 || this.f139537f / i10 >= 2;
    }

    public final boolean p(int i10) {
        return i10 <= this.f139537f / 2;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarJ = j(cls);
        int iA = aVarJ.a(t10);
        int iB = aVarJ.b() * iA;
        if (p(iB)) {
            a aVarE = this.f139534c.e(iA, cls);
            this.f139533b.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapN = n(cls);
            Integer num = navigableMapN.get(Integer.valueOf(aVarE.f139540b));
            Integer numValueOf = Integer.valueOf(aVarE.f139540b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapN.put(numValueOf, Integer.valueOf(iIntValue));
            this.f139538g += iB;
            g();
        }
    }

    public final boolean q(int i10, Integer num) {
        if (num != null) {
            return o() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    public j(int i10) {
        this.f139533b = new h<>();
        this.f139534c = new b();
        this.f139535d = new HashMap();
        this.f139536e = new HashMap();
        this.f139537f = i10;
    }
}
