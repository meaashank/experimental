package com.prism.lib.pfs.compat;

import android.os.Parcelable;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import com.prism.commons.utils.C3836a;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.c0;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.PrivateFileSystemConfig;
import java.io.File;
import o6.InterfaceC5331d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PfsCompatCore implements Parcelable {
    private static final String TAG = l0.b("PfsCompatCore");
    protected boolean mounted = false;
    protected final int processId = Process.myPid();

    public class a implements InterfaceC5331d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityC1486c f183664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PrivateFileSystem.d f183665b;

        public a(ActivityC1486c activityC1486c, PrivateFileSystem.d dVar) {
            this.f183664a = activityC1486c;
            this.f183665b = dVar;
        }

        @Override // o6.InterfaceC5331d
        public void a() {
            PfsCompatCore.this.realMountLocked(this.f183664a, this.f183665b);
        }

        @Override // o6.InterfaceC5331d
        public void stop() {
            this.f183665b.c(PrivateFileSystem.MountResultCode.NO_PERMISSION);
        }
    }

    public static PfsCompatCore getInstance(@NonNull String str, @NonNull String str2, @Nullable PrivateFileSystemConfig privateFileSystemConfig) {
        StringBuilder sb2 = new StringBuilder(C3836a.f162073a);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(PrivateFileSystem.getAppContext().getPackageName());
        String string = sb2.toString();
        if (!str.startsWith(str3)) {
            String externalRootPathFirst = PrivateFileSystem.getExternalRootPathFirst();
            String strA = androidx.concurrent.futures.a.a(externalRootPathFirst, str3, str);
            if (str.startsWith(string.substring(1))) {
                c0.b().d("PFS.compatCore", "case scoped storage");
                return new PfsCompatCoreLegacy(strA, false);
            }
            if (!C3841e.w() || PrivateFileSystem.isExternalStorageLegacy()) {
                c0.b().d("PFS.compatCore", "case smooth legacy storage");
                return new PfsCompatCoreLegacy(strA, true);
            }
            if (privateFileSystemConfig != null && privateFileSystemConfig.c(4)) {
                c0.b().d("PFS.compatCore", "case asked legacy storage");
                return new PfsCompatCoreLegacy(strA, true);
            }
            if (Oa.a.f65254w) {
                if (privateFileSystemConfig != null && privateFileSystemConfig.f183653h != null && privateFileSystemConfig.c(1)) {
                    PrivateFileSystemConfig privateFileSystemConfig2 = new PrivateFileSystemConfig(privateFileSystemConfig);
                    privateFileSystemConfig2.a(2);
                    PrivateFileSystem privateFileSystem = PrivateFileSystem.getInstance(privateFileSystemConfig2);
                    privateFileSystem.tryAutoMount();
                    if (privateFileSystem.isMounted()) {
                        privateFileSystem.root().walk(privateFileSystemConfig.f183653h.a(), null);
                        if (privateFileSystemConfig.f183653h.isValid()) {
                            c0.b().d("PFS.compatCore", "case SAF storage (compat mode)");
                            return new PfsCompatCoreSAF(externalRootPathFirst, str, str2, true);
                        }
                    }
                }
                if (privateFileSystemConfig == null || !privateFileSystemConfig.c(2)) {
                    c0.b().d("PFS.compatCore", "case manage external storage");
                    return new PfsCompatCoreLegacy(strA, true);
                }
            }
            c0.b().d("PFS.compatCore", "case no-choice legacy storage");
            return new PfsCompatCoreSAF(externalRootPathFirst, str, str2, true);
        }
        String externalRootPath = PrivateFileSystem.getExternalRootPath(str);
        if (externalRootPath == null) {
            c0.b().d("PFS.compatCore", "case no-choice legacy storage");
            return new PfsCompatCoreLegacy(str, false);
        }
        String strSubstring = str.substring(externalRootPath.length());
        if (strSubstring.startsWith(string)) {
            c0.b().d("PFS.compatCore", "case scoped storage");
            return new PfsCompatCoreLegacy(str, false);
        }
        if (!C3841e.w() || PrivateFileSystem.isExternalStorageLegacy()) {
            c0.b().d("PFS.compatCore", "case smooth legacy storage");
            return new PfsCompatCoreLegacy(str, true);
        }
        if (privateFileSystemConfig != null && privateFileSystemConfig.c(4)) {
            c0.b().d("PFS.compatCore", "case asked legacy storage");
            return new PfsCompatCoreLegacy(str, true);
        }
        if (Oa.a.f65254w) {
            if (privateFileSystemConfig != null && privateFileSystemConfig.f183653h != null && privateFileSystemConfig.c(1)) {
                PrivateFileSystemConfig privateFileSystemConfig3 = new PrivateFileSystemConfig(privateFileSystemConfig);
                privateFileSystemConfig3.a(2);
                PrivateFileSystem privateFileSystem2 = PrivateFileSystem.getInstance(privateFileSystemConfig3);
                I.b(TAG, "temp mount pfs core type: %s", privateFileSystem2.getCompatCore().getClass().getCanonicalName());
                privateFileSystem2.tryAutoMount();
                if (privateFileSystem2.isMounted()) {
                    privateFileSystem2.root().walk(privateFileSystemConfig.f183653h.a(), null);
                    if (privateFileSystemConfig.f183653h.isValid()) {
                        c0.b().d("PFS.compatCore", "case SAF storage (compat mode)");
                        return new PfsCompatCoreSAF(externalRootPath, strSubstring, str2, true);
                    }
                }
            }
            if (privateFileSystemConfig == null || !privateFileSystemConfig.c(2)) {
                c0.b().d("PFS.compatCore", "case manage external storage");
                return new PfsCompatCoreLegacy(str, true);
            }
        }
        c0.b().d("PFS.compatCore", "case SAF storage");
        return new PfsCompatCoreSAF(externalRootPath, strSubstring, str2, true);
    }

    public abstract void changeMountPath(@NonNull ActivityC1486c activityC1486c, @NonNull PrivateFileSystem.d dVar);

    public abstract PfsCompatExtFile getCompatExtFile();

    public abstract PfsCompatType getCompatType();

    public abstract String getPermShowPath();

    public abstract String getPfsResidePath();

    public boolean isMounted() {
        return tryAutoMount();
    }

    public void mount(@NonNull ActivityC1486c activityC1486c, @NonNull PrivateFileSystem.d dVar) {
        if (this.mounted) {
            I.a(TAG, "already mounted return");
            dVar.c(PrivateFileSystem.MountResultCode.SUCCESS);
            return;
        }
        synchronized (this) {
            try {
                boolean zTryAutoMountLocked = tryAutoMountLocked();
                this.mounted = zTryAutoMountLocked;
                if (!zTryAutoMountLocked) {
                    dVar.b(getCompatType(), getPermShowPath(), new a(activityC1486c, dVar));
                } else {
                    I.a(TAG, "tryAutoMount success return");
                    dVar.c(PrivateFileSystem.MountResultCode.SUCCESS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void realMountLocked(@NonNull ActivityC1486c activityC1486c, @NonNull PrivateFileSystem.d dVar);

    public abstract boolean supportChangeMountPath();

    public boolean tryAutoMount() {
        boolean zTryAutoMountLocked;
        if (this.mounted) {
            return true;
        }
        synchronized (this) {
            zTryAutoMountLocked = tryAutoMountLocked();
            this.mounted = zTryAutoMountLocked;
        }
        return zTryAutoMountLocked;
    }

    public abstract boolean tryAutoMountLocked();
}
