package com.prism.gaia.naked.metadata.android.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ActivityCAGI {

    @W6.l
    @W6.j("android.app.Activity")
    public interface G extends ClassAccessor {
        @W6.n("mActivityInfo")
        NakedObject<ActivityInfo> mActivityInfo();

        @W6.n("mEmbeddedID")
        NakedObject<String> mEmbeddedID();

        @W6.n("mFinished")
        NakedBoolean mFinished();

        @W6.n("mParent")
        NakedObject<Activity> mParent();

        @W6.n("mResultCode")
        NakedInt mResultCode();

        @W6.n("mResultData")
        NakedObject<Intent> mResultData();

        @W6.n("mToken")
        NakedObject<IBinder> mToken();
    }
}
