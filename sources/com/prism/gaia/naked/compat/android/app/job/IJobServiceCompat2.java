package com.prism.gaia.naked.compat.android.app.job;

import android.app.job.JobParameters;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.app.job.IJobServiceCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IJobServiceCompat2 {

    public static class Util {
        public static IInterface asInterface(IBinder iBinder) {
            return IJobServiceCAG.f165469G.Stub.asInterface().call(iBinder);
        }

        public static void onNetworkChanged(IInterface iInterface, JobParameters jobParameters) {
            IJobServiceCAG.f165469G.onNetworkChanged().call(iInterface, jobParameters);
        }

        public static void startJob(IInterface iInterface, JobParameters jobParameters) {
            IJobServiceCAG.f165469G.startJob().call(iInterface, jobParameters);
        }

        public static void stopJob(IInterface iInterface, JobParameters jobParameters) {
            IJobServiceCAG.f165469G.stopJob().call(iInterface, jobParameters);
        }
    }
}
