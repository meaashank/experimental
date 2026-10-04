package com.prism.gaia.naked.compat.android.app.job;

import K7.b;
import android.app.Notification;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.app.job.IJobCallbackCAG;

/* JADX INFO: loaded from: classes6.dex */
public class IJobCallbackCompat2 {

    public static class Util {
        public static void acknowledgeGetTransferredDownloadBytesMessage(IInterface iInterface, int i10, int i11, long j10) throws RemoteException {
            IJobCallbackCAG.U34.acknowledgeGetTransferredDownloadBytesMessage().call(iInterface, Integer.valueOf(i10), Integer.valueOf(i11), Long.valueOf(j10));
        }

        public static void acknowledgeGetTransferredUploadBytesMessage(IInterface iInterface, int i10, int i11, long j10) throws RemoteException {
            IJobCallbackCAG.U34.acknowledgeGetTransferredUploadBytesMessage().call(iInterface, Integer.valueOf(i10), Integer.valueOf(i11), Long.valueOf(j10));
        }

        public static void acknowledgeStartMessage(IInterface iInterface, int i10, boolean z10) throws RemoteException {
            IJobCallbackCAG.f165467G.acknowledgeStartMessage().call(iInterface, Integer.valueOf(i10), Boolean.valueOf(z10));
        }

        public static void acknowledgeStopMessage(IInterface iInterface, int i10, boolean z10) throws RemoteException {
            IJobCallbackCAG.f165467G.acknowledgeStopMessage().call(iInterface, Integer.valueOf(i10), Boolean.valueOf(z10));
        }

        public static IInterface asInterface(IBinder iBinder) {
            return IJobCallbackCAG.f165467G.Stub.asInterface().call(iBinder);
        }

        public static boolean completeWork(IInterface iInterface, int i10, int i11) throws RemoteException {
            return IJobCallbackCAG.f165467G.completeWork().call(iInterface, Integer.valueOf(i10), Integer.valueOf(i11)).booleanValue();
        }

        public static JobWorkItem dequeueWork(IInterface iInterface, int i10) throws RemoteException {
            return b.a(IJobCallbackCAG.f165467G.dequeueWork().call(iInterface, Integer.valueOf(i10)));
        }

        public static void handleAbandonedJob(IInterface iInterface, int i10) throws RemoteException {
            if (!C3841e.E() || IJobCallbackCAG.C34.handleAbandonedJob() == null) {
                return;
            }
            IJobCallbackCAG.C34.handleAbandonedJob().call(iInterface, Integer.valueOf(i10));
        }

        public static void jobFinished(IInterface iInterface, int i10, boolean z10) throws RemoteException {
            IJobCallbackCAG.f165467G.jobFinished().call(iInterface, Integer.valueOf(i10), Boolean.valueOf(z10));
        }

        public static void setNotification(IInterface iInterface, int i10, int i11, Notification notification, int i12) throws RemoteException {
            IJobCallbackCAG.U34.setNotification().call(iInterface, Integer.valueOf(i10), notification, notification, Integer.valueOf(i12));
        }

        public static void updateEstimatedNetworkBytes(IInterface iInterface, int i10, JobWorkItem jobWorkItem, long j10, long j11) throws RemoteException {
            IJobCallbackCAG.U34.updateEstimatedNetworkBytes().call(iInterface, Integer.valueOf(i10), jobWorkItem, Long.valueOf(j10), Long.valueOf(j11));
        }

        public static void updateTransferredNetworkBytes(IInterface iInterface, int i10, JobWorkItem jobWorkItem, long j10, long j11) throws RemoteException {
            IJobCallbackCAG.U34.updateTransferredNetworkBytes().call(iInterface, Integer.valueOf(i10), iInterface, Long.valueOf(j10), Long.valueOf(j11));
        }
    }
}
