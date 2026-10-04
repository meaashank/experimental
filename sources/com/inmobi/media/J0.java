package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;
import o3.C5322b;

/* JADX INFO: loaded from: classes5.dex */
public final class J0 implements InterfaceC3496c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedImageDrawable f152086a;

    public J0(String filePath) throws IOException {
        kotlin.jvm.internal.G.p(filePath, "filePath");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(filePath)));
        kotlin.jvm.internal.G.n(drawableDecodeDrawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
        this.f152086a = C5322b.a(drawableDecodeDrawable);
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void a(InterfaceC3482b4 interfaceC3482b4) {
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void b() {
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final boolean c() {
        return this.f152086a.isRunning();
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final int d() {
        return this.f152086a.getIntrinsicWidth();
    }

    public final void e() {
        this.f152086a.start();
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void start() {
        this.f152086a.registerAnimationCallback(new I0(this));
        this.f152086a.start();
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void a(boolean z10) {
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final int a() {
        return this.f152086a.getIntrinsicHeight();
    }

    @Override // com.inmobi.media.InterfaceC3496c4
    public final void a(Canvas canvas, float f10, float f11) {
        kotlin.jvm.internal.G.m(canvas);
        canvas.translate(f10, f11);
        this.f152086a.draw(canvas);
    }
}
