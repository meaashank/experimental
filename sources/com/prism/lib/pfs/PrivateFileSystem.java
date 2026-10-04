package com.prism.lib.pfs;

import B0.C0922f;
import Ma.g;
import Ma.h;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import bb.C2850a;
import com.bumptech.glide.j;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.C3836a;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3855t;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.PrivateFileSystemConfig;
import com.prism.lib.pfs.compat.PfsCompatCore;
import com.prism.lib.pfs.compat.PfsCompatType;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.exception.PfsIOException;
import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.PrivatePath;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.file.exchange.ExchangeFileWrapper;
import com.prism.lib.pfs.ui.PreviewActivity;
import e6.C4367c;
import g6.C4455a;
import i6.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o6.InterfaceC5331d;
import o6.k;
import o6.l;
import r6.i;

/* JADX INFO: loaded from: classes7.dex */
public class PrivateFileSystem implements Parcelable {
    public static final int FILE_ENCRYPT_TYPE_DEFAULT = 1;
    public static final int PATH_ENCRYPT_TYPE_DEFAULT = 2;
    public static final String PFS_MIME_TYPE = "application/prism.pfs.security";
    private static boolean initialized;
    private static Context sAppContext;
    private static PrivateFileSystem sExportDefault;
    private static PrivateFileSystem sExternalDCIM;
    private static PrivateFileSystem sExternalRoot;
    private static String sExternalRootPath;
    private static Set<String> sExternalRootPathSet;
    private static PrivateFileSystem sPfsDefault;
    private static String sTempExportPath;
    private final PfsCompatCore compatCore;
    private final int fileEncryptType;
    private volatile int pathEncryptType;

    @NonNull
    private final String relativeHomeConfigured;

    @Nullable
    private final String resideId;

    @NonNull
    private final String residePathConfigured;

    @Nullable
    private final i<String> residePathPM;
    private static final String TAG = l0.b("PrivateFileSystem");
    private static boolean sExternalStorageLegacy = true;
    private static final Map<String, PrivateFileSystem> sExtraVolumeRoots = new LinkedHashMap();
    public static final Parcelable.Creator<PrivateFileSystem> CREATOR = new b();

    public enum MountResultCode {
        SUCCESS,
        NO_PERMISSION,
        DENY_MIGRATE_ROOT,
        OTHER_ERROR
    }

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f183640a;

        public a(d dVar) {
            this.f183640a = dVar;
        }

        @Override // com.prism.lib.pfs.PrivateFileSystem.d
        public void b(PfsCompatType pfsCompatType, String str, InterfaceC5331d interfaceC5331d) {
            this.f183640a.b(pfsCompatType, str, interfaceC5331d);
        }

        @Override // com.prism.lib.pfs.PrivateFileSystem.d
        public void c(MountResultCode mountResultCode) {
            if (mountResultCode != MountResultCode.SUCCESS) {
                this.f183640a.c(mountResultCode);
                return;
            }
            g6.i iVarA = C4455a.b().a();
            final d dVar = this.f183640a;
            iVarA.execute(new Runnable() { // from class: La.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f58771a.f(dVar);
                }
            });
        }

        public final /* synthetic */ void f(final d dVar) {
            try {
                PrivateFileSystem privateFileSystem = PrivateFileSystem.this;
                privateFileSystem.pathEncryptType = PrivatePath.initResidePath(privateFileSystem, privateFileSystem.pathEncryptType);
                if (PrivateFileSystem.this.residePathPM != null) {
                    PrivateFileSystem.this.residePathPM.a(PrivateFileSystem.getAppContext()).p(PrivateFileSystem.this.getResidePath());
                }
                C4455a.b().c().post(new Runnable() { // from class: La.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(PrivateFileSystem.MountResultCode.SUCCESS);
                    }
                });
            } catch (PfsIOException e10) {
                I.h(PrivateFileSystem.TAG, "mounted initResidePath() failed: " + e10.getMessage(), e10);
                C4455a.b().c().post(new Runnable() { // from class: La.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(PrivateFileSystem.MountResultCode.OTHER_ERROR);
                    }
                });
            }
        }
    }

    public class b implements Parcelable.Creator<PrivateFileSystem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PrivateFileSystem createFromParcel(Parcel parcel) {
            return new PrivateFileSystem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PrivateFileSystem[] newArray(int i10) {
            return new PrivateFileSystem[i10];
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183642a;

        static {
            int[] iArr = new int[FileType.values().length];
            f183642a = iArr;
            try {
                iArr[FileType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183642a[FileType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f183642a[FileType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f183642a[FileType.PDF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f183642a[FileType.PPT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f183642a[FileType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public interface d {
        void b(PfsCompatType pfsCompatType, String str, InterfaceC5331d interfaceC5331d);

        void c(MountResultCode mountResultCode);
    }

    public static /* synthetic */ void b(File[] fileArr) {
        try {
            for (File file : fileArr) {
                C3858w.m(file);
            }
        } catch (Throwable unused) {
        }
    }

    private static void cleanTempExportPathAsync() {
        final File file = new File(getTempExportPath());
        if (file.exists()) {
            if (!file.isDirectory()) {
                C4455a.b().a().execute(new Runnable() { // from class: La.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3858w.m(file);
                    }
                });
                return;
            }
            final File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            C4455a.b().a().execute(new Runnable() { // from class: La.l
                @Override // java.lang.Runnable
                public final void run() {
                    PrivateFileSystem.b(fileArrListFiles);
                }
            });
        }
    }

    public static Ma.c exportFile(ExchangeFile exchangeFile, ExchangeFile exchangeFile2) {
        return exportFile(true, false, exchangeFile, exchangeFile2);
    }

    public static Ma.c exportFiles(boolean z10, boolean z11, Collection<ExchangeFile> collection, Collection<ExchangeFile> collection2) {
        LinkedList linkedList = new LinkedList();
        Iterator<ExchangeFile> it = collection.iterator();
        Iterator<ExchangeFile> it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            ExchangeFile next = it.next();
            ExchangeFile next2 = it2.next();
            try {
                Ma.d dVarA = Ma.d.a(next2, next);
                dVarA.f58908d = z11;
                dVarA.f58907c = z10;
                linkedList.add(dVarA);
            } catch (Exception unused) {
                Log.e(TAG, "failed export privatePath for target(" + next.getName() + "): " + next2.getName());
            }
        }
        return new Ma.c(linkedList);
    }

    public static String fmtExternalRelative(String str) {
        String str2 = File.separator;
        if (!str.startsWith(str2)) {
            str = getExternalRootPathFirst() + str2 + str;
        }
        return str.endsWith(str2) ? C0922f.a(str, 1, 0) : str;
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static PrivateFileSystem getDefault() {
        return sPfsDefault;
    }

    public static PrivateFileSystem getExportDefault() {
        return sExportDefault;
    }

    public static PrivateFileSystem getExternalDCIM() {
        PrivateFileSystem privateFileSystem = sExternalDCIM;
        if (privateFileSystem != null) {
            return privateFileSystem;
        }
        synchronized (PrivateFileSystem.class) {
            PrivateFileSystem privateFileSystem2 = sExternalDCIM;
            if (privateFileSystem2 != null) {
                return privateFileSystem2;
            }
            try {
                PrivateFileSystem privateFileSystem3 = getInstance(new PrivateFileSystemConfig.Builder().setResidePath(null, d.a.f202868j).setRelativeHome("").setPathEncryptType(0).setFileEncryptType(-1).build());
                sExternalDCIM = privateFileSystem3;
                return privateFileSystem3;
            } catch (IOException e10) {
                throw new GaiaRuntimeException("Fatal Error", e10);
            }
        }
    }

    public static PrivateFileSystem getExternalRoot() {
        PrivateFileSystem privateFileSystem = sExternalRoot;
        if (privateFileSystem != null) {
            return privateFileSystem;
        }
        synchronized (PrivateFileSystem.class) {
            PrivateFileSystem privateFileSystem2 = sExternalRoot;
            if (privateFileSystem2 != null) {
                return privateFileSystem2;
            }
            try {
                PrivateFileSystem privateFileSystem3 = getInstance(new PrivateFileSystemConfig.Builder().setResidePath(null, sExternalRootPath).setRelativeHome("").setPathEncryptType(0).setFileEncryptType(-1).build());
                sExternalRoot = privateFileSystem3;
                return privateFileSystem3;
            } catch (IOException e10) {
                throw new GaiaRuntimeException("Fatal Error", e10);
            }
        }
    }

    @Nullable
    public static String getExternalRootPath(String str) {
        for (String str2 : sExternalRootPathSet) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static String getExternalRootPathFirst() {
        return sExternalRootPath;
    }

    public static List<PrivateFileSystem> getExternalRoots() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getExternalRoot());
        synchronized (PrivateFileSystem.class) {
            try {
                for (String str : sExternalRootPathSet) {
                    if (!str.equals(sExternalRootPath)) {
                        Map<String, PrivateFileSystem> map = sExtraVolumeRoots;
                        PrivateFileSystem privateFileSystem = map.get(str);
                        if (privateFileSystem == null) {
                            try {
                                privateFileSystem = getInstance(new PrivateFileSystemConfig.Builder().setResidePath(null, str).setRelativeHome("").setPathEncryptType(0).setFileEncryptType(-1).build());
                                map.put(str, privateFileSystem);
                            } catch (IOException e10) {
                                I.h(TAG, "no scan root for volume " + str, e10);
                            }
                        }
                        arrayList.add(privateFileSystem);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @NonNull
    public static Bitmap getIcon(FileType fileType) {
        int i10 = c.f183642a[fileType.ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3) ? C3855t.b(getAppContext().getResources(), d.g.f186193b2) : i10 != 4 ? i10 != 5 ? C3855t.b(getAppContext().getResources(), d.g.f186188a2) : C3855t.b(getAppContext().getResources(), d.g.f186175X1) : C3855t.b(getAppContext().getResources(), d.g.f186167V1) : C3855t.b(getAppContext().getResources(), d.g.f186151R1);
    }

    @NonNull
    public static j<Drawable> getIconGlideRequest(@NonNull ExchangeFile exchangeFile) {
        return com.bumptech.glide.c.F(getAppContext()).e(exchangeFile);
    }

    public static PrivateFileSystem getInstance(PrivateFileSystemConfig privateFileSystemConfig) {
        return new PrivateFileSystem(privateFileSystemConfig);
    }

    @NonNull
    public static j<Drawable> getSeekableIconGlideRequest(@NonNull ExchangeFile exchangeFile) {
        PrivateFile privateFileUnwrapPrivateFile = unwrapPrivateFile(exchangeFile);
        return (privateFileUnwrapPrivateFile != null && privateFileUnwrapPrivateFile.isFile() && privateFileUnwrapPrivateFile.getType() == FileType.IMAGE) ? com.bumptech.glide.c.F(getAppContext()).i(PfsFileProvider.a(privateFileUnwrapPrivateFile)) : getIconGlideRequest(exchangeFile);
    }

    public static String getTempExportAuth() {
        return sAppContext.getPackageName() + ".lib.pfs.TempExportFileProvider";
    }

    public static String getTempExportPath() {
        return sTempExportPath;
    }

    public static void init(Application application) {
        File externalCacheDir;
        if (initialized) {
            return;
        }
        i6.d.a();
        Da.b.d(application);
        C4367c.o().s(application);
        sAppContext = application;
        sExternalRootPathSet = new LinkedHashSet();
        if (C3841e.w()) {
            sExternalStorageLegacy = Environment.isExternalStorageLegacy();
        } else {
            sExternalStorageLegacy = true;
        }
        try {
            File[] externalCacheDirs = application.getExternalCacheDirs();
            if (externalCacheDirs != null) {
                for (File file : externalCacheDirs) {
                    if (file != null) {
                        String canonicalPath = file.getCanonicalPath();
                        int iIndexOf = canonicalPath.toLowerCase().indexOf(C3836a.f162073a.toLowerCase());
                        if (iIndexOf > 0) {
                            String strSubstring = canonicalPath.substring(0, iIndexOf);
                            sExternalRootPathSet.add(strSubstring);
                            if (sExternalRootPath == null) {
                                sExternalRootPath = strSubstring;
                            }
                        }
                    }
                }
            }
            if (sExternalRootPath == null && (externalCacheDir = application.getExternalCacheDir()) != null) {
                String canonicalPath2 = externalCacheDir.getCanonicalPath();
                int iIndexOf2 = canonicalPath2.toLowerCase().indexOf(C3836a.f162073a.toLowerCase());
                if (iIndexOf2 > 0) {
                    String strSubstring2 = canonicalPath2.substring(0, iIndexOf2);
                    sExternalRootPathSet.add(strSubstring2);
                    sExternalRootPath = strSubstring2;
                }
            }
            if (sExternalRootPath == null && Environment.getExternalStorageDirectory() != null) {
                String canonicalPath3 = Environment.getExternalStorageDirectory().getCanonicalPath();
                sExternalRootPath = canonicalPath3;
                sExternalRootPathSet.add(canonicalPath3);
            }
            if (sExternalRootPath == null) {
                throw new GaiaRuntimeException("FATAL ERROR: could not get external root path");
            }
        } catch (IOException e10) {
            Log.e(TAG, "External-Root-Directory detect failed: " + e10.getMessage(), e10);
        }
        sTempExportPath = new File(application.getFilesDir(), "pfs.tempExports").getAbsolutePath();
        cleanTempExportPathAsync();
        try {
            sPfsDefault = new PrivateFileSystem(new PrivateFileSystemConfig.Builder().build());
            sExportDefault = new PrivateFileSystem(new PrivateFileSystemConfig.Builder().setResidePath(C2850a.f126020e, Oa.a.f65233b).setRelativeHome(Oa.a.f65233b).setPathEncryptType(0).setFileEncryptType(-1).build());
            initialized = true;
        } catch (IOException e11) {
            throw new GaiaRuntimeException("FATAL exception: " + e11.getMessage(), e11);
        }
    }

    public static boolean isExternalPath(String str) {
        return getExternalRootPath(str) != null;
    }

    public static boolean isExternalStorageLegacy() {
        return sExternalStorageLegacy;
    }

    public static void preview(Activity activity, PrivateFile privateFile, PreviewActivity.SortType sortType, @Nullable PrivateFileSystem privateFileSystem) {
        if (privateFile == null || !privateFile.getPfs().compatCore.isMounted()) {
            return;
        }
        activity.startActivity(PreviewActivity.p1(activity, privateFile, sortType, privateFileSystem));
    }

    @Nullable
    public static String resolveVolumeRoot(String str) {
        if (str == null) {
            return null;
        }
        if ("primary".equals(str)) {
            return sExternalRootPath;
        }
        String str2 = File.separator + str.toLowerCase();
        for (String str3 : sExternalRootPathSet) {
            if (str3.toLowerCase().endsWith(str2)) {
                return str3;
            }
        }
        return null;
    }

    @Nullable
    private static PrivateFile unwrapPrivateFile(@Nullable ExchangeFile exchangeFile) {
        for (int i10 = 0; i10 < 8 && exchangeFile != null; i10++) {
            if (exchangeFile instanceof PrivateFile) {
                return (PrivateFile) exchangeFile;
            }
            if (!(exchangeFile instanceof ExchangeFileWrapper)) {
                break;
            }
            exchangeFile = ((ExchangeFileWrapper) exchangeFile).getFile();
        }
        return null;
    }

    public void changeMountPath(@NonNull ActivityC1486c activityC1486c, @NonNull d dVar) {
        this.compatCore.changeMountPath(activityC1486c, dVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PrivateFile detect(String str) throws PfsIOException {
        return PrivateFile.c.a(this, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PrivateFileSystem)) {
            return false;
        }
        PrivateFileSystem privateFileSystem = (PrivateFileSystem) obj;
        return TextUtils.equals(privateFileSystem.resideId, this.resideId) && privateFileSystem.residePathConfigured.equals(this.residePathConfigured);
    }

    public String getAbsoluteHomeConfigured() {
        return fmtExternalRelative(this.relativeHomeConfigured);
    }

    public PfsCompatCore getCompatCore() {
        return this.compatCore;
    }

    public int getFileEncryptType() {
        return this.fileEncryptType;
    }

    public int getPathEncryptType() {
        return this.pathEncryptType;
    }

    public String getRelativeHomeConfigured() {
        return this.relativeHomeConfigured;
    }

    public String getResidePath() {
        return this.compatCore.getPfsResidePath();
    }

    public String getTargetResidePath() {
        return isMounted() ? getResidePath() : this.residePathConfigured;
    }

    public int hashCode() {
        String str = this.resideId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public g importFile(ExchangeFile exchangeFile) {
        return importFiles(false, false, exchangeFile);
    }

    public g importFiles(ExchangeFile... exchangeFileArr) {
        return importFiles(false, false, exchangeFileArr);
    }

    public boolean isMounted() {
        return this.compatCore.isMounted();
    }

    public List<PrivateFile> listFiles(String str) {
        try {
            return PrivateFile.c.e(this, str).list();
        } catch (IOException unused) {
            return null;
        }
    }

    public void mount(@NonNull ActivityC1486c activityC1486c, @NonNull d dVar) {
        I.b(TAG, "mount pfs(%s) root: %s", this.resideId, this.residePathConfigured);
        this.compatCore.mount(activityC1486c, new a(dVar));
    }

    public PrivateFile parse(String str) throws PfsIOException {
        return PrivateFile.c.e(this, str);
    }

    public PrivateFile root() {
        return PrivateFile.c.h(this);
    }

    public void scan(l<PrivateFile> lVar, @Nullable k kVar) {
        root().walk(lVar, kVar);
    }

    public boolean supportChangeMountPath() {
        return this.compatCore.supportChangeMountPath();
    }

    public boolean tryAutoMount() {
        boolean zTryAutoMount = this.compatCore.tryAutoMount();
        if (zTryAutoMount) {
            try {
                this.pathEncryptType = PrivatePath.initResidePath(this, this.pathEncryptType);
            } catch (PfsIOException unused) {
            }
        }
        return zTryAutoMount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.residePathConfigured);
        parcel.writeString(this.relativeHomeConfigured);
        parcel.writeInt(this.pathEncryptType);
        parcel.writeInt(this.fileEncryptType);
        parcel.writeString(this.resideId);
        parcel.writeParcelable(this.compatCore, i10);
    }

    private PrivateFileSystem(PrivateFileSystemConfig privateFileSystemConfig) {
        String str = privateFileSystemConfig.f183648c;
        this.residePathConfigured = str;
        String str2 = privateFileSystemConfig.f183649d;
        this.relativeHomeConfigured = str2;
        this.pathEncryptType = privateFileSystemConfig.f183650e;
        this.fileEncryptType = privateFileSystemConfig.f183651f;
        String str3 = privateFileSystemConfig.f183647b;
        this.resideId = str3;
        this.residePathPM = C2850a.b(str3, str);
        PfsCompatCore pfsCompatCore = PfsCompatCore.getInstance(str, str2, privateFileSystemConfig);
        this.compatCore = pfsCompatCore;
        I.b(TAG, "PFS instance id(%s) core: %s", str3, pfsCompatCore.getClass().getCanonicalName());
    }

    public static Ma.c exportFile(boolean z10, boolean z11, ExchangeFile exchangeFile, ExchangeFile exchangeFile2) {
        LinkedList linkedList = new LinkedList();
        try {
            Ma.d dVarA = Ma.d.a(exchangeFile2, exchangeFile);
            dVarA.f58908d = z11;
            dVarA.f58907c = z10;
            linkedList.add(dVarA);
        } catch (Exception unused) {
            Log.e(TAG, "failed export privatePath for target(" + exchangeFile.getName() + "): " + exchangeFile2.getName());
        }
        return new Ma.c(linkedList);
    }

    @NonNull
    public static j<Drawable> getIconGlideRequest(FileType fileType) {
        int i10 = c.f183642a[fileType.ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3) ? com.bumptech.glide.c.F(getAppContext()).p(Integer.valueOf(d.g.f186193b2)) : i10 != 4 ? i10 != 5 ? com.bumptech.glide.c.F(getAppContext()).p(Integer.valueOf(d.g.f186188a2)) : com.bumptech.glide.c.F(getAppContext()).p(Integer.valueOf(d.g.f186175X1)) : com.bumptech.glide.c.F(getAppContext()).p(Integer.valueOf(d.g.f186167V1)) : com.bumptech.glide.c.F(getAppContext()).p(Integer.valueOf(d.g.f186151R1));
    }

    public g importFile(String str, ExchangeFile exchangeFile) {
        return importFile(false, false, str, exchangeFile.getName(), exchangeFile);
    }

    public g importFiles(boolean z10, boolean z11, ExchangeFile... exchangeFileArr) {
        LinkedList linkedList = new LinkedList();
        for (ExchangeFile exchangeFile : exchangeFileArr) {
            try {
                h hVarA = h.a(this, exchangeFile);
                hVarA.f58916d = z11;
                hVarA.f58915c = z10;
                linkedList.add(hVarA);
            } catch (Exception unused) {
                Log.e(TAG, "failed create privatePath for source: " + exchangeFile.getName());
            }
        }
        return new g(linkedList);
    }

    public g importFile(String str, String str2, ExchangeFile exchangeFile) {
        return importFile(false, false, str, str2, exchangeFile);
    }

    public g importFile(boolean z10, boolean z11, String str, ExchangeFile exchangeFile) {
        return importFile(z10, z11, str, exchangeFile.getName(), exchangeFile);
    }

    public g importFile(boolean z10, boolean z11, String str, String str2, ExchangeFile exchangeFile) {
        LinkedList linkedList = new LinkedList();
        try {
            h hVarC = h.c(this, exchangeFile, str, str2);
            hVarC.f58916d = z11;
            hVarC.f58915c = z10;
            linkedList.add(hVarC);
        } catch (Exception unused) {
            String str3 = TAG;
            StringBuilder sbA = androidx.activity.result.i.a("failed create privatePath for target(", str, ") and source: ");
            sbA.append(exchangeFile.getName());
            Log.e(str3, sbA.toString());
        }
        return new g(linkedList);
    }

    public g importFiles(String str, ExchangeFile... exchangeFileArr) {
        return importFiles(false, false, str, exchangeFileArr);
    }

    public PrivateFileSystem(PrivatePath privatePath) {
        PrivateFileSystem pfs = privatePath.getPfs();
        String realPath = privatePath.getRealPath();
        this.residePathConfigured = realPath;
        this.relativeHomeConfigured = "";
        this.pathEncryptType = PrivatePath.detectPathEncryptType(realPath);
        this.fileEncryptType = pfs.fileEncryptType;
        this.resideId = null;
        this.residePathPM = null;
        this.compatCore = PfsCompatCore.getInstance(realPath, "", null);
    }

    public g importFiles(boolean z10, boolean z11, String str, ExchangeFile... exchangeFileArr) {
        LinkedList linkedList = new LinkedList();
        for (ExchangeFile exchangeFile : exchangeFileArr) {
            try {
                h hVarB = h.b(this, exchangeFile, str);
                hVarB.f58916d = z11;
                hVarB.f58915c = z10;
                linkedList.add(hVarB);
            } catch (Exception unused) {
                String str2 = TAG;
                StringBuilder sbA = androidx.activity.result.i.a("failed create privatePath for target(", str, ") and source: ");
                sbA.append(exchangeFile.getName());
                Log.e(str2, sbA.toString());
            }
        }
        return new g(linkedList);
    }

    public static Ma.c exportFiles(PrivateFileSystem privateFileSystem, @Nullable String str, ExchangeFile... exchangeFileArr) {
        return exportFiles(true, false, privateFileSystem, str, exchangeFileArr);
    }

    public static Ma.c exportFiles(boolean z10, boolean z11, PrivateFileSystem privateFileSystem, ExchangeFile... exchangeFileArr) {
        return exportFiles(z10, z11, privateFileSystem, null, exchangeFileArr);
    }

    public static Ma.c exportFiles(boolean z10, boolean z11, PrivateFileSystem privateFileSystem, @Nullable String str, ExchangeFile... exchangeFileArr) {
        if (str != null && str.length() != 0) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = androidx.compose.runtime.changelist.j.a(str, str2);
            }
        } else {
            str = "";
        }
        LinkedList linkedList = new LinkedList();
        for (ExchangeFile exchangeFile : exchangeFileArr) {
            try {
                Ma.d dVarA = Ma.d.a(exchangeFile, privateFileSystem.parse(str + exchangeFile.getName()));
                dVarA.f58908d = z11;
                dVarA.f58907c = z10;
                linkedList.add(dVarA);
            } catch (Exception unused) {
                Log.e(TAG, "failed export privatePath: " + exchangeFile.getName());
            }
        }
        return new Ma.c(linkedList);
    }

    private PrivateFileSystem(Parcel parcel) {
        String string = parcel.readString();
        this.residePathConfigured = string;
        this.relativeHomeConfigured = parcel.readString();
        this.pathEncryptType = parcel.readInt();
        this.fileEncryptType = parcel.readInt();
        String string2 = parcel.readString();
        this.resideId = string2;
        this.residePathPM = C2850a.b(string2, string);
        this.compatCore = (PfsCompatCore) parcel.readParcelable(PfsCompatCore.class.getClassLoader());
    }
}
