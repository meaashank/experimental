package com.prism.lib.pfs.file;

import B0.C0922f;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import com.prism.commons.file.FileType;
import com.prism.commons.interfaces.WalkCmd;
import com.prism.commons.utils.C3843g;
import com.prism.commons.utils.C3844h;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.compat.PfsCompatCore;
import com.prism.lib.pfs.compat.PfsCompatExtFile;
import com.prism.lib.pfs.exception.PfsIOException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import l6.C5150b;
import o6.k;
import o6.l;
import t1.C5596a;

/* JADX INFO: loaded from: classes7.dex */
public class PrivatePath implements Parcelable {
    private static final String STALE_SUFFIX_OLD = ".temp";
    private static final String STALE_SUFFIX_OTHER = ".99";
    private static final String STALE_SUFFIX_PHOTO = ".22";
    private static final String STALE_SUFFIX_VIDEO = ".11";
    private int overrideFileEncryptType;
    private int overridePathEncryptType;
    private final PrivateFileSystem pfs;
    private final PfsCompatExtFile pfsCompatExtFile;
    private String relativePath;
    private String userPath;
    private static final String TAG = l0.b("PrivatePath");
    public static final Parcelable.Creator<PrivatePath> CREATOR = new a();

    public class a implements Parcelable.Creator<PrivatePath> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PrivatePath createFromParcel(Parcel parcel) {
            return new PrivatePath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PrivatePath[] newArray(int i10) {
            return new PrivatePath[i10];
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188860a;

        static {
            int[] iArr = new int[FileType.values().length];
            f188860a = iArr;
            try {
                iArr[FileType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f188860a[FileType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c {
        public static PrivatePath a(PrivateFileSystem privateFileSystem, String str) throws PfsIOException {
            try {
                String strB = C3858w.b(str);
                if (!privateFileSystem.isMounted()) {
                    throw new PfsIOException(1);
                }
                String residePath = privateFileSystem.getResidePath();
                if (!strB.startsWith(residePath)) {
                    return null;
                }
                return new PrivatePath(privateFileSystem, privateFileSystem.getCompatCore().getCompatExtFile().refer(strB.substring(residePath.length())));
            } catch (IOException e10) {
                StringBuilder sbA = androidx.activity.result.i.a("calc canonical path for '", str, "' failed: ");
                sbA.append(e10.getMessage());
                throw new PfsIOException(3, sbA.toString(), e10);
            }
        }

        public static PrivatePath b(PrivatePath privatePath, String str) throws PfsIOException {
            String path = new File(privatePath.getRelativePath(), str).getPath();
            try {
                return new PrivatePath(privatePath.getPfs(), privatePath.getPfs().getCompatCore().getCompatExtFile().refer(C3858w.b(path)));
            } catch (IOException e10) {
                StringBuilder sbA = androidx.activity.result.i.a("calc canonical path for '", path, "' failed: ");
                sbA.append(e10.getMessage());
                throw new PfsIOException(3, sbA.toString(), e10);
            }
        }

        public static PrivatePath c(PrivateFileSystem privateFileSystem, File file, String str) throws PfsIOException {
            return d(privateFileSystem, new File(file, str).getPath());
        }

        public static PrivatePath d(PrivateFileSystem privateFileSystem, String str) throws PfsIOException {
            return new PrivatePath(privateFileSystem, PrivatePath.resolvePath(str));
        }

        public static PrivatePath e(PrivateFileSystem privateFileSystem, String str, String str2) throws PfsIOException {
            return d(privateFileSystem, new File(str, str2).getPath());
        }

        public static PrivatePath f(PrivatePath privatePath, String str) throws PfsIOException {
            return d(privatePath.getPfs(), new File(privatePath.getUserPath(), str).getPath());
        }

        public static PrivatePath g(PrivateFileSystem privateFileSystem) {
            return new PrivatePath(privateFileSystem, File.separator);
        }
    }

    public static /* synthetic */ WalkCmd a(PfsCompatExtFile pfsCompatExtFile) {
        if (pfsCompatExtFile.sync(false).isDirectory()) {
            return WalkCmd.INSIDE;
        }
        String relativePath = pfsCompatExtFile.getRelativePath();
        return (isStalePath(relativePath) || C3858w.y(relativePath) != FileType.UNKNOWN) ? WalkCmd.STOP : WalkCmd.CONTINUE;
    }

    @SuppressLint({"SwitchIntDef"})
    private String decodePath(String str) throws PfsIOException {
        String str2 = File.separator;
        if (str.equals(str2)) {
            return str2;
        }
        if (isStalePath(str)) {
            this.overridePathEncryptType = 1;
        }
        int pathEncryptType = getPathEncryptType();
        return pathEncryptType != 1 ? pathEncryptType != 2 ? decodePathNone(str) : decodePathBase64(str) : decodePathStale(str);
    }

    private String decodePathBase64(String str) throws PfsIOException {
        C5150b c5150bE = C5150b.e(str);
        LinkedList linkedList = new LinkedList();
        try {
            for (String str2 : c5150bE.f220953a.split(File.separator)) {
                linkedList.add(C3844h.f(str2, C3843g.f162097a));
            }
            String strJoin = TextUtils.join(File.separator, linkedList);
            if (c5150bE.f220954b == null) {
                return strJoin;
            }
            return strJoin + '.' + C3844h.f(c5150bE.f220954b, C3843g.f162097a);
        } catch (IllegalArgumentException e10) {
            throw new PfsIOException(3, e10);
        }
    }

    private String decodePathNone(String str) {
        return str;
    }

    private String decodePathStale(String str) throws PfsIOException {
        if (!str.endsWith(STALE_SUFFIX_VIDEO) && !str.endsWith(STALE_SUFFIX_PHOTO) && !str.endsWith(STALE_SUFFIX_OTHER)) {
            if (str.endsWith(STALE_SUFFIX_OLD)) {
                String strA = C0922f.a(str, 5, 0);
                this.overrideFileEncryptType = -1;
                return strA;
            }
            this.overridePathEncryptType = 0;
            this.overrideFileEncryptType = -1;
            return str;
        }
        C5150b c5150bE = C5150b.e(str.substring(0, str.length() - 3));
        String str2 = c5150bE.f220953a;
        if (c5150bE.f220954b == null) {
            return str2;
        }
        try {
            return str2 + '.' + C3844h.f(c5150bE.f220954b, C3843g.f162097a);
        } catch (IllegalArgumentException e10) {
            throw new PfsIOException(3, e10);
        }
    }

    public static int detectPathEncryptType(String str) {
        for (int i10 = 0; i10 <= 2; i10++) {
            if (getPathEncryptTypeFile(str, i10).exists()) {
                return i10;
            }
        }
        return -1;
    }

    @SuppressLint({"SwitchIntDef"})
    private String encodePath(String str) {
        String str2 = File.separator;
        if (str.equals(str2)) {
            return str2;
        }
        int pathEncryptType = this.pfs.getPathEncryptType();
        return pathEncryptType != 1 ? pathEncryptType != 2 ? encodePathNone(str) : encodePathBase64(str) : encodePathStale(str);
    }

    private String encodePathBase64(String str) {
        C5150b c5150bE = C5150b.e(str);
        LinkedList linkedList = new LinkedList();
        for (String str2 : c5150bE.f220953a.split(File.separator)) {
            linkedList.add(C3844h.c(str2, C3843g.f162097a));
        }
        String strJoin = TextUtils.join(File.separator, linkedList);
        if (c5150bE.f220954b == null) {
            return strJoin;
        }
        return strJoin + '.' + C3844h.c(c5150bE.f220954b, C3843g.f162097a);
    }

    private String encodePathNone(String str) {
        return str;
    }

    private String encodePathStale(String str) {
        C5150b c5150bE = C5150b.e(str);
        String str2 = c5150bE.f220953a;
        if (c5150bE.f220954b == null) {
            return str2;
        }
        String str3 = str2 + '.' + C3844h.c(c5150bE.f220954b, C3843g.f162097a);
        int i10 = b.f188860a[C3858w.z(c5150bE.c()).ordinal()];
        return i10 != 1 ? i10 != 2 ? androidx.compose.runtime.changelist.j.a(str3, STALE_SUFFIX_OTHER) : androidx.compose.runtime.changelist.j.a(str3, STALE_SUFFIX_PHOTO) : androidx.compose.runtime.changelist.j.a(str3, STALE_SUFFIX_VIDEO);
    }

    private static File getPathEncryptTypeFile(String str, int i10) {
        return new File(str, getPathEncryptTypeFileName(i10));
    }

    private static String getPathEncryptTypeFileName(int i10) {
        return (i10 < 0 || i10 > 2) ? ".pathType2" : android.support.v4.media.c.a(".pathType", i10);
    }

    public static int initResidePath(PrivateFileSystem privateFileSystem, int i10) throws PfsIOException {
        PfsCompatCore compatCore = privateFileSystem.getCompatCore();
        PfsCompatExtFile pfsCompatExtFileSync = compatCore.getCompatExtFile().refer("").sync(true);
        if (pfsCompatExtFileSync.exists() && !pfsCompatExtFileSync.isDirectory()) {
            pfsCompatExtFileSync.delete();
        }
        pfsCompatExtFileSync.mkDirs();
        int iDetectPathEncryptType = detectPathEncryptType(compatCore.getPfsResidePath());
        if (i10 == -1) {
            if (iDetectPathEncryptType != -1) {
                i10 = iDetectPathEncryptType;
            } else if (pfsCompatExtFileSync.walk(new i(), null)) {
                pfsCompatExtFileSync.rmEmptySubDirs();
                i10 = 2;
            } else {
                i10 = 1;
            }
        } else if (i10 != 0 && iDetectPathEncryptType != -1 && i10 != iDetectPathEncryptType) {
            throw new PfsIOException(3, "set valid pathEncryptType but the residePath already exist different one");
        }
        if (i10 == 0) {
            return 0;
        }
        PfsCompatExtFile pfsCompatExtFileSync2 = compatCore.getCompatExtFile().refer(getPathEncryptTypeFileName(i10)).sync(true);
        if (pfsCompatExtFileSync2.exists()) {
            C5596a.a("exist pathEncryptType: ", i10, TAG);
            return i10;
        }
        pfsCompatExtFileSync2.createNewFile();
        C5596a.a("init pathEncryptType: ", i10, TAG);
        return i10;
    }

    private static boolean isStalePath(String str) {
        return str.endsWith(STALE_SUFFIX_PHOTO) || str.endsWith(STALE_SUFFIX_VIDEO) || str.endsWith(STALE_SUFFIX_OTHER) || str.endsWith(STALE_SUFFIX_OLD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WalkCmd lambda$walk$0(l lVar, PfsCompatExtFile pfsCompatExtFile) {
        try {
            return lVar.a(new PrivatePath(this.pfs, pfsCompatExtFile));
        } catch (Exception unused) {
            return WalkCmd.CONTINUE;
        }
    }

    public static String resolvePath(String str) throws PfsIOException {
        if (TextUtils.isEmpty(str)) {
            return File.separator;
        }
        String str2 = File.separator;
        if (!str.startsWith(str2)) {
            str = androidx.compose.runtime.changelist.j.a(str2, str);
        }
        LinkedList linkedList = new LinkedList();
        for (String str3 : str.substring(1).split(str2)) {
            if (!str3.equals(IconCache.EMPTY_CLASS_NAME)) {
                if (str3.equals("..")) {
                    if (linkedList.size() == 0) {
                        throw new PfsIOException(3, "Illegal userPath: ".concat(str));
                    }
                    linkedList.removeLast();
                } else if (TextUtils.isEmpty(str3)) {
                }
                linkedList.add(str3);
            }
        }
        if (linkedList.size() == 0) {
            return File.separator;
        }
        StringBuilder sb2 = new StringBuilder();
        String str4 = File.separator;
        sb2.append(str4);
        sb2.append(TextUtils.join(str4, linkedList));
        return sb2.toString();
    }

    public void adjustPath(boolean z10) {
        String str;
        this.pfsCompatExtFile.sync(true);
        if (this.pfsCompatExtFile.exists()) {
            try {
                if (z10) {
                    this.pfsCompatExtFile.delete();
                    return;
                }
                C5150b c5150bE = C5150b.e(this.userPath);
                HashSet hashSet = new HashSet();
                List<PrivatePath> list = getParent().list();
                if (list == null) {
                    return;
                }
                Iterator<PrivatePath> it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().getUserPath());
                }
                int i10 = 1;
                while (true) {
                    if (i10 > hashSet.size() + 1) {
                        str = null;
                        break;
                    }
                    str = c5150bE.f220953a + "_" + i10 + c5150bE.c();
                    if (!hashSet.contains(str)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (str == null) {
                    Log.e(TAG, "NEVER HAPPEN: could not find an unused filename: " + this.userPath);
                    return;
                }
                this.userPath = str;
                String strEncodePath = encodePath(str);
                this.relativePath = strEncodePath;
                this.pfsCompatExtFile.refer(strEncodePath);
            } catch (PfsIOException unused) {
            }
        }
    }

    public PrivatePath asRoot() {
        PrivateFileSystem privateFileSystem = new PrivateFileSystem(this);
        privateFileSystem.tryAutoMount();
        return c.g(privateFileSystem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PrivatePath)) {
            return false;
        }
        PrivatePath privatePath = (PrivatePath) obj;
        return privatePath.getUserPath().equals(getUserPath()) && privatePath.getPfs().equals(getPfs());
    }

    public PfsCompatExtFile getCompatExtFile() {
        return this.pfsCompatExtFile;
    }

    public PrivatePath getParent() throws PfsIOException {
        return c.d(this.pfs, new File(this.userPath).getParent());
    }

    public int getPathEncryptType() {
        int i10 = this.overridePathEncryptType;
        return i10 == -1 ? this.pfs.getPathEncryptType() : i10;
    }

    public PrivateFileSystem getPfs() {
        return this.pfs;
    }

    public int getPreferFileEncryptType() {
        int i10 = this.overrideFileEncryptType;
        return i10 == -2 ? this.pfs.getFileEncryptType() : i10;
    }

    public String getRealPath() {
        return getCompatExtFile().getRealPath();
    }

    public String getRelativePath() {
        return this.relativePath;
    }

    public String getUserPath() {
        return this.userPath;
    }

    public int hashCode() {
        return getUserPath().hashCode() + (getPfs().hashCode() * 31);
    }

    public List<PrivatePath> list() {
        List<PfsCompatExtFile> list = this.pfsCompatExtFile.sync(false).list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PfsCompatExtFile pfsCompatExtFile : list) {
            try {
                arrayList.add(new PrivatePath(this.pfs, pfsCompatExtFile));
            } catch (PfsIOException | RuntimeException unused) {
                arrayList.add(new PrivatePath(this.pfs, pfsCompatExtFile, true));
            }
        }
        return arrayList;
    }

    public boolean move(PrivatePath privatePath) {
        boolean zMove = this.pfsCompatExtFile.sync(false).move(privatePath.pfsCompatExtFile.sync(false));
        if (zMove) {
            try {
                String relativePath = this.pfsCompatExtFile.getRelativePath();
                this.relativePath = relativePath;
                this.userPath = decodePath(relativePath);
            } catch (PfsIOException unused) {
            }
        }
        return zMove;
    }

    public boolean rename(String str) {
        boolean zRename = this.pfsCompatExtFile.sync(false).rename(encodePath(str));
        if (zRename) {
            try {
                String relativePath = this.pfsCompatExtFile.getRelativePath();
                this.relativePath = relativePath;
                this.userPath = decodePath(relativePath);
            } catch (PfsIOException unused) {
            }
        }
        return zRename;
    }

    @NonNull
    public String toString() {
        return this.userPath + "(" + this.pfsCompatExtFile.getRealPath() + ")";
    }

    public boolean walk(final l<PrivatePath> lVar, @Nullable k kVar) {
        return this.pfsCompatExtFile.sync(false).walk(new l() { // from class: com.prism.lib.pfs.file.h
            @Override // o6.l
            public final WalkCmd a(Object obj) {
                return this.f188867a.lambda$walk$0(lVar, (PfsCompatExtFile) obj);
            }
        }, kVar);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.pfs, i10);
        parcel.writeString(this.userPath);
        parcel.writeString(this.relativePath);
        parcel.writeInt(this.overridePathEncryptType);
        parcel.writeInt(this.overrideFileEncryptType);
    }

    public static int getPathEncryptType(PrivatePath privatePath) {
        String name = new File(privatePath.getRealPath()).getName();
        if (name.startsWith(".pathType")) {
            try {
                int i10 = Integer.parseInt(name.substring(9));
                if (i10 >= 0 && i10 <= 2) {
                    return i10;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    private PrivatePath(PrivateFileSystem privateFileSystem, String str) {
        this.overridePathEncryptType = -1;
        this.overrideFileEncryptType = -2;
        this.pfs = privateFileSystem;
        this.userPath = str;
        this.relativePath = encodePath(str);
        this.pfsCompatExtFile = privateFileSystem.getCompatCore().getCompatExtFile().refer(this.relativePath);
    }

    private PrivatePath(PrivateFileSystem privateFileSystem, PfsCompatExtFile pfsCompatExtFile) throws PfsIOException {
        this.overridePathEncryptType = -1;
        this.overrideFileEncryptType = -2;
        this.pfs = privateFileSystem;
        this.pfsCompatExtFile = pfsCompatExtFile;
        String relativePath = pfsCompatExtFile.getRelativePath();
        this.relativePath = relativePath;
        this.userPath = decodePath(relativePath);
    }

    private PrivatePath(PrivateFileSystem privateFileSystem, PfsCompatExtFile pfsCompatExtFile, boolean z10) {
        this.overridePathEncryptType = -1;
        this.overrideFileEncryptType = -2;
        this.pfs = privateFileSystem;
        this.pfsCompatExtFile = pfsCompatExtFile;
        String relativePath = pfsCompatExtFile.getRelativePath();
        this.relativePath = relativePath;
        this.overridePathEncryptType = 0;
        this.userPath = decodePathNone(relativePath);
    }

    private PrivatePath(Parcel parcel) {
        this.overridePathEncryptType = -1;
        this.overrideFileEncryptType = -2;
        PrivateFileSystem privateFileSystem = (PrivateFileSystem) parcel.readParcelable(PrivateFileSystem.class.getClassLoader());
        this.pfs = privateFileSystem;
        this.userPath = parcel.readString();
        this.relativePath = parcel.readString();
        this.overridePathEncryptType = parcel.readInt();
        this.overrideFileEncryptType = parcel.readInt();
        this.pfsCompatExtFile = privateFileSystem.getCompatCore().getCompatExtFile().refer(this.relativePath);
    }
}
