package com.prism.gaia.naked.metadata.android.app.servertransaction;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class LaunchActivityItemCAGI {

    @l
    @j("android.app.servertransaction.LaunchActivityItem")
    public interface P28 extends ClassAccessor {
        @n("mCompatInfo")
        NakedObject<Object> mCompatInfo();

        @n("mIdent")
        NakedInt mIdent();

        @n("mInfo")
        NakedObject<ActivityInfo> mInfo();

        @n("mIntent")
        NakedObject<Intent> mIntent();

        @n("mIsForward")
        NakedBoolean mIsForward();

        @n("mOverrideConfig")
        NakedObject<Configuration> mOverrideConfig();

        @n("mPendingNewIntents")
        NakedObject<List<Object>> mPendingNewIntents();

        @n("mPendingResults")
        NakedObject<List<Object>> mPendingResults();

        @n("mPersistentState")
        NakedObject<PersistableBundle> mPersistentState();

        @n("mProfilerInfo")
        NakedObject<Object> mProfilerInfo();

        @n("mReferrer")
        NakedObject<String> mReferrer();

        @n("mState")
        NakedObject<Bundle> mState();

        @n("mVoiceInteractor")
        NakedObject<Object> mVoiceInteractor();
    }
}
