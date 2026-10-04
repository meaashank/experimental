package com.prism.gaia.naked.metadata.android.app.job;

import android.app.Notification;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class IJobCallbackCAGI {

    @W6.m
    @W6.j("android.app.job.IJobCallback")
    public interface C34 extends ClassAccessor {
        @W6.p("handleAbandonedJob")
        @W6.f({int.class})
        NakedMethod<Void> handleAbandonedJob();
    }

    @W6.l
    @W6.j("android.app.job.IJobCallback")
    public interface G extends ClassAccessor {

        @W6.l
        @W6.j("android.app.job.IJobCallback$Stub")
        public interface Stub extends ClassAccessor {
            @W6.f({IBinder.class})
            @W6.s("asInterface")
            NakedStaticMethod<IInterface> asInterface();
        }

        @W6.p("acknowledgeStartMessage")
        @W6.f({int.class, boolean.class})
        NakedMethod<Void> acknowledgeStartMessage();

        @W6.p("acknowledgeStopMessage")
        @W6.f({int.class, boolean.class})
        NakedMethod<Void> acknowledgeStopMessage();

        @W6.p("completeWork")
        @W6.f({int.class, int.class})
        NakedMethod<Boolean> completeWork();

        @W6.p("dequeueWork")
        @W6.f({int.class})
        NakedMethod<JobWorkItem> dequeueWork();

        @W6.p("jobFinished")
        @W6.f({int.class, boolean.class})
        NakedMethod<Void> jobFinished();
    }

    @W6.l
    @W6.j("android.app.job.IJobCallback")
    public interface U34 extends ClassAccessor {
        @W6.p("acknowledgeGetTransferredDownloadBytesMessage")
        @W6.f({int.class, int.class, long.class})
        NakedMethod<Void> acknowledgeGetTransferredDownloadBytesMessage();

        @W6.p("acknowledgeGetTransferredUploadBytesMessage")
        @W6.f({int.class, int.class, long.class})
        NakedMethod<Void> acknowledgeGetTransferredUploadBytesMessage();

        @W6.p("setNotification")
        @W6.f({int.class, int.class, Notification.class, int.class})
        NakedMethod<Void> setNotification();

        @W6.p("updateEstimatedNetworkBytes")
        @W6.f({int.class, JobWorkItem.class, long.class, long.class})
        NakedMethod<Void> updateEstimatedNetworkBytes();

        @W6.p("updateTransferredNetworkBytes")
        @W6.f({int.class, JobWorkItem.class, long.class, long.class})
        NakedMethod<Void> updateTransferredNetworkBytes();
    }
}
