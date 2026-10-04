package com.prism.gaia.naked.metadata.android.app.job;

import android.app.job.JobServiceEngine;
import android.os.Binder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class JobServiceCAGI {

    @W6.l
    @W6.j("android.app.job.JobService")
    public interface O26 extends ClassAccessor {
        @W6.n("mEngine")
        NakedObject<JobServiceEngine> mEngine();
    }

    @W6.l
    @W6.j("android.app.job.JobService")
    public interface _N25 extends ClassAccessor {
        @W6.n("mBinder")
        NakedObject<Binder> mBinder();
    }
}
