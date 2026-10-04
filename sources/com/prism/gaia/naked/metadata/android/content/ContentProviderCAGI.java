package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.m;
import W6.p;
import android.content.ContentProvider;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ContentProviderCAGI {

    @i(ContentProvider.class)
    @m
    public interface C extends ClassAccessor {
        @p("getIContentProvider")
        NakedMethod<IInterface> getIContentProvider();
    }
}
