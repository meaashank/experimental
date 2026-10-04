package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.collection.C1545m0;
import e.f0;

/* JADX INFO: loaded from: classes2.dex */
public class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f139514a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<a, Bitmap> f139515b = new h<>();

    @f0
    public static class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f139516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bitmap.Config f139519d;

        public a(b bVar) {
            this.f139516a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f139516a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f139517b = i10;
            this.f139518c = i11;
            this.f139519d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f139517b == aVar.f139517b && this.f139518c == aVar.f139518c && this.f139519d == aVar.f139519d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f139517b * 31) + this.f139518c) * 31;
            Bitmap.Config config = this.f139519d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.e(this.f139517b, this.f139518c, this.f139519d);
        }
    }

    @f0
    public static class b extends d<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i10, int i11, Bitmap.Config config) {
            a aVarB = b();
            aVarB.b(i10, i11, config);
            return aVarB;
        }
    }

    public static String e(int i10, int i11, Bitmap.Config config) {
        StringBuilder sbA = C1545m0.a("[", i10, "x", i11, "], ");
        sbA.append(config);
        return sbA.toString();
    }

    public static String g(Bitmap bitmap) {
        return e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return e(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return y3.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        this.f139515b.d(this.f139514a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return this.f139515b.a(this.f139514a.e(i10, i11, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        return this.f139515b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f139515b;
    }
}
