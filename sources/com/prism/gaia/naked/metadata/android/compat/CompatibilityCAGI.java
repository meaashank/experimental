package com.prism.gaia.naked.metadata.android.compat;

import W6.j;
import W6.l;
import W6.p;
import W6.q;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class CompatibilityCAGI {

    @l
    @j("android.compat.Compatibility")
    public interface R30 extends ClassAccessor {

        @l
        @j("android.compat.Compatibility$Callbacks")
        public interface Callbacks extends ClassAccessor {
            @p("isChangeEnabled")
            @W6.f({long.class})
            NakedMethod<Boolean> isChangeEnabled();

            @p("reportChange")
            @W6.f({long.class})
            NakedMethod<Void> reportChange();
        }

        @q("sCallbacks")
        NakedStaticObject<Object> sCallbacks();
    }

    @l
    @j("android.compat.Compatibility")
    public interface S31 extends ClassAccessor {

        @l
        @j("android.compat.Compatibility$BehaviorChangeDelegate")
        public interface BehaviorChangeDelegate extends ClassAccessor {
            @p("isChangeEnabled")
            @W6.f({long.class})
            NakedMethod<Boolean> isChangeEnabled();

            @p("onChangeReported")
            @W6.f({long.class})
            NakedMethod<Void> onChangeReported();
        }

        @q("DEFAULT_CALLBACKS")
        NakedStaticObject<Object> DEFAULT_CALLBACKS();

        @q("sCallbacks")
        NakedStaticObject<Object> sCallbacks();
    }
}
