package T4;

import N4.l;
import androidx.annotation.Nullable;
import com.gaia.ngallery.model.AlbumMeta;
import com.gaia.ngallery.model.MediaFile;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.stub.n;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.file.PrivateFile;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f68338j = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PrivateFile f68339i;

    public c(PrivateFile privateFile, String str, AlbumMeta albumMeta) {
        super(str, albumMeta);
        this.f68339i = privateFile;
    }

    public static c A(PrivateFile privateFile) {
        PrivateFile privateFileD = D(privateFile);
        return new c(privateFile, privateFile.getRelativeFilename(), privateFileD == null ? new AlbumMeta() : AlbumMeta.readFromFile(privateFileD));
    }

    public static PrivateFile D(PrivateFile privateFile) {
        try {
            return PrivateFile.c.f(privateFile.getPfs(), privateFile.getUserPath(), n.f164462t);
        } catch (IOException unused) {
            return null;
        }
    }

    public PrivateFile B() {
        return this.f68339i;
    }

    public String C() {
        return N4.d.m().m(this) ? PrivateFileSystem.getAppContext().getString(l.p.f62826G1) : N4.d.f59080j.n(this) ? PrivateFileSystem.getAppContext().getString(l.p.f62834H1) : l();
    }

    @Override // T4.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public PrivateFile n() {
        String strM = m();
        if (strM == null) {
            return null;
        }
        try {
            PrivateFile privateFileF = PrivateFile.c.f(this.f68339i.getPfs(), this.f68339i.getUserPath(), strM);
            if (privateFileF.exists()) {
                if (privateFileF.isFile()) {
                    return privateFileF;
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public synchronized P4.b F(@Nullable Comparator<MediaFile> comparator, boolean z10) {
        boolean z11;
        List<PrivateFile> list = null;
        if (z10) {
            try {
                a(null);
            } catch (Throwable th) {
                throw th;
            }
        }
        P4.b bVarF = f();
        if (bVarF != null) {
            bVarF.p(comparator);
            return bVarF;
        }
        if (comparator == null) {
            comparator = MediaFile.MODIFY_TIME_ASC;
        }
        long jI = i();
        try {
            list = this.f68339i.sync(z10).list();
        } catch (RuntimeException e10) {
            I.h(f68338j, "album(" + l() + ") could not be listed", e10);
        }
        P4.b bVar = new P4.b(this, comparator);
        if (list != null) {
            for (PrivateFile privateFile : list) {
                if (privateFile.isFile() && !privateFile.getName().equals(n.f164462t) && N4.d.w(N4.d.q(privateFile))) {
                    bVar.a(new MediaFile(privateFile));
                    long jLastModified = privateFile.lastModified();
                    if (jLastModified > jI) {
                        jI = jLastModified;
                    }
                }
            }
        }
        boolean z12 = true;
        if (bVar.f65560e == h() && bVar.f65561f == p() && jI == i()) {
            z11 = false;
        } else {
            k().setImageCount(bVar.f65560e);
            k().setVideoCount(bVar.f65561f);
            k().setLastModified(jI);
            z11 = true;
        }
        if (n() != null || bVar.f65558c.size() <= 0) {
            z12 = z11;
        } else {
            k().setThumbnail(bVar.l(0).getName());
        }
        if (z12) {
            t();
        }
        bVar.f65559d = i();
        a(bVar);
        return bVar;
    }

    public PrivateFile G(@Nullable Comparator<PrivateFile> comparator) {
        if (comparator == null) {
            comparator = PrivateFile.MODIFIED_TIME_ASC;
        }
        List<PrivateFile> list = this.f68339i.sync(false).list();
        if (list == null || list.size() == 0) {
            return null;
        }
        Collections.sort(list, comparator);
        return list.get(0);
    }

    @Override // T4.a
    public boolean b(MediaFile mediaFile) {
        boolean zB = super.b(mediaFile);
        if (zB && n() == null) {
            x(mediaFile.getName());
            z();
        }
        return zB;
    }

    @Override // T4.a
    public boolean e(MediaFile mediaFile) {
        PrivateFile privateFileN;
        boolean zE = super.e(mediaFile);
        if (zE && (privateFileN = n()) != null && privateFileN.getName().equals(mediaFile.getName())) {
            x(null);
            z();
        }
        return zE;
    }

    @Override // T4.a
    public void t() {
        PrivateFile privateFileD = D(this.f68339i);
        if (privateFileD == null) {
            return;
        }
        try {
            k().writeToFile(privateFileD);
        } catch (IOException unused) {
        }
    }
}
