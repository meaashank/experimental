package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class H extends AbstractC3097i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139888d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f139889e = f139888d.getBytes(InterfaceC4444b.f202232b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f139890c;

    public H(int i10) {
        this.f139890c = i10;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f139889e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f139890c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3097i
    public Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return K.n(bitmap, this.f139890c);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        return (obj instanceof H) && this.f139890c == ((H) obj).f139890c;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return y3.o.q(-950519196, y3.o.p(this.f139890c));
    }
}
