package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements InterfaceC4448f<Bitmap, Bitmap> {

    public static final class a implements com.bumptech.glide.load.engine.s<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f139911a;

        public a(@NonNull Bitmap bitmap) {
            this.f139911a = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.s
        public void a() {
        }

        @Override // com.bumptech.glide.load.engine.s
        @NonNull
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @NonNull
        public Bitmap c() {
            return this.f139911a;
        }

        @Override // com.bumptech.glide.load.engine.s
        @NonNull
        public Bitmap get() {
            return this.f139911a;
        }

        @Override // com.bumptech.glide.load.engine.s
        public int getSize() {
            return y3.o.i(this.f139911a);
        }
    }

    @Override // g3.InterfaceC4448f
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull Bitmap bitmap, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return new a(bitmap);
    }

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull Bitmap bitmap, @NonNull C4447e c4447e) throws IOException {
        return true;
    }

    public com.bumptech.glide.load.engine.s<Bitmap> c(@NonNull Bitmap bitmap, int i10, int i11, @NonNull C4447e c4447e) {
        return new a(bitmap);
    }

    public boolean d(@NonNull Bitmap bitmap, @NonNull C4447e c4447e) {
        return true;
    }
}
