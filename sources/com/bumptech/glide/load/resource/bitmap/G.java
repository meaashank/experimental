package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.C4447e;
import g3.InterfaceC4448f;

/* JADX INFO: loaded from: classes2.dex */
public class G implements InterfaceC4448f<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3.m f139886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139887b;

    public G(o3.m mVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f139886a = mVar;
        this.f139887b = eVar;
    }

    @Override // g3.InterfaceC4448f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        com.bumptech.glide.load.engine.s<Drawable> sVarA = this.f139886a.a(uri, i10, i11, c4447e);
        if (sVarA == null) {
            return null;
        }
        return w.a(this.f139887b, ((o3.j) sVarA).get(), i10, i11);
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull C4447e c4447e) {
        return "android.resource".equals(uri.getScheme());
    }
}
