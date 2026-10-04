package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import g3.InterfaceC4450h;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C3092d implements InterfaceC4450h<BitmapDrawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4450h<Drawable> f139938c;

    public C3092d(InterfaceC4450h<Bitmap> interfaceC4450h) {
        this.f139938c = new x(interfaceC4450h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.bumptech.glide.load.engine.s<BitmapDrawable> c(com.bumptech.glide.load.engine.s<Drawable> sVar) {
        if (sVar.get() instanceof BitmapDrawable) {
            return sVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + sVar.get());
    }

    public static com.bumptech.glide.load.engine.s<Drawable> d(com.bumptech.glide.load.engine.s<BitmapDrawable> sVar) {
        return sVar;
    }

    @Override // g3.InterfaceC4450h
    @NonNull
    public com.bumptech.glide.load.engine.s<BitmapDrawable> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.s<BitmapDrawable> sVar, int i10, int i11) {
        com.bumptech.glide.load.engine.s sVarA = this.f139938c.a(context, sVar, i10, i11);
        c(sVarA);
        return sVarA;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        this.f139938c.b(messageDigest);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof C3092d) {
            return this.f139938c.equals(((C3092d) obj).f139938c);
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f139938c.hashCode();
    }
}
