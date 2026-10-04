package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.m;
import W6.q;
import android.content.Intent;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class IntentCAGI {

    @i(Intent.class)
    @m
    public interface C extends ClassAccessor {
        @q("EXTRA_USER_HANDLE")
        NakedStaticObject<String> EXTRA_USER_HANDLE();

        @q("FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT")
        NakedStaticInt FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT();
    }
}
