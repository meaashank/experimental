package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3089a<DataType> implements InterfaceC4448f<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4448f<DataType, Bitmap> f139933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f139934b;

    public C3089a(Context context, InterfaceC4448f<DataType, Bitmap> interfaceC4448f) {
        this(context.getResources(), interfaceC4448f);
    }

    @Override // g3.InterfaceC4448f
    public com.bumptech.glide.load.engine.s<BitmapDrawable> a(@NonNull DataType datatype, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return E.d(this.f139934b, this.f139933a.a(datatype, i10, i11, c4447e));
    }

    @Override // g3.InterfaceC4448f
    public boolean b(@NonNull DataType datatype, @NonNull C4447e c4447e) throws IOException {
        return this.f139933a.b(datatype, c4447e);
    }

    @Deprecated
    public C3089a(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, InterfaceC4448f<DataType, Bitmap> interfaceC4448f) {
        this(resources, interfaceC4448f);
    }

    public C3089a(@NonNull Resources resources, @NonNull InterfaceC4448f<DataType, Bitmap> interfaceC4448f) {
        y3.m.f(resources, "Argument must not be null");
        this.f139934b = resources;
        y3.m.f(interfaceC4448f, "Argument must not be null");
        this.f139933a = interfaceC4448f;
    }
}
