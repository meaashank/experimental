package com.prism.gaia.naked.metadata.android.app;

import android.app.ActivityManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ActivityManagerCAGI {

    @W6.l
    @W6.i(ActivityManager.class)
    public interface G extends ClassAccessor {
        @W6.q("START_CANCELED")
        NakedStaticInt START_CANCELED();

        @W6.q("START_INTENT_NOT_RESOLVED")
        NakedStaticInt START_INTENT_NOT_RESOLVED();
    }

    @W6.l
    @W6.i(ActivityManager.class)
    public interface M23 extends ClassAccessor {
        @W6.q("START_NOT_CURRENT_USER_ACTIVITY")
        NakedStaticInt START_NOT_CURRENT_USER_ACTIVITY();
    }

    @W6.l
    @W6.i(ActivityManager.class)
    public interface O26 extends ClassAccessor {
        @W6.q("IActivityManagerSingleton")
        NakedStaticObject<Object> IActivityManagerSingleton();

        @W6.s("getService")
        NakedStaticMethod<IInterface> getService();
    }

    @W6.l
    @W6.i(ActivityManager.class)
    public interface S31 extends ClassAccessor {

        @W6.m
        @W6.j("android.app.ActivityManager$PendingIntentInfo")
        public interface PendingIntentInfo extends ClassAccessor {
            @W6.g({"java.lang.String", "int", x.b.f238265f, "int"})
            @W6.k
            NakedConstructor<?> ctor();

            @W6.n("mCreatorPackage")
            NakedObject<String> mCreatorPackage();

            @W6.n("mCreatorUid")
            NakedInt mCreatorUid();

            @W6.n("mImmutable")
            NakedBoolean mImmutable();

            @W6.n("mIntentSenderType")
            NakedInt mIntentSenderType();
        }
    }
}
