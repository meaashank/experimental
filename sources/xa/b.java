package Xa;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.prism.lib.pfs.file.exchange.ExchangeFile;

/* JADX INFO: loaded from: classes7.dex */
public class b implements DataSource.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeFile f78750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TransferListener<? super DataSource> f78751b;

    public b(ExchangeFile exchangeFile) {
        this.f78750a = exchangeFile;
    }

    public static b a(ExchangeFile exchangeFile) {
        return new b(exchangeFile);
    }

    public void b(TransferListener<? super DataSource> transferListener) {
        this.f78751b = transferListener;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        return new a(this.f78750a, this.f78751b);
    }
}
