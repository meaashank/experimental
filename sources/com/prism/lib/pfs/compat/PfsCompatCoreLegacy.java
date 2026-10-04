package com.prism.lib.pfs.compat;

import B0.C0920d;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActivityC1486c;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.d;
import e6.C4366b;
import e6.C4367c;
import java.io.File;
import s6.C5577b;
import s6.i;

/* JADX INFO: loaded from: classes7.dex */
public class PfsCompatCoreLegacy extends PfsCompatCore {
    private final boolean askExternalStoragePerm;
    private final String pfsRootPath;
    private static final String TAG = l0.b("PfsCompatCoreLegacy");
    public static final Parcelable.Creator<PfsCompatCoreLegacy> CREATOR = new b();

    public class a implements i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PrivateFileSystem.d f183667a;

        public a(PrivateFileSystem.d dVar) {
            this.f183667a = dVar;
        }

        @Override // s6.i.b
        public void a(s6.i iVar) {
            synchronized (PfsCompatCoreLegacy.this) {
                PfsCompatCoreLegacy.this.mounted = true;
            }
            this.f183667a.c(PrivateFileSystem.MountResultCode.SUCCESS);
        }

        @Override // s6.i.b
        public void b(s6.i iVar) {
            this.f183667a.c(PrivateFileSystem.MountResultCode.NO_PERMISSION);
        }

        @Override // s6.i.b
        public void c(s6.i iVar, @NonNull String[] strArr) {
            this.f183667a.c(PrivateFileSystem.MountResultCode.NO_PERMISSION);
        }
    }

    public class b implements Parcelable.Creator<PfsCompatCoreLegacy> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PfsCompatCoreLegacy createFromParcel(Parcel parcel) {
            return new PfsCompatCoreLegacy(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PfsCompatCoreLegacy[] newArray(int i10) {
            return new PfsCompatCoreLegacy[i10];
        }
    }

    private boolean checkPerm(String str) {
        return C0920d.checkSelfPermission(PrivateFileSystem.getAppContext(), str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$realMountLocked$0(PrivateFileSystem.d dVar, int i10, Intent intent) {
        I.b(TAG, "resultCode: %d, data=%s", Integer.valueOf(i10), intent);
        if (!Environment.isExternalStorageManager()) {
            dVar.c(PrivateFileSystem.MountResultCode.NO_PERMISSION);
            return;
        }
        synchronized (this) {
            this.mounted = true;
        }
        dVar.c(PrivateFileSystem.MountResultCode.SUCCESS);
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public void changeMountPath(@NonNull ActivityC1486c activityC1486c, @NonNull PrivateFileSystem.d dVar) {
        tryAutoMount();
        synchronized (this) {
            realMountLocked(activityC1486c, dVar);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public PfsCompatExtFile getCompatExtFile() {
        return new PfsCompatExtFileLegacy(this);
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public PfsCompatType getCompatType() {
        return PfsCompatType.LEGACY;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public String getPermShowPath() {
        return this.pfsRootPath.substring(1) + File.separator;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public String getPfsResidePath() {
        return this.pfsRootPath;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public void realMountLocked(@NonNull ActivityC1486c activityC1486c, @NonNull final PrivateFileSystem.d dVar) {
        if (!this.askExternalStoragePerm || isMounted()) {
            dVar.c(PrivateFileSystem.MountResultCode.SUCCESS);
            return;
        }
        if (!Oa.a.f65254w) {
            Log.d(TAG, "request permissions for external storage");
            C4367c.o().y(activityC1486c, C5577b.f238565g, new a(dVar));
            return;
        }
        Log.d(TAG, "request permissions for manage external storage");
        C4366b.a aVar = new C4366b.a() { // from class: com.prism.lib.pfs.compat.d
            @Override // e6.C4366b.a
            public final void a(int i10, Intent intent) {
                this.f183685a.lambda$realMountLocked$0(dVar, i10, intent);
            }
        };
        PackageManager packageManager = activityC1486c.getPackageManager();
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.parse("package:" + activityC1486c.getPackageName()));
        if (intent.resolveActivity(packageManager) == null) {
            intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
        }
        Na.a.b(activityC1486c, intent.getAction());
        try {
            C4367c.o().x(activityC1486c, intent, aVar);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activityC1486c, d.p.f187165X3, 1).show();
        }
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public boolean supportChangeMountPath() {
        return false;
    }

    @Override // com.prism.lib.pfs.compat.PfsCompatCore
    public boolean tryAutoMountLocked() {
        if (this.askExternalStoragePerm) {
            return Oa.a.f65254w ? Environment.isExternalStorageManager() : checkPerm("android.permission.READ_EXTERNAL_STORAGE") && checkPerm("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.pfsRootPath);
        parcel.writeInt(this.askExternalStoragePerm ? 1 : 0);
        parcel.writeInt(this.processId);
        parcel.writeInt(isMounted() ? 1 : 0);
    }

    public PfsCompatCoreLegacy(String str, boolean z10) {
        this.pfsRootPath = str;
        this.askExternalStoragePerm = z10;
    }

    private PfsCompatCoreLegacy(Parcel parcel) {
        this.pfsRootPath = parcel.readString();
        this.askExternalStoragePerm = parcel.readInt() == 1;
        int i10 = parcel.readInt();
        boolean z10 = parcel.readInt() == 1;
        if (this.processId == i10) {
            this.mounted = z10;
        } else {
            this.mounted = false;
        }
    }
}
