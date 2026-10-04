package Xa;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.prism.lib.pfs.exception.PfsIOException;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class a implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferListener<? super a> f78745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExchangeFile f78746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f78747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f78749e;

    public a(@NonNull ExchangeFile exchangeFile) {
        this(exchangeFile, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f78747c = null;
        try {
            try {
                InputStream inputStream = this.f78749e;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new PfsIOException(5, e10);
            }
        } finally {
            this.f78749e = null;
            if (this.f78748d) {
                this.f78748d = false;
                TransferListener<? super a> transferListener = this.f78745a;
                if (transferListener != null) {
                    transferListener.onTransferEnd(this);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.f78747c;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        try {
            this.f78747c = dataSpec.uri;
            InputStream inputStream = this.f78746b.getInputStream();
            this.f78749e = inputStream;
            long j10 = dataSpec.position;
            if (j10 > 0) {
                inputStream.skip(j10);
            }
            this.f78748d = true;
            TransferListener<? super a> transferListener = this.f78745a;
            if (transferListener == null) {
                return -1L;
            }
            transferListener.onTransferStart(this, dataSpec);
            return -1L;
        } catch (IOException e10) {
            throw new PfsIOException(4, e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        TransferListener<? super a> transferListener;
        if (i11 == 0) {
            return 0;
        }
        try {
            int i12 = this.f78749e.read(bArr, i10, i11);
            if (i12 > 0 && (transferListener = this.f78745a) != null) {
                transferListener.onBytesTransferred(this, i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new PfsIOException(6, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NonNull ExchangeFile exchangeFile, TransferListener<? super DataSource> transferListener) {
        this.f78745a = transferListener;
        this.f78746b = exchangeFile;
    }
}
