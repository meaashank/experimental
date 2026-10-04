package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import g3.InterfaceC4450h;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class x implements InterfaceC4450h<Drawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4450h<Bitmap> f139975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f139976d;

    public x(InterfaceC4450h<Bitmap> interfaceC4450h, boolean z10) {
        this.f139975c = interfaceC4450h;
        this.f139976d = z10;
    }

    @Override // g3.InterfaceC4450h
    @NonNull
    public com.bumptech.glide.load.engine.s<Drawable> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.s<Drawable> sVar, int i10, int i11) {
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarH = com.bumptech.glide.c.e(context).h();
        Drawable drawable = sVar.get();
        com.bumptech.glide.load.engine.s<Bitmap> sVarA = w.a(eVarH, drawable, i10, i11);
        if (sVarA != null) {
            com.bumptech.glide.load.engine.s<Bitmap> sVarA2 = this.f139975c.a(context, sVarA, i10, i11);
            if (!sVarA2.equals(sVarA)) {
                return d(context, sVarA2);
            }
            sVarA2.a();
            return sVar;
        }
        if (!this.f139976d) {
            return sVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        this.f139975c.b(messageDigest);
    }

    public final com.bumptech.glide.load.engine.s<Drawable> d(Context context, com.bumptech.glide.load.engine.s<Bitmap> sVar) {
        return E.d(context.getResources(), sVar);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f139975c.equals(((x) obj).f139975c);
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f139975c.hashCode();
    }

    public InterfaceC4450h<BitmapDrawable> c() {
        return this;
    }
}
