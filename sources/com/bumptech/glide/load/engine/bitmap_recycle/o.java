package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.collection.N0;
import e.T;
import e.f0;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public final class o implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139568d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f139569a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<a, Bitmap> f139570b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavigableMap<Integer, Integer> f139571c = new PrettyPrintTreeMap();

    @f0
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f139572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139573b;

        public a(b bVar) {
            this.f139572a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f139572a.c(this);
        }

        public void b(int i10) {
            this.f139573b = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f139573b == ((a) obj).f139573b;
        }

        public int hashCode() {
            return this.f139573b;
        }

        public String toString() {
            return o.g(this.f139573b);
        }
    }

    @f0
    public static class b extends d<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i10) {
            a aVar = (a) super.b();
            aVar.f139573b = i10;
            return aVar;
        }
    }

    public static String g(int i10) {
        return N0.a("[", i10, "]");
    }

    private static String h(Bitmap bitmap) {
        return g(y3.o.i(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return g(y3.o.h(i10, i11, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return y3.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        a aVarE = this.f139569a.e(y3.o.i(bitmap));
        this.f139570b.d(aVarE, bitmap);
        Integer num = this.f139571c.get(Integer.valueOf(aVarE.f139573b));
        this.f139571c.put(Integer.valueOf(aVarE.f139573b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final void e(Integer num) {
        Integer num2 = this.f139571c.get(num);
        if (num2.intValue() == 1) {
            this.f139571c.remove(num);
        } else {
            this.f139571c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        int iH = y3.o.h(i10, i11, config);
        a aVarE = this.f139569a.e(iH);
        Integer numCeilingKey = this.f139571c.ceilingKey(Integer.valueOf(iH));
        if (numCeilingKey != null && numCeilingKey.intValue() != iH && numCeilingKey.intValue() <= iH * 8) {
            this.f139569a.c(aVarE);
            aVarE = this.f139569a.e(numCeilingKey.intValue());
        }
        Bitmap bitmapA = this.f139570b.a(aVarE);
        if (bitmapA != null) {
            bitmapA.reconfigure(i10, i11, config);
            e(numCeilingKey);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f139570b.f();
        if (bitmapF != null) {
            e(Integer.valueOf(y3.o.i(bitmapF)));
        }
        return bitmapF;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f139570b + "\n  SortedSizes" + this.f139571c;
    }
}
