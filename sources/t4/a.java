package T4;

import androidx.annotation.Nullable;
import com.gaia.ngallery.model.AlbumMeta;
import com.gaia.ngallery.model.MediaFile;
import com.prism.commons.file.FileType;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68330f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68331g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68332h = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlbumMeta f68334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68335c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference<P4.b> f68336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f68337e;

    public a(String str, AlbumMeta albumMeta) {
        this.f68333a = str;
        this.f68334b = albumMeta;
    }

    public void a(P4.b bVar) {
        if (bVar == null) {
            this.f68336d = null;
        } else {
            this.f68336d = new WeakReference<>(bVar);
        }
    }

    public boolean b(MediaFile mediaFile) {
        FileType type = mediaFile.getType();
        if (N4.d.u(type)) {
            q();
            return true;
        }
        if (!N4.d.x(type)) {
            return false;
        }
        r();
        return true;
    }

    public void c() {
        this.f68334b.decImageCount();
    }

    public void d() {
        this.f68334b.decVideoCount();
    }

    public boolean e(MediaFile mediaFile) {
        FileType type = mediaFile.getType();
        if (N4.d.u(type)) {
            c();
            return true;
        }
        if (!N4.d.x(type)) {
            return false;
        }
        d();
        return true;
    }

    @Nullable
    public P4.b f() {
        WeakReference<P4.b> weakReference = this.f68336d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String g() {
        return this.f68333a;
    }

    public int h() {
        return this.f68334b.getImageCount();
    }

    public long i() {
        return this.f68334b.getLastModified();
    }

    public int j() {
        return this.f68334b.getVideoCount() + this.f68334b.getImageCount();
    }

    public AlbumMeta k() {
        return this.f68334b;
    }

    public String l() {
        return this.f68334b.getName();
    }

    public String m() {
        return this.f68334b.getThumbnail();
    }

    public abstract ExchangeFile n();

    public int o() {
        return this.f68335c;
    }

    public int p() {
        return this.f68334b.getVideoCount();
    }

    public void q() {
        this.f68334b.incImageCount();
    }

    public void r() {
        this.f68334b.incVideoCount();
    }

    public boolean s() {
        return this.f68337e;
    }

    public abstract void t();

    public String toString() {
        return "Album{id=" + g() + ", name='" + k().getName() + "'}";
    }

    public void u(boolean z10) {
        this.f68337e = z10;
    }

    public void v(long j10) {
        this.f68334b.setLastModified(j10);
        t();
    }

    public void w(String str) {
        this.f68334b.setName(str);
    }

    public void x(String str) {
        this.f68334b.setThumbnail(str);
    }

    public void y(int i10) {
        this.f68335c = i10;
    }

    public void z() {
        v(System.currentTimeMillis());
    }
}
