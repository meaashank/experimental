package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import okio.C5360j;
import ub.InterfaceC5664b;

/* JADX INFO: loaded from: classes7.dex */
public class z<T> extends y<T> implements u {
    private ContentResolver contentResolver;
    private Uri contentUri;
    private d countingSink;
    private String filePath;
    private InputStream inputStream;
    protected boolean isQuic = false;
    private long offset;
    protected InterfaceC5664b progressListener;

    public z() {
    }

    public final T a(h<T> hVar, long j10) throws Throwable {
        File file = new File(this.filePath);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new QCloudClientException(new IOException("local file directory can not create."));
        }
        if (hVar.f194288b.f225298g == null) {
            throw new QCloudServiceException("response body is empty !");
        }
        try {
            c(file, hVar.a(), j10);
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new QCloudClientException("write local file error for " + e10.toString(), e10);
        }
    }

    public final T b(h<T> hVar, long j10) throws QCloudServiceException, QCloudClientException {
        OutputStream outputStream = getOutputStream();
        InputStream inputStreamA = hVar.a();
        byte[] bArr = new byte[8192];
        this.countingSink = new d(new C5360j(), j10, this.progressListener);
        while (true) {
            try {
                try {
                    int i10 = inputStreamA.read(bArr);
                    if (i10 == -1) {
                        Bd.f.o(outputStream);
                        return null;
                    }
                    outputStream.write(bArr, 0, i10);
                    this.countingSink.n(i10);
                } catch (IOException e10) {
                    e10.printStackTrace();
                    throw new QCloudClientException("write local uri error for " + e10.toString(), e10);
                }
            } catch (Throwable th) {
                Bd.f.o(outputStream);
                throw th;
            }
        }
    }

    public final void c(File file, InputStream inputStream, long j10) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        if (inputStream == null) {
            throw new QCloudClientException(new IOException("response body stream is null"));
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rws");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            long bytesTransferred = getBytesTransferred();
            long j11 = this.offset;
            if (j11 + bytesTransferred > 0) {
                randomAccessFile.seek(j11 + bytesTransferred);
            }
            byte[] bArr = new byte[8192];
            this.countingSink = new d(new C5360j(), j10, bytesTransferred, this.progressListener);
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    Bd.f.o(randomAccessFile);
                    return;
                } else {
                    randomAccessFile.write(bArr, 0, i10);
                    this.countingSink.n(i10);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 == null) {
                throw th;
            }
            Bd.f.o(randomAccessFile2);
            throw th;
        }
    }

    @Override // com.tencent.qcloud.core.http.y
    public T convert(h<T> hVar) throws Throwable {
        if (this.isQuic) {
            return null;
        }
        h.c(hVar);
        long[] jArrD = yb.d.d(hVar.f194288b.T0("Content-Range"));
        long jE = jArrD != null ? (jArrD[1] - jArrD[0]) + 1 : hVar.e();
        if (!TextUtils.isEmpty(this.filePath)) {
            a(hVar, jE);
            return null;
        }
        if (this.contentUri == null) {
            throw new QCloudClientException(new IllegalArgumentException("filePath or ContentUri are both null"));
        }
        b(hVar, jE);
        return null;
    }

    public void enableQuic(boolean z10) {
        this.isQuic = z10;
    }

    @Override // com.tencent.qcloud.core.http.u
    public long getBytesTransferred() {
        d dVar = this.countingSink;
        if (dVar != null) {
            return dVar.l();
        }
        return 0L;
    }

    public OutputStream getOutputStream() throws QCloudClientException {
        if (TextUtils.isEmpty(this.filePath)) {
            Uri uri = this.contentUri;
            if (uri == null) {
                throw new QCloudClientException(new IllegalArgumentException("filePath or ContentUri are both null"));
            }
            try {
                return this.contentResolver.openOutputStream(uri);
            } catch (FileNotFoundException e10) {
                throw new QCloudClientException(e10);
            }
        }
        File file = new File(this.filePath);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new QCloudClientException(new IOException("local file directory can not create."));
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException e11) {
            throw new QCloudClientException(e11);
        }
    }

    public InterfaceC5664b getProgressListener() {
        return this.progressListener;
    }

    public boolean isFilePathConverter() {
        return !TextUtils.isEmpty(this.filePath);
    }

    @Override // com.tencent.qcloud.core.http.u
    public void setProgressListener(InterfaceC5664b interfaceC5664b) {
        this.progressListener = interfaceC5664b;
    }

    public z(Uri uri, ContentResolver contentResolver, long j10) {
        this.contentUri = uri;
        this.contentResolver = contentResolver;
        this.offset = j10;
    }

    public z(String str, long j10) {
        this.filePath = str;
        this.offset = j10;
    }
}
