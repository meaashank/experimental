package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import W6.q;
import android.content.ContentResolver;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ContentResolverCAGI {

    public interface A {

        public interface ContextImpl {

            @l
            @i(ContentResolver.class)
            public interface J18 extends ClassAccessor {
                @n("mPackageName")
                NakedObject<String> mPackageName();
            }
        }
    }

    @l
    @i(ContentResolver.class)
    public interface G extends ClassAccessor {
        @q("sContentService")
        NakedStaticObject<IInterface> sContentService();
    }
}
