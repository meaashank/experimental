package com.prism.gaia.naked.metadata.android.util;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import w7.i;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class SingletonCAGI {

    @l
    @j("android.util.Singleton")
    public interface G extends ClassAccessor {
        @p(i.f240158w)
        NakedMethod<Object> get();

        @n("mInstance")
        NakedObject<Object> mInstance();
    }
}
