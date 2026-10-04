package com.prism.gaia.naked.metadata.android.app.job;

import android.app.job.JobParameters;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IJobServiceCAGI {

    @W6.l
    @W6.j("android.app.job.IJobService")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.app.job.IJobService$Stub")
        public interface Stub extends ClassAccessor {
            @W6.f({IBinder.class})
            @W6.s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }

        @W6.p("onNetworkChanged")
        @W6.f({JobParameters.class})
        NakedMethod<Void> onNetworkChanged();

        @W6.p("startJob")
        @W6.f({JobParameters.class})
        NakedMethod<Void> startJob();

        @W6.p("stopJob")
        @W6.f({JobParameters.class})
        NakedMethod<Void> stopJob();
    }
}
