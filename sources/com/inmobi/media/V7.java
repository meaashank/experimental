package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class V7 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f152522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(Context context, byte b10) {
        super(context);
        kotlin.jvm.internal.G.p(context, "context");
        this.f152522a = b10;
    }

    public abstract void a(C3708r7 c3708r7, W7 w72, int i10, int i11, U7 u72);

    public final byte getType() {
        return this.f152522a;
    }
}
