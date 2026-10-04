package Ma;

import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.file.exchange.ExchangeFileEx;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExchangeFile f58905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExchangeFile f58906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58907c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f58908d = false;

    public static d a(ExchangeFile exchangeFile, ExchangeFile exchangeFile2) {
        d dVar = new d();
        dVar.f58905a = exchangeFile;
        dVar.f58906b = exchangeFile2;
        return dVar;
    }

    public void b() {
        ExchangeFile exchangeFile = this.f58906b;
        if (exchangeFile instanceof ExchangeFileEx) {
            ((ExchangeFileEx) exchangeFile).deleteQuietly();
        }
    }

    public void c() throws IOException {
        ExchangeFile exchangeFile = this.f58906b;
        if (exchangeFile instanceof ExchangeFileEx) {
            ((ExchangeFileEx) exchangeFile).mkParentDirs();
            ((ExchangeFileEx) this.f58906b).adjustFilename(this.f58908d);
        }
        ExchangeFile exchangeFile2 = this.f58905a;
        if (exchangeFile2 instanceof PrivateFile) {
            ((PrivateFile) exchangeFile2).doExport(this.f58906b, this.f58907c);
            return;
        }
        this.f58906b.writeFromInputStream(exchangeFile2.getInputStream(), false);
        if (this.f58907c) {
            return;
        }
        this.f58905a.deleteQuietly();
    }

    public ExchangeFile d() {
        return this.f58905a;
    }

    public ExchangeFile e() {
        return this.f58906b;
    }

    public boolean f() {
        return this.f58907c;
    }

    public d g(boolean z10) {
        this.f58907c = z10;
        return this;
    }

    public d h(boolean z10) {
        this.f58908d = z10;
        return this;
    }
}
