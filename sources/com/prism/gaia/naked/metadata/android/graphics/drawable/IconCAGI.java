package com.prism.gaia.naked.metadata.android.graphics.drawable;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.annotation.TargetApi;
import android.graphics.drawable.Icon;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(23)
public final class IconCAGI {

    @l
    @i(Icon.class)
    public interface G extends ClassAccessor {
        @n("mInt1")
        NakedObject<Integer> mInt1();

        @n("mObj1")
        NakedObject<Object> mObj1();

        @n("mString1")
        NakedObject<String> mString1();

        @n("mType")
        NakedObject<Integer> mType();
    }
}
