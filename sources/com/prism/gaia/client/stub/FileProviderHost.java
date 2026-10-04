package com.prism.gaia.client.stub;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.prism.commons.utils.C3836a;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.C3861z;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import com.prism.gaia.helper.io.GFile;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class FileProviderHost extends FileProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f164309b = ".host.fileprovider";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164308a = "asdf-".concat("FileProviderHost");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3861z<String, Context> f164310c = new C3861z<>(new C3916c());

    public static class RemoteInstall extends RemoteRunnable {
        public static final Parcelable.Creator<RemoteInstall> CREATOR = new a();
        private static final String RESULT_FILE_SHARE_URI = "result_fileShareUri";
        private String filePath;

        public class a implements Parcelable.Creator<RemoteInstall> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public RemoteInstall createFromParcel(Parcel parcel) {
                return new RemoteInstall(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public RemoteInstall[] newArray(int i10) {
                return new RemoteInstall[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PendingIntent getInstallIntent(GFile gFile) {
            RemoteInstall remoteInstall = new RemoteInstall();
            remoteInstall.filePath = gFile.getAbsolutePath();
            remoteInstall.start(gFile.t());
            return (PendingIntent) remoteInstall.getResultBundle().getParcelable(RESULT_FILE_SHARE_URI);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            Context contextN = GaiaContext.j().n();
            Uri uriW = C3858w.w(contextN, FileProviderHost.c(contextN), new File(this.filePath));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.addFlags(3);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(uriW, C3858w.c.f162163a);
            getResultBundle().putParcelable(RESULT_FILE_SHARE_URI, PendingIntent.getActivity(contextN, 0, intent, C3836a.b.a(1140850688)));
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.filePath);
        }

        private RemoteInstall() {
        }

        private RemoteInstall(Parcel parcel) {
            super(parcel);
            this.filePath = parcel.readString();
        }
    }

    public static /* synthetic */ String a(Context context) {
        return context.getPackageName() + f164309b;
    }

    public static PendingIntent b(@NonNull GFile gFile) {
        gFile.getAbsolutePath();
        return RemoteInstall.getInstallIntent(gFile);
    }

    public static String c(Context context) {
        return f164310c.a(context);
    }
}
