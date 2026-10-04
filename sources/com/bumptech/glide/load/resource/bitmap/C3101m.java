package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import e.T;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(api = 28)
public final class C3101m implements InterfaceC4448f<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3095g f139948a = new C3095g();

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull ByteBuffer byteBuffer, @NonNull C4447e c4447e) throws IOException {
        return true;
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return this.f139948a.c(ImageDecoder.createSource(byteBuffer), i10, i11, c4447e);
    }

    public boolean d(@NonNull ByteBuffer byteBuffer, @NonNull C4447e c4447e) throws IOException {
        return true;
    }
}
