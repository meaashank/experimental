package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC3097i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139891d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f139892e = f139891d.getBytes(InterfaceC4444b.f202232b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f139893c;

    public I(int i10) {
        y3.m.b(i10 > 0, "roundingRadius must be greater than 0.");
        this.f139893c = i10;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f139892e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f139893c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3097i
    public Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return K.q(eVar, bitmap, this.f139893c);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        return (obj instanceof I) && this.f139893c == ((I) obj).f139893c;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return y3.o.q(-569625254, y3.o.p(this.f139893c));
    }
}
