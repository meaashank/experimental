package com.prism.gaia.naked.metadata.android.app.job;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PersistableBundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
@TargetApi(21)
public final class JobParametersCAGI {

    @W6.l
    @W6.i(JobParameters.class)
    public interface G extends ClassAccessor {
        @W6.n("callback")
        NakedObject<IBinder> callback();

        @W6.n("extras")
        NakedObject<PersistableBundle> extras();

        @W6.p("getCallback")
        NakedMethod<IInterface> getCallback();

        @W6.n("jobId")
        NakedInt jobId();
    }
}
