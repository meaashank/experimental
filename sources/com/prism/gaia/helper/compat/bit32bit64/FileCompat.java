package com.prism.gaia.helper.compat.bit32bit64;

import U6.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.prism.gaia.exception.GaiaRemoteRunnableException;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.l;
import com.prism.gaia.naked.compat.libcore.io.OsCompat2;
import com.prism.gaia.server.Gaia32bit64bitProvider;
import g6.C4455a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import o6.h;

/* JADX INFO: loaded from: classes6.dex */
public class FileCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164997a = "asdf-".concat(FileCompat.class.getSimpleName());

    public static class CrossSpaceCopy extends RemoteRunnable {
        public static final Parcelable.Creator<CrossSpaceCopy> CREATOR = new b();
        private static final int FEEDBACK_CODE_PROGRESS = 1;
        private static final String FEEDBACK_PROGRESS_NEWLY_BYTES = "feedback_progressNewlyBytes";
        private boolean deleteSrc;
        private boolean hasNewlyBytesFeedback;
        private h<Long> newlyBytesFeedback;
        private String srcPath;
        private String tarPath;
        private GUri tarSpaceUri;

        public class a implements h<Long> {
            public a() {
            }

            @Override // o6.h
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(Long l10) {
                CrossSpaceCopy.this.sendFeedbackProgress(l10.longValue());
            }
        }

        public class b implements Parcelable.Creator<CrossSpaceCopy> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public CrossSpaceCopy createFromParcel(Parcel parcel) {
                return new CrossSpaceCopy(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public CrossSpaceCopy[] newArray(int i10) {
                return new CrossSpaceCopy[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void crossSpaceCopyNoCheck(GFile gFile, GFile gFile2, GUri gUri, GUri gUri2, boolean z10, h<Long> hVar) throws IOException {
            CrossSpaceCopy crossSpaceCopy = new CrossSpaceCopy();
            crossSpaceCopy.srcPath = gFile.getAbsolutePath();
            crossSpaceCopy.tarPath = gFile2.getAbsolutePath();
            crossSpaceCopy.tarSpaceUri = gUri2;
            crossSpaceCopy.deleteSrc = z10;
            crossSpaceCopy.hasNewlyBytesFeedback = hVar != null;
            crossSpaceCopy.newlyBytesFeedback = hVar;
            try {
                crossSpaceCopy.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void onFeedbackProgress(Bundle bundle) {
            if (this.newlyBytesFeedback != null) {
                this.newlyBytesFeedback.a(Long.valueOf(bundle.getLong(FEEDBACK_PROGRESS_NEWLY_BYTES, 0L)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendFeedbackProgress(long j10) {
            if (this.hasNewlyBytesFeedback) {
                Bundle bundle = new Bundle();
                bundle.putLong(FEEDBACK_PROGRESS_NEWLY_BYTES, j10);
                sendFeedback(1, bundle);
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onFeedbackReceived(int i10, Bundle bundle) {
            if (i10 != 1) {
                return;
            }
            onFeedbackProgress(bundle);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            FileCompat.l(new GFile(this.srcPath), new GFile(this.tarPath), this.tarSpaceUri, this.deleteSrc, this.hasNewlyBytesFeedback ? new a() : null);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.srcPath);
            parcel.writeString(this.tarPath);
            parcel.writeParcelable(this.tarSpaceUri, i10);
            parcel.writeByte(this.deleteSrc ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.hasNewlyBytesFeedback ? (byte) 1 : (byte) 0);
        }

        private CrossSpaceCopy() {
        }

        private CrossSpaceCopy(Parcel parcel) {
            super(parcel);
            this.srcPath = parcel.readString();
            this.tarPath = parcel.readString();
            this.tarSpaceUri = (GUri) parcel.readParcelable(GUri.class.getClassLoader());
            this.deleteSrc = parcel.readByte() != 0;
            this.hasNewlyBytesFeedback = parcel.readByte() != 0;
        }
    }

    public static class FileCopyToRemote extends RemoteRunnable {
        private static final int FEEDBACK_CODE_PROGRESS = 1;
        private static final String FEEDBACK_PROGRESS_NEWLY_BYTES = "feedback_progressNewlyBytes";
        private int fileMode;
        private String filePath;
        private long fileSize;
        private boolean hasNewlyBytesFeedback;
        private h<Long> newlyBytesFeedback;
        private ParcelFileDescriptor pfdForRemote;
        private static final String TAG = "asdf-".concat(FileCopyToRemote.class.getSimpleName());
        public static final Parcelable.Creator<FileCopyToRemote> CREATOR = new a();

        public class a implements Parcelable.Creator<FileCopyToRemote> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public FileCopyToRemote createFromParcel(Parcel parcel) {
                return new FileCopyToRemote(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public FileCopyToRemote[] newArray(int i10) {
                return new FileCopyToRemote[i10];
            }
        }

        public static void copyToRemoteNoCheck(GFile gFile, GUri gUri, h<Long> hVar) throws IOException {
            copyToRemoteNoCheck(gFile, gFile.g(gUri), gUri, hVar);
        }

        private void onFeedbackProgress(Bundle bundle) {
            if (this.newlyBytesFeedback != null) {
                this.newlyBytesFeedback.a(Long.valueOf(bundle.getLong(FEEDBACK_PROGRESS_NEWLY_BYTES)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendFeedbackProgress(long j10) {
            if (this.hasNewlyBytesFeedback) {
                Bundle bundle = new Bundle();
                bundle.putLong(FEEDBACK_PROGRESS_NEWLY_BYTES, j10);
                sendFeedback(1, bundle);
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onFeedbackReceived(int i10, Bundle bundle) {
            if (i10 != 1) {
                return;
            }
            onFeedbackProgress(bundle);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            l.x(this.filePath);
            l.c0(this.pfdForRemote, new File(this.filePath), new h() { // from class: com.prism.gaia.helper.compat.bit32bit64.c
                @Override // o6.h
                public final void a(Object obj) {
                    this.f165003a.sendFeedbackProgress(((Long) obj).longValue());
                }
            });
            OsCompat2.Util.chmod(this.filePath, this.fileMode);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.fileMode);
            parcel.writeLong(this.fileSize);
            parcel.writeString(this.filePath);
            parcel.writeParcelable(this.pfdForRemote, i10);
            parcel.writeByte(this.hasNewlyBytesFeedback ? (byte) 1 : (byte) 0);
        }

        private FileCopyToRemote() {
        }

        public static void copyToRemoteNoCheck(final GFile gFile, GFile gFile2, @Nullable GUri gUri, h<Long> hVar) throws IOException {
            if (!gFile.exists() || !gFile.canRead() || !gFile.isFile()) {
                throw new IOException("FileCopyToRemote.copyToRemote() srcFile not exist or can not be read: " + gFile.getAbsolutePath());
            }
            if (gUri == null) {
                gUri = gFile2.t();
            }
            final ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            FileCopyToRemote fileCopyToRemote = new FileCopyToRemote();
            fileCopyToRemote.fileMode = OsCompat2.Util.getModeOfFile(gFile.getAbsolutePath());
            fileCopyToRemote.fileSize = gFile.length();
            fileCopyToRemote.filePath = gFile2.getAbsolutePath();
            fileCopyToRemote.pfdForRemote = parcelFileDescriptorArrCreatePipe[0];
            fileCopyToRemote.hasNewlyBytesFeedback = hVar != null;
            fileCopyToRemote.newlyBytesFeedback = hVar;
            C4455a.b().a().execute(new Runnable() { // from class: com.prism.gaia.helper.compat.bit32bit64.b
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    l.W(gFile, parcelFileDescriptorArrCreatePipe[1]);
                }
            });
            try {
                fileCopyToRemote.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private FileCopyToRemote(Parcel parcel) {
            super(parcel);
            this.fileMode = parcel.readInt();
            this.fileSize = parcel.readLong();
            this.filePath = parcel.readString();
            this.pfdForRemote = (ParcelFileDescriptor) parcel.readParcelable(FileCopyToRemote.class.getClassLoader());
            this.hasNewlyBytesFeedback = parcel.readByte() != 0;
        }
    }

    public static class RemoteInputStream extends RemoteRunnable {
        public static final Parcelable.Creator<RemoteInputStream> CREATOR = new a();
        private static final String RESULT_PFD_READ = "result_pfdRead";
        private String filePath;

        public class a implements Parcelable.Creator<RemoteInputStream> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public RemoteInputStream createFromParcel(Parcel parcel) {
                return new RemoteInputStream(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public RemoteInputStream[] newArray(int i10) {
                return new RemoteInputStream[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream getInputStreamNoCheck(GFile gFile, GUri gUri) throws IOException {
            RemoteInputStream remoteInputStream = new RemoteInputStream();
            remoteInputStream.filePath = gFile.getAbsolutePath();
            try {
                remoteInputStream.start(gUri);
                return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) remoteInputStream.getResultBundle().getParcelable(RESULT_PFD_READ));
            } catch (GaiaRemoteRunnableException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            final File file = new File(this.filePath);
            if (!file.exists() || !file.canRead()) {
                throw new FileNotFoundException(android.support.v4.media.e.a(new StringBuilder("RemoteInputStream.onRemoteRun: file("), this.filePath, ") not exist or can not be read"));
            }
            final ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            C4455a.b().a().execute(new Runnable() { // from class: com.prism.gaia.helper.compat.bit32bit64.d
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    l.W(file, parcelFileDescriptorArrCreatePipe[1]);
                }
            });
            getResultBundle().putParcelable(RESULT_PFD_READ, parcelFileDescriptorArrCreatePipe[0]);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.filePath);
        }

        private RemoteInputStream() {
        }

        private RemoteInputStream(Parcel parcel) {
            super(parcel);
            this.filePath = parcel.readString();
        }
    }

    public static void a(GFile gFile, int i10, boolean z10) throws IOException {
        RemoteFileOp.chmod(gFile.t(), gFile, i10, z10);
    }

    public static void b(GFile gFile, int i10, boolean z10, GUri gUri) throws IOException {
        RemoteFileOp.chmod(gUri, gFile, i10, z10);
    }

    public static void c(GFile gFile, int i10, int i11, boolean z10) throws IOException {
        RemoteFileOp.chown(gFile.t(), gFile, i10, i11, z10);
    }

    public static void d(GFile gFile, int i10, int i11, boolean z10, GUri gUri) throws IOException {
        RemoteFileOp.chown(gUri, gFile, i10, i11, z10);
    }

    public static void e(GFile gFile, GFile gFile2, boolean z10, h<Long> hVar) throws Throwable {
        GUri gUriT = gFile.t();
        if (!gUriT.equals(gFile2.t())) {
            CrossSpaceCopy.crossSpaceCopyNoCheck(gFile, gFile2, gFile.t(), gFile2.t(), z10, hVar);
            return;
        }
        if (!Gaia32bit64bitProvider.i(gUriT)) {
            RemoteFileOp.copy(gUriT, z10, gFile, gFile2, hVar);
            return;
        }
        l.m(gFile, gFile2, hVar);
        if (z10) {
            l.s(gFile);
        }
    }

    public static void f(GFile gFile, GFile gFile2, GUri gUri, boolean z10, h<Long> hVar) throws Throwable {
        if (gFile == null) {
            return;
        }
        if (gUri == null) {
            gUri = gFile.t();
        } else {
            if (!gUri.equals(gFile.t())) {
                gFile.getAbsolutePath();
                gUri.toString();
                return;
            }
            if (gFile2 == null) {
                gFile2 = gFile.e(gUri);
            }
            if (Gaia32bit64bitProvider.i(gUri)) {
                if (gFile.equals(gFile2)) {
                    gFile.getAbsolutePath();
                    return;
                }
                gFile.getAbsolutePath();
                l.m(gFile, gFile2, hVar);
                if (z10) {
                    l.s(gFile);
                    return;
                }
                return;
            }
        }
        h(gFile, gFile2, gUri, z10, hVar);
    }

    public static void g(GFile gFile, boolean z10, h<Long> hVar) throws Throwable {
        f(gFile, null, null, z10, hVar);
    }

    public static void h(GFile gFile, GFile gFile2, GUri gUri, boolean z10, h<Long> hVar) throws IOException {
        CrossSpaceCopy.crossSpaceCopyNoCheck(gFile, gFile2, gUri, Gaia32bit64bitProvider.f(), z10, hVar);
    }

    public static void i(GFile gFile, GFile gFile2, GUri gUri, GUri gUri2, boolean z10, h<Long> hVar) throws IOException {
        CrossSpaceCopy.crossSpaceCopyNoCheck(gFile, gFile2, gUri, gUri2, z10, hVar);
    }

    public static void j(GFile gFile, GUri gUri, boolean z10, h<Long> hVar) throws Throwable {
        k(gFile, null, gUri, z10, hVar);
    }

    public static void k(GFile gFile, GFile gFile2, GUri gUri, boolean z10, h<Long> hVar) throws Throwable {
        if (gFile == null) {
            return;
        }
        if (gUri != null) {
            if (gFile2 == null) {
                gFile2 = gFile.g(gUri);
            } else if (!gUri.equals(gFile2.t())) {
                gFile2.getAbsolutePath();
                gUri.toString();
                return;
            }
            if (Gaia32bit64bitProvider.i(gUri)) {
                if (gFile.equals(gFile2)) {
                    gFile.getAbsolutePath();
                    return;
                }
                gFile.getAbsolutePath();
                l.m(gFile, gFile2, hVar);
                if (z10) {
                    l.s(gFile);
                    return;
                }
                return;
            }
        } else {
            if (gFile2 == null) {
                gFile.getAbsolutePath();
                return;
            }
            gUri = gFile2.t();
        }
        l(gFile, gFile2, gUri, z10, hVar);
    }

    public static void l(GFile gFile, GFile gFile2, GUri gUri, boolean z10, h<Long> hVar) throws IOException {
        if (gFile.exists()) {
            if (gFile.isFile()) {
                FileCopyToRemote.copyToRemoteNoCheck(gFile, gFile2, gUri, hVar);
                if (z10) {
                    gFile.delete();
                    return;
                }
                return;
            }
            if (gFile.isDirectory()) {
                RemoteFileOp.makeDirs(gUri, gFile2, OsCompat2.Util.getModeOfFile(gFile.getAbsolutePath()));
                File[] fileArrListFiles = gFile.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        l(new GFile(gFile, name), new GFile(gFile2, name), gUri, z10, hVar);
                    }
                }
                if (z10) {
                    gFile.delete();
                }
            }
        }
    }

    public static boolean m(GFile gFile) {
        return RemoteFileOp.delete(gFile.t(), gFile);
    }

    public static boolean n(GFile gFile, GUri gUri) {
        return RemoteFileOp.delete(gUri, gFile);
    }

    public static InputStream o(GFile gFile) throws IOException {
        String strN = gFile.n();
        if (strN != null && !U6.c.M(strN)) {
            return RemoteInputStream.getInputStreamNoCheck(gFile, c.b.f68734b.r(strN));
        }
        try {
            return new FileInputStream(gFile);
        } catch (SecurityException e10) {
            throw new IOException(e10);
        }
    }

    public static InputStream p(GFile gFile, GUri gUri) throws IOException {
        return RemoteInputStream.getInputStreamNoCheck(gFile, gUri);
    }

    public static com.prism.gaia.helper.e q() {
        return U6.c.F();
    }

    public static String[] r(GFile gFile) {
        gFile.t();
        return RemoteFileOp.list(gFile.t(), gFile);
    }

    public static String[] s(GFile gFile, GUri gUri) {
        return RemoteFileOp.list(gFile.t(), gFile);
    }

    public static void t(GFile gFile, int i10) throws IOException {
        RemoteFileOp.makeDirs(gFile.t(), gFile, i10);
    }

    public static void u(GFile gFile, int i10, GUri gUri) throws IOException {
        RemoteFileOp.makeDirs(gUri, gFile, i10);
    }

    public static class RemoteFileOp extends RemoteRunnable {
        private static final int FEEDBACK_CODE_PROGRESS_BYTES = 1;
        private static final String FEEDBACK_PROGRESS_BYTES = "feedback_progressBytes";
        private static final String RESULT_LIST = "result_list";
        private boolean hasValueFeedback;
        private int mode;
        private OpCode opCode;
        private int ownerUid;
        private boolean recursive;
        private GFile sourceFile;
        private GFile targetFile;
        private h<Long> valueFeedback;
        private static final String TAG = "asdf-".concat(RemoteFileOp.class.getSimpleName());
        public static final Parcelable.Creator<RemoteFileOp> CREATOR = new b();

        public enum OpCode {
            MAKE_DIRS,
            COPY,
            DEL,
            MOVE,
            CHMOD,
            EXPAND_MODE,
            FIX_MODE,
            CHOWN,
            LIST
        }

        public class a implements h<Long> {
            public a() {
            }

            @Override // o6.h
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(Long l10) {
                RemoteFileOp.this.sendFeedbackProgressBytes(l10.longValue());
            }
        }

        public class b implements Parcelable.Creator<RemoteFileOp> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public RemoteFileOp createFromParcel(Parcel parcel) {
                return new RemoteFileOp(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public RemoteFileOp[] newArray(int i10) {
                return new RemoteFileOp[i10];
            }
        }

        private RemoteFileOp() {
            this.sourceFile = null;
            this.targetFile = null;
            this.mode = 0;
            this.recursive = false;
            this.ownerUid = 0;
            this.hasValueFeedback = false;
            this.valueFeedback = null;
        }

        public static void chmod(GUri gUri, GFile gFile, int i10, boolean z10) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.CHMOD;
            remoteFileOp.targetFile = gFile;
            remoteFileOp.mode = i10;
            remoteFileOp.recursive = z10;
            try {
                remoteFileOp.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void chmodOnRemote() throws IOException {
            l.f(this.targetFile.getAbsolutePath(), this.mode, this.recursive);
        }

        public static void chown(GUri gUri, GFile gFile, int i10, int i11, boolean z10) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.CHOWN;
            remoteFileOp.targetFile = gFile;
            remoteFileOp.ownerUid = i10;
            remoteFileOp.mode = i11;
            remoteFileOp.recursive = z10;
            try {
                remoteFileOp.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void chownOnRemote() throws IOException {
            l.i(this.targetFile.getAbsolutePath(), this.ownerUid, this.mode, this.recursive);
        }

        public static void copy(GUri gUri, boolean z10, GFile gFile, GFile gFile2, h<Long> hVar) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.COPY;
            remoteFileOp.sourceFile = gFile;
            remoteFileOp.targetFile = gFile2;
            remoteFileOp.mode = z10 ? 1 : 0;
            remoteFileOp.hasValueFeedback = hVar != null;
            remoteFileOp.valueFeedback = hVar;
            try {
                remoteFileOp.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void copyOnRemote() throws Throwable {
            l.m(this.sourceFile, this.targetFile, this.hasValueFeedback ? new a() : null);
            if (this.mode > 0) {
                l.s(this.sourceFile);
            }
        }

        public static boolean delete(GUri gUri, GFile gFile) {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.DEL;
            remoteFileOp.targetFile = gFile;
            return remoteFileOp.start(gUri) == 0;
        }

        private void deleteOnRemote() {
            setResultCode(l.s(this.targetFile) ? 0 : -1);
        }

        public static void expandMode(GUri gUri, GFile gFile, int i10, boolean z10) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.EXPAND_MODE;
            remoteFileOp.targetFile = gFile;
            remoteFileOp.mode = i10;
            remoteFileOp.recursive = z10;
            try {
                remoteFileOp.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void expandModeOnRemote() throws IOException {
            l.A(this.targetFile.getAbsolutePath(), this.mode, this.recursive);
        }

        public static void fixMode(GUri gUri, GFile gFile, int i10, int i11) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.FIX_MODE;
            remoteFileOp.targetFile = gFile;
            remoteFileOp.mode = i10;
            remoteFileOp.ownerUid = i11;
            try {
                remoteFileOp.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void fixModeOnRemote() throws IOException {
            l.C(this.targetFile.getAbsolutePath(), this.mode, this.ownerUid);
        }

        public static String[] list(GUri gUri, GFile gFile) {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.LIST;
            remoteFileOp.targetFile = gFile;
            try {
                remoteFileOp.start(gUri);
                String[] stringArray = remoteFileOp.getResultBundle().getStringArray(RESULT_LIST);
                return stringArray == null ? new String[0] : stringArray;
            } catch (GaiaRemoteRunnableException e10) {
                if (e10.getCause() instanceof SecurityException) {
                    throw ((SecurityException) e10.getCause());
                }
                throw e10;
            }
        }

        private void listOnRemote() throws SecurityException {
            getResultBundle().putStringArray(RESULT_LIST, this.targetFile.list());
        }

        public static void makeDirs(GUri gUri, GFile gFile, int i10) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.MAKE_DIRS;
            remoteFileOp.targetFile = gFile;
            remoteFileOp.mode = i10;
            try {
                remoteFileOp.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        private void makeDirsOnRemote() throws IOException {
            l.K(this.targetFile, this.mode);
        }

        public static boolean move(GUri gUri, GFile gFile, GFile gFile2) throws IOException {
            RemoteFileOp remoteFileOp = new RemoteFileOp();
            remoteFileOp.opCode = OpCode.MOVE;
            remoteFileOp.sourceFile = gFile;
            remoteFileOp.targetFile = gFile2;
            try {
                return remoteFileOp.start(gUri) != 0;
            } catch (GaiaRemoteRunnableException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        private void moveOnRemote() throws IOException {
            setResultCode(l.N(this.sourceFile, this.targetFile) ? 0 : -1);
        }

        private void onFeedbackProgressBytes(Bundle bundle) {
            if (this.valueFeedback != null) {
                this.valueFeedback.a(Long.valueOf(bundle.getLong(FEEDBACK_PROGRESS_BYTES, 0L)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendFeedbackProgressBytes(long j10) {
            if (this.hasValueFeedback) {
                Bundle bundle = new Bundle();
                bundle.putLong(FEEDBACK_PROGRESS_BYTES, j10);
                sendFeedback(1, bundle);
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onFeedbackReceived(int i10, Bundle bundle) {
            if (i10 != 1) {
                return;
            }
            onFeedbackProgressBytes(bundle);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            switch (this.opCode) {
                case MAKE_DIRS:
                    makeDirsOnRemote();
                    break;
                case COPY:
                    copyOnRemote();
                    break;
                case DEL:
                    deleteOnRemote();
                    break;
                case MOVE:
                    moveOnRemote();
                    break;
                case CHMOD:
                    chmodOnRemote();
                    break;
                case EXPAND_MODE:
                    expandModeOnRemote();
                    break;
                case FIX_MODE:
                    fixModeOnRemote();
                    break;
                case CHOWN:
                    chownOnRemote();
                    break;
                case LIST:
                    listOnRemote();
                    break;
                default:
                    Objects.toString(this.opCode);
                    break;
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.opCode.ordinal());
            l.S(parcel, this.sourceFile);
            l.S(parcel, this.targetFile);
            parcel.writeInt(this.mode);
            parcel.writeByte(this.recursive ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.ownerUid);
            parcel.writeByte(this.hasValueFeedback ? (byte) 1 : (byte) 0);
        }

        public RemoteFileOp(Parcel parcel) {
            super(parcel);
            this.sourceFile = null;
            this.targetFile = null;
            this.mode = 0;
            this.recursive = false;
            this.ownerUid = 0;
            this.hasValueFeedback = false;
            this.valueFeedback = null;
            this.opCode = OpCode.values()[parcel.readInt()];
            this.sourceFile = l.R(parcel);
            this.targetFile = l.R(parcel);
            this.mode = parcel.readInt();
            this.recursive = parcel.readByte() != 0;
            this.ownerUid = parcel.readInt();
            this.hasValueFeedback = parcel.readByte() != 0;
        }
    }
}
