package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import e.T;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;
import java.io.InputStream;
import y3.C5812a;

/* JADX INFO: loaded from: classes2.dex */
@T(api = 28)
public final class D implements InterfaceC4448f<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3095g f139842a = new C3095g();

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull InputStream inputStream, @NonNull C4447e c4447e) throws IOException {
        return true;
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull InputStream inputStream, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return this.f139842a.c(ImageDecoder.createSource(C5812a.b(inputStream)), i10, i11, c4447e);
    }

    public boolean d(@NonNull InputStream inputStream, @NonNull C4447e c4447e) throws IOException {
        return true;
    }
}
