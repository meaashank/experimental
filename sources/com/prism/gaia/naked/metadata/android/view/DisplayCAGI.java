package com.prism.gaia.naked.metadata.android.view;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.q;
import android.os.IInterface;
import android.view.Display;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class DisplayCAGI {

    @l
    @i(Display.class)
    public interface G extends ClassAccessor {
        @q("sWindowManager")
        NakedStaticObject<IInterface> sWindowManager();
    }
}
