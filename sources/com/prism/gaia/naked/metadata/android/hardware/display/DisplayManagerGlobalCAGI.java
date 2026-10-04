package com.prism.gaia.naked.metadata.android.hardware.display;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import W6.s;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class DisplayManagerGlobalCAGI {

    @l
    @j("android.hardware.display.DisplayManagerGlobal")
    public interface G extends ClassAccessor {
        @s("getInstance")
        NakedStaticMethod<Object> getInstance();

        @n("mDm")
        NakedObject<IInterface> mDm();
    }
}
