package X4;

import com.gaia.ngallery.sync.model.FileLastSyncedInfo;
import com.prism.lib.pfs.file.PrivateFile;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivateFile f76778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLastSyncedInfo f76779b;

    public a(PrivateFile privateFile, FileLastSyncedInfo fileLastSyncedInfo) {
        this.f76778a = privateFile;
        this.f76779b = fileLastSyncedInfo;
    }

    public boolean a() {
        PrivateFile privateFile = this.f76778a;
        return privateFile != null && privateFile.exists();
    }

    public long b() {
        PrivateFile privateFile = this.f76778a;
        if (privateFile == null) {
            return 0L;
        }
        return privateFile.lastModified();
    }

    public long c() {
        if (e()) {
            return this.f76779b.getLastModifedFromServer();
        }
        return 0L;
    }

    public long d() {
        if (e()) {
            return this.f76779b.getLastSyncedTime();
        }
        return 0L;
    }

    public boolean e() {
        return this.f76779b != null;
    }
}
