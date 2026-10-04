package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import g3.C4447e;
import g3.InterfaceC4449g;
import java.io.File;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3090b implements InterfaceC4449g<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4449g<Bitmap> f139936b;

    public C3090b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, InterfaceC4449g<Bitmap> interfaceC4449g) {
        this.f139935a = eVar;
        this.f139936b = interfaceC4449g;
    }

    @Override // g3.InterfaceC4449g
    @NonNull
    public EncodeStrategy a(@NonNull C4447e c4447e) {
        return this.f139936b.a(c4447e);
    }

    @Override // g3.InterfaceC4443a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull com.bumptech.glide.load.engine.s<BitmapDrawable> sVar, @NonNull File file, @NonNull C4447e c4447e) {
        return this.f139936b.b((Bitmap) new C3096h(sVar.get().getBitmap(), this.f139935a), file, c4447e);
    }
}
