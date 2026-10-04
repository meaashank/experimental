package com.prism.gaia.naked.metadata.android.app;

import android.os.Bundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ActivityOptionsCAGI {

    @W6.m
    @W6.j("android.app.ActivityOptions")
    public interface C extends ClassAccessor {
        @W6.p("getLaunchTaskBehind")
        NakedMethod<Boolean> getLaunchTaskBehind();

        @W6.p("getLaunchTaskId")
        NakedMethod<Integer> getLaunchTaskId();
    }

    @W6.l
    @W6.j("android.app.ActivityOptions")
    public interface J16 extends ClassAccessor {
        @W6.f({Bundle.class})
        @W6.k
        NakedConstructor<Object> ctor();
    }
}
