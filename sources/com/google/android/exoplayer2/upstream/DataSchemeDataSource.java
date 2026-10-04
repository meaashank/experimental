package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.appcompat.widget.O;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.net.URLDecoder;
import w.y;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSchemeDataSource implements DataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRead;
    private byte[] data;
    private DataSpec dataSpec;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.dataSpec = null;
        this.data = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new ParserException(y.a("Unsupported scheme: ", scheme));
        }
        String[] strArrSplit = uri.getSchemeSpecificPart().split(",");
        if (strArrSplit.length > 2) {
            throw new ParserException(O.a("Unexpected URI format: ", uri));
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ParserException(y.a("Error while parsing Base64 encoded string: ", str), e10);
            }
        } else {
            this.data = URLDecoder.decode(str, "US-ASCII").getBytes();
        }
        return this.data.length;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int length = this.data.length - this.bytesRead;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i11, length);
        System.arraycopy(this.data, this.bytesRead, bArr, i10, iMin);
        this.bytesRead += iMin;
        return iMin;
    }
}
