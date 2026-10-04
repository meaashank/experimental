package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import e.T;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(api = 28)
public final class C3095g implements InterfaceC4448f<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f139943b = "BitmapImageDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139944a = new com.bumptech.glide.load.engine.bitmap_recycle.f();

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return c(C3094f.a(source), i10, i11, c4447e);
    }

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull ImageDecoder.Source source, @NonNull C4447e c4447e) throws IOException {
        C3094f.a(source);
        return true;
    }

    public com.bumptech.glide.load.engine.s<Bitmap> c(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new m3.i(i10, i11, c4447e));
        if (Log.isLoggable(f139943b, 2)) {
            Log.v(f139943b, "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C3096h(bitmapDecodeBitmap, this.f139944a);
    }

    public boolean d(@NonNull ImageDecoder.Source source, @NonNull C4447e c4447e) throws IOException {
        return true;
    }
}
