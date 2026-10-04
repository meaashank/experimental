package com.prism.gaia.naked.metadata.android.os;

import android.os.Handler;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class HandlerCAGI {

    @W6.i(Handler.class)
    @W6.m
    public interface C extends ClassAccessor {
        @W6.n("mAsynchronous")
        NakedBoolean mAsynchronous();
    }

    @W6.l
    @W6.i(Handler.class)
    public interface G extends ClassAccessor {
        @W6.n("mCallback")
        NakedObject<Handler.Callback> mCallback();
    }
}
