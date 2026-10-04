package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.m;
import W6.n;
import W6.q;
import W6.s;
import android.content.ClipboardManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ClipboardManagerCAGI {

    @i(ClipboardManager.class)
    @m
    public interface C26 extends ClassAccessor {
        @n("mService")
        NakedObject<IInterface> mService();
    }

    @l
    @i(ClipboardManager.class)
    public interface _N24 extends ClassAccessor {
        @s("getService")
        NakedStaticMethod<IInterface> getService();

        @q("sService")
        NakedStaticObject<IInterface> sService();
    }
}
