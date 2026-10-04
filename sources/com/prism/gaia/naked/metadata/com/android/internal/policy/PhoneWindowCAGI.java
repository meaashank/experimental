package com.prism.gaia.naked.metadata.com.android.internal.policy;

import W6.b;
import W6.c;
import W6.j;
import W6.m;
import W6.q;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class PhoneWindowCAGI {

    @m
    @j("com.android.internal.policy.impl.PhoneWindow$WindowManagerHolder")
    public interface C extends ClassAccessor {
        @q("sWindowManager")
        NakedStaticObject<IInterface> sWindowManager();
    }

    @m
    @j("com.android.internal.policy.PhoneWindow$WindowManagerHolder")
    public interface C2 extends ClassAccessor {
        @q("sWindowManager")
        NakedStaticObject<IInterface> sWindowManager();
    }
}
