package com.prism.gaia.naked.metadata.android.widget;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.content.pm.ApplicationInfo;
import android.widget.RemoteViews;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class RemoteViewsCAGI {

    @l
    @i(RemoteViews.class)
    public interface G extends ClassAccessor {
        @n("mActions")
        NakedObject<ArrayList<Object>> mActions();
    }

    @l
    @i(RemoteViews.class)
    public interface L21 extends ClassAccessor {
        @n("mApplication")
        NakedObject<ApplicationInfo> mApplication();
    }

    @l
    @i(RemoteViews.class)
    public interface _L21 extends ClassAccessor {
        @n("mPackage")
        NakedObject<String> mPackage();
    }
}
