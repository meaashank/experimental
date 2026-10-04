package com.prism.gaia.naked.metadata.android.view;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.s;
import android.graphics.Bitmap;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class SurfaceControlCAGI {

    @l
    @j("android.view.SurfaceControl")
    public interface G extends ClassAccessor {
        @f({int.class, int.class})
        @s("screnshot")
        NakedStaticMethod<Bitmap> screnshot();
    }
}
