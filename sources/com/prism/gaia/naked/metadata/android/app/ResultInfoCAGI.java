package com.prism.gaia.naked.metadata.android.app;

import android.content.Intent;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ResultInfoCAGI {

    @W6.m
    @W6.j("android.app.ResultInfo")
    public interface C extends ClassAccessor {
        @W6.n("mData")
        NakedObject<Intent> mData();

        @W6.n("mRequestCode")
        NakedInt mRequestCode();

        @W6.n("mResultCode")
        NakedInt mResultCode();

        @W6.n("mResultWho")
        NakedObject<String> mResultWho();
    }
}
