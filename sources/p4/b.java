package P4;

import com.gaia.ngallery.model.MediaFile;
import com.prism.commons.file.FileType;
import h6.InterfaceC4495a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC4495a<MediaFile, String> f65555g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T4.a f65556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Comparator<MediaFile> f65557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h6.d<String, MediaFile> f65558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f65559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f65560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65561f;

    public b(T4.a aVar) {
        this(aVar, MediaFile.MODIFY_TIME_DSC);
    }

    public void a(MediaFile mediaFile) {
        synchronized (this) {
            try {
                mediaFile.linkAlbumArchive(this);
                int size = this.f65558c.size();
                this.f65558c.c(mediaFile);
                if (this.f65558c.size() > size) {
                    d(mediaFile);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Collection<MediaFile> collection) {
        synchronized (this) {
            try {
                int size = this.f65558c.size();
                for (MediaFile mediaFile : collection) {
                    mediaFile.linkAlbumArchive(this);
                    this.f65558c.c(mediaFile);
                    if (this.f65558c.size() > size) {
                        d(mediaFile);
                        size++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        synchronized (this) {
            this.f65558c.i();
            this.f65560e = 0;
            this.f65561f = 0;
        }
    }

    public final void d(MediaFile mediaFile) {
        FileType type = mediaFile.getType();
        if (type == FileType.IMAGE) {
            this.f65560e++;
        } else if (type == FileType.VIDEO) {
            this.f65561f++;
        }
    }

    public final void e(MediaFile mediaFile) {
        FileType type = mediaFile.getType();
        if (type == FileType.IMAGE) {
            this.f65560e--;
        } else if (type == FileType.VIDEO) {
            this.f65561f--;
        }
    }

    public T4.a f() {
        return this.f65556a;
    }

    public ArrayList<MediaFile> g() {
        return this.f65558c.o();
    }

    public String h() {
        return this.f65556a.g();
    }

    public int i() {
        return this.f65560e;
    }

    public long j() {
        return this.f65559d;
    }

    public int k() {
        return this.f65558c.size();
    }

    public MediaFile l(int i10) {
        return this.f65558c.n(i10);
    }

    public int m() {
        return this.f65561f;
    }

    public Iterator<MediaFile> n() {
        return this.f65558c.iterator();
    }

    public void o(MediaFile mediaFile) {
        synchronized (this) {
            try {
                int size = this.f65558c.size();
                this.f65558c.remove(mediaFile);
                if (this.f65558c.size() < size) {
                    e(mediaFile);
                }
                if (mediaFile.getAlbumArchive() != null) {
                    mediaFile.unlinkAlbumArchive(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(Comparator<MediaFile> comparator) {
        if (comparator == null || comparator == this.f65557b) {
            return;
        }
        synchronized (this) {
            h6.d<String, MediaFile> dVar = this.f65558c;
            h6.d<String, MediaFile> dVar2 = new h6.d<>(f65555g, comparator, MediaFile.class);
            this.f65558c = dVar2;
            dVar2.g(dVar.o());
            this.f65557b = comparator;
        }
    }

    public void q(long j10) {
        this.f65559d = j10;
    }

    public b(T4.a aVar, Comparator<MediaFile> comparator) {
        this.f65559d = 0L;
        this.f65560e = 0;
        this.f65561f = 0;
        this.f65556a = aVar;
        this.f65557b = comparator;
        this.f65558c = new h6.d<>(f65555g, comparator, MediaFile.class);
    }
}
