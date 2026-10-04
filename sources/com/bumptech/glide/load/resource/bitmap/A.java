package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC3097i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f139808g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f139809h = f139808g.getBytes(InterfaceC4444b.f202232b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f139810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f139811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f139812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f139813f;

    public A(float f10, float f11, float f12, float f13) {
        this.f139810c = f10;
        this.f139811d = f11;
        this.f139812e = f12;
        this.f139813f = f13;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f139809h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f139810c).putFloat(this.f139811d).putFloat(this.f139812e).putFloat(this.f139813f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3097i
    public Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return K.p(eVar, bitmap, this.f139810c, this.f139811d, this.f139812e, this.f139813f);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (this.f139810c == a10.f139810c && this.f139811d == a10.f139811d && this.f139812e == a10.f139812e && this.f139813f == a10.f139813f) {
                return true;
            }
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return y3.o.o(this.f139813f, y3.o.o(this.f139812e, y3.o.o(this.f139811d, y3.o.q(-2013597734, y3.o.n(this.f139810c)))));
    }
}
