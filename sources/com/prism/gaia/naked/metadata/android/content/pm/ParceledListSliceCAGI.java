package com.prism.gaia.naked.metadata.android.content.pm;

import android.os.Parcelable;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ParceledListSliceCAGI {

    @W6.m
    @W6.j("android.content.pm.ParceledListSlice")
    public interface C extends ClassAccessor {
        @W6.q("CREATOR")
        NakedStaticObject<Parcelable.Creator> CREATOR();

        @W6.p(AgentOptions.APPEND)
        NakedMethod<Boolean> append();

        @W6.k
        NakedConstructor<Parcelable> ctor();

        @W6.p("getList")
        NakedMethod<List<?>> getList();

        @W6.p("isLastSlice")
        NakedMethod<Boolean> isLastSlice();

        @W6.p("populateList")
        NakedMethod<Parcelable> populateList();

        @W6.p("setLastSlice")
        NakedMethod<Void> setLastSlice();
    }

    @W6.m
    @W6.j("android.content.pm.ParceledListSlice")
    public interface CJ18 extends ClassAccessor {
        @W6.q("CREATOR")
        NakedStaticObject<Parcelable.Creator> CREATOR();

        @W6.f({List.class})
        @W6.k
        NakedConstructor<Parcelable> ctor();

        @W6.p("getList")
        NakedMethod<List> getList();
    }
}
