package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3099k implements InterfaceC4448f<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f139947a;

    public C3099k(v vVar) {
        this.f139947a = vVar;
    }

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull ByteBuffer byteBuffer, @NonNull C4447e c4447e) throws IOException {
        d(byteBuffer, c4447e);
        return true;
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return this.f139947a.h(byteBuffer, i10, i11, c4447e);
    }

    public boolean d(@NonNull ByteBuffer byteBuffer, @NonNull C4447e c4447e) {
        this.f139947a.getClass();
        return true;
    }
}
