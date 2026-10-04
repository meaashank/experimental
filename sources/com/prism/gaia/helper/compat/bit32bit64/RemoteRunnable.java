package com.prism.gaia.helper.compat.bit32bit64;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.exception.GaiaRemoteRunnableException;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.utils.o;
import com.prism.gaia.server.Gaia32bit64bitProvider;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RemoteRunnable implements Runnable, Parcelable {
    private static final String PARAM_REMOTE_RUNNABLE = "remoteRunnable";
    private static final String RESULT_CODE = ".resultCode";
    public static final int RESULT_CODE_FAIL = -1;
    private static final String RESULT_EXCEPTION = ".resultException";
    private static final String TAG = "asdf-".concat("RemoteRunnable");
    private GaiaRemoteRunnableException err;
    private ResultReceiver feedbackReceiver;
    private Bundle output;
    private Bundle result;

    public RemoteRunnable() {
        this(null, 0);
    }

    public static void onRemoteReceivedRunnable(Bundle bundle, Bundle bundle2) {
        bundle.setClassLoader(RemoteRunnable.class.getClassLoader());
        RemoteRunnable remoteRunnable = (RemoteRunnable) bundle.getParcelable(PARAM_REMOTE_RUNNABLE);
        if (remoteRunnable == null) {
            return;
        }
        remoteRunnable.output = bundle2;
        remoteRunnable.run();
        GaiaRemoteRunnableException gaiaRemoteRunnableException = remoteRunnable.err;
        if (gaiaRemoteRunnableException != null) {
            remoteRunnable.output.putParcelable(RESULT_EXCEPTION, gaiaRemoteRunnableException);
        }
    }

    private void runInCurrent() {
        this.output = new Bundle();
        run();
        GaiaRemoteRunnableException gaiaRemoteRunnableException = this.err;
        if (gaiaRemoteRunnableException != null) {
            throw gaiaRemoteRunnableException;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getResultBundle() {
        Bundle bundle = this.output;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = this.result;
        return bundle2 != null ? bundle2 : new Bundle();
    }

    public void onFeedbackReceived(int i10, Bundle bundle) {
    }

    public void onRemoteRun() throws Exception {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            onRemoteRun();
        } catch (Throwable th) {
            this.err = new GaiaRemoteRunnableException(th);
        }
    }

    public void sendFeedback(int i10, Bundle bundle) {
        this.feedbackReceiver.send(i10, bundle);
    }

    public void setResultCode(int i10) {
        this.output.putInt(RESULT_CODE, i10);
    }

    public int start(@NonNull GUri gUri) throws GaiaRemoteRunnableException {
        return start(gUri, false);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.feedbackReceiver, i10);
    }

    public RemoteRunnable(Handler handler, int i10) {
        this.result = null;
        this.output = null;
        this.err = null;
        this.feedbackReceiver = new ResultReceiver(handler == null ? new Handler(Gaia32bit64bitProvider.c()) : handler) { // from class: com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i11, Bundle bundle) {
                try {
                    RemoteRunnable.this.onFeedbackReceived(i11, bundle);
                } catch (Throwable unused) {
                    String unused2 = RemoteRunnable.TAG;
                }
            }
        };
    }

    public int start(@NonNull GUri gUri, boolean z10) throws GaiaRemoteRunnableException {
        if (z10 || !Gaia32bit64bitProvider.i(gUri)) {
            o.c("RemoteRunnable -> ".concat(getClass().getSimpleName()));
            Bundle bundle = new Bundle();
            bundle.putParcelable(PARAM_REMOTE_RUNNABLE, this);
            try {
                this.result = GaiaContext.j().n().getContentResolver().call(gUri.getContentUri(), Gaia32bit64bitProvider.f166091i, (String) null, bundle);
            } catch (IllegalArgumentException unused) {
                this.result = null;
            }
            Bundle bundle2 = this.result;
            if (bundle2 == null) {
                return -1;
            }
            bundle2.setClassLoader(GaiaRemoteRunnableException.class.getClassLoader());
            GaiaRemoteRunnableException gaiaRemoteRunnableException = (GaiaRemoteRunnableException) this.result.getParcelable(RESULT_EXCEPTION);
            if (gaiaRemoteRunnableException != null) {
                throw gaiaRemoteRunnableException;
            }
        } else {
            runInCurrent();
            this.result = this.output;
        }
        return this.result.getInt(RESULT_CODE, 0);
    }

    public RemoteRunnable(Parcel parcel) {
        this.result = null;
        this.output = null;
        this.err = null;
        this.feedbackReceiver = (ResultReceiver) parcel.readParcelable(RemoteRunnable.class.getClassLoader());
    }
}
