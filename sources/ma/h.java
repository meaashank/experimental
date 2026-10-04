package Ma;

import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivateFile f58913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExchangeFile f58914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58915c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f58916d = false;

    public static h a(PrivateFileSystem privateFileSystem, ExchangeFile exchangeFile) throws IOException {
        h hVar = new h();
        hVar.f58913a = PrivateFile.c.e(privateFileSystem, exchangeFile.getName());
        hVar.f58914b = exchangeFile;
        return hVar;
    }

    public static h b(PrivateFileSystem privateFileSystem, ExchangeFile exchangeFile, String str) throws IOException {
        h hVar = new h();
        hVar.f58913a = PrivateFile.c.f(privateFileSystem, str, exchangeFile.getName());
        hVar.f58914b = exchangeFile;
        return hVar;
    }

    public static h c(PrivateFileSystem privateFileSystem, ExchangeFile exchangeFile, String str, String str2) throws IOException {
        h hVar = new h();
        hVar.f58913a = PrivateFile.c.f(privateFileSystem, str, str2);
        hVar.f58914b = exchangeFile;
        return hVar;
    }

    public void d() {
        this.f58913a.deleteQuietly();
    }

    public void e() throws IOException {
        this.f58913a.doImport(this.f58914b, this.f58916d);
        if (this.f58915c) {
            return;
        }
        this.f58914b.deleteQuietly();
    }

    public PrivateFile f() {
        return this.f58913a;
    }

    public ExchangeFile g() {
        return this.f58914b;
    }

    public boolean h() {
        return this.f58916d;
    }

    public h i(boolean z10) {
        this.f58915c = z10;
        return this;
    }

    public h j(boolean z10) {
        this.f58916d = z10;
        return this;
    }
}
