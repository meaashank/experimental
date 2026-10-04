package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import w3.C5741b;
import w3.InterfaceC5745f;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3098j extends com.bumptech.glide.l<C3098j, Bitmap> {
    @NonNull
    public static C3098j n(@NonNull InterfaceC5745f<Bitmap> interfaceC5745f) {
        C3098j c3098j = new C3098j();
        c3098j.g(interfaceC5745f);
        return c3098j;
    }

    @NonNull
    public static C3098j p() {
        C3098j c3098j = new C3098j();
        c3098j.i();
        return c3098j;
    }

    @NonNull
    public static C3098j q(int i10) {
        C3098j c3098j = new C3098j();
        c3098j.j(i10);
        return c3098j;
    }

    @NonNull
    public static C3098j r(@NonNull DrawableCrossFadeFactory.Builder builder) {
        C3098j c3098j = new C3098j();
        c3098j.k(builder);
        return c3098j;
    }

    @NonNull
    public static C3098j s(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory) {
        C3098j c3098j = new C3098j();
        c3098j.m(drawableCrossFadeFactory);
        return c3098j;
    }

    @NonNull
    public static C3098j t(@NonNull InterfaceC5745f<Drawable> interfaceC5745f) {
        C3098j c3098j = new C3098j();
        c3098j.m(interfaceC5745f);
        return c3098j;
    }

    @Override // com.bumptech.glide.l
    public boolean equals(Object obj) {
        return (obj instanceof C3098j) && super.equals(obj);
    }

    @Override // com.bumptech.glide.l
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public C3098j i() {
        m(new DrawableCrossFadeFactory.Builder().build());
        return this;
    }

    @NonNull
    public C3098j j(int i10) {
        m(new DrawableCrossFadeFactory.Builder(i10).build());
        return this;
    }

    @NonNull
    public C3098j k(@NonNull DrawableCrossFadeFactory.Builder builder) {
        m(builder.build());
        return this;
    }

    @NonNull
    public C3098j l(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory) {
        m(drawableCrossFadeFactory);
        return this;
    }

    @NonNull
    public C3098j m(@NonNull InterfaceC5745f<Drawable> interfaceC5745f) {
        this.f139377a = new C5741b(interfaceC5745f);
        return this;
    }
}
