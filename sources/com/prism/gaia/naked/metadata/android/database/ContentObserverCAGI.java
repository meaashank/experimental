package com.prism.gaia.naked.metadata.android.database;

import W6.f;
import W6.j;
import W6.l;
import W6.n;
import W6.p;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class ContentObserverCAGI {

    @l
    @j("android.database.ContentObserver")
    public interface G extends ClassAccessor {

        @l
        @j("android.database.ContentObserver$Transport")
        public interface Transport extends ClassAccessor {
            @n("mContentObserver")
            NakedObject<ContentObserver> mContentObserver();
        }

        @n("mHandler")
        NakedObject<Handler> mHandler();
    }

    @l
    @j("android.database.ContentObserver")
    public interface J16 extends ClassAccessor {
        @p("dispatchChange")
        @f({boolean.class, Uri.class, int.class})
        NakedMethod<Void> dispatchChange();
    }

    @l
    @j("android.database.ContentObserver")
    public interface _I15 extends ClassAccessor {
        @p("dispatchChange")
        @f({boolean.class})
        NakedMethod<Void> dispatchChange();
    }
}
