package com.prism.gaia.naked.metadata.android.app.job;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.content.ComponentName;
import androidx.core.app.NotificationCompat;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
@TargetApi(21)
public final class JobInfoCAGI {

    @W6.l
    @W6.i(JobInfo.class)
    public interface G extends ClassAccessor {
        @W6.n("jobId")
        NakedInt jobId();

        @W6.n(NotificationCompat.CATEGORY_SERVICE)
        NakedObject<ComponentName> service();
    }
}
