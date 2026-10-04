package com.prism.gaia.naked.metadata.java.lang;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.l;
import W6.p;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public class RuntimeCAGI {

    @l
    @i(Runtime.class)
    public interface G extends ClassAccessor {
        @p("load0")
        @f({Class.class, String.class})
        NakedMethod<Void> load0();

        @f({String.class, ClassLoader.class})
        @s("nativeLoad")
        NakedStaticMethod<String> nativeLoad();
    }
}
