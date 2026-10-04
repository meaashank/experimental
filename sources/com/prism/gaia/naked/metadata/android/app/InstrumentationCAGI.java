package com.prism.gaia.naked.metadata.android.app;

import android.app.Instrumentation;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class InstrumentationCAGI {

    @W6.i(Instrumentation.class)
    @W6.m
    public interface C extends ClassAccessor {
        @W6.n("mThread")
        NakedObject<Object> mThread();
    }
}
