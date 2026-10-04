package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.content.ContentProviderClient;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ContentProviderClientCAGI {

    @l
    @i(ContentProviderClient.class)
    public interface G extends ClassAccessor {
        @n("mContentProvider")
        NakedObject<IInterface> mContentProvider();
    }
}
