package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import g3.InterfaceC4444b;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class p extends AbstractC3097i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f139953c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139954d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f139955e = f139954d.getBytes(InterfaceC4444b.f202232b);

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f139955e);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3097i
    public Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return K.d(eVar, bitmap, i10, i11);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        return obj instanceof p;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return 1101716364;
    }
}
